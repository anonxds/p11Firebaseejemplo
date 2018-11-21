package com.example.pc.p11firebaseejemplo;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText edNom, eDap, adCor, adpass;
private ListView ListV_personas;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edNom=findViewById(R.id.txt_nombrePersona);
        eDap=findViewById(R.id.txt_apellidoPersona);
        adCor=findViewById(R.id.txt_correoPersona);
        adpass=findViewById(R.id.txt_passwordPersona);
        ListV_personas=findViewById(R.id.p);



    }

    public boolean onCreateOptionMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item){
        String nombre =edNom.getText().toString();
        String apellido =eDap.getText().toString();
        String correo =adCor.getText().toString();
        String pass =adpass.getText().toString();
        switch (item.getItemId()){
            case  R.id.icon_add:
                Toast.makeText(this,"Agregar",Toast.LENGTH_SHORT).show();
                break;
            case  R.id.icon_save:
                Toast.makeText(this,"save",Toast.LENGTH_SHORT).show();
                break;
            case  R.id.icon_delete:
                Toast.makeText(this,"delete",Toast.LENGTH_SHORT).show();
                break;
                default:
                    break;


        }
        return true;
    }
}
