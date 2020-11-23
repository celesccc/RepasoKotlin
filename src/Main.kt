@file:Suppress("UNREACHABLE_CODE")

fun main() {

    repeat(5) { numRep ->
        println("Estoy en la repetición $numRep")
    }

    repeat(5) {
        println("Estoy en la repetición $it")
    }

    var varA = 'a'
    for (varA in 'a'..'z'){ //varA tomará los valores de la a a la z.
        print(varA)
    }

    var miFloat = 1.0

    var miInt : Int? = 1
    miInt = null


    //escribeInt(miInt!!) //Con !! da igual que Int sea null, porque estoy segura de que no es null
    // pero en el caso de que sea null, devolverá una excepción.
    escribeIntConPregunta(miInt)


    //listas
    val array = arrayOf(1,2,3) // No se pueden añadir elementos
    val lista =listOf(1,2,3)

    val mutableList =mutableListOf(1,2,3) //Se pueden añadir elementos.
    val listMutable = MutableList(9){
        val resultado = it + 10
        resultado
    }

    println(listMutable)

    //EJERCICIO
    // Lista de 100 elementos y del 0 a 9 sean 0
    // De 9 a 19 sea 1
    // 000000,11111112222222
    val listMutable2 = MutableList(50){ num ->
        when (num) {
            in 0..9 -> 0
            in 10..19 -> 1
            in 20..29 -> 2
            in 30..39 -> 3
            in 40..49 -> 4
            else -> println("Fuera del rango")
        }
    }
    println(listMutable2)


    // FILTROS
    val colores = mutableListOf("Rojo", "Azul", "Verde", "Naranja")
    var listaFiltrada = colores.filter { string ->
        string.toUpperCase().contains("A")
    } //Dentro de las llaves harbá un código que se ejecutará por cada uno de los elementos que haya en la lista
    print(listaFiltrada)
}

fun escribeInt(miInt : Int){
    println("$miInt")
}

fun escribeIntConPregunta(miInt : Int?): Int{
    return miInt?:0 //Si el Int es null, devuelve 0, sino devuelve miInt
}