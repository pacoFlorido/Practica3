package net.iesochoa.pacofloridoquesada.practica3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import net.iesochoa.pacofloridoquesada.practica3.databinding.ActivityMainBinding

private const val TAG = "practica3"
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val model:MainActivityViewModel by viewModels()
    //var num:Int = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Iniciamos el contador. Si es la primera vez, a cero, si es un reconstrucción
        // la hará al valor que tenía
        //binding.tvNumero.text = model.contador.toString()
        model.getContador().observe(this, Observer<Int> {
            cont->binding.tvNumero.text = cont.toString()
        })
        binding.btSumaUno.setOnClickListener{
            // Sumamos 1
            model.sumaUno()
            // Mostramos el valor
            //binding.tvNumero.text = model.contador.toString()
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