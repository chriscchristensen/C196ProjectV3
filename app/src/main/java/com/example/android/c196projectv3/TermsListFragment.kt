package com.example.android.c196projectv3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.android.c196projectv3.databinding.FragmentTermBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class TermsListFragment : Fragment() {

    private var _binding: FragmentTermBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentTermBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonHome.setOnClickListener {
            findNavController().navigate(R.id.action_TermListFragment_to_HomeFragment)
        }
        binding.buttonTermeditor.setOnClickListener {
            findNavController().navigate(R.id.action_TermListFragment_to_TermEditorFragment)
        }
        binding.buttonTermdetails.setOnClickListener {
            findNavController().navigate(R.id.action_TermListFragment_to_TermDetailsFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}