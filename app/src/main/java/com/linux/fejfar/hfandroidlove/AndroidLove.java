package com.linux.fejfar.hfandroidlove;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class AndroidLove extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_love);
    }

    public void onLoveButtonClicked(View view) {
        TextView textView = (TextView) findViewById(R.id.haikuTextView);
        Button showButton = (Button) findViewById(R.id.button2);
        if (textView.getVisibility() == view.INVISIBLE) {
            textView.setVisibility(view.VISIBLE);
            showButton.setText("Hide this Android Love");
        } else {
            textView.setVisibility(view.INVISIBLE);
            showButton.setText("Show me some Android Love!");
        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.android_love, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
