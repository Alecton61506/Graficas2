package ud.example.estado_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button miBoton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText( this,  "Se ejecuto el metodo onCreate", Toast.LENGTH_LONG);

        miBoton = findViewById(R.id.button);
        miBoton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Se ejecuto el metodo onPause", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Se ejecuto el metodo onPause", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Se ejecuto el metodo onResume", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Se ejecuto el metodo onStart", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Se ejecuto el metodo onDestroy", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Se ejecuto el metodo onStop", Toast.LENGTH_LONG).show();
    }


}