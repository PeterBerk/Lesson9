
abstract public class Employee {
       
    protected String name;
    protected double rate, pay;
    protected int hours;
    protected static double totalPay;
    public Employee(String name, double rate, int hours){
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setRate(double rate){
        this.rate = rate;
    }
    public void setHours(int hours){
        this.hours = hours;
    }
    public String getName(){
        return this.name;
    }
    public double getPay(){
        return this.pay;
    }
    public static double getTotalPay(){
        return totalPay;
    }
    
}
