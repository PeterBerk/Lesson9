public class PartTimeEmployee extends Employee{

    public PartTimeEmployee(String name, double rate, int hours){
        super(name, rate, hours);
        this.pay += rate*hours;
        Employee.totalPay += this.pay;
    }
}
