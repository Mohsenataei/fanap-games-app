package com.example.ataei.helpers

import androidx.databinding.BindingAdapter
import com.example.ataei.ui.custom.MagicalImageView

class Utils {
    companion object {
        @JvmStatic
        @BindingAdapter("imageUrl")
        fun loadImage(view: MagicalImageView, url: String) {
            view.setImageUrl(url)
        }
    }
}