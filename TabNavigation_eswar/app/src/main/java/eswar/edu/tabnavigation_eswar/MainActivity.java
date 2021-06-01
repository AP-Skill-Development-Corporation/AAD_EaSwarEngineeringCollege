package eswar.edu.tabnavigation_eswar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
/*TabNavigation  is combined with the ability to swipe child screens
* left to right and right to left
* Displaying tabs is tablayout  in the android design support library.
* it provides a horizontal layout  to display tabs. */
    TabLayout tabLayout;
    ViewPager viewPager;
    MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.tablay1);
        viewPager = findViewById(R.id.viewpager1);
        myAdapter = new MyAdapter(getSupportFragmentManager());
        myAdapter.add();
        viewPager.setAdapter(myAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}