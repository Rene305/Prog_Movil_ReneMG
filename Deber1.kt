
fun main(args: Array<String>) {

    fun ejercicio1() {
        //Ejercicio 1 Par e Impar
        println("ingresa n")
        var a = readLine()?.toInt()?:10
        for (i in 1..a!!) {
            if (i % 2 == 0) {
                println(i.toString() + "-->par")
            } else
                println(i.toString() + "-->impar")
        }
    }

    fun ejercicio2() {
//Ejercicio 2 Calculadora simple
        var n: Int
        var n1: Double
        var n2: Double
        var R: Double

        println("Ingresa el primer Numero Porfavor:")
        n1 = readLine()?.toDouble() ?: 1.0
        println("Ingresa el segundo Numero Porfavor:")
        n2 = readLine()?.toDouble() ?: 1.0

        println("Digita 1_Si deseas Sumar")
        println("Digita 2_Si deseas Restar")
        println("Digita 3_Si deseas Multiplicar")
        println("Digita 4_Si deseas Dividir")
        n = readLine()?.toInt() ?: 1
        when (n) {
            1 -> {
                R = (n1 + n2)
                println("La respuesta es: ${R}")
            }

            2 -> {
                R = (n1 - n2)
                println("La respuesta es: ${R}")
            }

            3 -> {
                R = (n1 * n2)
                println("La respuesta es: ${R}")
            }

            4 -> {
                R = (n1 / n2)
                println("La respuesta es: ${R}")
            }
        }
    }

    fun ejercicio3() {
        //Ejercicio 3 numeros primos
        var n = 0
        println("ingresa un numero a identificar porfavor...")
        var n1 = readLine()?.toInt() ?: 7
        for (i in 1..n1) {
            if (n1 % i == 0) {
                n += 1
            }
        }
        if (n == 2) {
            println("el numero ${n1} es primo")
        } else {
            println("el numero ${n1} no es primo")
        }
    }


    fun ejercicio4() {
        //Ejercicio 4 Tabla de Multiplicar
        println("Ingresa un numero porfavor...")
        var na = readLine()?.toInt() ?: 2
        for (i in 1..10) {

            var R1 = (na * i)
            println("El Resultado de ${na} x ${i} es ${R1}")
        }
    }

    fun ejercicio5() {
// Ejercicio 5 Factorial
        println("Ingrersa un Numero porfavor...")

        var num = readLine()?.toInt() ?: 3
        var a = num
        for (i in num - 1 downTo 1) {
            num *= i

        }
        println("el Factorial de ${a} es ${num}")
    }

    fun ejercicio6() {
//Ejercicio 6 Suma de numeros pares
        println("Ingresa un numero porfavor...")
        var a = readLine()?.toInt() ?: 4
        var b = a - 1
        var R: Int
        for (i in 1..b) {
            if (i % 2 == 0) {
                a += i

            }
        }
        println(a)
    }

    fun ejercicio7() {
        //ejercicio 7 primeros n de serie de Fibonacci
        var a = 0
        var b = 1
        var c = 0
        var n1 = 0
        println("Ingresa la cantidad de digitos que deseas Imprimir")
        n1 = readLine()?.toInt() ?: 10

        for (i in 0..n1) {
            println(a)
            c = a + b
            a = b
            b = c
        }
    }
    fun ejercicio8(){
        //ejercicio 8 Numeros primos en un Rango
        var c=0
        println("Ingresar un numero de inicio porfavor...")
        var inicio= readLine()?.toInt()?: 1
        println("Ingresar un numero de final porfavor...")
        var final= readLine()?.toInt()?: 10
        if(inicio<final){
            for(i in inicio..final){
                for(j in 1..i){
                    if(i % j==0){
                        c+=1
                    }
                }
                if(c==2){
                    println(i)
                }
                c=0
            }
        }
    }
    do {
        println("Preciona 1. si deseas comprobar ejercicio 1 (Números pares e impares)")
        println("Preciona 2. si deseas comprobar ejercicio 2 (Calculadora simple) ")
        println("Preciona 3. si deseas comprobar ejercicio 3 (Detecta Números primos)")
        println("Preciona 4. si deseas comprobar ejercicio 4 (Tabla de multiplicar)")
        println("Preciona 5. si deseas comprobar ejercicio 5 (Factorial de un número)")
        println("Preciona 6. si deseas comprobar ejercicio 6 (Suma de números pares)")
        println("Preciona 7. si deseas comprobar ejercicio 7 (Serie de Fibonacci)")
        println("Preciona 8. si deseas comprobar ejercicio 8 (Números primos en un rango)")
        println("Preciona 0. si deseas Salir")

        var a = readLine()?.toInt() ?: 1

    when (a) {
        0 -> println("Adios •ᴗ• ")
        1 -> ejercicio1()
        2 -> ejercicio2()
        3 -> ejercicio3()
        4 -> ejercicio4()
        5 -> ejercicio5()
        6 -> ejercicio6()
        7 -> ejercicio7()
        8 -> ejercicio8()
    }


    }while (a!=0)

}
