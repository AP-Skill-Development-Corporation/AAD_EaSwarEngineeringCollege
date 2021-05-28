package eswar.edu.intents_eswar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText,editText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.edit1);
        editText1 = findViewById(R.id.edit2);
    }

    public void navigate(View view) {
        /*intent is a messaging object you can use to request an action from
        * another app component
        * It is used to  perform inter-connection between  activities and
        *  data passing mechanism*/
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
        /*Types of Intents: There are two types of Intents
        * Explicit Intent : Specifies  the component
        * Implicit Intent:  doesn't specify the component */

    }

    public void browser(View view) {
        String data = editText.getText().toString();
        Uri uri = Uri.parse("https://www."+data);
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }

    public void passdata(View view) {
        String fName = editText1.getText().toString();
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        intent.putExtra("KEY",fName);
        startActivity(intent);
    }
}