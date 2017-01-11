package com.jduenas.maps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.jduenas.maps.fragment.OptionsFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

        attachFragment();
    }
    public void irMapa(View v){
        Intent i = new Intent(this, MapsActivity.class);
        startActivity(i);
    }
    /** Attach placeholder fragment here and show different kind of RecyclerView flavours eg List or grid based on user selection in the options menu.*/
    private void attachFragment(){

        OptionsFragment placeholderFragment = new OptionsFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.container, placeholderFragment).commit();
    }
}
