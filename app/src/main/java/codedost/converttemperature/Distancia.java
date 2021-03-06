package codedost.converttemperature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Distancia extends AppCompatActivity {

    Button convertir=null;
    EditText cantidad=null;
    TextView resultado=null;
    Spinner spincl= null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);

        convertir=(Button)findViewById(R.id.btntem);
        cantidad=(EditText)findViewById(R.id.cant);
        resultado=(TextView)findViewById(R.id.Resu);
        spincl=(Spinner)findViewById(R.id.spinla);

        String[]op={"Selecciona una opcion","Metro a centimetro","centimetro a metro"};
        ArrayAdapter<String>adapter= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,op);
        spincl.setAdapter(adapter);
        convertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cantidad.getText().toString().equals("")){
                    Toast msg=Toast.makeText(getApplicationContext(),"Escribe una cantidad",Toast.LENGTH_SHORT);
                    msg.show();

                }else
                {
                    Double c=Double.parseDouble(cantidad.getText().toString());
                    Double res=null;
                    int select=spincl.getSelectedItemPosition();
                    switch (select){
                        case 0:
                            Toast.makeText(getApplicationContext(),"selecciona una opcion",Toast.LENGTH_SHORT).show();
                            break;
                        case 1:
                            res=c*100;
                            break;
                        case 2:
                            res=c/100;
                            break;
                    }
                    resultado.setText(res.toString());
                }
            }
        });
    }
}

