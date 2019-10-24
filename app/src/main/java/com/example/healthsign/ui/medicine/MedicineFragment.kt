package com.example.healthsign.ui.medicine

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.healthsign.R

class MedicineFragment : Fragment() {

    private lateinit var medicineViewModel: MedicineViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        medicineViewModel =
            ViewModelProviders.of(this).get(MedicineViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_medicine, container, false)
        val textView: TextView = root.findViewById(R.id.text_medicine)
        medicineViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}
