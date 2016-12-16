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
     * >> Wird nur beim bezahlen aufgerufen -> Daher (vorerst) kein HilfsStack
     * @return gibt den gesamten Preis der Waren zurück.
     */

    //Hier ein Hilfsstack einfügen, Damit die Waren nicht verschwinden.
    //Notiz an Patti: Schande für deine Faulheit!!
    public double whatToPay() {
        while (!cart.isEmpty()){
            fullPrice = fullPrice + cart.top().getPrice();
            cart.pop();
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

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getZ(){
        return z;
    }

    public void moveUpE(){
        z = z  + 1;
    }

    public void moveDownE(){
        z = z - 1;
    }

    public void moveUp(){
        y = y + 1;
    }

    public void moveDown(){
        y = y - 1;
    }

    public void moveLeft(){
        x = x - 1;
    }

    public void moveRight(){
        x = x + 1;
    }
}
