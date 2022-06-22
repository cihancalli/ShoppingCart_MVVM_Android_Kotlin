package com.diten.tech.shoppingcartmvvm.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.diten.tech.shoppingcartmvvm.R
import com.diten.tech.shoppingcartmvvm.adapter.ShopListAdapter
import com.diten.tech.shoppingcartmvvm.databinding.FragmentShopBinding
import com.diten.tech.shoppingcartmvvm.model.Product
import kotlinx.android.synthetic.main.fragment_shop.*


class ShopFragment : Fragment(),ShopListAdapter.ShopInterface {

     private lateinit var fragmentShopBinding : FragmentShopBinding
    private lateinit var productList: ArrayList<Product>
    private lateinit var adapter: ShopListAdapter

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        productList = ArrayList()

        val p_1 = Product("1","A",1.2,false,"")
        val p_2 = Product("2","A",2.3,true,"")
        val p_3 = Product("3","A",3.4,false,"")
        val p_4 = Product("4","A",4.5,true,"")

        productList.add(p_1)
        productList.add(p_2)
        productList.add(p_3)
        productList.add(p_4)

        adapter = ShopListAdapter(productList)
        shopRecyclerView.adapter = adapter


    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View?
    {
        // Inflate the layout for this fragment
        fragmentShopBinding = FragmentShopBinding.inflate(inflater,container,false)

        return fragmentShopBinding.root

    }

    override fun addItem(product: Product) {

    }

    override fun onItemClick(product: Product) {

    }
}