package net.iesochoa.pacofloridoquesada.practica3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import net.iesochoa.pacofloridoquesada.practica3.databinding.ActivityMainBinding

private const val TAG = "practica3"
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var num:Int = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvNumero.text = num.toString()
        binding.btSumaUno.setOnClickListener{
            num++
            binding.tvNumero.text = num.toString()
        }

        Log.i(TAG,"onCreate")
    }
    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume")
    }
    override fun onPause() {
        Log.i(TAG, "onPause")
        super.onPause()
    }
    override fun onStop() {
        Log.i(TAG, "onStop")
        super.onStop()
    }
    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart")
    }
    override fun onDestroy() {
        Log.i(TAG, "onDestroy")
        super.onDestroy()
    }
}