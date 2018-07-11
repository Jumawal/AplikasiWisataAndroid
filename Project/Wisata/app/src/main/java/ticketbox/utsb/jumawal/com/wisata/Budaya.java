package ticketbox.utsb.jumawal.com.wisata;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.app.ListActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Budaya extends AppCompatActivity {
    ListView listView;
    String[] itemname ={
            "Kolam Renang Aiq Bukaq",
            "Kolam Renang Joben",
            "Kolam Renang Lembah Hijau",
            "Kolam Renang Lemor",
            "Kolam Renang Narmada",
            "Kolam Renang Putri Duyung"
    };

    Integer[] gambar ={
            R.drawable.aiq_bukak,
            R.drawable.joben,
            R.drawable.lembah_hijau,
            R.drawable.lemor,
            R.drawable.narmada,
            R.drawable.seng
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budaya);

        this.setTitle("Kolam Renang");
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        PantaiAdaptar pantaiAdaptar = new PantaiAdaptar(this, itemname ,gambar);
        listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(pantaiAdaptar);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = null;
                if (itemname[i].equals("Kolam Renang Aiq Bukaq")) {
                    intent = new Intent(Budaya.this, Kolamaikbukak.class);
                    startActivity(intent);
                }else if (itemname[i].equals("Kolam Renang Joben")){
                    intent = new Intent(Budaya.this, KolamJoben.class);
                    startActivity(intent);
                }else if (itemname[i].equals("Kolam Renang Lembah Hijau")){
                    intent = new Intent(Budaya.this, KolamLembahHijau.class);
                    startActivity(intent);
                }else if (itemname[i].equals("Kolam Renang Lemor")){
                    intent = new Intent(Budaya.this, Kolamlemor.class);
                    startActivity(intent);
                }else if (itemname[i].equals("Kolam Renang Narmada")){
                    intent = new Intent(Budaya.this, KolamNarmada.class);
                    startActivity(intent);
                }else if (itemname[i].equals("Kolam Renang Putri Duyung")){
                    intent = new Intent(Budaya.this, Kolamduyung.class);
                    startActivity(intent);
                }
            }
        });
    }

}