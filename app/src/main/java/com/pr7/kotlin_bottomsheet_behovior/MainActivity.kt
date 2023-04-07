package com.pr7.kotlin_bottomsheet_behovior

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior

class MainActivity : AppCompatActivity() {
    lateinit var linearLayout: LinearLayout
    lateinit var imageView: ImageView

    var collapse=true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        linearLayout=findViewById(R.id.linearlayoutbottomsheet)
        imageView=findViewById(R.id.imageviewarrow)
        val bottomSheetBehavior=BottomSheetBehavior.from(linearLayout)

        imageView.setOnClickListener {
            if (collapse){
                bottomSheetBehavior.state=BottomSheetBehavior.STATE_EXPANDED
                collapse=false
            }else{
                bottomSheetBehavior.state=BottomSheetBehavior.STATE_COLLAPSED
                collapse=true
            }
        }

        bottomSheetBehavior.addBottomSheetCallback(object: BottomSheetBehavior.BottomSheetCallback() {
            override fun onStateChanged(bottomSheet: View, newState: Int) {
                if (newState==BottomSheetBehavior.STATE_EXPANDED){
                    imageView.setImageResource(R.drawable.round_keyboard_arrow_down_24)
                }else if(newState == BottomSheetBehavior.STATE_COLLAPSED){
                    imageView.setImageResource(R.drawable.round_keyboard_arrow_up_24)

                }
            }

            override fun onSlide(bottomSheet: View, slideOffset: Float) {

            }

        })


    }
}