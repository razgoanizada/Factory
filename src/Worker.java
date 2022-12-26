public class Worker extends Employee{

    private double wagePerHours;
    private int hours;

    public Worker(String name, double wagePerHours, int hours) {
        super(name);
        this.wagePerHours = wagePerHours;
        this.hours = hours;
    }


    public double getWagePerHours() {
        return wagePerHours;
    }

    public Worker setWagePerHours(double wagePerHours) {
        this.wagePerHours = wagePerHours;
        return this;
    }

    public int getHours() {
        return hours;
    }

    public Worker setHours(int hours) {
        this.hours = hours;
        return this;
    }

    @Override
    public double salary() {
        return this.hours * this.wagePerHours;
    }


    @Override
    public String toString() {

        return super.toString() + ", wage : " + this.wagePerHours + ", hours: " + this.hours;

    }
}
