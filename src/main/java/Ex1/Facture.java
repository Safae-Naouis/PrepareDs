package Ex1;

public class Facture {
    double frais;
    public double getFraisTransport(double montant){
        if (montant <600){
             frais=45.0;
        }
        else {frais=0.0;}
        return frais;
    }
}
