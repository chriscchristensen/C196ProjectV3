package com.example.android.c196projectv3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.android.c196projectv3.databinding.FragmentCourseEditorBinding

class CourseEditorFragment : Fragment() {

    private var _binding: FragmentCourseEditorBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    companion object {
        fun newInstance() = CourseEditorFragment()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCourseEditorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonHome.setOnClickListener {
            findNavController().navigate(R.id.action_courseEditorFragment_to_HomeFragment)
        }
        binding.courselist.setOnClickListener {
            findNavController().navigate(R.id.action_courseEditorFragment_to_CourseFragment)
        }
        binding.coursenoteseditor.setOnClickListener {
            findNavController().navigate(R.id.action_courseEditorFragment_to_courseNotesEditorFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}