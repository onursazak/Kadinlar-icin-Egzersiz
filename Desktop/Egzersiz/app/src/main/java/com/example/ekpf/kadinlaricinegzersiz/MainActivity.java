package com.example.ekpf.kadinlaricinegzersiz;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }





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
        if (id == R.id.action_settings) {
            ayarlarJavaClassFragment ayarlarFragment=new ayarlarJavaClassFragment();
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter,R.anim.exit,R.anim.pop_enter, R.anim.pop_exit)
                    .replace(R.id.content_main,ayarlarFragment)
                    .addToBackStack(null)
                    .commit();
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.IsinmaItem) {
            IsinmaEkraniFragment isinmaObject=new IsinmaEkraniFragment();
            getSupportFragmentManager().beginTransaction()
                     .setCustomAnimations(R.anim.enter,R.anim.exit,R.anim.pop_enter, R.anim.pop_exit)
                    .replace(R.id.content_main,isinmaObject)
                    .addToBackStack(null)
                    .commit();
        } else if (id == R.id.altVucutItem) {
            altVucutFragment tansiyonObject=new altVucutFragment();
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter,R.anim.exit,R.anim.pop_enter, R.anim.pop_exit)
                    .replace(R.id.content_main,tansiyonObject)
                    .addToBackStack(null)
                    .commit();

        } else if (id == R.id.ustVucutItem) {
            ustVucutFragment ustVucutObj= new ustVucutFragment();
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter,R.anim.exit,R.anim.pop_enter, R.anim.pop_exit)
                    .replace(R.id.content_main,ustVucutObj)
                    .addToBackStack(null)
                    .commit();


        }

        else if (id == R.id.notlarimItem) {
            NotlarFragment notObject=new NotlarFragment();
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter,R.anim.exit,R.anim.pop_enter, R.anim.pop_exit)
                    .replace(R.id.content_main,notObject)
                    .addToBackStack(null)
                    .commit();

        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
