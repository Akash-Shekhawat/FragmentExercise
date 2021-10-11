package com.example.fragmentexercise

import android.app.AlertDialog
import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

// Creating Diaglog Fragment
class DialogFragmentDemo : DialogFragment() {

    // It return Dialog after building it
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog =
        AlertDialog.Builder(requireContext())
            .setTitle("Welcome")
            .setMessage("This is Dialog Fragment")
            .setPositiveButton("Okay!") { _, _ -> }
            .create()
}