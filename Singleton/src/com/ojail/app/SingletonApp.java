package com.ojail.app;

import com.ojail.util.Configurations;

public class SingletonApp {
    public static void main(String[] args) {
        Configurations.getInstance().printEmployeeList();
        Configurations.getInstance().addEmployee("Mohamad",122);
        Configurations.getInstance().addEmployee("Sam", 101);
        Configurations.getInstance().addEmployee("Hasan", 245);
        Configurations.getInstance().getEmployee(25);
        Configurations.getInstance().getEmployee(245);
        Configurations.getInstance().printEmployeeList();
        Configurations.getInstance().changeId("Mark", 126);
        Configurations.getInstance().changeId("Sam", 218);
    }
}
