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
}
