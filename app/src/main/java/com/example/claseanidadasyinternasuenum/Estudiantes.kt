package com.example.claseanidadasyinternasuenum

class Estudiantes(val nombre:String,var edad:Int, val lenguajes:Array<progra>,val amigo:Array<Estudiantes>?=null) {
    enum class progra{
        KOTLIN,
        PHP,
        JAVA,
        PYTHON,
        JAVASCRIP
    }


    fun codigo(){
        for(lenguaje:progra in lenguajes){
            println("Se programar en $lenguaje")
        }
    }
}