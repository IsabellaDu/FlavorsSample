package com.disabella.flavorssample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

const val URL = "https://cdn.pixabay.com/photo/2016/03/31/21/33/cartoon-1296497_1280.png"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image = findViewById<ImageView>(R.id.imageView)

        Glide.with(this)
            .load(URL)
            .placeholder(R.drawable.ic_baseline_image_24)
            .into(image)

    }
}