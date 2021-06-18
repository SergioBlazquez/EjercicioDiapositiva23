package com.example.ejerciciodiapositiva23

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class StringAdapter(var list: List<Personaje>) : RecyclerView.Adapter<StringAdapter.StringViewHolder>()  {

    class StringViewHolder(var root: View, var linearLayout: LinearLayout, var imageView: ImageView, var textView1: TextView, var textView2: TextView) : RecyclerView.ViewHolder(root)


    // Aquí solo obtenemos las vistas que están dentro de layout en el que queremos mostrar nuestros elementos
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StringViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        val twlinearLayout = view.findViewById<LinearLayout>(R.id.ly)
        val imageView = view.findViewById<ImageView>(R.id.imagweview)
        val textView1 = view.findViewById<TextView>(R.id.tv1)
        val textView2 = view.findViewById<TextView>(R.id.tv2)
        return StringViewHolder(view, twlinearLayout, imageView, textView1,textView2)
    }

    // Aquí devolvemos el número de elementos que habrá en nuestro recylcerView
    override fun getItemCount(): Int {
        return list.size
    }

    // Aquí ponermos en el layout vacío que hemos creado en el onCreateViewHolder los datos del elemento
    override fun onBindViewHolder(holder: StringViewHolder, position: Int) {




                holder.imageView.setImageResource(list[position].imagen)
                holder.textView1.text=list[position].nombre
                holder.textView2.text=list[position].raza





    }


}

