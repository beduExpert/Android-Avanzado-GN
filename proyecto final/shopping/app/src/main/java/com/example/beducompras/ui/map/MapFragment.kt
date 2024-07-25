package com.example.beducompras.ui.map

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.beducompras.databinding.FragmentMapBinding

// TODO: Este Fragment será el contenedor de nuestro mapa.
//  Similar a lo que hicimos en el MainActivity del este ejemplo: https://github.com/beduExpert/Android-Avanzado-GN/tree/main/Sesion-05/Ejemplo-02

class MapFragment : Fragment() {

    private var _binding: FragmentMapBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMapBinding.inflate(layoutInflater, container, false).apply{
        }

        // TODO: Agregar mapFragment?.getMapAsync y todo lo que conlleve aquí


        return binding.root
    }

}