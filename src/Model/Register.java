package Model;

/**
 * Created by SomeWaterfalls & Automatik-BlueBird on 09.12.2016.
 */
public class Register {
    private Queue<Customer> queue;

    /**
     * Die Kasse wird erstellt und erhält eine Schlange.
     * Die Schlange ist keine Giftschlange.
     */
    public Register(){
        queue = new Queue();

    }

    /**
     * Lässt einen Kunden (sofern einer in der Schlange steht) bezahlen und gibt ihn frei.
     * Wenn er nicht zahlen kann wird sein Einkaufswagen geklaut und er wird rausgeworfen.
     * Wenn kein Kunde da ist wirst du erneut gedisst, u turd <3
     */
    public void checkOut(){
        if (!queue.isEmpty()) {
            Customer c = queue.front();
            c.pay();
            queue.dequeue();
        }else{
            System.out.println("No customers here u suc*er!");
        }
    }
}
