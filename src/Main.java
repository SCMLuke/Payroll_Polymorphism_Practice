public class Main {
    public static void main(String[] args) {
        Employee bob = new Manager("Bob","Dinkus",40000);
        Employee tina = new PieceWorker("Tina", "Zena",1000);
        Employee sue = new Salaried("Sue", "Me",10);
        Employee richard = new Commissioned("Richard", "Rich",2000);


        bob.calculateMonthlyPay();
        tina.calculateMonthlyPay();
        sue.calculateMonthlyPay();
        richard.calculateMonthlyPay();
    }
}