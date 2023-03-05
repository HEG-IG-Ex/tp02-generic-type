public class Account extends Data implements Additionable<Double>{
    private double solde;

    public Account(int no, double solde) {
        super(no);
        this.setSolde(solde);
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public Double getMemberToAddition() {
        return new Double(solde);
    }
}
