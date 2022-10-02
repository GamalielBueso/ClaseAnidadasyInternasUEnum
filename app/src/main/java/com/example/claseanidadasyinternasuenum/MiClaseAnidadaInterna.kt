package com.example.claseanidadasyinternasuenum

class MiClaseAnidadaInterna {
    //clase anidada (Nested class), es una clase que puede contener otra clase de ella

    private val uno = 1

    private fun retornaUno():Int{
        return uno
    }

    class miClaseAnidada{

        fun suma(n1:Int,n2:Int):Int{
            return n1+n2
        }

    }

    //clase interna (inner class)
    inner class miClaseInterna{

        fun sumarUno(num:Int):Int{
            return num + uno
        }
        fun sumarDos(num:Int):Int{
            return num + uno + retornaUno()
        }
    }

}