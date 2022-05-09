package com.example.presidentialelectioncandidates

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class listFragment : Fragment() {

    val namesArray = arrayOf("bush","carson","chafee","cliton","omalley","rubio","sanders","trump")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list, container, false)

        val listView = view.findViewById<ListView>(R.id.list)
        val adapter : ArrayAdapter<String> = ArrayAdapter(requireActivity(),android.R.layout.simple_list_item_1,namesArray)
        listView.adapter = adapter

        listView.setOnItemClickListener { parent, _, position, _ ->
            val selectedItem = parent.getItemAtPosition(position) as String

            Toast.makeText(requireActivity(),selectedItem,Toast.LENGTH_SHORT).show()

        }

        return view
    }

}