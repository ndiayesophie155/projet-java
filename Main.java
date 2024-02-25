public class Main{
    public static void main(String[]args){

    }
    public void initialize(){
        royaume = new Royaume(0,new Village(),new Paysan());
    }
    public void Jeu(int nombreTours){
        for(int i = 0;i < nombreTours;i++){
            Action action = joueur.prochaineAction(royaume.getArgent());
            royaume.effectuerAction(action);
        }
    }
    public void fin(){
        System.out.print("Resultat final:");
        System.out.print("Argent en caisse:"+royaume.getArgent());
        System.out.print("Nombre d'habitants:"+royaume.getNombreHabitants);
    }
}