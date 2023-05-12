package com.example.missy.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.missy.BeratBadanActivity
import com.example.missy.MoodActivity
import com.example.missy.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [CalenderFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CalenderFragment : Fragment() {
    // TODO: Rename and change types of parameters
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_calender, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val suasanahati: Button = view.findViewById(R.id.suasanaHati)
        val beratbadan : Button = view.findViewById(R.id.berat_badan)

        suasanahati.setOnClickListener {
            val moodActivityIntent = Intent(requireContext(), MoodActivity::class.java)
            activity?.startActivity(moodActivityIntent)
        }

        beratbadan.setOnClickListener {
            val beratbadanActivityIntent = Intent(requireContext(), BeratBadanActivity::class.java)
            activity?.startActivity(beratbadanActivityIntent)
        }

    }
}