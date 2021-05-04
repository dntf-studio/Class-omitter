package com.dntf.class_omitter.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.text.style.AbsoluteSizeSpan
import android.widget.Button
import android.widget.TextView
import com.dntf.class_omitter.R
import java.lang.StringBuilder

class chemis1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chemis1)

        val text1 : TextView = findViewById(R.id.textView)
        val table1 : Button = findViewById(R.id.button1)
        val table2 : Button = findViewById(R.id.button2)
        val table3 : Button = findViewById(R.id.button3)
        val table4 : Button = findViewById(R.id.button4)
        val table5 : Button = findViewById(R.id.button5)
        val table6 : Button = findViewById(R.id.button6)
        val table7 : Button = findViewById(R.id.button7)
        val table8 : Button = findViewById(R.id.button8)
        val table9 : Button = findViewById(R.id.button9)
        val table10 : Button = findViewById(R.id.button10)
        val table11 : Button = findViewById(R.id.button11)
        val table12 : Button = findViewById(R.id.button12)
        val table13 : Button = findViewById(R.id.button13)
        val table14 : Button = findViewById(R.id.button14)
        val table15 : Button = findViewById(R.id.button15)
        val table16 : Button = findViewById(R.id.button16)
        val table17 : Button = findViewById(R.id.button17)
        val table18 : Button = findViewById(R.id.button18)


        text1.text = "元素名と元素記号"
        table1.text = "H"
        table2.text = "He"
        table3.text = "Li"
        table4.text = "Be"
        table5.text = "B"
        table6.text = "C"
        table7.text = "N"
        table8.text = "O"
        table9.text = "F"
        table10.text = "Ne"
        table11.text = "Na"
        table12.text = "Mg"
        table13.text = "Al"
        table14.text = "Si"
        table15.text = "P"
        table16.text = "S"
        table17.text = "Cl"
        table18.text = "Ar"
    }

    fun TextView.changeSpanSize(target_text:String,text_:String,size:Int){
        val span = SpannableStringBuilder(target_text+text_)

        span.setSpan(
                AbsoluteSizeSpan(size,true),
                0,
                target_text.length,
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        text = span
    }
}