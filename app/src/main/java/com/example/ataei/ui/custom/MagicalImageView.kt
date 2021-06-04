package com.example.ataei.ui.custom

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView
import com.bumptech.glide.Glide
import com.example.ataei.R
import java.util.jar.Attributes
import javax.annotation.Nullable

class MagicalImageView(context: Context?) : AppCompatImageView(context) {

    private var imageUrl: String? = null

    constructor(context: Context?, @Nullable attributeSet: AttributeSet) : this(context) {
        init(context, attributeSet)
    }


    fun setImageUrl() {
        imageUrl?.let {
            Glide.with(context)
                .load(imageUrl)
                .placeholder(R.drawable.ic_business_donate_v1)
                .centerCrop()
                .into(this)
        }

    }

    private fun init(context: Context?, attributes: AttributeSet) {
        try {
            val ta = context?.obtainStyledAttributes(attributes, R.styleable.MagicalImageView, 0, 0)
            imageUrl = ta?.getString(R.styleable.MagicalImageView_image_url)
        } catch (e: Exception) {
            e.printStackTrace()
        }

        setImageUrl()
    }

}