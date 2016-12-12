package Model;

/**
 * Created by SomeWaterfalls & Automatik-BlueBird on 12.12.2016.
 */
public class Good {
    private String name;
    private double price;
    private int xPos;
    private int yPos;
    private int zPos;

    /**
     * Die Ware wird erstellt, erhält einen Namen und Preis und einen Ort, welcher später im Array zu finden ist.
     */
    public Good(String name, double price, int x, int y, int z){
        this.name = name;
        this.price = price;
        xPos = x;
        yPos = y;
        zPos = z;
    }

    /**
     * Die Getter Methode für den Namen.
     */
    public String getName(){
        return name;
    }

    /**
     * Noch eine Getter Methode für den Preis.
     */
    public double getPrice(){
        return price;
    }

    /**
     * Getter Methode die als String die Position zurückgibt,
     * welche aus x(Länge), y(Breite) und z(Höhe) zusammengesetzt wird.
     */

    public String getPosition(){
        String hilf;
        hilf = "x = " + xPos + "\n" + "y = " + yPos + "\n" + "Etage = " + zPos;
        return hilf;
    }

}
