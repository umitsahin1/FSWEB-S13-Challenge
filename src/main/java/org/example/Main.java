package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        String[] healthPlans = new String[3];
        String[] developers = new String[3];

        Employee employee = new Employee(12, "laz Ziyaz", "lazziya@gmail.com", "12345", healthPlans);
        Healthplan healthplan = new Healthplan(13, "A Sigorta", Plan.BASIC);
        Company company = new Company(20, "Tech Innovations", 12000, developers);
    }
}