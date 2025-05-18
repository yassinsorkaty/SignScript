// HomeActivity.kt
package com.google.mediapipe.examples.gesturerecognizer
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.mediapipe.examples.gesturerecognizer.R
import android.view.View
import android.content.Intent


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome)
        findViewById<View>(R.id.another_button).setOnClickListener {
            // Start live camera gesture recognition activity
            startActivity(Intent(this, MainActivity::class.java))
        }

        // Set click listeners for the buttons

    }
}
