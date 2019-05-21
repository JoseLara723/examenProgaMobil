package codedost.converttemperature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button temperatura=null;
    Button area=null;
    Button distancia=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        temperatura=(Button)findViewById(R.id.btn1);
        temperatura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cambiar=new Intent(getApplicationContext(),Temperatura.class);
                startActivity(cambiar);
            }
        });
        area=(Button)findViewById(R.id.btn2);
        area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cambiar1=new Intent(getApplicationContext(),Area.class);
                startActivity(cambiar1);
            }
        });
        distancia=(Button)findViewById(R.id.btn3);
        area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cambiar2=new Intent(getApplicationContext(),Distancia.class);
                startActivity(cambiar2);
            }
        });
    }
}
