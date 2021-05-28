package eswar.edu.intents_eswar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView = findViewById(R.id.textView);
        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("KEY");
        textView.setText("Name is : "+name);
    }
}