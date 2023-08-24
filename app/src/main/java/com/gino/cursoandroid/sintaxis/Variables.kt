package com.gino.cursoandroid.sintaxis

fun main() {
    val PI: Float = 23.24f
    var edad: Int = 21
    var caracter: Char = 'G'
    var miNombre: String = "Gino Paoletti"
    var booleano: Boolean = true
    println("Hola me llamo $miNombre")
    //definir un array
    val arreglo = arrayOf("Gino", "Luchi", "Samu", 4) //pueden ser de distinto tipo?

    //recorrerlo con for
    for (position in arreglo.indices)
        println("Repitición nro $position")
    //otra forma
    for ((position, value) in arreglo.withIndex()){
        println("La posición $position contiene $value")
    }
    //otra forma
    for(papita in arreglo){
        println("EL NOMBRE ES $papita")
    }

    //listas val= inmutable no se puede agregar, quitar o actualizar sus elementos
    val lista:List<String> = listOf("Lunes", "Martes","Miercoles")
    println(lista.last())
    println(lista.filter { it.contains("Martes") }) //devuelve una lista con solo martes
    lista.forEach{ println(it)}
    lista.forEach{valor -> println(valor)};
    var listaMutable:MutableList<String> = mutableListOf("New1","new2","new3")
    //lista.add no existe
    listaMutable.add(0,"new11") //pone delante, si no ponemos nada va al final

    println(listaMutable.get(0))


}