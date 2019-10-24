package com.example.healthsign.ui.fitness

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.healthsign.R

class FitnessFragment : Fragment() {

    private lateinit var fitnessViewModel: FitnessViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fitnessViewModel =
            ViewModelProviders.of(this).get(FitnessViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_fitness, container, false)
        val textView: TextView = root.findViewById(R.id.text_fitness)
        fitnessViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}
