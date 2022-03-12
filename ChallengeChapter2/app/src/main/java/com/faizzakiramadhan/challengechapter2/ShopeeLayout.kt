package com.faizzakiramadhan.challengechapter2

import ItemAdapter3
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class ShopeeLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopee_layout)

        val recyclerview = findViewById<RecyclerView>(R.id.rv_produk)


        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemList1Class>()


        // add image and text to the arraylist
        data.add(ItemList1Class(R.drawable.produk1, "Rp62.500 "))
        data.add(ItemList1Class(R.drawable.produk2, "Rp48.500 "))
        data.add(ItemList1Class(R.drawable.produk3, "Rp49.500 "))


        // This will pass the ArrayList to our Adapter
        val adapter = ItemAdapter3(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter

        //make the recyclerview horizontal
        recyclerview.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)


    }
}