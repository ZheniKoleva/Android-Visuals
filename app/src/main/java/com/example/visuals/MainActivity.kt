package com.example.visuals

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.visuals.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val cats = listOf<Int>(
        R.drawable.cat1,
        R.drawable.cat2,
        R.drawable.cat3,
        R.drawable.cat4,
        R.drawable.cat5,
        R.drawable.cat6,
        R.drawable.cat7,
        R.drawable.cat8,
        R.drawable.cat9,
        R.drawable.cat10,
        R.drawable.cat11,
        R.drawable.cat12,
        R.drawable.cat13,
        R.drawable.cat14,
        R.drawable.cat15,
        R.drawable.cat16
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*Main Task
        var counter = 0
        binding.dataToShow = counter.toString()

        binding.button.setOnClickListener {
            counter++
            binding.dataToShow = counter.toString()

            val randomIndex = Random.nextInt(cats.size)
            binding.imageViewMine.setImageResource(cats[randomIndex])
        } */

        //Bonus Task
        binding.dataToShow = binding.imageViewMine.resources
            .getResourceEntryName(cats[0]).toString()

        binding.button.setOnClickListener {
            val randomIndex = Random.nextInt(cats.size)
            binding.imageViewMine.setImageResource(cats[randomIndex])

            binding.dataToShow = binding.imageViewMine.resources
                .getResourceEntryName(cats[randomIndex]).toString()

        }
    }
}