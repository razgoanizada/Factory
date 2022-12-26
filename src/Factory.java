import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Factory{

    private Employee[] employees;
    private int numOfEmployees;
    private final int maxEmployees = 100;

    public Factory() {

        employees = new Employee[maxEmployees];
        numOfEmployees = 0;
    }

    public boolean addEmployee(Employee employee) {

        if (numOfEmployees< maxEmployees){
            employees[numOfEmployees] = employee;
            numOfEmployees++;
            return true;
        }

        return false;
    }

    public int numOfWorkers() {
        return numOfEmployees;
    }

    public Manager mostManager() {

        List<Manager> managers = new ArrayList<>();

        for (Employee employee : employees) {

            if (employee instanceof Manager)
                managers.add((Manager) employee);
        }

      return managers.stream()
              .reduce((manager, manager2) -> manager.getNumOfWorkers() > manager2.getNumOfWorkers() ? manager : manager2)
              .get();

    }


    public Worker minHours() {

        List<Worker> workers = new ArrayList<>();

        for (Employee employee : employees) {

            if (employee instanceof Worker)
                workers.add((Worker) employee);
        }

        return workers.stream()
                .reduce((worker, worker2) -> worker.getHours() < worker2.getHours() ? worker : worker2)
                .get();

    }


    public Employee maxSalary() {

        double max = 0;
        int get = 0;

        for (int i = 0; i < numOfEmployees; i++) {

            if (employees[i].salary() > max) {
                max = employees[i].salary();
                get = i;

            }
        }

        return employees[get];

    }


    public Employee getByName(String eName) {

        for (Employee employee : employees) {

            if (employee.getName() == eName)
                return employee;

        }

        return null;
    }

    @Override
    public String toString() {

        System.out.println("******************************************************************************");
        System.out.println("Workers in factory");
        for (int i = 0; i < numOfEmployees; i++) {

            System.out.println(employees[i].toString());

        }

        System.out.println("******************************************************************************");
       return "";
    }


    public double salaryByName(String eName) {

        for (Employee employee : employees) {


            if (employee.getName().equals(eName))
                return employee.salary();
        }


        return 0;
    }
}
