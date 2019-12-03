fun main() {

    /*println("Esto es una app")
     var miComputadora=Computer("i5",Mouse(),Screen())
     println(miComputadora.cpu)println(miComputadora.toString())
     println(miComputadora)
     println("${miComputadora.cpu} tiene un ratón ${miComputadora.Mouse} y una pantalla ${miComputadora.screen}")
     println("${miComputadora.cpu} tiene un ratón ${miComputadora.Mouse}")
     var ratonSorpresa=Mouse("ay")
     println(ratonSorpresa.tipo)
     */
    var miComp=Computer(("i5,5"),Mouse(),keyboard())
    miComp.memoria=1000
    println(miComp.toString())
    //Comentario

    var miComp2=Computer(("i4"),Mouse(),keyboard())
    println(miComp2.keyboard)


}