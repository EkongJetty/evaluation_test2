package com.example.fragment2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.fragment2.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private lateinit var navCon: NavController



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater,container,false)
        navCon = NavHostFragment.findNavController(this)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var name = binding.inputLayout1.editText?.text.toString()
        val track = binding.inputLayout2.editText?.text.toString()
        val moto = binding.inputLayout3.editText?.text.toString()
        HomeFragmentDirections.actionHomeFragmentToSubmissionFragment(name, track, moto)
        binding.submit.setOnClickListener {
            navCon.navigate(R.id.action_homeFragment_to_submissionFragment)
        }


           }
    }




