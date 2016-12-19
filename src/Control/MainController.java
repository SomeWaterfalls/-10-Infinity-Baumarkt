package Control;

import Model.Blueprint;
import Model.Customer;
import com.sun.xml.internal.bind.v2.TODO;

/**
 * Created by 204g11 on 09.12.2016.
 */
public class MainController {
    //Yo, Philipp, dis is your Métier.
    private Customer customer;
    private Blueprint blueprint;

    public MainController(){
        customer = new Model.Customer(500);
        blueprint = new Model.Blueprint();
    }

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
        return true;
    }

    public boolean leftIsPossible(){
        return true;
    }

    public boolean rightIsPossible(){return true;
    }

    /**
     * Customer kann sich nach Oben, Unten, Links oder/und Rechts bewegen !!! 0_0
     * @return
     */

    public boolean moveUp(){
        if(upIsPossible()){
            customer.moveForward();
        }
        return false;
    }

    public boolean moveDown(){
        if (downIsPossible()){
            customer.moveBackwards();
        }
        return false;
    }

    public boolean moveLeft(){
        if (leftIsPossible()){
            customer.moveLeft();
        }
        return false;
    }

    public boolean moveRight() {
        if(rightIsPossible()) {
            customer.moveRight();
        }
        return false;
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


    /**
     * Rechnet alle Preise im Einkaufswagen zusammen und gibt diesen in Euro an
     * @return
     */
    public int value(){
        return -1;
    }

    /**
     * Soll Inhalt des Shoppingcarts angeben
     */
    public void cartSubstance(){

    }

    /**
     * Soll die Etagezahl anzeigen
     */
    public int showLevel(){
        return -1;
    }

    public int sectorHandler(){
        return -1;
    }
}
