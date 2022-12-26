public class Main {
    public static void main(String[] args) {

      Factory factory = new Factory();

        Worker raz = new Worker("raz", 50, 10);
        Worker elad = new Worker("elad", 48, 15);
        Manager chen = new Manager("chen", 15678, 59);
        Manager shani = new Manager("shani", 14521, 58);


        factory.addEmployee(raz);
        factory.addEmployee(elad);
        factory.addEmployee(chen);
        factory.addEmployee(shani);

      System.out.println(factory.numOfWorkers());
      System.out.println(factory.mostManager());
      System.out.println(factory.minHours());
      System.out.println(factory.maxSalary());
      System.out.println(factory.getByName("raz"));
      System.out.println(factory);
      System.out.println(factory.salaryByName("raz"));


    }
}