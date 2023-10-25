package edu.du.week7localtabs.ui.main

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import edu.du.week7localtabs.R

class SpringsOrleansFragment : Fragment() {

    private lateinit var mapButton: Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater!!.inflate(R.layout.fragment_so, container, false)

        mapButton = view.findViewById(R.id.btn_map)
        mapButton.setOnClickListener {
            Log.i("BTN CLICK", "CLICKED")
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=123 E Pikes Peak Ave, Colorado Springs, CO 80903")))
        }
        return view
    }

    companion object {
        @JvmStatic
        fun newInstance(): SpringsOrleansFragment {
            return SpringsOrleansFragment()
        }
    }
}