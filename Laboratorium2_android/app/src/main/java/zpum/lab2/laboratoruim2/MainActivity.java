package zpum.lab2.laboratoruim2;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {

    EditText haslo;
    EditText login;




public void showCredentialDialog(){
    AlertDialog aD = new AlertDialog.Builder(MainActivity.this).create();
    aD.setTitle("Blad Logowania");
    aD.setMessage("Bledne dane do logowania");
    aD.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
            new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            });
    aD.show();
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        haslo = findViewById(R.id.editTextHaslo);
        login = findViewById(R.id.editTextLogin);
    }

    public void logowanieOnclick(View view){
    String  hs = "123";
        if ( haslo.getText().toString().equals(hs) ) {
            Intent i = new Intent(getBaseContext(), Date2Activity.class);
            startActivity(i);
        } else showCredentialDialog();

    }

}
