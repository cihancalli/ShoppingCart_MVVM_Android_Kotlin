package com.diten.tech.shoppingcartmvvm.model

data class Product (val id:String?=null,
               val name:String?=null,
               val price:Double?=null,
               val isAvailable:Boolean?=null,
               val imageUrl:String?=null
)