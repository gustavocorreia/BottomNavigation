package br.com.gcs.bottomnavigation


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import org.w3c.dom.Text


/**
 * A simple [Fragment] subclass.
 *
 */
class BlankFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_blank, container, false)
        val tvMensagem = view.findViewById<TextView>(R.id.tvMensagem)
        tvMensagem.text = arguments?.getString("texto")
        // Inflate the layout for this fragment
        return view
    }

    companion object {
        fun newinstance(texto: String) : BlankFragment {
            val fragment = BlankFragment()
            val bundle = Bundle()
            bundle.putString("texto", texto)
            fragment.arguments = bundle
            return  fragment
        }
    }



}
