package com.example.presidentialelectioncandidates

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.ListView
import androidx.fragment.app.Fragment

class detailsFragment : Fragment() {

    val data : Array<User> = arrayOf(
        User(R.drawable.bush, "Bush"),
        User(R.drawable.carson, "Carson"),
        User(R.drawable.chafee, "Chafee"),
        User(R.drawable.clinton, "Clinton"),
        User(R.drawable.omalley, "Omalley"),
        User(R.drawable.rubio, "Rubio"),
        User(R.drawable.sanders, "Sanders"),
        User(R.drawable.trump, "Trump")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_details, container, false)
        val list : ListView = view.findViewById(R.id.list)
        val adapter : MyAdapter = MyAdapter(requireActivity(), R.layout.row, data)
        list.adapter = adapter
        return view

    }

}