public abstract class Action {
    private double cout;
    private String nom;

    public Action(double cout,String nom){
        this.cout = cout;
        this.nom = nom;
    }
    public abstract void action(Royaume r,Fabrique f);
}
