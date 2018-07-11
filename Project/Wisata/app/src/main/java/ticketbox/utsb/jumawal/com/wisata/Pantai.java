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
import android.widget.Button;
import android.widget.ListView;

public class Pantai extends AppCompatActivity {
    Button btncemara, btnekas,btnfink, btnkuta,btnlabuanhaji,btnrambang,btnsenggigi,btnsurga;
    ListView listView;
    String[] itemname ={
            "Pantai Fink",
            "Pantai Senggigi",
            "Pantai Cemara",
            "Pantai Ekas",
            "Pantai Labuan Haji",
            "Pantai Kuta",
            "Pantai Rambang",
            "Pantai Surga"
    };

    Integer[] gambar ={
            R.drawable.pink,
            R.drawable.senggigi,
            R.drawable.cemara,
            R.drawable.ekas,
            R.drawable.labuan,
            R.drawable.kuta,
            R.drawable.rambang,
            R.drawable.surga
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantai);
        this.setTitle("Pantai");
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
                if (itemname[i].equals("Pantai Fink")) {
                    intent = new Intent(Pantai.this, PantaiFink.class);
                    startActivity(intent);
                } else if (itemname[i].equals("Pantai Senggigi")) {
                    intent = new Intent(Pantai.this, PantaiSenggigi.class);
                    startActivity(intent);
                }else if (itemname[i].equals("Pantai Cemara")){
                    intent = new Intent(Pantai.this, PantaiCemara.class);
                    startActivity(intent);
                }else if (itemname[i].equals("Pantai Ekas")){
                    intent = new Intent(Pantai.this, PantaiEkas.class);
                    startActivity(intent);
                }else if (itemname[i].equals("Pantai Labuan Haji")){
                    intent = new Intent(Pantai.this, PantaiLabuanHaji.class);
                    startActivity(intent);
                }else if (itemname[i].equals("Pantai Kuta")){
                    intent = new Intent(Pantai.this, PantaiKuta.class);
                    startActivity(intent);
                }else if (itemname[i].equals("Pantai Rambang")){
                    intent = new Intent(Pantai.this, PantaiRambang.class);
                    startActivity(intent);
                }else if (itemname[i].equals("Pantai Surga")){
                    intent = new Intent(Pantai.this, PantaiSurga.class);
                    startActivity(intent);
                }
            }
        });
    }
}