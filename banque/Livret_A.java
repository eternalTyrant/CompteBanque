package banque;

public class Livre_A extends Compte{
 
    private double solde=0.0;

    public double getSolde(){return solde;}
    public void setSolde(double solde){this.solde+=solde;}

    Livre_A(){}
    Livre_A(double solde){
        if(solde<0) solde*=-1;
        this.solde=solde;
    }

    public double retirer(double somme){
        double tmp=0;
        if(solde>=somme) tmp = solde -= somme;

        return tmp;
    }

    public double virer(double somme, Livre_A compteDestination){

        if(solde>=somme){
            compteDestination.setSolde(somme);
            retirer(somme);
        }
        return solde;
    }

    @Override public String toString() {  return  "Solde : "+solde ; }

    public int main(){
        toString();
        Compte my_account = new Compte();
        Compte good_Account = new Compte(5000.00);

        good_Account.deposer(1000);
        good_Account.virer(5000.0,my_account);

        Livre_A my_livret A = new Livre_A();
        my_livret.deposer(100.10);

        System.out.println(good_Account.toString());
        return 0;
    }

}
