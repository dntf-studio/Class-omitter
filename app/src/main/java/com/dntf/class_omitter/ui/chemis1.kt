package com.dntf.class_omitter.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.text.style.AbsoluteSizeSpan
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.dntf.class_omitter.MainActivity
import com.dntf.class_omitter.R
import java.lang.StringBuilder

class chemis1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chemis1)

        //imagebutton
        val backbtn : Button = findViewById(R.id.button45)
        backbtn.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        //table1
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
        val table19 : Button = findViewById(R.id.button19)
        val table20 : Button = findViewById(R.id.button20)

        //table2
        val table_1 : Button = findViewById(R.id.button_1)
        val table_2 : Button = findViewById(R.id.button_2)
        val table_3 : Button = findViewById(R.id.button_3)
        val table_4 : Button = findViewById(R.id.button_4)
        val table_5 : Button = findViewById(R.id.button_5)
        val table_6 : Button = findViewById(R.id.button_6)
        val table_7 : Button = findViewById(R.id.button_7)
        val table_8 : Button = findViewById(R.id.button_8)
        val table_9 : Button = findViewById(R.id.button_9)
        val table_10 : Button = findViewById(R.id.button_10)
        val table_11 : Button = findViewById(R.id.button_11)
        val table_12 : Button = findViewById(R.id.button_12)

        text1.text = "????????????????????????"
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
        table19.text = "K"
        table20.text = "Ca"

        table_1.text = "Fe"
        table_2.text = "Ni"
        table_3.text = "Cu"
        table_4.text = "Zn"
        table_5.text = "Ag"
        table_6.text = "Br"
        table_7.text = "Ba"
        table_8.text = "Pt"
        table_9.text = "Au"
        table_10.text = "Hg"
        table_11.text = "Pb"
        table_12.text = "I"

        table1.setOnClickListener{ messanger(table1.text.toString(),1) }
        table2.setOnClickListener{ messanger(table2.text.toString(),2) }
        table3.setOnClickListener{ messanger(table3.text.toString(),3) }
        table4.setOnClickListener{ messanger(table4.text.toString(),4) }
        table5.setOnClickListener{ messanger(table5.text.toString(),5) }
        table6.setOnClickListener{ messanger(table6.text.toString(),6) }
        table7.setOnClickListener{ messanger(table7.text.toString(),7) }
        table8.setOnClickListener{ messanger(table8.text.toString(),8) }
        table9.setOnClickListener{ messanger(table9.text.toString(),9) }
        table10.setOnClickListener{ messanger(table10.text.toString(),10) }
        table11.setOnClickListener{ messanger(table11.text.toString(),11) }
        table12.setOnClickListener{ messanger(table12.text.toString(),12) }
        table13.setOnClickListener{ messanger(table13.text.toString(),13) }
        table14.setOnClickListener{ messanger(table14.text.toString(),14) }
        table15.setOnClickListener{ messanger(table15.text.toString(),15) }
        table16.setOnClickListener{ messanger(table16.text.toString(),16) }
        table17.setOnClickListener{ messanger(table17.text.toString(),17) }
        table18.setOnClickListener{ messanger(table18.text.toString(),18) }
        table19.setOnClickListener{ messanger(table19.text.toString(),19) }
        table20.setOnClickListener{ messanger(table20.text.toString(),20) }

        table_1.setOnClickListener { alert(table_1.text.toString(),"???") }
        table_2.setOnClickListener { alert(table_2.text.toString(),"????????????") }
        table_3.setOnClickListener { alert(table_3.text.toString(),"???") }
        table_4.setOnClickListener { alert(table_4.text.toString(),"??????") }
        table_5.setOnClickListener { alert(table_5.text.toString(),"???") }
        table_6.setOnClickListener { alert(table_6.text.toString(),"??????") }
        table_7.setOnClickListener { alert(table_7.text.toString(),"????????????") }
        table_8.setOnClickListener { alert(table_8.text.toString(),"??????") }
        table_9.setOnClickListener { alert(table_9.text.toString(),"???") }
        table_10.setOnClickListener { alert(table_10.text.toString(),"??????") }
        table_11.setOnClickListener { alert(table_11.text.toString(),"???") }
        table_12.setOnClickListener { alert(table_12.text.toString(),"?????????") }
    }

    fun messanger(str:String,num:Int){
        when(num){
            1 -> {alert(str,"??????")}
            2 -> {alert(str,"????????????")}
            3 -> {alert(str,"????????????")}
            4 -> {alert(str,"????????????")}
            5 -> {alert(str,"?????????")}
            6 -> {alert(str,"??????")}
            7 -> {alert(str,"??????")}
            8 -> {alert(str,"??????")}
            9 -> {alert(str,"?????????")}
            10 -> {alert(str,"?????????")}
            11 -> {alert(str,"???????????????")}
            12 -> {alert(str,"??????????????????")}
            13 -> {alert(str,"??????????????????")}
            14 -> {alert(str,"?????????")}
            15 -> {alert(str,"??????")}
            16 -> {alert(str,"??????")}
            17 -> {alert(str,"??????")}
            18 -> {alert(str,"????????????")}
            19 -> {alert(str,"????????????")}
            20 -> {alert(str,"???????????????")}
        }
    }

    fun alert(title:String,msg:String){
        AlertDialog.Builder(this)
                .setTitle(title)
                .setMessage(msg)
                .setPositiveButton("OK",{dialog,which->})
                .show()
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