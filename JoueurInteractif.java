import java.util.Scanner;

public class JoueurInteractif implements Joueur{
    private Scanner scanner;
    private FabriqueAction fabriqueAction;

    public JoueurInteractif(){
        scanner = new Scanner(System.in);
        fabriqueAction = new FabriqueAction();
    }

    @Override
    public Action prochaineAction(int argent){
        System.out.println("Quelle action souhaitez-vous effectuer ?");
        String choix = scanner.nextLine();

        return fabriqueAction.creerAction(choix,argent);
    }
}