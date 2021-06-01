package eswar.edu.service_eswar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View view) {
        Intent intent = new Intent(this,MyService.class);
        startService(intent);
    }

    public void stop(View view) {
        Intent intent = new Intent(this,MyService.class);
        stopService(intent);
    }
}