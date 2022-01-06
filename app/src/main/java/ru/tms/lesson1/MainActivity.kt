package ru.tms.lesson1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.os.bundleOf
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()

        btn.setOnClickListener {
           startActivity(Intent.createChooser(createIntent(),"title"))
        }
    }

    private fun createIntent() =
        Intent(Intent.ACTION_SEND).apply {
            type = "text/plain"
            putExtra(Intent.EXTRA_EMAIL, arrayOf("jan@example.com")) // recipients
            putExtra(Intent.EXTRA_SUBJECT, "Email subject")
            putExtra(Intent.EXTRA_TEXT, "Email message text")
        }
}