public class Main {
    private static Employee[] employees = new Employee[10];

    public static void addEmployee(int index, String name, int department, double salary) {
        if (index >= 0 && index < employees.length) {
            employees[index] = new Employee(department, name, salary);
        } else {
            System.out.println("Вышли за пределы массива!");
        }
    }

    public static void printAllEmployees() {
        System.out.println("Список всех сотрудников:");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static double calculateTotalSalary() {
        double totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public static Employee findMinSalaryEmployee() {
        Employee minSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (minSalaryEmployee == null || employee.getSalary() < minSalaryEmployee.getSalary()) {
                    minSalaryEmployee = employee;
                }
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findMaxSalaryEmployee() {
        Employee maxSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (maxSalaryEmployee == null || employee.getSalary() > maxSalaryEmployee.getSalary()) {
                    maxSalaryEmployee = employee;
                }
            }
        }
        return maxSalaryEmployee;
    }

    public static double calculateAverageSalary() {
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                count++;
            }
        }
        if (count == 0) {
            return 0;
        } else {
            return calculateTotalSalary() / count;
        }
    }   public static void printAllNames() {
        System.out.println("ФИО всех сотрудников:");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getName());
            }
        }
    }
    public static void main(String[] args) {

        addEmployee(0,"Семен Свиридов",1,50000);
        addEmployee(1,"Елена Иванова",2,60000);
        addEmployee(2,"Аркадий Борисов",3,95000);
        addEmployee(3,"Софья Матвеева",4,115000);
        addEmployee(4,"Михаил Вольский",5,70000);

        printAllEmployees();

        System.out.println("Сумма затрат на зарплаты: " + calculateTotalSalary() + " руб.");

        System.out.println("Сотрудник с минимальной зарплатой: " + findMinSalaryEmployee() + " руб.");

        System.out.println("Сотрудник с максимальной зарплатой: " + findMaxSalaryEmployee() + " руб.");

        System.out.println("Среднее значение зарплат: " + calculateAverageSalary() + " руб.");

        printAllNames();
    }
}