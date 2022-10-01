package com.example.claseanidadasyinternasuenum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.io.PrintStream

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Enum class o clases enumeradas
        //claseEnumeradas()
        //seguridadNula()
        //funciones()
        clases()

    }

    enum class Direccion (val  dir:Int){
        NORTE(  1), SUR(-1), ESTE(1), OESTE(-1);

        fun descripcion():String{
            return when(this){
                NORTE -> ":a direccion es Norte"
                SUR -> ":a direccion es Norte"
                ESTE -> ":a direccion es Norte"
                OESTE -> ":a direccion es Norte"
            }
        }
    }

    private fun claseEnumeradas(){
        var direccionUsuario:Direccion?=null
        println(direccionUsuario)
        println("Direccion actual: $direccionUsuario")

        direccionUsuario = Direccion.NORTE
        println("Direccion actual: $direccionUsuario")
        direccionUsuario = Direccion.OESTE
        println("Direcion actual: $direccionUsuario")

        //propiedades por def
        println("Prpiedad name : ${direccionUsuario.name}")
        println("Propiedad Ordinal: ${direccionUsuario.ordinal}")
    }

    //veremos seguridad contra nulos(null safety)
    fun seguridadNula(){
        var miString = "Programacion IV (28/09/2022)"
        // miString = null Esto daria un error de compilacion
        println(miString)

        var miSeguridadNula:String?= "Valor de seguridad nula"
        println(miSeguridadNula)
        miSeguridadNula = null
        println(miSeguridadNula)

        //miSeguridadNula = "Le volvemos a cambiar el valor"
        //println(miSeguridadNula)

        /*
        if (miSeguridadNula!=null){
            println(miSeguridadNula!!.toString())
        }else{
            println(miSeguridadNula!!.toString())
        }
        */

        //Llamadas seguras  (safe call)
        println(miSeguridadNula?.length)
        miSeguridadNula?.let {
            println(it.toString())
        }?: kotlin.run {
            println(miSeguridadNula.toString())
        }

    }

    fun funciones(){
        decirHola()
        decirHola()
        decirHola()

        decirNombre( nombre = "Gamaliel")
        decirNombre( nombre = "Mario")
        decirNombre( nombre = "Paola")

        val resultadoSuma = sumarDosNumeros(4,6)
        println(resultadoSuma)

        println(sumarDosNumeros(9,8))

        println(sumarDosNumeros(3,sumarDosNumeros(7,5)))

        decirNombreEdad("Valeria", 21)
    }

    //funcion simple
    fun decirHola(){
        println("Hola Estudiantes")
    }

    //funciones con un paremetro de entrada
    fun decirNombre(nombre:String){
        println("Hola, tu nombre es: ${nombre}")
    }
    fun decirNombreEdad(nombre:String,edad:Int){
        println("Hola, tu nombre es: ${nombre} y mi edad es $edad")
    }

    //funciones con un valor de retorno
    fun sumarDosNumeros(num1:Int,num2:Int):Int{
        val suma = num1+num2
        return suma
    }

    fun clases(){
        val persona1 = Estudiantes("Victor", 22, arrayOf(Estudiantes.progra.PHP,Estudiantes.progra.JAVA))
        println(persona1.nombre)
        persona1.edad = 24
        println(persona1.edad)
        persona1.codigo()

        val persona2 = Estudiantes("Mariel", 20, arrayOf(Estudiantes.progra.JAVASCRIP), arrayOf(persona1))
        persona2.edad = 24
        println(persona2.edad)
        persona2.codigo()

        println("${persona2.amigo?.first()?.nombre} es amigo de ${persona2.nombre}")

    }

}