package eswar.edu.fragment_eswar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
/*Fragment  is a part of Activity . By the help of fragments we can display  multiple
* screens on one activity. A fragment has  its own layout  and its own behaviour
*  and its own  lifecycle callbacks.*/
    boolean status = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loadFragment(View view) {
        if(!status){
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.framlayout1,new Fragment_A()).commit();
            status=true;
        }else{
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.framlayout1,new FragmentB()).commit();
            status=false;
        }
    }
}