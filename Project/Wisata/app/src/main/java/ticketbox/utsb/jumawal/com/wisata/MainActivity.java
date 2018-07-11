package ticketbox.utsb.jumawal.com.wisata;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Home");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.btn_settings) {
            final Dialog dialog = new Dialog(context);
            dialog.setContentView(R.layout.activity_about);
            dialog.setTitle("Info Aplikasi");

            TextView tek1 = (TextView) dialog.findViewById(R.id.tek1);
            ImageView logo = (ImageView) dialog.findViewById(R.id.logo);
            TextView tek2 = (TextView) dialog.findViewById(R.id.tek2);
            TextView tek3 = (TextView) dialog.findViewById(R.id.tek3);
            TextView tek5 = (TextView) dialog.findViewById(R.id.tek5);
            tek5.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://stiki.ac.id/"));
                    startActivity(intent);
                }
            });
            TextView tek4 = (TextView) dialog.findViewById(R.id.tek4);
            tek4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:151111018@mhs.stiki.ac.id"));
                    startActivity(intent);
                }
            });
            Button btok = (Button) dialog.findViewById(R.id.btok);
            btok.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                }
            });

            dialog.show();




        }else if (id == R.id.btn_help){
            Intent intent = new Intent(MainActivity.this, Help.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
         if (id == R.id.nav_wisata) {
            Intent intent = new Intent(MainActivity.this, wisata.class);
            startActivity(intent);

        } else if (id == R.id.nav_about){
             final Dialog dialog = new Dialog(context);
             dialog.setContentView(R.layout.activity_about);
             dialog.setTitle("Info Aplikasi");

             TextView tek1 = (TextView) dialog.findViewById(R.id.tek1);
             ImageView logo = (ImageView) dialog.findViewById(R.id.logo);
             TextView tek2 = (TextView) dialog.findViewById(R.id.tek2);
             TextView tek3 = (TextView) dialog.findViewById(R.id.tek3);
             TextView tek5 = (TextView) dialog.findViewById(R.id.tek5);
             tek5.setOnClickListener(new View.OnClickListener() {

                 @Override
                 public void onClick(View v) {
                     // TODO Auto-generated method stub
                     Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://stiki.ac.id/"));
                     startActivity(intent);
                 }
             });
             TextView tek4 = (TextView) dialog.findViewById(R.id.tek4);
             tek4.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     // TODO Auto-generated method stub
                     Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:151111018@mhs.stiki.ac.id"));
                     startActivity(intent);
                 }
             });
             Button btok = (Button) dialog.findViewById(R.id.btok);
             btok.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     dialog.dismiss();
                 }
             });

             dialog.show();

         }else if (id == R.id.nav_sejarah){
             Intent intent = new Intent(MainActivity.this, SejarahLombok.class);
             startActivity(intent);
         }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
