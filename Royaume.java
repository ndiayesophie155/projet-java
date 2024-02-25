import java.util.Arraylist;
import java.util.List;
import java.util.Random;

public class Royaume {
    private List<Village>villages;
    private Random random;

    public Royaume(){
        villages = new Arraylist<>();
        random = new Random();
    }
    public void ajouterVillage(Village village){
        villages.add(village);
    }
    public void vieillirVillages(){
        for(Village village:villages){
            village.vieillir();
        }
    }
    public void production() {
        for (Village village : villages) {
            village.production();
        }
    }
    public void collecterImpots() {
        for (Village village : villages) {
            village.impots();
        }
    }
    public void faireMourirVillageois() {
        for (Village village : villages) {
            village.mourir() ;
            }
        }
        public void ajouteHabitant (Roturier) {
        int randomIndex = random.nextInt(village.size());
        Village village = village.get(randomIndex);
        village.ajouterHabitant(r);
        }
        public void depense ( int montant){

        }
    }
    @Override
public Strimg toString(){
    StrimgBuilder sb = new StrimgBuilder();
    sb.append("Royaume:\n");
    for(Village village:villages){
        sb.append(village.toString()).append("\n");
    }
    return sb.toString();
         }
 int


