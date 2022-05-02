package com.example.gemstone

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.github.appintro.AppIntro
import com.github.appintro.AppIntroFragment

class IntroActivity : AppIntro() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Call addSlide passing your Fragments.
        // You can use AppIntroFragment to use a pre-built fragment
        addSlide(
            AppIntroFragment.createInstance(
                title = "Welcome...",
                description = "This is the first slide of the example"
            )
        )
        addSlide(
            AppIntroFragment.createInstance(
                title = "...Let's get started!",
                description = "This is the last slide, I won't annoy you more :)"
            )
        )
    }

    override fun onSkipPressed(currentFragment: Fragment?) {
        super.onSkipPressed(currentFragment)
        // Decide what to do when the user clicks on "Skip"
        gotoMain()
    }

    override fun onDonePressed(currentFragment: Fragment?) {
        super.onDonePressed(currentFragment)
        gotoMain()
    }

    fun gotoMain(){
        val i = Intent(this,MainActivity::class.java)
        startActivity(i)
        finish()
    }
}