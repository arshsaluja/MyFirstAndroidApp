package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class factBook{
    var facts=arrayOf("My name is Arsh","We are Learning Kotlin","We are using android studio")

    fun getFact():String{
        var randomNumber = Random.nextInt(facts.size)
        return facts[randomNumber]
    }
}
/*
class color{
    internal var colors = arrayOf("#caffbf","#9bf6ff","#e5989b")
    fun getColor(): String {
        var randomNumber = Random.nextInt(colors.size)
        return colors[randomNumber]
    }
}
*/

class MainActivity : AppCompatActivity() {
    private  var factbook=factBook()
     var colors=arrayOf("#caffbf","#9bf6ff","#e5989b")

    private var mFacts: String =factbook.facts[0]

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextButton.setOnClickListener {
            mFacts=factbook.getFact()
            factView.text=mFacts
            var randomNumber = Random.nextInt(colors.size)
            var mColor  = Color.parseColor(colors[randomNumber])
            relativeLayout.setBackgroundColor(mColor)
        }
    }

}
