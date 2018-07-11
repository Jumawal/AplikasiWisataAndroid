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

public class Airterjun extends AppCompatActivity {
    ListView listView;
    String[] itemname ={
            "Air Terjun Geripak",
            "Air Terjun Otak Kokoh",
            "Air Terjun Jeruk Manis",
            "Air Terjun Tiu Teja",
            "Air Terjun Benang Kelambu"
    };

    Integer[] gambar ={
            R.drawable.geripak,
            R.drawable.otak_kokoq,
            R.drawable.jerman,
            R.drawable.teja,
            R.drawable.a
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_airterjun);
        this.setTitle("Air Terjun");
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
                if (itemname[i].equals("Air Terjun Geripak")) {
                    intent = new Intent(Airterjun.this, AirTerjunGeripak.class);
                    startActivity(intent);
                }else if (itemname[i].equals("Air Terjun Otak Kokoh")){
                    intent = new Intent(Airterjun.this, AirTerjunOtakKokoh.class);
                    startActivity(intent);
                }else if (itemname[i].equals("Air Terjun Jeruk Manis")){
                    intent = new Intent(Airterjun.this, AirTerjunJerukManis.class);
                    startActivity(intent);
                }else if (itemname[i].equals("Air Terjun Tiu Teja")){
                    intent = new Intent(Airterjun.this, AirTerjunTiuTeja.class);
                    startActivity(intent);
                }else if (itemname[i].equals("Air Terjun Benang Kelambu")){
                    intent = new Intent(Airterjun.this, AirTerjunBenangKelambu.class);
                    startActivity(intent);
                }else if (itemname[i].equals("Air Terjun Pupas")){
                }
            }
        });
    }

}