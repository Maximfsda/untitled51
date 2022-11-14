public class Main {

    public static void bookAddition(Employee[] myEmployee, Employee employee) {
        for (int i = 0; i < myEmployee.length; i++) {
            if (myEmployee[i] == null) {
                myEmployee[i] = employee;
                break;
            }
        }
    }

    public static void allPrint(Employee[] myEmployee) {
        for (int i = 0; i < myEmployee.length; i++) {
            if (myEmployee[i] != null) {
                System.out.println(i + 1 + "-" + "" + myEmployee[i]);
            }
        }
    }

    public static int salaryCostsMonth(Employee[] myEmployee) {
        int salary = 0;
        for (int i = 0; i < myEmployee.length; i++) {
            if (myEmployee[i] != null) {
                salary += myEmployee[i].getSalary();
            }
        }
        return salary;
    }

    public static int averageWage(Employee[] myEmployee) {
        int numberEmployees = 0;
        int salary = 0;
        for (int i = 0; i < myEmployee.length; i++) {
            if (myEmployee[i] != null) {
                numberEmployees++;
            }
        }
        for (int i = 0; i < myEmployee.length; i++) {
            if (myEmployee[i] != null) {
                salary += myEmployee[i].getSalary();
            }
        }
        return salary / numberEmployees;
    }


    public static Employee salaryMin(Employee[] myEmployee) {
        Employee min = myEmployee[0];
        for (int i = 0; i < myEmployee.length; i++) {
            if (myEmployee[i] != null) {
                break;
            } else {
                min = myEmployee[i];
            }
        }
        for (int i = 0; i < myEmployee.length; i++) {
            if (myEmployee[i] != null) {
                if (myEmployee[i].getSalary() < min.getSalary()) {
                    min = myEmployee[i];
                }
            } else {
                break;
            }
        }
        return min;
    }

    public static Employee salaryMax(Employee[] myEmployee) {
        Employee max = myEmployee[0];
        for (int i = 0; i < myEmployee.length; i++) {
            if (myEmployee[i] != null) {
                break;
            } else {
                max = myEmployee[i];
            }
        }
        for (int i = 0; i < myEmployee.length; i++) {
            if (myEmployee[i] != null) {
                if (myEmployee[i].getSalary() > max.getSalary()) {
                    max = myEmployee[i];
                }
            } else {
                break;
            }
        }
        return max;
    }

    public static void nameEmployee(Employee[] myEmployee) {
        System.out.println("Список сотрудников: ");
        for (int i = 0; i < myEmployee.length; i++) {
            if (myEmployee[i] != null) {
                System.out.println(myEmployee[i].getName() + " " + myEmployee[i].getSurname() + " " + myEmployee[i].getPatronymic());
            }
        }
    }


    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        Employee one = new Employee("Лисицин", "максим", "Андреевич", 1, 18000);
        Employee two = new Employee("Евдокимов", "Олег", "Иванович", 2, 24000);
        Employee three = new Employee("карасев", "Глеб", "Генадьевич", 3, 13000);
        Employee four = new Employee("Кошкина", "Анна", "Викторовна", 4, 115000);
        Employee five = new Employee("Лимон", "Антон", "ростиславович", 5, 111000);

        bookAddition(employee, one);
        bookAddition(employee, two);
        bookAddition(employee, three);
        bookAddition(employee, four);
        bookAddition(employee, five);
        allPrint(employee);
        System.out.println();
        System.out.println("Cумму затрат на зарплаты в месяц :" + salaryCostsMonth(employee));
        System.out.println();
        System.out.println("Среднее значение зарплат : " + averageWage(employee));
        System.out.println();
        System.out.println("Сотрудник с min зп: " + "\n" + salaryMin(employee));
        System.out.println();
        System.out.println("Сотрудник с max зп: " + "\n" + salaryMax(employee));
        System.out.println();
        nameEmployee(employee);

    }
}