package com.coderbloc.aparnasridhar.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    public Toast mAppToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get the button reference
        Button catButton = (Button)findViewById(R.id.catButton);
        Button thingOneButton = (Button)findViewById(R.id.thingOneButton);
        Button thingTwoButton = (Button)findViewById(R.id.thingTwoButton);
        Button thingaButton = (Button)findViewById(R.id.thingaButton);
        Button sallyButton = (Button)findViewById(R.id.sallyButton);
        Button nickButton = (Button)findViewById(R.id.nickButton);
        Button doctorButton = (Button)findViewById(R.id.doctorButton);

        //Setup click listeners for buttons
        catButton.setOnClickListener(this);
        thingOneButton.setOnClickListener(this);
        thingTwoButton.setOnClickListener(this);
        thingaButton.setOnClickListener(this);
        sallyButton.setOnClickListener(this);
        nickButton.setOnClickListener(this);
        doctorButton.setOnClickListener(this);

    }

    /**
     * Override the onClick function to handle toasts for different buttons
     * @param v View
     */
    @Override
    public void onClick(View v) {
        //Switch based on button ID
        switch(v.getId()) {
            case R.id.catButton:
            {
                displayToast(getString(R.string.cat_button_toast));
                break;
            }

            case R.id.thingOneButton:
            {
                displayToast(getString(R.string.thing_one_button_toast));
                break;
            }
            case R.id.thingTwoButton:
            {
                displayToast(getString(R.string.thing_two_button_toast));
                break;
            }
            case R.id.thingaButton:
            {
                displayToast(getString(R.string.thingamajing_button_toast));
                break;
            }
            case R.id.sallyButton:
            {
                displayToast(getString(R.string.sally_button_toast));
                break;
            }
            case R.id.nickButton:
            {
                displayToast(getString(R.string.nick_button_toast));
                break;
            }
            case R.id.doctorButton:
            {
                displayToast(getString(R.string.dr_seuss_button_toast));
                break;
            }
        }
    }

    /**
     * Display a toast message
     * @param msg - Message to display in the toast
     */
    private void displayToast(String msg) {
        //Stop any previous toasts
        if(mAppToast !=null){
            mAppToast.cancel();
        }
        //Make and display new toast
        mAppToast = Toast.makeText(this,msg,Toast.LENGTH_SHORT);
        mAppToast.show();

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
