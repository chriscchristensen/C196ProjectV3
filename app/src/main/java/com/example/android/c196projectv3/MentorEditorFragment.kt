package com.example.android.c196projectv3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.android.c196projectv3.databinding.FragmentMentorEditorBinding

class MentorEditorFragment : Fragment() {

    private var _binding: FragmentMentorEditorBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    companion object {
        fun newInstance() = MentorEditorFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMentorEditorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonHome.setOnClickListener {
            findNavController().navigate(R.id.action_mentorEditorFragment_to_HomeFragment)
        }
        binding.buttonSave.setOnClickListener {
            findNavController().navigate(R.id.action_mentorEditorFragment_to_courseDetailsFragment)
        }
        binding.buttonDelete.setOnClickListener {
            findNavController().navigate(R.id.action_mentorEditorFragment_to_courseDetailsFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}