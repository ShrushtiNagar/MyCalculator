package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var inputText :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv1 = findViewById<TextView>(R.id.tv1)
        val tv2 = findViewById<TextView>(R.id.tv2)
        val tv3 = findViewById<TextView>(R.id.tv3)
        val iv4 = findViewById<ImageView>(R.id.iv4)
        val tv5 = findViewById<TextView>(R.id.tv5)
        val tv6 = findViewById<TextView>(R.id.tv6)
        val tv7 = findViewById<TextView>(R.id.tv7)
        val tv8 = findViewById<TextView>(R.id.tv8)
        val tv9 = findViewById<TextView>(R.id.tv9)
        val tv10 = findViewById<TextView>(R.id.tv10)
        val tv11 = findViewById<TextView>(R.id.tv11)
        val tv12 = findViewById<TextView>(R.id.tv12)
        val tv13 = findViewById<TextView>(R.id.tv13)
        val tv14 = findViewById<TextView>(R.id.tv14)
        val tv15 = findViewById<TextView>(R.id.tv15)
        val tv16 = findViewById<TextView>(R.id.tv16)
        val tv17 = findViewById<TextView>(R.id.tv17)
        val tv18 = findViewById<TextView>(R.id.tv18)
        val tv19 = findViewById<TextView>(R.id.tv19)

       inputText = findViewById(R.id.inputText)
        var canAddOperator = false
        var canAddDecimal = true

        tv1.setOnClickListener {
            tv1.animate().apply{
                duration = 80
                rotationXBy(20f)
            }.withEndAction {
                tv1.animate().apply{
                    duration = 80
                    rotationXBy(-20f)
                }
            }
            inputText.text=""
        }

        tv2.setOnClickListener{
            tv2.animate().apply{
                duration = 80
                rotationXBy(20f)
            }.withEndAction {
                tv2.animate().apply{
                    rotationXBy(-20f)
                }
            }
            if(canAddOperator){
                inputText.append(tv2.text)
                canAddOperator=false
                canAddDecimal=true
            }

        }

        tv3.setOnClickListener{
            tv3.animate().apply{
                duration = 80
                rotationXBy(20f)
            }.withEndAction {
                tv3.animate().apply{
                    rotationXBy(-20f)
                }
            }
            if(canAddOperator){
                inputText.append(tv3.text)
                canAddOperator=false
                canAddDecimal=true
            }
        }
//
        iv4.setOnClickListener{
            iv4.animate().apply{
                duration = 80
                rotationXBy(20f)
            }.withEndAction {
                iv4.animate().apply{
                    rotationXBy(-20f)
                }
            }
            val length = inputText.length()
            if(length>0){
                inputText.text = inputText.text.subSequence(0,length-1)
            }
        }

        tv5.setOnClickListener{
            tv5.animate().apply{
                duration = 80
                rotationXBy(20f)
            }.withEndAction {
                tv5.animate().apply{
                    rotationXBy(-20f)
                }
            }
            inputText.append(tv5.text)
            canAddOperator=true

        }

        tv6.setOnClickListener{
            tv6.animate().apply{
                duration = 80
                rotationXBy(20f)
            }.withEndAction {
                tv6.animate().apply{
                    rotationXBy(-20f)
                }
            }
            inputText.append(tv6.text)
            canAddOperator=true
        }

        tv7.setOnClickListener{
            tv7.animate().apply{
                duration = 80
                rotationXBy(20f)
            }.withEndAction {
                tv7.animate().apply{
                    rotationXBy(-20f)
                }
            }
            inputText.append(tv7.text)
            canAddOperator=true
        }

        tv8.setOnClickListener{
            tv8.animate().apply{
                duration = 80
                rotationXBy(20f)
            }.withEndAction {
                tv8.animate().apply{
                    rotationXBy(-20f)
                }
            }
            if(canAddOperator){
                inputText.append(tv8.text)
                canAddOperator=false
                canAddDecimal=true
            }
        }

        tv9.setOnClickListener{
            tv9.animate().apply{
                duration = 80
                rotationXBy(20f)
            }.withEndAction {
                tv9.animate().apply{
                    rotationXBy(-20f)
                }
            }
            inputText.append(tv9.text)
            canAddOperator=true
        }

        tv10.setOnClickListener{
            tv10.animate().apply{
                duration = 80
                rotationXBy(20f)
            }.withEndAction {
                tv10.animate().apply{
                    rotationXBy(-20f)
                }
            }

            inputText.append(tv10.text)
            canAddOperator=true
        }

        tv11.setOnClickListener{
            tv11.animate().apply{
                duration = 80
                rotationXBy(20f)
            }.withEndAction {
                tv11.animate().apply{
                    rotationXBy(-20f)
                }
            }
            inputText.append(tv11.text)
            canAddOperator=true

        }

        tv12.setOnClickListener{
            tv12.animate().apply{
                duration = 80
                rotationXBy(20f)
            }.withEndAction {
                tv12.animate().apply{
                    rotationXBy(-20f)
                }
            }
            if(canAddOperator){
                inputText.append(tv12.text)
                canAddOperator=false
                canAddDecimal=true
            }
        }

        tv13.setOnClickListener{
            tv13.animate().apply{
                duration = 80
                rotationXBy(20f)
            }.withEndAction {
                tv13.animate().apply{
                    rotationXBy(-20f)
                }
            }
            inputText.append(tv13.text)
            canAddOperator=true
        }

        tv14.setOnClickListener{
            tv14.animate().apply{
                duration = 80
                rotationXBy(20f)
            }.withEndAction {
                tv14.animate().apply{
                    rotationXBy(-20f)
                }
            }
            inputText.append(tv14.text)
            canAddOperator=true
        }

        tv15.setOnClickListener{
            tv15.animate().apply{
                duration = 80
                rotationXBy(20f)
            }.withEndAction {
                tv15.animate().apply{
                    rotationXBy(-20f)
                }
            }
            inputText.append(tv15.text)
            canAddOperator=true
        }

        tv16.setOnClickListener{
            tv16.animate().apply{
                duration = 80
                rotationXBy(20f)
            }.withEndAction {
                tv16.animate().apply{
                    rotationXBy(-20f)
                }
            }
            if(canAddOperator){
                inputText.append(tv16.text)
                canAddOperator=false
                canAddDecimal=true
            }
        }

        tv17.setOnClickListener {
            tv17.animate().apply {
                duration = 80
                rotationXBy(20f)
            }.withEndAction {
                tv17.animate().apply {
                    rotationXBy(-20f)
                }
            }
            if (canAddDecimal) {
                inputText.append(tv17.text)
                canAddDecimal = false
                canAddOperator= false
            }
        }

        tv18.setOnClickListener{
            tv18.animate().apply{
                duration = 80
                rotationXBy(20f)
            }.withEndAction {
                tv18.animate().apply{
                    rotationXBy(-20f)
                }
            }
            inputText.append(tv18.text)
            canAddOperator=true
        }

        tv19.setOnClickListener{
            tv19.animate().apply{
                duration = 80
                rotationXBy(20f)
            }.withEndAction {
                tv19.animate().apply{
                    rotationXBy(-20f)
                }
            }
        inputText.text = calcResults()

        }

    }

    private fun calcResults():String{
        val digitsOperator = digitsOperator()
        if(digitsOperator.isEmpty())
            return ""

        val moduloOperation = moduloCalculator(digitsOperator)
        if(moduloOperation.isEmpty()) return ""

        val timesDiv = calcTimesDiv(moduloOperation)
        if(timesDiv.isEmpty()) return ""

        val result = addSubtractCalculate(timesDiv)

        return result.toString()
    }

    private fun moduloCalculator(passedList: MutableList<Any>): MutableList<Any> {

        val list = mutableListOf<Any>()

            if(passedList.contains('%')){

                var restartIndex = passedList.size

                for(i in passedList.indices){

                    if( passedList[i] is Char && i!= passedList.lastIndex && i< restartIndex){

                        val prev = passedList[i-1] as Float
                        val next = passedList[i+1] as Float

                            if(passedList[i] == '%'){
                                list.add(prev % next)
                                restartIndex =i+1
                            }
                        else{
                            list.add(prev)
                            list.add(passedList[i])
                            }
                    }
                    if(i> restartIndex){
                        list.add(passedList[i])
                    }
                }
            }
        else{
            return passedList
            }

        return list
    }

    private fun addSubtractCalculate(passedList: MutableList<Any>):Float {
        var result = passedList[0] as Float

        for(i in passedList.indices){

            if(passedList[i] is Char && i !=passedList.lastIndex ){

                val op =passedList[i]
                val next = passedList[i+1] as Float

                when(op){
                    '+'-> result += next
                    '-' -> result -= next
                }
            }
        }

        return result
    }

    private fun digitsOperator():MutableList<Any>{

        val list = mutableListOf<Any>()
        var currentDigit = ""

        for(char in inputText.text){

            if(char.isDigit() || char=='.'){
                currentDigit += char
            }
            else{
                list.add(currentDigit.toFloat())
                currentDigit=""
                list.add(char)
            }
        }
        if(currentDigit != ""){
            list.add(currentDigit.toFloat())
        }
        return list
    }

    private fun calcTimesDiv(passedList: MutableList<Any>):MutableList<Any>{
        var list = passedList
        while(list.contains('x') || list.contains('/')){
            list = timesDivision(list)
        }

        return list
    }

    private fun timesDivision(passedList :MutableList<Any>):MutableList<Any>{
        var restartIndex = passedList.size
        val newList = mutableListOf<Any>()

        for(i in passedList.indices){

            if(passedList[i] is Char && i != passedList.lastIndex && i<restartIndex){

                val op = passedList[i]
                val prevDigit = passedList[i-1] as Float
                val next = passedList[i+1] as Float

                if(passedList[i] == 'x'){
                    newList.add(prevDigit * next)
                    restartIndex = i+1
                }
                else if(passedList[i]== '/'){
                    newList.add(prevDigit / next)
                    restartIndex = i+1
                }
                else{
                    newList.add(prevDigit)
                    newList.add(op)
                }
            }
            if(i>restartIndex){
                newList.add(passedList[i])
            }
        }
        return newList
    }
}