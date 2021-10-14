public class Director extends Manager {
    @Override
    public int getSalary() {
        if (numberOfSubordinates == 0) {
            return baseSalary;
        } else {
            return baseSalary * (numberOfSubordinates / 100 * 9);
        }
    }
}
