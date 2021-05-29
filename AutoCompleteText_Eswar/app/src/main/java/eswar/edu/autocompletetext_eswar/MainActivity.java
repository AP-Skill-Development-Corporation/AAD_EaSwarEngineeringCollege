package eswar.edu.autocompletetext_eswar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
AutoCompleteTextView autoCompleteTextView;
TextView textView;
String [] namelist = {"Anusha","Bhaskar","Aksahay","Ram","Jyothi","Praveen","Sai","Pallavi"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autoCompleteTextView = findViewById(R.id.act1);
        textView = findViewById(R.id.text1);
        StringBuilder editText = new StringBuilder();
        editText.append("Input value:").append("\n");
        for(String value : namelist){
            editText.append(value).append(",");

        }
        textView.setText(editText);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,namelist);
       autoCompleteTextView.setAdapter(arrayAdapter);
       autoCompleteTextView.setThreshold(1);
       autoCompleteTextView.setAdapter(arrayAdapter);
    }
}