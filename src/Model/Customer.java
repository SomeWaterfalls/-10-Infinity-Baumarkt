package Model;

/**
 * Created by SomeWaterfalls & Automatik-BlueBird on 09.12.2016.
 */
public class Customer {
    private Stack<Good> cart;
    private double budget;
    private double fullPrice = 0;
    private int x, y, z;

    /**
     * Ein Customer wird erzeugt und kriegt einen Einkaufswagen und ein Budget.
     */
    public Customer(double budget) {
        cart = new Stack<Good>();
        this.budget = budget;
        x = 0;
        y = 0;
        z = 0;
    }

    /**
     * @return gibt das Budget zurück. Eine Getter Methode. Braucht die wirklich eine Beschriftung?
     * Sie ist eigentlich selbsterklärend, aber gut.
     */
    public double getBudget() {
        return budget;
    }

    /**
     * Berechnet auf Aufruf den Preis der gesamten Waren, die sich im Stack befinden
     * Die abgelesenen Waren werden in ein Hilfsstack verschoben und nach dem Berechnen des Preises
     * wieder in den "cart" Stack zurückgeschoben. (Yuhuu, Hilfsstack! :D)
     * @return gibt den gesamten Preis der Waren zurück.
     */

    public double whatToPay() {
        Stack<Good> helper = new Stack<Good>();
        while (!cart.isEmpty()){
            fullPrice = fullPrice + cart.top().getPrice();
            helper.push(cart.top());
            cart.pop();
         }
        while (!helper.isEmpty()){
            cart.push(helper.top());
            helper.pop();
        }
        return fullPrice;
    }

    /**
     *
     * @return gibt zurück, ob das Budget ausreicht um die Waren zu bezahlen.
     */

    public boolean canIpay(){
        whatToPay();
        if(budget >= fullPrice){
            return true;
        }
        return false;
    }

    /**
     * Bezahlt die Waren, sofern möglich. Wenn nicht disst es dich.
     */
    public void pay(){
        if (canIpay()) {
            budget = budget - fullPrice;
        } else {
            System.out.println("Hey ma boi(or gal, or Apache Helicopter to calm tumblr down), what did you f*cking expect trying to buy some sh*t without cash?! Get lost, b*tch!");
        }
    }

    /**
     * Methoden um die Positon zu erfahren.
     * @return x Gibt die Etagenbreite zurück (links&rechts), y gibt die Etagenhöhe zurück (vor/zurück),
     * Hier steht also z für die Gebäudehöhe (hoch/runter)
     */
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getZ(){
        return z;
    }

    /**
     * Methoden zur Bewegung in alle Richtungen
     * -> Ob es möglich ist wird im MainController überprüft!
     */


    public void moveUp(){
        z = z + 1;
    }

    public void moveDown(){
        z = z - 1;
    }

    public void moveRight(){
        x = x + 1;
    }

    public void moveLeft(){
        x = x - 1;
    }

    public void moveForward(){
        y = y + 1;
    }

    public void moveBackwards(){
        y = y - 1;
    }

    /**
     * Grabbt eine gegebene Ware und wirft sie in den wunderbaren Infinity-Einkaufswagen™  (©Infinity-Baumarkt)
     */
    public void grabbinGoods(Good grab){
        cart.push(grab);
    }

    public void throwinGood(){
        if(!cart.isEmpty()) {
            cart.pop();
        }
    }

}










//©  ™