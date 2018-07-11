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

public class Gunung extends AppCompatActivity {
    ListView listView;
    String[] itemname ={
            "Gunung Rinjani",
            "Gunung Baru Jari"
    };

    Integer[] gambar ={
            R.drawable.gunungrinjani,
            R.drawable.rinjani
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_airterjun);
        this.setTitle("Gunung");
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
                if (itemname[i].equals("Gunung Rinjani")) {
                    intent = new Intent(Gunung.this, GunungRinjani.class);
                    startActivity(intent);
                }else if (itemname[i].equals("Gunung Baru Jari")){
                    intent = new Intent(Gunung.this, GunungBarujari.class);
                    startActivity(intent);
                }
            }
        });
    }

}