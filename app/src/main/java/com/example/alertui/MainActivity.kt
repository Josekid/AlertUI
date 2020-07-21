package com.example.alertui

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.app.NotificationCompat
import com.tapadoo.alerter.Alert
import com.tapadoo.alerter.Alerter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //
        btnBuy.setOnClickListener{
            Alerter.create(this)
                .setTitle("Alert title")
                .setText("Alert Text...")
                .setBackgroundColorRes(R.color.colorAccent)
                .setIcon(R.drawable.alerter_ic_face)
                .setDuration(1000)
                .show()
        }
    }

}
