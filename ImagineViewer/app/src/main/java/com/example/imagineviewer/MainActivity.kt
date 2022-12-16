package com.example.imagineviewer

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
companion object{
    const val IMAGE_REQUEST_CODE = 0
}

        val StringList = mutableListOf<String>()
        val IntList = mutableListOf<Int>()
        val imageList = mutableListOf<ImageData>()

    fun createTextView(String: String, Int: Int): TextView {
        val view = TextView(this)
        return view
        scroll_view
        linear
        linear.addView(view)
    }

    class ImageData {
        private var stringUri: String = ""

        var photoUri: Uri
            get() = Uri.parse(stringUri)
            set(value) {
                stringUri = value.toString()
            }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        button.setOnClickListener {
            val intent = Intent(Intent.ACTION_GET_CONTENT)
            intent.type = "image/*"
            this.startActivityForResult(intent, IMAGE_REQUEST_CODE)
//            if (intent.resolveActivity(packageManager) != null){
//                startActivityForResult(intent, IMAGE_REQUEST_CODE)

            println("button tapped")
    // main activity starts image stuff
            // image screen handles user selecting image
            // when image is selected then mainactivity receives some output ( onactivityresult)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        // if requestCode == IMAGE_REQUEST_CODE

        // somehow get the image url
        // create and add an imageclassdata and add to array
        // and somehow display stuff (image? or textview?)
        println(data)
        println(resultCode)
        println(requestCode)
        println("on activity result")
    }

}