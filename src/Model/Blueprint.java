package Model;

/**
 * Created by Microsaft on 09.12.2016.
 */
public class Blueprint {

    //Referenzen
    private Section[][][] allSections;

    public Blueprint(){
        allSections = new Section[3][2][2];
    }


    /**
     *
     * @return Höhe des Gebäudes
     */
    public int getHeigth(){
        return allSections.length;
    }

    public int getEast(){
        return allSections[0].length;
    }

    public int getNorth(){
        return allSections[0][0].length;
    }

    /**
     * Gibt die Section (Also die Waren die da sind) für die eingegebene Position an..
     */

    public Section getSection(int z, int x, int y){
        return allSections[z][x][y];
    }
}
