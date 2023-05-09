package com.example.pixabay

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import coil.load
import com.example.pixabay.databinding.ItemImagesBinding
import kotlin.collections.ArrayList

class PixaAdapter(val list: ArrayList<ImageModel>) : Adapter<PixaAdapter.PixaViewHolder>() {

    fun addImages(listImages: List<ImageModel>) {
        list.addAll(listImages)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PixaViewHolder {
        return PixaViewHolder(ItemImagesBinding.inflate(LayoutInflater.from(parent.context),
            parent,
            false
        )
        )
    }

    override fun onBindViewHolder(holder: PixaViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class PixaViewHolder(var binding: ItemImagesBinding) : ViewHolder(binding.root) {
        fun bind(imageModel: ImageModel) {
            binding.photoView.load(imageModel.largeImageURL)
        }
    }
}