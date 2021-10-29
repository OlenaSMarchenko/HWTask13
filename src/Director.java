public final class Director extends BaseManager { //Классы Manager и Director должны быть финальными

    private static final int MULT = 9;  //Коэффициенты для расчета ЗП у Manager и Director должны быть константами

    public Director(int baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);
    }

    @Override
    protected int getMult() {
        return  MULT;
}
}
