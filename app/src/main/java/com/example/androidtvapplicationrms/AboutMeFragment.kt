package com.example.androidtvapplicationrms

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide

class AboutMeFragment : Fragment(R.layout.fragment_about_me) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val avatarImageView = view.findViewById<ImageView>(R.id.avatar)

        Glide.with(this)
            .load(R.drawable.ricardo)
            .circleCrop()
            .into(avatarImageView)
    }
}