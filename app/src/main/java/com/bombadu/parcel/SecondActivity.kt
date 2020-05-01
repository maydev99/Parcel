package com.bombadu.parcel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val item = intent.getParcelableExtra<MyModel>("extra_item")
        titleTextView.text = item!!.title
        detailsTextView.text = item.details
        priceTextView.text = "\$${item.price}" //putting a dollar symbol in front of a concatenated variable
        categoryTextView.text = item.category


    }
}
