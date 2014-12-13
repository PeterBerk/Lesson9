public class FullTimeEmployee extends Employee{
    public FullTimeEmployee(String name, double rate, int hours){
        super(name, rate, hours);
        if (hours > 40){
            this.pay += rate*40;
            this.pay += rate*2*(hours-40);
        }
        else this.pay += rate*hours;
        Employee.totalPay += this.pay;
    }
}
