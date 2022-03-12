package com.faizzakiramadhan.challengechapter2

import ItemAdapter
import android.content.ClipData.newIntent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity()  {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // getting the recyclerview by its id
        val recyclerview = findViewById<RecyclerView>(R.id.rv_akses_cepat)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemList1Class>()


        // add image and text to the arraylist
        data.add(ItemList1Class(R.drawable.wallet, "gopay "))

        // This will pass the ArrayList to our Adapter
        val adapter = ItemAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter

        //intent  @id/ib_home to the ShopeeLayout
        val btn_next = findViewById<Button>(R.id.btn_lihat_halaman2)

        //set onclick listener
        btn_next.setOnClickListener {
            val intent = android.content.Intent(this, ShopeeLayout::class.java)
            startActivity(intent)
        }


    }
}