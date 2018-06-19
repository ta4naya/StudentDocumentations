package com.example.kells.navigationdrawer;



import android.os.Bundle;
import android.support.v4.app.FragmentManager;

import android.view.View;
import android.support.v4.app.Fragment;
import android.view.ViewGroup;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.widget.Button;


/**
 * Created by Juned on 11/19/2017.
 */

public class Fragment_1 extends Fragment {
    Button btnOPenEnrollment;
    Button btnCityReg;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

View v =inflater.inflate(R.layout.fragment_layout_1, container, false);
Button btnEnroll =(Button) v.findViewById(R.id.buttonEnroll);
btnCityReg =(Button) v.findViewById(R.id.buttonCity);
btnCityReg.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        CityRegistration enrollFragment = new CityRegistration();
        FragmentManager manager =getFragmentManager();
        manager.beginTransaction()
                .replace(R.id.flmain,enrollFragment,enrollFragment.getTag())
                .commit();

    }
});
btnEnroll.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Fragment_2 enrollFragment = new Fragment_2();
        FragmentManager manager =getFragmentManager();
        manager.beginTransaction()
                .replace(R.id.flmain,enrollFragment,enrollFragment.getTag())
                .commit();

    }
});
        return v;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Home");
    }


}