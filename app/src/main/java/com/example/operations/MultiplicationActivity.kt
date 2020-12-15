package com.example.operations

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MultiplicationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multiplication)
    }
    fun multfun(view: View)
    {
        var getnum1=findViewById<EditText>(R.id.num1)
        var getnum2=findViewById<EditText>(R.id.num2)
        var res=getnum1.text.toString().toInt()*getnum2.text.toString().toInt()
    var getresult=findViewById<TextView>(R.id.result)
        getresult.text=res.toString()
       

    }
    fun backhomefun(view: View){
        intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}
