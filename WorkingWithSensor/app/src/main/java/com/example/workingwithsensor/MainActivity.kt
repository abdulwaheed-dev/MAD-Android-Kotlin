package com.example.workingwithsensor

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity(), SensorEventListener {

    //sensor manager object
    lateinit var sensorManager : SensorManager

    lateinit var textView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1 - sensor manager object
        sensorManager = getSystemService(SENSOR_SERVICE) as SensorManager

        //2 - specific sensor (i.e., proximity sensor here) object
        val proximitySensor = sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY)

        //3 - register sensor with sensorManager
        sensorManager.registerListener(this, proximitySensor, 100)

    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onSensorChanged(event: SensorEvent?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        val x = event!!.values[0]
        //val y = event!!.values[1]
        //val z = event!!.values[2]

        val values = "x = "+x

        textView = findViewById(R.id.sensorValues)

        textView.text = values
    }

}
