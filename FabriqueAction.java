import java.util.ArrayList;
import java.util.List;

public class FabriqueAction {
    private List<Action>list;

    public FabriqueAction(){
        list = new Arraylist<>();
        list.add(new Action(10,"AchatPaysan"));
        list.add(new Action(5,"Impot"));
        list.add(new Action(0,"Fin de Tour"));
    }
    public boolean actionCorrect(String nom){
        for(Action action : liste){
            if(action.getNom().equals(nom)){
                return true;
            }
        }
        return false;
    }
    public Action creer(String nom){
        for(Action action : liste){
            if (action.getNom().equals(nom)){
                return action;
            }
        }
        return null;

    }
}
