package io;

import java.io.BufferedReader;
import java.io.IOException;

public class Reader {

    public String[] getWords(FileSource source){
        BufferedReader br = null;
        String [] output = null;

        try {
            br = new BufferedReader(new java.io.FileReader(source.path));
            output = br.readLine().split(",");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            if(br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }

        }
        return output;
    }
}
