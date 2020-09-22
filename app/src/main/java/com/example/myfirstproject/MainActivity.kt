package com.example.myfirstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.*
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Numbers
        btnDot.setOnClickListener{appendOnClick(".", true)}
        btnZero.setOnClickListener{appendOnClick("0", true)}
        btnOne.setOnClickListener{appendOnClick("1", true)}
        btnTwo.setOnClickListener{appendOnClick("2", true)}
        btnThree.setOnClickListener{appendOnClick("3", true)}
        btnFour.setOnClickListener{appendOnClick("4", true)}
        btnFive.setOnClickListener{appendOnClick("5", true)}
        btnSix.setOnClickListener{appendOnClick("6", true)}
        btnSeven.setOnClickListener{appendOnClick("7", true)}
        btnEight.setOnClickListener{appendOnClick("8", true)}
        btnNine.setOnClickListener{appendOnClick("9", true)}

        //Operators
        btnPlus.setOnClickListener {appendOnClick("+", false)}
        btnMinus.setOnClickListener{appendOnClick("-", false)}
        btnMulti.setOnClickListener{appendOnClick("×", false)}
        btnDiv.setOnClickListener{appendOnClick("÷", false)}

        btnClear.setOnClickListener {

        }

        btnResult.setOnClickListener {

        }
        btnDel.setOnClickListener{

        }

    }

    private fun appendOnClick (string: String, canClear:Boolean) {

    }
}