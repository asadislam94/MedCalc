package com.example.asadi.calc;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    return true;
                case R.id.navigation_dashboard:
                    return true;
                case R.id.navigation_notifications:
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Age Spinner
        Spinner agespinner = (Spinner) findViewById(R.id.agespinner);
        ArrayAdapter<String> agespinneradapter = new ArrayAdapter<String>(this,
                R.layout.spinnerview,R.id.multiline_spinner_text_view, Arrays.asList(getResources().getStringArray(R.array.Age_array)));
        agespinner.setAdapter(agespinneradapter);

        //Cardiac Spinner
        Spinner cardiacspinner = (Spinner) findViewById(R.id.cardiacSpinner);
        ArrayAdapter<String> cardiacspinneradapter = new ArrayAdapter<String>(this,
                R.layout.spinnerview,R.id.multiline_spinner_text_view, Arrays.asList(getResources().getStringArray(R.array.Cardiac_array)));
        cardiacspinner.setAdapter(cardiacspinneradapter);

        //Respiratory Spinner
        Spinner respiratoryspinner = (Spinner) findViewById(R.id.RespSpinner);
        ArrayAdapter<String> Respspinneradapter = new ArrayAdapter<String>(this,
                R.layout.spinnerview,R.id.multiline_spinner_text_view, Arrays.asList(getResources().getStringArray(R.array.Respiratory_array)));
        respiratoryspinner.setAdapter(Respspinneradapter);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
