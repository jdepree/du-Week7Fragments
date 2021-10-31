package edu.du.week7localtabs.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import edu.du.week7localtabs.R

class TablePublicHouseFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_tph, null)
    }

    companion object {
        @JvmStatic
        fun newInstance(): TablePublicHouseFragment {
            return TablePublicHouseFragment()
        }
    }
}