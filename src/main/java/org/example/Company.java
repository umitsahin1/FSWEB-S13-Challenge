package org.example;

public class Company {
    private double id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(double id, String name, double giro, String[] developerNames){
        this.id =id;
        this.name=name;
        this.giro = giro < 0 ? 0 : giro;
        this.developerNames =developerNames;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        this.giro = giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name){
        if(index < 0 || index >= developerNames.length) {
            System.out.println("Geçersiz index!");
            return;
        }

        if(developerNames[index] != null ){
            System.out.println("Bu index dolu.Lütfen başka bir index seçiniz.");
        } else {
            developerNames[index] = name;
        }
    }
}

