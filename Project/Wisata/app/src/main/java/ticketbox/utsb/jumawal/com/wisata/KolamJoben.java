package ticketbox.utsb.jumawal.com.wisata;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatRatingBar;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

public class KolamJoben extends AppCompatActivity implements View.OnClickListener {
    private EditText editTextEmail;
    private EditText editTextcoment;
    private TextView getRating;

    WebView view;
    private Button Submit;
    private AppCompatRatingBar RatingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kolam_joben);
        this.setTitle("Kolam Renang Joben");
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


        view = (WebView) findViewById(R.id.rating);
        view.getSettings().setJavaScriptEnabled(true);
        view.getSettings().setLoadsImagesAutomatically(true);
        view.getSettings().setDatabaseEnabled(true);
        view.getSettings().setSupportZoom(true);
        view.getSettings().setTextZoom(110);
        view.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        String url = "http://192.168.43.141/wisata/joben.php";
        view.loadUrl(url);
        view.setWebViewClient(new WebViewClient());

        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextcoment = (EditText) findViewById(R.id.editTextcoment);
        getRating = findViewById(R.id.rate);
        Submit = findViewById(R.id.submit);
        RatingBar = findViewById(R.id.penilaian);
        RatingBar.setOnRatingBarChangeListener(new android.widget.RatingBar.OnRatingBarChangeListener(){
            @Override
            public void onRatingChanged(android.widget.RatingBar ratingBar, float nilai, boolean b) {
                // Nilai pada TextView Akan Berupa/Terupdate Saat Nilai Ratingnya Berubah
                getRating.setText(""+nilai);
            }
        });
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addEmployee();
                // Menampilkan Pesan Berupa Nilai Yang Di inputkan User Pada RatingBar
                Toast.makeText(getApplicationContext(), "Nilai Yang Anda Kirimkan: "+RatingBar.getRating(), Toast.LENGTH_SHORT).show();
            }
        });

    }
    private void addEmployee(){
        final String Email = editTextEmail.getText().toString().trim();
        final String coment = editTextcoment.getText().toString().trim();
        final String rating = getRating.getText().toString().trim();


        class AddEmployee extends AsyncTask<Void,Void,String> {

            ProgressDialog loading;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(KolamJoben.this,"Menambahkan...","Tunggu...",false,false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(KolamJoben.this,s, Toast.LENGTH_LONG).show();
            }

            @Override
            protected String doInBackground(Void... v) {
                HashMap<String,String> params = new HashMap<>();
                params.put(konfigurasi.KEY_EMP_jobenEmail,Email);
                params.put(konfigurasi.KEY_EMP_jobenKomentar,coment);
                params.put(konfigurasi.KEY_EMP_jobenRating,rating);


                RequestHandler rh = new RequestHandler();
                String res = rh.sendPostRequest(konfigurasi.URL_KOLAMRENANGJOBEN, params);
                return res;
            }
        }

        AddEmployee ae = new AddEmployee();
        ae.execute();
    }
    @Override
    public void onClick(View view) {

    }

}

