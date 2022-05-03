package com.example.snackbar

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowSnackBar.setOnClickListener {
            val snackbar = Snackbar.make(
                rootLayout, "IT Wala",
                Snackbar.LENGTH_INDEFINITE
            )
            snackbar.setAction("OK") {
                Toast.makeText(
                    this@MainActivity, "Clicked.",
                    Toast.LENGTH_SHORT
                ).show()
            }
            snackbar.setActionTextColor(resources.getColor(R.color.white))
            snackbar.setTextColor(resources.getColor(R.color.white))
            snackbar.setBackgroundTint(resources.getColor(R.color.purple_500))
            snackbar.anchorView = btnShowSnackBar
            snackbar.show()
        }
    }
}