package com.rajat6393gmail.gymr.feature;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            int id = item.getItemId();
            if (id == R.id.navigation_exercises) {
                mTextMessage.setText(R.string.title_exercises);
                return true;
            } else if (id == R.id.navigation_workouts) {
                mTextMessage.setText(R.string.title_workouts);
                return true;
            } else if (id == R.id.navigation_custom) {
                mTextMessage.setText(R.string.title_custom);
                return true;
            }
            else if (id == R.id.navigation_profile) {
                mTextMessage.setText(R.string.title_profile);
                return true;}
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
