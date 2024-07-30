package com.example.beducompras.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.doOnPreDraw
import androidx.navigation.findNavController
import androidx.navigation.fragment.FragmentNavigatorExtras
import com.example.beducompras.R
import com.example.beducompras.api.Api
import com.example.beducompras.data.Product
import com.example.beducompras.databinding.FragmentHomeBinding
import com.google.android.material.transition.MaterialElevationScale
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class HomeFragment : Fragment(), ProductAdapterListener {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private var products: List<Product>? = null

    private lateinit var productAdapter: ProductAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        _binding = FragmentHomeBinding.inflate(layoutInflater, container, false)

        setupRecyclerView()

        if(products == null){
            fetchProducts()
        } else{
            showProducts()
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        postponeEnterTransition()

        view.doOnPreDraw {
            startPostponedEnterTransition()
        }
    }


    private fun fetchProducts(){
        /* TODO: Aquí recuperaremos la información de FakeStoreApi.
           Si la respuesta es correcta, asignar los datos a la variable products
           y luego llamamos al método showProducts().

           Si la respuesta es errónea o si no hubo una, mostrar un toast


         */

    }

    private fun setupRecyclerView(){
        productAdapter = ProductAdapter(this)
        binding.productList.apply{
            adapter = productAdapter
        }
    }

    private fun showProducts(){
        productAdapter.submitList(products)
        binding.progressBar.visibility = View.INVISIBLE
        binding.textHeader.visibility = View.VISIBLE
        binding.productList.visibility = View.VISIBLE
    }

    override fun onProductClicked(view: View, product: Product) {
        // TODO: Implementar generación de pdf
    }

}