package com.example.expedientedigitaltt.ui.tratamiento

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.expedientedigitaltt.R

class TratamientoFragment : Fragment() {

    companion object {
        fun newInstance() = TratamientoFragment()
    }

    private lateinit var viewModel: TratamientoViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_tratamiento, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TratamientoViewModel::class.java)
        // TODO: Use the ViewModel
    }

}