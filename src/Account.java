public class Account implements Additionable<Double>{
    private int no;
    private double solde;


    @Override
    public Double getMemberToAddition() {
        return new Double(solde);
    }
}
