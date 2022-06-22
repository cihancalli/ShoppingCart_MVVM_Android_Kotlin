package com.diten.tech.shoppingcartmvvm.adapter

import android.content.ClipData
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.diten.tech.shoppingcartmvvm.R
import com.diten.tech.shoppingcartmvvm.databinding.ShopRowBinding
import com.diten.tech.shoppingcartmvvm.model.Product


class ShopListAdapter (val ProductList:List<Product>)
    : RecyclerView.Adapter<ShopListAdapter.CardDesignHolder>() {

    inner class CardDesignHolder(var view: ShopRowBinding) : RecyclerView.ViewHolder(view.root)
    {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder
    {
        val inflater = LayoutInflater.from(parent.context)
        val view:ShopRowBinding = ShopRowBinding.inflate(inflater,parent,false)
        return CardDesignHolder(view)
    }

    override fun getItemCount(): Int
    {
        return ProductList.size
    }
    override fun onBindViewHolder(holder: CardDesignHolder, position: Int)
    {
        holder.view.shopProductRow = ProductList[position]
    }

    public interface ShopInterface{
        fun addItem(product:Product)
        fun onItemClick(product:Product)
    }




}