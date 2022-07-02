package com.gorkemersizer.pinterestdesign

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.core.content.ContentProviderCompat
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.gorkemersizer.pinterestdesign.databinding.FragmentMainScreenBinding

class MainScreenFragment : Fragment() {

    private lateinit var binding: FragmentMainScreenBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //activity?.window?.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        binding = FragmentMainScreenBinding.inflate(inflater, container, false)

        binding.rv.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        val pictureList = ArrayList<Pictures>()
        val p1 = Pictures(1, "boxer")
        val p2 = Pictures(2, "woman")
        val p3 = Pictures(3, "woman_painting")
        val p4 = Pictures(4, "demon")
        val p5 = Pictures(5, "viking")
        val p6 = Pictures(6, "sunflower")
        val p7 = Pictures(7, "angel")
        val p8 = Pictures(8, "tattoo")
        pictureList.add(p1)
        pictureList.add(p2)
        pictureList.add(p3)
        pictureList.add(p4)
        pictureList.add(p5)
        pictureList.add(p6)
        pictureList.add(p7)
        pictureList.add(p8)

        val adapter = PictureAdapter(requireContext(), pictureList)
        binding.rv.adapter = adapter

        return binding.root

    }


}