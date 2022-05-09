package com.example.customlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter

class MyAdapter(context: Context, resource: Int, objects: Array<out Any>) :
    ArrayAdapter<User>(context, resource, objects) {

    val ref = context
    val row = resource
    val data = objects

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView
        if(view == null){
            view = LayoutInflater.from(context).inflate(row,parent,false)
        }

        return super.getView(position, convertView, parent)
    }

}