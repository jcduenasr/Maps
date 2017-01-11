package com.jduenas.maps;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    String lugar="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        Bundle b = getIntent().getExtras();
        if (b!=null){
            lugar = b.getString("lugar");
        }

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }



    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        switch (lugar){
            case "Lugar1":
                LatLng Lugar1 = new LatLng(4.673485, -74.144639);
                mMap.addMarker(new MarkerOptions().position(Lugar1).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).title("Parque central Fontibon Bogota"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(Lugar1));
                mMap.animateCamera(CameraUpdateFactory.zoomTo(16));
                break;
            case "Lugar2":
                LatLng Lugar2 = new LatLng(4.676783, -74.048337);
                mMap.addMarker(new MarkerOptions().position(Lugar2).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)).title("Parque de la 93 Bogota"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(Lugar2));
                mMap.animateCamera(CameraUpdateFactory.zoomTo(16));
                break;
            case "Lugar3":
                LatLng Lugar3 = new LatLng(4.658694, -74.094256);
                mMap.addMarker(new MarkerOptions().position(Lugar3).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)).title("Parque Simon Bolivar Bogota"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(Lugar3));
                mMap.animateCamera(CameraUpdateFactory.zoomTo(16));
                break;
            case "Lugar4":
                LatLng Lugar4 = new LatLng(4.598951, -74.079288);
                mMap.addMarker(new MarkerOptions().position(Lugar4).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)).title("Centro Bogota"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(Lugar4));
                mMap.animateCamera(CameraUpdateFactory.zoomTo(16));
                break;
            default:
                break;
        }

    }
}
