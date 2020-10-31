package com.inveitix.tiktaktoeadvanced.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.inveitix.tiktaktoeadvanced.R
import com.inveitix.tiktaktoeadvanced.TikToeView


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val container = view.findViewById<LinearLayout>(R.id.container);
        val tiktak = TikToeView(context)
        container.addView(tiktak)

        val database = FirebaseDatabase.getInstance()
        val myRef = database.getReference("games")

        myRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val snapshotIterator =
                    dataSnapshot.children
                val iterator: Iterator<DataSnapshot> =
                    snapshotIterator.iterator()

                val states = ArrayList<String>()
                while (iterator.hasNext()) {
                    val next = iterator.next()
                    states.add(next.value.toString())
                }

                tiktak.setStates(states)
            }

            override fun onCancelled(error: DatabaseError) { // Failed to read value

            }
        })

        tiktak.setStateListener {
            myRef.setValue(it)
        }

    }
}