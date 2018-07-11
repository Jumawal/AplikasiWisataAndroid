package ticketbox.utsb.jumawal.com.wisata;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class wisata extends AppCompatActivity {
Button btnPantai, btnGunung,btnBudaya, btnAir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata);
        this.setTitle("Wisata Lombok");
        btnPantai = (Button) findViewById(R.id.btn_pantai);
        btnGunung = (Button) findViewById(R.id.btn_gunung);
        btnBudaya = (Button) findViewById(R.id.btn_budaya);
        btnAir=(Button) findViewById(R.id.btn_airterjun);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        btnPantai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(wisata.this, Pantai.class);
                startActivity(intent);
            }
        });
        btnGunung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(wisata.this,Gunung.class);
                startActivity(intent);
            }
        });
        btnBudaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(wisata.this,Budaya.class);
                startActivity(intent);
            }
        });
        btnAir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(wisata.this, Airterjun.class);
                startActivity(intent);
            }
        });
    }


//    public void Pantai(View view) {
//        Intent intent = new Intent(wisata.this, Pantai.class);
//        startActivity(intent);
//
//    }
}
