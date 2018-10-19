package zpum.lab1.laboratiorium1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView wynik;
    EditText liczba1;
    EditText liczba2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wynik = findViewById(R.id.wynikTextView);
        liczba1 = findViewById(R.id.liczba1EditText);
        liczba2 = findViewById(R.id.liczba2EditText);

    }



    public void dodawanieOnclick(View view)
    {
        Integer l1 , l2, wyn;
        l1 = Integer.parseInt(liczba1.getText().toString());
        l2 = Integer.parseInt(liczba2.getText().toString());
        wyn = l1+ l2;
        wynik.setText(wyn.toString());

    }


    public void odejmowanieOnclick(View view)
    {
        Integer l1 , l2, wyn;
        l1 = Integer.parseInt(liczba1.getText().toString());
        l2 = Integer.parseInt(liczba2.getText().toString());
        wyn = l1 - l2;
        wynik.setText(wyn.toString());

    }



    public void mnozenieOnclick(View view)
    {
        Integer l1 , l2, wyn;
        l1 = Integer.parseInt(liczba1.getText().toString());
        l2 = Integer.parseInt(liczba2.getText().toString());
        wyn = l1 * l2;
        wynik.setText(wyn.toString());

    }
    public void dzielenieOnclick(View view)
    {
        Integer l1 , l2, wyn;

        l1 = Integer.parseInt(liczba1.getText().toString());
        l2 = Integer.parseInt(liczba2.getText().toString());
        if(l2 == 0 ){
            wynik.setText("nie można dzielic przez 0");
            return;
        }else {
        wyn = l1 / l2;
        wynik.setText(wyn.toString());
        }


    }


    public void moduloOnclick(View view)
    {
        Integer l1 , l2, wyn;
        l1 = Integer.parseInt(liczba1.getText().toString());
        l2 = Integer.parseInt(liczba2.getText().toString());
        wyn = l1 % l2;
        wynik.setText(wyn.toString());

    }


}
