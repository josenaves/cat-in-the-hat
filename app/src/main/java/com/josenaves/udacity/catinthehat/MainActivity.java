package com.josenaves.udacity.catinthehat;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    private Button btTheCat;
    private Button btTheThing1;
    private Button btTheThing2;
    private Button btThingamajigger;
    private Button btSally;
    private Button btNick;
    private Button btDrSeuss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);

        this.btTheCat = (Button)findViewById(R.id.button_the_cat);
        this.btTheCat.setOnClickListener(this);

        this.btTheThing1 = (Button)findViewById(R.id.button_thing_1);
        this.btTheThing1.setOnClickListener(this);

        this.btTheThing2 = (Button)findViewById(R.id.button_thing_2);
        this.btTheThing2.setOnClickListener(this);

        this.btThingamajigger = (Button)findViewById(R.id.button_thingamajigger);
        this.btThingamajigger.setOnClickListener(this);

        this.btSally = (Button)findViewById(R.id.button_sally);
        this.btSally.setOnClickListener(this);

        this.btNick = (Button)findViewById(R.id.button_nick);
        this.btNick.setOnClickListener(this);

        this.btDrSeuss = (Button)findViewById(R.id.button_drseuss);
        this.btDrSeuss.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "You just clicked on " +
                ((Button) view).getText() + " button.", Toast.LENGTH_SHORT).show();
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
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}