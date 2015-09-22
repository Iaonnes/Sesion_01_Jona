package app.jayjay.com.inicio_sesion;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.Toast;

import static app.jayjay.com.inicio_sesion.R.id.txtContraseña;
import static app.jayjay.com.inicio_sesion.R.id.txtUsuario;

public class MainActivity extends AppCompatActivity {


    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = (Button) findViewById(R.id.btnInicio);

          boton.setOnClickListener(new View.OnClickListener(){


              @Override
              public void onClick(View v) {
                  String usuario = ((EditText)findViewById(R.id.txtUsuario)).getText().toString();
                  String contraseña = ((EditText)findViewById(R.id.txtContraseña)).getText().toString();

                  if(usuario.equals("admin") && contraseña.equals("admin")){

                      Intent newform = new Intent(MainActivity.this, Saludo.class);
                      startActivity(newform);

                  }
                  else {
                      Toast.makeText(boton.getContext(),"ERROR",Toast.LENGTH_SHORT).show();
                  }
              }

         });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
