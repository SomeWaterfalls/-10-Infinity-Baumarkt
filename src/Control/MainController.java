package Control;

/**
 * Created by 204g11 on 09.12.2016.
 */
public class MainController {
    //Yo, Phillip, dis is your Métier.

    //Etagenzahl liefern, aktuelle Section, Etagenbreite und höhe aus Blueprint-Objekt weiterleiten
    //TODO
    public int getLevelCount() {
        return 3;
    }

    //TODO
    public boolean upEIsPossible(){
        return true;
    }

    public boolean downEIsPossible(){
        return true;
    }

    public boolean upIsPossible(){
        return true;
    }

    public boolean downIsPossible(){
        return true;
    }

    public boolean leftIsPossible(){
        return true;
    }

    public boolean rightIsPossible(){
        return true;
    }

    /**
     * Der Nutzer fährt eine Etage höher, falls er in der dazu passenden Section ist und weitere Etagen nach oben vorhanden sind.
     * Ansonsten passiert nichts.
     */
    public void moveUp(){

    }

    public void moveDown(){

    }

    /**
     * Rechnet alle Preise im Einkaufswagen zusammen und gibt diesen in Euro an
     * @return
     */
    public int value(){

    }
}