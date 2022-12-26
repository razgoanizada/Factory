public class Manager extends Employee{

    private double wage;
    private int numOfWorkers;

    public Manager(String name, double wage, int numOfWorkers) {
        super(name);
        this.wage = wage;
        this.numOfWorkers = numOfWorkers;
    }


    public double getWage() {
        return wage;
    }

    public Manager setWage(double wage) {
        this.wage = wage;
        return this;
    }

    public int getNumOfWorkers() {
        return numOfWorkers;
    }

    public Manager setNumOfWorkers(int numOfWorkers) {
        this.numOfWorkers = numOfWorkers;
        return this;
    }



    @Override
    public double salary() {

        if (numOfWorkers <= 10)
            return wage;

        else if (numOfWorkers <= 20)
            return wage + (numOfWorkers * 50);


        return wage + 1000;

    }

    @Override
    public String toString() {
        return super.toString() + ", wage : " + salary() + ", workers: " + this.numOfWorkers;
    }


}
