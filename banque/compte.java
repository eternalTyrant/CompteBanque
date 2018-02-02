package banque;

public class Compte {

    private double solde=0.0;

    public double getSolde(){return solde;}
    public void setSolde(double solde){this.solde+=solde;}

    Compte(){}
    Compte(double solde){
        if(solde<0) solde*=-1;
        this.solde=solde;
    }

    public void deposer(double somme){
        if(somme<0) somme*=-1;
        this.solde=somme;
    }

    public double retirer(double somme){
        double tmp=0;
        tmp = solde -= somme;

        return tmp;
    }

    public double virer(double somme, Compte compteDestination){

            compteDestination.setSolde(somme);
            retirer(somme);

        return solde;
    }

    @Override public String toString() {  return  "Solde : "+solde ; }



}
