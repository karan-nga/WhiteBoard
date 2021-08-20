package com.example.whiteboard

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import com.example.whiteboard.paintView.Companion.colorList
import com.example.whiteboard.paintView.Companion.currentBrush
import com.example.whiteboard.paintView.Companion.pathList

class MainActivity : AppCompatActivity() {
   companion object{
       var path=Path()
       var paint=Paint()
   }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val redBtn=findViewById<ImageButton>(R.id.red)
        val blueBtn=findViewById<ImageButton>(R.id.blue)
        val blackBtn=findViewById<ImageButton>(R.id.black)
        val eraser=findViewById<ImageView>(R.id.white)
        redBtn.setOnClickListener{
            Toast.makeText(this,"Red Selected!",Toast.LENGTH_SHORT).show()
            paint.color= Color.RED
            colorChange(paint.color)
        }
        blueBtn.setOnClickListener{
            Toast.makeText(this,"Blue Selected!",Toast.LENGTH_SHORT).show()
            paint.color= Color.BLUE
            colorChange(paint.color)
        }
        blackBtn.setOnClickListener{
            Toast.makeText(this,"Black Selected!",Toast.LENGTH_SHORT).show()
            paint.color= Color.BLACK
            colorChange(paint.color)
        }
        eraser.setOnClickListener{
            Toast.makeText(this,"Canvas Clear!",Toast.LENGTH_SHORT).show()
            pathList.clear()
            colorList.clear()
            path.reset()
        }
    }
    private fun colorChange(color:Int){
    currentBrush=color
        path=Path()
    }

}