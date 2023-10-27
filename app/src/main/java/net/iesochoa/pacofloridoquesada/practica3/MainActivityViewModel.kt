package net.iesochoa.pacofloridoquesada.practica3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {
    //Datos que queremos mantener
    //var contador:Int = 0
    //Método de manipulación del contador
    private val contador = MutableLiveData<Int>(0)
    fun sumaUno(){
        // contador++
        contador.value = contador.value?.plus(1)
    }
    fun getContador(): LiveData<Int> {
        return contador
    }
}