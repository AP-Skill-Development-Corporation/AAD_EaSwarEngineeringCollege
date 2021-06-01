package eswar.edu.tabnavigation_eswar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Fragment1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_1, container, false);
        TextView textView = view.findViewById(R.id.text1);
        String text = getArguments().getString("ID");
        textView.setText(text);
        return view;
    }
}