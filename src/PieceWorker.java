public class PieceWorker extends Employee {
    private double unitsProduced;
    public PieceWorker (String firstName, String lastName, double unitsProduced) {
        super(firstName,lastName);
        this.unitsProduced = unitsProduced;
    }
    public void setUnitsProduced (double unitsProduced) {
        this.unitsProduced = unitsProduced;
    }
    public double getUnitsProduced() {
        return unitsProduced;
    }
    public void calculateMonthlyPay() {
        System.out.println("Name: "+(getFirstName()+" "+getLastName())+"\n"+"Pay Type: "+"Piece Worker"+"\n"+"Monthly Pay: "+(unitsProduced*1));
    }
}
