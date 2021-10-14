public class Manager extends Employee {

    protected int numberOfSubordinates;

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates() {

    }

    @Override
    public int getSalary() {
        if (numberOfSubordinates == 0) {
            return baseSalary;
        } else {
            return getBaseSalary() * (numberOfSubordinates / 100 * 3);
        }
    }
}



