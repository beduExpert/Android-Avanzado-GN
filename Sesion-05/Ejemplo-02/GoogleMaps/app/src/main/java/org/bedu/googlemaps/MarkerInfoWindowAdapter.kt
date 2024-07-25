package org.bedu.googlemaps

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.Marker
import org.bedu.googlemaps.databinding.LocationContentBinding
import org.bedu.googlemaps.location.Location

class MarkerInfoWindowAdapter(private val context: Context): GoogleMap.InfoWindowAdapter {
    override fun getInfoContents(marker: Marker): View {
        val location = marker.tag as Location

        val binding = LocationContentBinding.inflate(LayoutInflater.from(context))

        binding.apply {
            textViewTitle.text = location.name
            textViewAddress.text = location.address
        }


        return binding.root
    }

    override fun getInfoWindow(p0: Marker) = null
}