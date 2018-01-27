package com.example.asadi.calc;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Field;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner agespinner;
    Spinner cardiacspinner;
    Spinner respiratoryspinner;
    Spinner ECGspinner;
    Spinner SystolicBPspinner;
    Spinner Pulsespinner;
    Spinner Haemoglobinspinner;
    Spinner wbcspinner;
    Spinner ureaspinner;
    Spinner sodiumspinner;
    Spinner potassiumspinner;
    Spinner GCSspinner;
    Spinner OpSeverspinner;
    Spinner proceduresspinner;
    Spinner bloodlossspinner;
    Spinner peritonealspinner;
    Spinner malignancyspinner;
    Spinner urgencyspinner;
    ArrayList<Pair<Integer,String>> agepair;
    ArrayList<Pair<Integer,String>> cardiacpair;
    ArrayList<Pair<Integer,String>> respiratorypair;
    ArrayList<Pair<Integer,String>> ECGpair;
    ArrayList<Pair<Integer,String>> SystolicBPpair;
    ArrayList<Pair<Integer,String>> Pulsepair;
    ArrayList<Pair<Integer,String>> Haemoglobinpair;
    ArrayList<Pair<Integer,String>> wbcpair;
    ArrayList<Pair<Integer,String>> ureapair;
    ArrayList<Pair<Integer,String>> sodiumpair;
    ArrayList<Pair<Integer,String>> potassiumpair;
    ArrayList<Pair<Integer,String>> GCSpair;
    ArrayList<Pair<Integer,String>> OpSeverpair;
    ArrayList<Pair<Integer,String>> procedurespair;
    ArrayList<Pair<Integer,String>> bloodlosspair;
    ArrayList<Pair<Integer,String>> peritonealpair;
    ArrayList<Pair<Integer,String>> malignancypair;
    ArrayList<Pair<Integer,String>> urgencypair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Age Spinner
        agepair=getpairs(this,"Age");
        agespinner = (Spinner) findViewById(R.id.agespinner);
        ArrayAdapter<String> agespinneradapter = new ArrayAdapter<String>(this,
                R.layout.spinnerview,R.id.multiline_spinner_text_view, getstrings(this,"Age"));
        agespinner.setAdapter(agespinneradapter);
        agespinner.setOnItemSelectedListener(this);

        //Cardiac Spinner
        cardiacpair=getpairs(this,"Cardiac");
        cardiacspinner = (Spinner) findViewById(R.id.cardiacSpinner);
        ArrayAdapter<String> cardiacspinneradapter = new ArrayAdapter<String>(this,
                R.layout.spinnerview,R.id.multiline_spinner_text_view,getstrings(this,"Cardiac"));
        cardiacspinner.setAdapter(cardiacspinneradapter);
        cardiacspinner.setOnItemSelectedListener(this);

        //Respiratory Spinner
        respiratorypair=getpairs(this,"Respiratory");
        respiratoryspinner = (Spinner) findViewById(R.id.RespSpinner);
        ArrayAdapter<String> Respspinneradapter = new ArrayAdapter<String>(this,
                R.layout.spinnerview,R.id.multiline_spinner_text_view, getstrings(this,"Respiratory"));
        respiratoryspinner.setAdapter(Respspinneradapter);
        respiratoryspinner.setOnItemSelectedListener(this);

        //ECG Spinner
        ECGpair=getpairs(this,"ECG");
        ECGspinner = (Spinner) findViewById(R.id.ECGSpinner);
        ArrayAdapter<String> ECGspinneradaptor = new ArrayAdapter<String>(this,
                R.layout.spinnerview,R.id.multiline_spinner_text_view, getstrings(this,"ECG"));
        ECGspinner.setAdapter(ECGspinneradaptor);
        ECGspinner.setOnItemSelectedListener(this);

        //SystolicBP Spinner
        SystolicBPpair=getpairs(this,"SystolicBP");
        SystolicBPspinner = (Spinner) findViewById(R.id.SystolicBPspinner);
        ArrayAdapter<String> SystolicBPspinneradaptor = new ArrayAdapter<String>(this,
                R.layout.spinnerview,R.id.multiline_spinner_text_view, getstrings(this,"SystolicBP"));
        SystolicBPspinner.setAdapter(SystolicBPspinneradaptor);
        SystolicBPspinner.setOnItemSelectedListener(this);

        //Pulse Spinner
        Pulsepair=getpairs(this,"Pulse");
        Pulsespinner = (Spinner) findViewById(R.id.Pulsespinner);
        ArrayAdapter<String> Pulsespinneradaptor = new ArrayAdapter<String>(this,
                R.layout.spinnerview,R.id.multiline_spinner_text_view, getstrings(this,"Pulse"));
        Pulsespinner.setAdapter(Pulsespinneradaptor);
        Pulsespinner.setOnItemSelectedListener(this);

        //Haemoglobin Spinner
        Haemoglobinpair=getpairs(this,"Haemoglobin");
        Haemoglobinspinner = (Spinner) findViewById(R.id.Haemoglobinspinner);
        ArrayAdapter<String> Haemoglobinspinneradaptor = new ArrayAdapter<String>(this,
                R.layout.spinnerview,R.id.multiline_spinner_text_view,getstrings(this,"Haemoglobin"));
        Haemoglobinspinner.setAdapter(Haemoglobinspinneradaptor);
        Haemoglobinspinner.setOnItemSelectedListener(this);

        //WBC Spinner
        wbcpair=getpairs(this,"wbc");
        wbcspinner = (Spinner) findViewById(R.id.wbcspinner);
        ArrayAdapter<String> wbcspinneradaptor = new ArrayAdapter<String>(this,
                R.layout.spinnerview,R.id.multiline_spinner_text_view, getstrings(this,"wbc"));
        wbcspinner.setAdapter(wbcspinneradaptor);
        wbcspinner.setOnItemSelectedListener(this);

        //Urea Spinner
        ureapair=getpairs(this,"urea");
        ureaspinner = (Spinner) findViewById(R.id.ureaspinner);
        ArrayAdapter<String> ureaspinneradaptor = new ArrayAdapter<String>(this,
                R.layout.spinnerview,R.id.multiline_spinner_text_view, getstrings(this,"urea"));
        ureaspinner.setAdapter(ureaspinneradaptor);
        ureaspinner.setOnItemSelectedListener(this);

        //Sodium Spinner
        sodiumpair=getpairs(this,"sodium");
        sodiumspinner = (Spinner) findViewById(R.id.sodiumspinner);
        ArrayAdapter<String> sodiumspinneradaptor = new ArrayAdapter<String>(this,
                R.layout.spinnerview,R.id.multiline_spinner_text_view, getstrings(this,"sodium"));
        sodiumspinner.setAdapter(sodiumspinneradaptor);
        sodiumspinner.setOnItemSelectedListener(this);

        //Potassium Spinner
        potassiumpair=getpairs(this,"potassium");
        potassiumspinner = (Spinner) findViewById(R.id.potassiumspinner);
        ArrayAdapter<String> potassiumspinneradaptor = new ArrayAdapter<String>(this,
                R.layout.spinnerview,R.id.multiline_spinner_text_view, getstrings(this,"potassium"));
        potassiumspinner.setAdapter(potassiumspinneradaptor);
        potassiumspinner.setOnItemSelectedListener(this);

        //GCS Spinner
        GCSpair=getpairs(this,"GCS");
        GCSspinner = (Spinner) findViewById(R.id.GCSspinner);
        ArrayAdapter<String> GCSspinneradaptor = new ArrayAdapter<String>(this,
                R.layout.spinnerview,R.id.multiline_spinner_text_view, getstrings(this,"GCS"));
        GCSspinner.setAdapter(GCSspinneradaptor);
        GCSspinner.setOnItemSelectedListener(this);

        //OPSeverity Spinner
        OpSeverpair=getpairs(this,"OPSever");
        OpSeverspinner = (Spinner) findViewById(R.id.OpSeverspinner);
        ArrayAdapter<String> OpSeverspinneradaptor = new ArrayAdapter<String>(this,
                R.layout.spinnerview,R.id.multiline_spinner_text_view, getstrings(this,"OPSever"));
        OpSeverspinner.setAdapter(OpSeverspinneradaptor);
        OpSeverspinner.setOnItemSelectedListener(this);

        //Procedures Spinner
        procedurespair=getpairs(this,"procedures");
        proceduresspinner = (Spinner) findViewById(R.id.proceduresspinner);
        ArrayAdapter<String> proceduresspinneradaptor = new ArrayAdapter<String>(this,
                R.layout.spinnerview,R.id.multiline_spinner_text_view, getstrings(this,"procedures"));
        proceduresspinner.setAdapter(proceduresspinneradaptor);
        proceduresspinner.setOnItemSelectedListener(this);

        //Blood Loss Spinner
        bloodlosspair=getpairs(this,"bloodloss");
        bloodlossspinner = (Spinner) findViewById(R.id.bloodlossspinner);
        ArrayAdapter<String> bloodlossspinneradaptor = new ArrayAdapter<String>(this,
                R.layout.spinnerview,R.id.multiline_spinner_text_view, getstrings(this,"bloodloss"));
        bloodlossspinner.setAdapter(bloodlossspinneradaptor);
        bloodlossspinner.setOnItemSelectedListener(this);

        //Peretoneal Spinner
        peritonealpair=getpairs(this,"peritoneal");
        peritonealspinner = (Spinner) findViewById(R.id.peritonealspinner);
        ArrayAdapter<String> peritonealspinneradaptor = new ArrayAdapter<String>(this,
                R.layout.spinnerview,R.id.multiline_spinner_text_view, getstrings(this,"peritoneal"));
        peritonealspinner.setAdapter(peritonealspinneradaptor);
        peritonealspinner.setOnItemSelectedListener(this);

        //Malignancy Spinner
        malignancypair=getpairs(this,"malignancy");
        malignancyspinner = (Spinner) findViewById(R.id.malignancyspinner);
        ArrayAdapter<String> malignancyspinneradaptor = new ArrayAdapter<String>(this,
                R.layout.spinnerview,R.id.multiline_spinner_text_view, getstrings(this,"malignancy"));
        malignancyspinner.setAdapter(malignancyspinneradaptor);
        malignancyspinner.setOnItemSelectedListener(this);

        //Urgency Spinner
        urgencypair=getpairs(this,"urgency");
        urgencyspinner = (Spinner) findViewById(R.id.urgencyspinner);
        ArrayAdapter<String> urgencyspinneradaptor = new ArrayAdapter<String>(this,
                R.layout.spinnerview,R.id.multiline_spinner_text_view, getstrings(this,"urgency"));
        urgencyspinner.setAdapter(urgencyspinneradaptor);
        urgencyspinner.setOnItemSelectedListener(this);

    }

    public void onItemSelected(AdapterView<?> parent, View view, int pos,long id) {
        calculate();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void calculate()
    {
        int Physiologyscore=0;
        int Opsever=0;
        Double p_possum_mortality=0.0;
        Double possum_morbidy=0.0;

        //do stuff
        int age_num=get_number(agespinner,agepair);
        Physiologyscore=get_number(agespinner,agepair)+get_number(cardiacspinner,cardiacpair)+get_number(respiratoryspinner,respiratorypair)+get_number(ECGspinner,ECGpair)+get_number(SystolicBPspinner,SystolicBPpair)+get_number(Pulsespinner,Pulsepair)+get_number(Haemoglobinspinner,Haemoglobinpair)+get_number(wbcspinner,wbcpair)+get_number(ureaspinner,ureapair)+get_number(sodiumspinner,sodiumpair)+get_number(potassiumspinner,potassiumpair)+get_number(GCSspinner,GCSpair);
        Opsever=get_number(OpSeverspinner,OpSeverpair)+get_number(proceduresspinner,procedurespair)+get_number(bloodlossspinner,bloodlosspair)+get_number(peritonealspinner,peritonealpair)+get_number(malignancyspinner,malignancypair)+get_number(urgencyspinner,urgencypair);
        p_possum_mortality=(1/(Math.exp(-1*((0.19*Physiologyscore)+(0.15*Opsever)-9.37))+1))*100;
        possum_morbidy=(1/(Math.exp(-1*((0.16*Physiologyscore)+(0.19*Opsever)-5.91))+1))*100;

        TextView physiologytxtview = (TextView) findViewById(R.id.PhysiologyScoretextview);
        physiologytxtview.setText(getString(R.string.physiology_score)+" "+Physiologyscore);
        TextView Opsevertxtview = (TextView) findViewById(R.id.OperSeverScoretextview);
        Opsevertxtview.setText(getString(R.string.operative_severity_score)+" "+Opsever);

        DecimalFormat df = new DecimalFormat("#.00");
        TextView mortalilitytxtview = (TextView) findViewById(R.id.P_POSSUMtextview);
        mortalilitytxtview.setText(getString(R.string.p_possum_predicted_mortality)+" "+df.format(p_possum_mortality)+"%");
        TextView morbiditytxtview = (TextView) findViewById(R.id.POSSUMtextview);
        morbiditytxtview.setText(getString(R.string.possum_predicted_morbidity)+" "+df.format(possum_morbidy)+"%");
    }

    Integer get_number(Spinner curspin,  ArrayList<Pair<Integer,String>> pairs)
    {
        String selectedstring=curspin.getSelectedItem().toString();
        for(Pair<Integer,String> pair:pairs)
        {
            if(pair.second.equals(selectedstring))
                return pair.first;
        }
        return -1;
    }


    public ArrayList<Pair<Integer,String>> getpairs(Context context, String key) {
        ArrayList<Pair<Integer,String>> pairlist= new ArrayList<Pair<Integer,String>>();
        for(TypedArray item:getMultiTypedArray(context,key))
        {
            Integer value=item.getInt(0,0);
            String text=item.getString(1);
            pairlist.add(new Pair<Integer, String>(value,text));
        }
        return pairlist;
    }

    public List<String> getstrings(Context context, String key) {
        List<String> allages= new ArrayList<String>();
        for(TypedArray item:getMultiTypedArray(context,key))
        {
            allages.add(item.getString(1));
        }
        return allages;
    }

    public static List<TypedArray> getMultiTypedArray(Context context, String key) {
        List<TypedArray> array = new ArrayList<>();

        try {
            Class<R.array> res = R.array.class;
            Field field;
            int counter = 0;
            do {
                field = res.getField(key + "_" + counter);
                array.add(context.getResources().obtainTypedArray(field.getInt(null)));
                counter++;
            } while (field != null);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return array;
        }
    }
}
