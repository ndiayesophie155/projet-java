public class Jeu{
    private Royaume royaume;
    private FabriqueAction fabrique;
    private Joueur joueur;

    public Jeu(){
        royaume = new Royaume(0,new Village(),new Paysan());
        fabrique = new FabriqueAction();
        joueur = new JoueurInteractif();
    }


}