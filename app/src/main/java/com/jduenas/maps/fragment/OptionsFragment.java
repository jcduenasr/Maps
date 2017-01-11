package com.jduenas.maps.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jduenas.maps.R;
import com.jduenas.maps.adapter.OptionAdapter;
import com.jduenas.maps.pojo.OptionApp;

import java.util.ArrayList;

/**
 * Created by jduenas on 10/01/2017.
 */

public class OptionsFragment  extends Fragment {

    ArrayList<OptionApp> mOptionApps;
    private RecyclerView recyclerView;
    private OptionAdapter optionAdapter;


    public OptionsFragment() {
        // Required empty public constructor
    }

    /**
     * Método de la clase padre Fragment que permite representar la vista xml en objetos para su manipulacion
     * @return retorna la vista
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View optionsView = inflater.inflate(R.layout.fragment_options, container, false);
        recyclerView = (RecyclerView)optionsView.findViewById(R.id.rvOptionsApp);
        RecyclerView.LayoutManager layoutManager = null;
        layoutManager = new StaggeredGridLayoutManager(2/*span count*/, StaggeredGridLayoutManager.VERTICAL/* orientation*/);
        recyclerView.setLayoutManager(layoutManager);
        mOptionApps = getOptionApps();
        optionAdapter = new OptionAdapter(mOptionApps, getActivity());
        recyclerView.setAdapter(optionAdapter);

        TextView tvusername;
        tvusername = (TextView)optionsView.findViewById(R.id.tv_user_name_options);

        return optionsView;
    }

    private ArrayList<OptionApp> getOptionApps(){
        ArrayList<OptionApp> optionApps = new ArrayList<>();

        optionApps.add(new OptionApp(getString(R.string.option1),R.drawable.parquefont));
        optionApps.add(new OptionApp(getString(R.string.option2),R.drawable.parque93));
        optionApps.add(new OptionApp(getString(R.string.option3),R.drawable.sb));
        optionApps.add(new OptionApp(getString(R.string.option4),R.drawable.pajarera));


        return optionApps;
    }
}
