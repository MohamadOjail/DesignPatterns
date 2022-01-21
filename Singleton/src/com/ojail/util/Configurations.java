package com.ojail.util;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Configurations {
    private final HashMap<String, Integer> employeeIds = new HashMap<>();
    private final String filePath;

    private static Configurations instance;

    private Configurations(){
        this.filePath = "src/file.cfg";
        populateMap();
    }

    public static Configurations getInstance(){
        if(instance == null) instance = new Configurations();
        return instance;
    }

    private void populateMap(){
        try {
            List<String> list = Files.readAllLines(Path.of(filePath));
            for ( String line : list){
                String[] entry = line.split(":");
                employeeIds.put(entry[0], Integer.parseInt(entry[1]));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void printEmployeeList(){
        if (employeeIds.isEmpty()) System.out.println("\n\tEmployee list is empty\n");
        else{
            System.out.println("\n\tname:id\n\t===========");
            employeeIds.forEach((n , i) -> System.out.println("\t" + n + ":" + i));
            System.out.println();
        }
    }

    public void getEmployee(Integer id){
        if( employeeIds.containsValue(id)){
            System.out.println("\n\tEntry found here:");
            System.out.println("\tname:\tid:\n\t===========");

            String key = employeeIds.entrySet().stream()
                    .filter(x -> x.getValue().equals(id))
                    .findFirst()
                    .get().getKey();
            System.out.println("\t" + key + ":" + employeeIds.get(key) + "\n");
        }else System.out.println("\n\tNot found !!");
    }

    public void addEmployee(String key, Integer id){
        employeeIds.put(key,id);
        save();
        System.out.println("\tAdded new employee");
    }

    public void changeId(String key, int newId){
        if(employeeIds.containsKey(key)){
            employeeIds.put(key,newId);
            save();
            System.out.println("\tThe id for Employee: " + key + " has been changed.");
        }else System.out.println("\tNot Found");
    }

    private void save() {
        FileWriter fw = null;
        try {
            fw = new FileWriter(filePath);
            for (Map.Entry<String, Integer> entry : employeeIds.entrySet()){
                fw.write(entry.getKey() + ":" + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
