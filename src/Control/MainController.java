package Control;

import Model.Blueprint;
import Model.Customer;

/**
 * Created by 204g11 on 09.12.2016.
 */
public class MainController {
    //Yo, Phillip, dis is your Métier.
    private Customer customer;
    private Blueprint blueprint;

    //Etagenzahl liefern, aktuelle Section, Etagenbreite und höhe aus Blueprint-Objekt weiterleiten
    //TODO
    public int getLevelCount() {
        return 3;
    }

    //TODO

    /**
     * Überprüft, ob der Nutzer in der passenden Sektion ist, um eine Etage nach oben zu fahren.
     * Falls ja, so kann er hochfahren, wenn eine weitere Etage vorhanden ist.
     * @return true, falls hochfahren möglich, sonst false.
     */
    public boolean upEIsPossible(){
        if(customer.getX() == 0 && customer.getX() == 0){
            if(customer.getZ() < blueprint.getHeigth() - 1){
                return true;
            }
        }
        return false;
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
        if(upEIsPossible()){
            customer.moveUp();
        }
    }

    public void moveDown(){

    }

    /**
     * Rechnet alle Preise im Einkaufswagen zusammen und gibt diesen in Euro an
     * @return
     */
    public int value(){
        return -1;
    }
}