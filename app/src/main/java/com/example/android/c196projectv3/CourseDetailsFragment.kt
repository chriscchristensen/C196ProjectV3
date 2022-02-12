package com.example.android.c196projectv3

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.android.c196projectv3.databinding.FragmentCourseDetailsBinding

class CourseDetailsFragment : Fragment() {

    private var _binding: FragmentCourseDetailsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    companion object {
        fun newInstance() = CourseDetailsFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCourseDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonHome.setOnClickListener {
            findNavController().navigate(R.id.action_courseDetailsFragment_to_HomeFragment)
        }
        binding.courselist.setOnClickListener {
            findNavController().navigate(R.id.action_courseDetailsFragment_to_CourseFragment)
        }
        binding.coursenotes.setOnClickListener {
            findNavController().navigate(R.id.action_courseDetailsFragment_to_courseNotesFragment)
        }
        binding.coursenoteseditor.setOnClickListener {
            findNavController().navigate(R.id.action_courseDetailsFragment_to_courseNotesEditorFragment)
        }
        binding.coursementoreditor.setOnClickListener {
            findNavController().navigate(R.id.action_courseDetailsFragment_to_mentorEditorFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}