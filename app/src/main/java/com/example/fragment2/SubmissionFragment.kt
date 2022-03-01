package com.example.fragment2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragment2.databinding.FragmentSubmissionBinding


class SubmissionFragment : Fragment() {
    private var _binding:FragmentSubmissionBinding?=null
    private val binding get() = _binding!!

    private lateinit var name:String
    private lateinit var track:String
    private lateinit var moto:String


    companion object{
        const val name = "name"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            name = it.getString(name).toString()
            track = it.getString(track).toString()
            moto = it.getString(moto).toString()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ):View {
        // Inflate the layout for this fragment
        _binding = FragmentSubmissionBinding.inflate(inflater,container,false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nameText.text=name
        binding.trackText.text=track
        binding.motoText.text=moto
    }



}