public abstract class BaseManager extends Worker {

    private int numberOfSubordinates;

    public BaseManager(int baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    protected abstract int getMult();

    @Override
    public int getSalary() {
        if (numberOfSubordinates == 0) {
            return super.getSalary();
        } else {
            return getBaseSalary() * (getNumberOfSubordinates() / 100 * getMult());
        }
    }
}


