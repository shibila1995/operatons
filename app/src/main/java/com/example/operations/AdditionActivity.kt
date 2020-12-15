package com.example.operations

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_addition.*

class AdditionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addition)
    }
fun addfun(view: View){
    var getnum1=findViewById<EditText>(R.id.num1)
    var getnum2=findViewById<EditText>(R.id.num2)
    var getres=findViewById<TextView>(R.id.result)
    var res=getnum1.text.toString().toInt()+getnum2.text.toString().toInt()

    getres.text=res.toString()
}
fun backhomefun(view: View){
    intent= Intent(this,MainActivity::class.java)
    startActivity(intent)
}
}
