package net.iesochoa.pacofloridoquesada.practica3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * Creamos esta clase ViewModel para hacer la lógica de la Activity aqui y en la Activity solo
 * visualizar los datos que obtendremos de esta clase.
 */
class MainActivityViewModel: ViewModel() {
    /**
     * Creamos las dos variables como MutableLiveData para conservar la información de la app
     */
    private val contador = MutableLiveData<Int>(0)
    private val asteriscos = MutableLiveData<String>("")

    /**
     * Función que suma uno al contador
     */
    fun sumaUno(){
        // contador++
        contador.value = contador.value?.plus(1)
    }
    /**
     * @return Devuelve el valor de contador como LiveData
     */
    fun getContador(): LiveData<Int> {
        return contador
    }
    /**
     * Función que suma un asterisco al String inicial
     */
    fun sumaAsterisco(){
        asteriscos.value += "*"
    }
    /**
     * @return Devuelve el valor de asteriscos como LiveData
     */
    fun getAsteriscos(): LiveData<String> {
        return asteriscos
    }
}