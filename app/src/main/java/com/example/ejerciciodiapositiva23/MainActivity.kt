package com.example.ejerciciodiapositiva23

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ejerciciodiapositiva23.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    var list = listOf(Personaje(R.mipmap.dragon,"Rodolfo","Dragon"),Personaje(R.mipmap.elf,"Elfonso","Elfo"),Personaje(R.mipmap.ninja,"Pedro","Humano"),Personaje(R.mipmap.knight,"Ramón","Humano"),Personaje(R.mipmap.magic,"Juan","Humano"),Personaje(R.mipmap.ogre,"Paco","Ogro"))


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter =  StringAdapter(list)
    }
}


class Personaje(var imagen:Int, var nombre:String, var raza:String)




