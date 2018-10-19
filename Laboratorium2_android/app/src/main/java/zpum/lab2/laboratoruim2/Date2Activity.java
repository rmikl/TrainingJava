package zpum.lab2.laboratoruim2;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

public class Date2Activity extends AppCompatActivity {

    DatePicker date;
    String data;
    EditText uz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date2);
        date = findViewById(R.id.datePicker3);
        Integer d,m,y;
        d= date.getDayOfMonth();
        m =date.getMonth();
        y=  date.getYear();
        data = new String ( d.toString() + "-" + m.toString() + "-" + y.toString() );
        uz =  findViewById(R.id.editTextUzasadnienie);


    }
    public void showCredentialDialog(View view){
        AlertDialog aD = new AlertDialog.Builder(Date2Activity.this).create();
        aD.setTitle("Dane z formularza");
        aD.setMessage(data + uz.getText().toString() );
        aD.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
        aD.show();
    }


}
