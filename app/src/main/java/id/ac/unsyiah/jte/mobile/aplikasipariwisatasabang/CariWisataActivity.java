package id.ac.unsyiah.jte.mobile.aplikasipariwisatasabang;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class CariWisataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cari_wisata, menu);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void doTugu(View view) {
        Intent intent = new Intent(this, TuguActivity.class);
        startActivity(intent);
    }
    public void doIboih(View view) {
        Intent intent = new Intent(this, IboihActivity.class);
        startActivity(intent);
    }
    public void doAneukLaot(View view) {
        Intent intent = new Intent(this, AneukLaotActivity.class);
        startActivity(intent);
    }
    public void doRubiah(View view) {
        Intent intent = new Intent(this, PulauRubiahActivity.class);
        startActivity(intent);
    }
    public void doGapang(View view) {
        Intent intent = new Intent(this, PantaiGapangActivity.class);
        startActivity(intent);
    }
    public void doParadiso(View view) {
        Intent intent = new Intent(this, ParadisoActivity.class);
        startActivity(intent);
    }
    public void doTapakGajah(View view) {
        Intent intent = new Intent(this, TapakGajahActivity.class);
        startActivity(intent);
    }
    public void doAngen(View view){
        Intent intent = new Intent(this, AngenActivity.class);
        startActivity(intent);
    }
    public void doPriaLaot(View view){
        Intent intent = new Intent(this, PriaLaotActivity.class);
        startActivity(intent);
    }
    public void doJaboi(View view){
        Intent intent = new Intent(this, JaboiActivity.class);
        startActivity(intent);
    }
    public void doKeuneukai(View view){
        Intent intent = new Intent(this, KeuneukaiActivity.class);
        startActivity(intent);
    }
}



