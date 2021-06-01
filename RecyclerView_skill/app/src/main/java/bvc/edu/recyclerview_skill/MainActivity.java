package bvc.edu.recyclerview_skill;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    MyAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler1);
       int images [] = {R.drawable.aa1,R.drawable.bb1,R.drawable.cc,R.drawable.dd,R.drawable.dd,
       R.drawable.ee,R.drawable.ff,R.drawable.gg,R.drawable.hh,R.drawable.in,
       R.drawable.jj};
       String names[]={"Aadhi","Boys","chakram","Don","Eega","Fida",
       "Gabbarsingh","Hyper","Indra","Jathiratnalu"};
       adapter = new MyAdapter(this,images,names);
       recyclerView.setLayoutManager(new LinearLayoutManager(this));
       recyclerView.setAdapter(adapter);
    }
}