package com.example.ataei.ui.home

import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.ataei.R

class BindingAdapters {

    companion object {
        @BindingAdapter("app:imageResource")
        @JvmStatic
        fun setImageResource(imageView: ImageView, imageUrl: String?) {
            val context = imageView.context
            val options: RequestOptions =
                RequestOptions().placeholder(R.drawable.ic_business_donate_v1)
                    .error(R.drawable.ic_launcher_background)
            Glide.with(context)
                .setDefaultRequestOptions(options)
                .load(imageUrl)
                .into(imageView)
        }

        @BindingAdapter("app:changeVisibility")
        @JvmStatic
        fun changeVisibility(view: View, value: Boolean) {
            view.visibility = if (value) View.VISIBLE else View.GONE
        }


    }

}