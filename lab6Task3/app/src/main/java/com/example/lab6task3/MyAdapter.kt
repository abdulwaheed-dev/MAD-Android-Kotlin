package com.example.lab6task3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(context: Context, resource: Int, objects: Array<out Numbers>) :
    ArrayAdapter<Numbers>(context, resource, objects) {

    val ref = context
    val row = resource
    val data = objects

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView
        if(view == null){
            view = LayoutInflater.from(context).inflate(row,parent,false)
        }

        val img : ImageView = view!!.findViewById(R.id.imageView)
        val num : TextView = view!!.findViewById(R.id.textView)
        val number : TextView = view!!.findViewById(R.id.textView2)

        img.setImageResource(data[position].img)
        num.text = data[position].num
        number.text = data[position].number


        return view!!

    }
}