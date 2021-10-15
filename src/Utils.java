public class Utils {

    //methods  поиск сотрудника в массиве по его имени
    public static Employee findByName(String name, Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            if (name.equals(array[i].getName())) {
                return array[i];
            }
        }
        return null;
    }

    //        поиск сотрудника в массиве по вхождению указанной строки в его имени
    public static Employee findBySubName(Employee[] array, String subName) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getName().contains(subName)) {
                return array[i];
            }
        }
        return null;
    }

    //        подсчет зарплатного бюджета для всех сотрудников в массиве
    public static int  getSalarySum(Employee[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i].getSalary();
        }
        return result;
    }

//        поиск наименьшей зарплаты в массиве
//        поиск наименьшего количества подчиненных в массиве менеджеров
    public static Manager getMinSubordinates(Manager[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        Manager result = array[0];
        for (int i = 1; i < array.length; i++) {
            if (result.getNumberOfSubordinates() > array[i].getNumberOfSubordinates()) {
                result = array[i];
            }
        }
        return result;
    }

//        поиск наибольшей зарплаты в массиве
//        поиск наименьшего количества подчиненных в массиве менеджеров
//        поиск наибольшего количества подчиненных в массиве менеджеров
//        поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров
//        поиск наименьшей надбавки (разнице между базовой ставки и зарплатой) в массиве менеджеров
}