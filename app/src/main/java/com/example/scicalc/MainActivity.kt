package com.example.scicalc

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import kotlin.math.*

class MainActivity : AppCompatActivity() {

    private lateinit var tvExpression: TextView
    private lateinit var tvResult: TextView
    private var currentInput = ""
    private var storedValue: Double? = null
    private var pendingOp: String? = null
    private var isInverse = false
    private var useDegrees = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvExpression = findViewById(R.id.tvExpression)
        tvResult = findViewById(R.id.tvResult)

        // Initialize buttons etc (same as before)
        // ...
    }

    // All calculator logic (appendDigit, setOp, applyTrig, etc.)
    // Same as in the full code I gave you
}
