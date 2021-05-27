package eswar.edu.countapp_eswar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView result;
    int value=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.text1);
    }

    public void mCount(View view) {
        value++;
        result.setText(""+value);
    }

    public void mToast(View view) {
        /*Toast : is a Display message  in a particular duration*/
        Toast.makeText(this,"Hai Students",Toast.LENGTH_LONG).show();
    }
}