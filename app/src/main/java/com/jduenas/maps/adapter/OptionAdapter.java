package com.jduenas.maps.adapter;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.widget.RecyclerView;

import com.jduenas.maps.MapsActivity;
import com.jduenas.maps.R;
import com.jduenas.maps.pojo.OptionApp;

import java.util.ArrayList;

/**
 * Created by jduenas on 10/01/2017.
 */

public class OptionAdapter extends RecyclerView.Adapter<OptionAdapter.OptionViewHolder>{
        ArrayList<OptionApp> optionApps;
        Activity activity;


/**
 * Constructor de la clase
 * @param optionApps El parámetro view contiene un array de objetos de la clase OptionApp
 * @param activity El parámetro activity tiene la referencia de la actividad desde la que se esta llamando esta clase
 */
public OptionAdapter(ArrayList<OptionApp> optionApps, Activity activity ){
        this.optionApps = optionApps;
        this.activity = activity;

        }

        /**
         * Método que devuelve un objeto de la clase InventoryViewHolder para interactuar con los views
         * @return objeto de la clase InventoryViewHolder
         */
        @Override
        public OptionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_options, parent, false);
                return new OptionViewHolder(view);
        }

        /**
         * Método  que muestra los datos en los views
         */
        @Override
        public void onBindViewHolder(final OptionViewHolder optionViewHolder, final int position) {
        final OptionApp optionApp = optionApps.get(position);
                optionViewHolder.imgCVOptions.setImageResource(optionApp.getImageOption());
                optionViewHolder.tvCVOption.setText(optionApp.getOptionName());

                optionViewHolder.imgCVOptions.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                                switch (optionApp.getOptionName()){
                                    case "Lugar1":
                                        Intent i = new Intent(activity, MapsActivity.class);
                                        i.putExtra("lugar",optionApp.getOptionName());
                                        activity.startActivity(i);
                                    break;
                                    case "Lugar2":
                                        Intent i2 = new Intent(activity, MapsActivity.class);
                                        i2.putExtra("lugar",optionApp.getOptionName());
                                        activity.startActivity(i2);
                                        break;
                                    case "Lugar3":
                                        Intent i3 = new Intent(activity, MapsActivity.class);
                                        i3.putExtra("lugar",optionApp.getOptionName());
                                        activity.startActivity(i3);
                                        break;
                                    case "Lugar4":
                                        Intent i4 = new Intent(activity, MapsActivity.class);
                                        i4.putExtra("lugar",optionApp.getOptionName());
                                        activity.startActivity(i4);
                                        break;
                                    default:
                                        break;
                                }

                        }
                });
        }

@Override
public int getItemCount() {
        return optionApps.size();
        }

/**
 * Esta clase nos permite interactuar con los views a traves de objetos
 * @author: WilsonMartinez
 * @version: 6/8/2016.
 */
public class OptionViewHolder extends RecyclerView.ViewHolder {
    private ImageView imgCVOptions;
    private TextView tvCVOption;

    /**
     * Constructor de la clase
     * @param itemView El parámetro view contiene la vista en la que vamos a mostrar los datos
     */
    public OptionViewHolder(View itemView){
        super(itemView);
        imgCVOptions = (ImageView)itemView.findViewById(R.id.imgCVOptions);
        tvCVOption = (TextView) itemView.findViewById(R.id.tvCVOption);
    }
}
}
