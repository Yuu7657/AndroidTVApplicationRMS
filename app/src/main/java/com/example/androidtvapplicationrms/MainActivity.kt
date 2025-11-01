package com.example.androidtvapplicationrms

import com.example.androidtvapplicationrms.WelcomeFragment
import com.example.androidtvapplicationrms.SkillsFragment
import com.example.androidtvapplicationrms.ProjectsFragment
import com.example.androidtvapplicationrms.ExperienceFragment
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val fragments = listOf(
        WelcomeFragment(),
        AboutMeFragment(),
        SkillsFragment(),
        ProjectsFragment(),
        ExperienceFragment()
    )
    private var currentIndex = 0

    private lateinit var arrowLeft: ImageView
    private lateinit var arrowRight: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        arrowLeft = findViewById(R.id.arrow_left)
        arrowRight = findViewById(R.id.arrow_right)

        showFragment(currentIndex)

        arrowLeft.setOnClickListener {
            if (currentIndex > 0) {
                currentIndex--
                showFragment(currentIndex)
            }
        }

        arrowRight.setOnClickListener {
            if (currentIndex < fragments.size - 1) {
                currentIndex++
                showFragment(currentIndex)
            }
        }
    }

    private fun showFragment(index: Int) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.main_browse_fragment, fragments[index])
            .commit()
        updateArrowVisibility()
    }

    private fun updateArrowVisibility() {
        arrowLeft.visibility = if (currentIndex == 0) View.INVISIBLE else View.VISIBLE
        arrowRight.visibility = if (currentIndex == fragments.size - 1) View.INVISIBLE else View.VISIBLE
    }
}