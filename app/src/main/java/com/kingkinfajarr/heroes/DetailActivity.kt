package com.kingkinfajarr.heroes

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.logging.Logger

class DetailActivity: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        val data: Hero? = intent.getParcelableExtra("heroDetail")

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        showSelectedHero(data)
    }

    private fun showSelectedHero(hero: Hero?) {
        Toast.makeText(this, "data : $hero", Toast.LENGTH_SHORT).show()
    }
}