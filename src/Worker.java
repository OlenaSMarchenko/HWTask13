public class Worker implements IEmployee {

    private int baseSalary;
    private String name;

    public Worker(int baseSalary, String name) {
        this.baseSalary = baseSalary;
        this.name = name;
    }

    @Override
    public int getBaseSalary() {
        return baseSalary;
    }

    @Override
    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getSalary() {
        return baseSalary;
    }
}
