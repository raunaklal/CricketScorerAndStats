package com.raunak.android.cricketscorerandstats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toolbar mTopToolbar;
    String[] nameArray={"Kalindi Warriors"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTopToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(mTopToolbar);

        CustomAdapter whatever=new CustomAdapter(this,nameArray);

        listView=findViewById(R.id.list_view);
        listView.setAdapter(whatever);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id=item.getItemId();
        switch (id){
            case R.id.add_new_group:
                Toast.makeText(MainActivity.this,R.string.add_new_group, Toast.LENGTH_SHORT).show();
                return true;
            case R.id.delete_group:
                Toast.makeText(MainActivity.this,R.string.delete_group, Toast.LENGTH_SHORT).show();
                return true;
            case R.id.help:
                Toast.makeText(MainActivity.this, R.string.help, Toast.LENGTH_SHORT).show();
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

