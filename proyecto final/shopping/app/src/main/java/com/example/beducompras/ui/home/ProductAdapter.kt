package com.example.beducompras.ui.home

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.beducompras.data.Product
import com.example.beducompras.databinding.ListItemProductBinding

class ProductAdapter(private val listener: ProductAdapterListener) :
    ListAdapter<Product, ProductAdapter.ViewHolder>(
        ProductDiffCallback
    ) {


    class ViewHolder(private val binding: ListItemProductBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(product: Product, listener: ProductAdapterListener) {

            binding.run {
                this.product = product
                this.listener = listener
                Glide.with(root).load(product.image).into(productImage)
                executePendingBindings()
            }
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ListItemProductBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(binding)
            }
        }

    }


    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(viewGroup)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.bind(getItem(position), listener)
    }
}

object ProductDiffCallback : DiffUtil.ItemCallback<Product>() {
    override fun areItemsTheSame(oldItem: Product, newItem: Product): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Product, newItem: Product): Boolean {
        return oldItem == newItem
    }
}