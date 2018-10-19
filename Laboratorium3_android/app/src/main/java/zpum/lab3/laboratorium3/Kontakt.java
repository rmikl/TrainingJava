package zpum.lab3.laboratorium3;

import com.orm.SugarRecord;


/**
 * Created by rm on 2018-03-17.
 */

public class Kontakt extends SugarRecord {
    String Nazwa;
    String Numer;


    public Kontakt(String Nazwa, String Numer){
        this.Nazwa = Nazwa;
        this.Numer = Numer;
    }
    public Kontakt(){

    }

    public String getName(){
        return Nazwa +" " + Numer;
    }
}
