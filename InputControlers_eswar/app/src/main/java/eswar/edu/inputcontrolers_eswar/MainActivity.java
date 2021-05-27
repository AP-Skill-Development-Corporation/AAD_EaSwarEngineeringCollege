package eswar.edu.inputcontrolers_eswar;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radiob1,radiob2;
    CheckBox check1,check2,check3;
    Spinner spinner;
    LinearLayout linearLayout;
    Switch aSwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = findViewById(R.id.linear1);
        aSwitch = findViewById(R.id.switch1);
        spinner = findViewById(R.id.spi1);
        radioGroup = findViewById(R.id.rg1);
        radiob1 = findViewById(R.id.rb1);
        radiob2 = findViewById(R.id.rb2);
        check1 = findViewById(R.id.ch1);
        check2 = findViewById(R.id.ch2);
        check3 = findViewById(R.id.ch3);
        aSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(aSwitch.isChecked()){
                    linearLayout.setBackgroundColor(Color.YELLOW);
                }
                else{
                    linearLayout.setBackgroundColor(Color.GREEN);
                }
            }
        });
        List<String> week = new ArrayList<>();
        week.add("Sunday");
        week.add("MonDay");
        week.add("Tuesday");
        week.add("WednesDay");
        week.add("ThursDay");
        week.add("Friday");
        week.add("Saturday");
        ArrayAdapter<String> adapter =new ArrayAdapter<>(this,
                R.layout.support_simple_spinner_dropdown_item,week);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "You Selected"+
                        week.get(i), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                 switch (i){
                     case R.id.rb1:
                         Toast.makeText(MainActivity.this, "Male", Toast.LENGTH_SHORT).show();
                         break;
                     case R.id.rb2:
                         Toast.makeText(MainActivity.this, "FeMale", Toast.LENGTH_SHORT).show();
                         break;
                 }
            }
        });
    }

    public void image(View view) {
        Toast.makeText(this, "You Selected Image", Toast.LENGTH_SHORT).show();
    }

    public void submit(View view) {
        StringBuffer result = new StringBuffer();
        if(check1.isChecked()){
            result.append(check1.getText());
        }if(check2.isChecked()){
            result.append("\n"+check2.getText());
        }if(check3.isChecked()){
            result.append("\n"+check3.getText());
        }if(check1.isChecked() ||check2.isChecked()||check3.isChecked()){
            Toast.makeText(this, ""+result, Toast.LENGTH_SHORT).show();
        }
    }
}