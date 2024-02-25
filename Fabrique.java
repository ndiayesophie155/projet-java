public class Fabrique{
    private int capaciteInitial;
    private int pdvInitial;

    public Fabrique(int capaciteInitiale, int pdvInitialale ){
        this.capaciteInitial = capaciteInitiale;
        this.pdvInitial = pdvInitialale;
    }
    public Paysan creerPaysan(){
        return new Paysan(capaciteInitiale,pdvInitial);
    }
    public Village creerVillage(){
        return new Village(capaciteInitial,pdvInitial);
    }
}
