package com.example.roadrescue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity<MapView> extends AppCompatActivity {

    private var mapView: MapView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Mapbox.getInstance(this, getString(R.string.mapbox_access_token))

        setContentView(R.layout.activity_main)

        mapView = findViewById(R.id.mapView)
        mapView?.onCreate(savedInstanceState)
        mapView?.getMapAsync { mapboxMap ->

                mapboxMap.setStyle(Style.MAPBOX_STREETS) {

            // Map is set up and the style has loaded. Now you can add data or make other map adjustments


        }

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
