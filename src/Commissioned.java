public class Commissioned extends Employee {
    private double grossSales;
    public Commissioned (String firstName, String lastName, double grossSales) {
        super(firstName,lastName);
        this.grossSales = grossSales;
    }
    public void setGrossSales (double grossSales) {
        this.grossSales = grossSales;
    }
    public double getGrossSales() {
        return grossSales;
    }
    public void calculateMonthlyPay() {
        System.out.println("Name: "+(getFirstName()+" "+getLastName())+"\n"+"Pay Type: "+"Salaried"+"\n"+"Monthly Pay: "+(grossSales+(grossSales*0.10)));
    }
}
