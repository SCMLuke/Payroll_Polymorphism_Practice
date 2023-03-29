public class Manager extends Employee {
    private double monthlyBonusAmount;
    public Manager (String firstName, String lastName, double monthlyBonusAmount) {
        super(firstName,lastName);
        this.monthlyBonusAmount=monthlyBonusAmount;
    }
    public void setMonthlyBonusAmount (double monthlyBonusAmount) {
        this.monthlyBonusAmount = monthlyBonusAmount;
    }
    public double getMonthlyBonusAmount() {
        return monthlyBonusAmount;
    }
    public void calculateMonthlyPay() {
        System.out.println("Name: "+(getFirstName()+" "+getLastName())+"\n"+"Pay Type: "+"Commissioned"+"\n"+"Monthly Pay: "+((100000/12)+monthlyBonusAmount));
    }
}
