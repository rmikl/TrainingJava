package zpum.lab3.laboratorium3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.orm.SchemaGenerator;
import com.orm.SugarContext;
import com.orm.SugarDb;
import com.orm.SugarRecord;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Kontakt> listaKontaktow;
    EditText Nzw;
    EditText Nr;
    TextView Wysw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SugarContext.init(this);
        SchemaGenerator schemaGenerator = new
                SchemaGenerator(this);
        schemaGenerator.createDatabase(new
                SugarDb(this).getDB());
        this.listaKontaktow = new ArrayList<Kontakt>();
        Nzw = findViewById(R.id.editTextNazwa);
        Nr = findViewById(R.id.editTextNumer);
        Wysw = findViewById(R.id.textViewZawartosc);

    }

    public String szukanieElementu(String ID ){
        for (int i = 0  ;i <  listaKontaktow.size(); i++){
            if (listaKontaktow.get(i).Numer.equals(ID)){
                return listaKontaktow.get(i).Nazwa;
            }
        }
        return "";
    }

    public void usuwanieElementu(String id ){
        List<Kontakt> kontaktList = Kontakt.listAll(Kontakt.class);
       for (Kontakt i : kontaktList){
           if (i.Numer.equals(id))
               SugarRecord.delete(i);
       }
    }

    public void onClickUs (View view ){
        usuwanieElementu(Nr.getText().toString());
}

    public void dodanieElementu(String Nzw ,String ID ){
      Kontakt kon = new Kontakt(Nzw, ID);
      kon.save();
    }

    public void onClickWysw(View view){
        String returnValue = "Nazwa        ID\n";
        List<Kontakt> cts = Kontakt.listAll(Kontakt.class);
        for (Kontakt i : cts){
            returnValue = returnValue + i.getName() + "\n";
        }
        Wysw.setText(returnValue);
    }

    public void onClickDod(View view){
        dodanieElementu(Nzw.getText().toString(), Nr.getText().toString());
    }


}


