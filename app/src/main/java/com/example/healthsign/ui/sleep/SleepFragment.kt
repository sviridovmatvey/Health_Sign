package com.example.healthsign.ui.sleep

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.healthsign.R

class SleepFragment : Fragment() {

    private lateinit var sleepViewModel: SleepViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        sleepViewModel =
            ViewModelProviders.of(this).get(SleepViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_sleep, container, false)
        val textView: TextView = root.findViewById(R.id.text_sleep)
        sleepViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}
