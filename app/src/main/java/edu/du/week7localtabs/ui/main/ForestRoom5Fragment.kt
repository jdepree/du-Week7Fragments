package edu.du.week7localtabs.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import edu.du.week7localtabs.R

class ForestRoom5Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fr5, null)
    }

    companion object {
        @JvmStatic
        fun newInstance(): ForestRoom5Fragment {
            return ForestRoom5Fragment()
        }
    }
}