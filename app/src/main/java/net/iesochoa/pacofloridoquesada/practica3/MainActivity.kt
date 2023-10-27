package net.iesochoa.pacofloridoquesada.practica3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import net.iesochoa.pacofloridoquesada.practica3.databinding.ActivityMainBinding

private const val TAG = "practica3"
class MainActivity : AppCompatActivity() {
    /**
     * Nueva forma de inflar los objetos con Binding.
     * Para esto hay que añadir lo siguiente al archivo <<build.gradle.kts>>
     *     buildFeatures{
     *         viewBinding = true
     *     }
     */
    private lateinit var binding: ActivityMainBinding

    /**
     * Asignamos el ViewModel a la Activity
     */
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
        /**
         * Obtenemos los datos del ViewModel
         */
        model.getContador().observe(this, Observer<Int> {
            cont->binding.tvNumero.text = cont.toString()
        })
        model.getAsteriscos().observe(this,Observer<String>{
            aste->binding.tvAsteriscos.text = aste.toString()
        })

        /**
         * Asignamos la acción del botón, que en este caso será sumar uno al contador y al número de
         * asteriscos
         */
        binding.btSumaUno.setOnClickListener{
            // Sumamos 1
            model.sumaUno()
            model.sumaAsterisco()
            // Mostramos el valor
            //binding.tvNumero.text = model.contador.toString()
        }

        Log.i(TAG,"onCreate")
    }

    /**
     * Métodos sobreescritos para observar el ciclo de vida de la App
     */
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