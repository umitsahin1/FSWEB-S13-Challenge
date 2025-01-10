package org.example;


public class Employee {
    private double id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;


    public Employee(double id, String fullName, String email, String password, String[] healthPlans){
        this.id = id;
        this.fullName =fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;

    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setHealthPlans(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }

    @Override
    public String toString() {
        String healthPlansStr = String.join(", ", healthPlans);
        return "Employee [ID: " + id + ", Name: " + fullName + ", E-mail: " + email + ", Password: " + password + ", HealthPlans: " + healthPlansStr + "]";
    }

    public void addHealthPlan(int index, String name){
        if(index < 0 || index >= healthPlans.length) {
            System.out.println("Geçersiz index!");
            return;
        }

        if(healthPlans[index] != null ){
          System.out.println("Bu index dolu.Lütfen başka bir index seçiniz.");
          } else {
          healthPlans[index] = name;
          }
    }
}


