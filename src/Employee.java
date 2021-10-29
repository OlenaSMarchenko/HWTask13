public abstract class Employee {
    private int baseSalary;
    private String name;
    private  int salary;


    public Employee(int baseSalary, String name) {
        this.baseSalary = baseSalary;
        this.name = name;

    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int getSalary(); //Employee.getSalary должен быть абстрактный

}





