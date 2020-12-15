package com.example.operations

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun addfunction(view: View){
        intent= Intent(this,AdditionActivity::class.java)
        startActivity(intent)
    }
    fun subfunction(view: View){
        intent= Intent(this,SubtractionActivity::class.java)
        startActivity(intent)
    }
    fun multfun(view: View){
        intent= Intent(this,MultiplicationActivity::class.java)
        startActivity(intent)
    }
    fun divfun(view: View){
        intent= Intent(this,DivisionActivity::class.java)
        startActivity(intent)
    }

}
