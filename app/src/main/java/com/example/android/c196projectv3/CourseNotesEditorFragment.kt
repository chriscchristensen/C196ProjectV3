package com.example.android.c196projectv3

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.android.c196projectv3.databinding.FragmentCourseNotesEditorBinding

class CourseNotesEditorFragment : Fragment() {

    private var _binding: FragmentCourseNotesEditorBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    companion object {
        fun newInstance() = CourseNotesEditorFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCourseNotesEditorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonHome.setOnClickListener {
            findNavController().navigate(R.id.action_courseNotesEditorFragment_to_HomeFragment)
        }
        binding.courseeditor.setOnClickListener {
            findNavController().navigate(R.id.action_courseNotesEditorFragment_to_courseEditorFragment)
        }
        binding.coursenotes.setOnClickListener {
            findNavController().navigate(R.id.action_courseNotesEditorFragment_to_courseNotesFragment)
        }
        binding.coursedetails.setOnClickListener {
            findNavController().navigate(R.id.action_courseNotesEditorFragment_to_courseDetailsFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}