package com.gorkemersizer.pinterestdesign

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gorkemersizer.pinterestdesign.databinding.CardDesignBinding

class PictureAdapter(var mContext: Context, var pictureList: List<Pictures>): RecyclerView.Adapter<PictureAdapter.CardDesignHolder>() {
    inner class CardDesignHolder(binding: CardDesignBinding): RecyclerView.ViewHolder(binding.root) {
        var binding: CardDesignBinding
        init {
            this.binding = binding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        val layoutInflater = LayoutInflater.from(mContext)
        val binding = CardDesignBinding.inflate(layoutInflater, parent, false)
        return CardDesignHolder(binding)
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
        val picture = pictureList.get(position)
        val t =holder.binding
        t.imageViewPicture.setImageResource(mContext.resources.getIdentifier(picture.pictureName, "drawable", mContext.packageName))
    }

    override fun getItemCount(): Int {
        return pictureList.size
    }

}