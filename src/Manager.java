public final class Manager extends BaseManager { //Классы Manager и Director должны быть финальными


    private static final int MULT = 3;//Коэффициенты для расчета ЗП у Manager и Director должны быть константами

    public Manager(int baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);
    }

    @Override
    protected int getMult() {
        return MULT;
    }


}



