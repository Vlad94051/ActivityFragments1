package ru.tms.lesson1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.core.os.bundleOf
import kotlinx.android.synthetic.main.activity_main.*

class ShareActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_first)

        handleIntent()
    }

    private fun handleIntent() {
        if (intent?.type == "text/plain") {
            findViewById<TextView>(R.id.title).text = intent.getStringExtra(Intent.EXTRA_TEXT)
        }
    }
}