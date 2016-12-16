package Control;

import Model.Blueprint;
import Model.Customer;

/**
 * Created by 204g11 on 09.12.2016.
 */
public class MainController {
    //Yo, Philipp, dis is your Métier.
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
        if(customer.getX() == 0 && customer.getY() == 0){
            if(customer.getZ() < blueprint.getHeigth() - 1){
                return true;
            }
        }
        return false;
    }

    /**
     * Überprüft, ob der Nutzer in der passenden Sektion ist, um eine Etage nach unten zu fahren.
     * Falls ja, so kann er herunterfahren, wenn eine weitere Etage vorhanden ist.
     * @return true, falls herunterfahren möglich, sonst false.
     */
    public boolean downEIsPossible(){
        if(customer.getX() == 0 && customer.getY() == 0){
            if(customer.getZ() > blueprint.getHeigth() - 1){
                return true;
            }
        }
        return false;
    }

    public boolean upIsPossible(){
        return true;
    }

    public boolean downIsPossible(){
        if(customer.getY() > blueprint.getLength() )
        return false;
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
    public void moveUpE(){
        if(upEIsPossible()){
            customer.moveUpE();
        }
    }

    public void moveDownE(){
        if(downEIsPossible()){
            customer.moveDownE();
        }
    }
}