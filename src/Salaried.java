public class Salaried extends Employee {
    private double yearsOfService;
    public Salaried (String firstName, String lastName, double yearsOfService) {
        super(firstName,lastName);
        this.yearsOfService = yearsOfService;
    }
    public void setYearsOfService (double yearsOfService) {
        this.yearsOfService = yearsOfService;
    }
    public double getYearsOfService() {
        return yearsOfService;
    }
    public void calculateMonthlyPay() {
        System.out.println("Name: "+(getFirstName()+" "+getLastName())+"\n"+"Pay Type: "+"Salaried"+"\n"+"Monthly Pay: "+((50000/12)+(50000*0.01+yearsOfService)));
    }
}
