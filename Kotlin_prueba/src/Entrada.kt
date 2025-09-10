fun main(){
    println("Primer programa Kotlin")

    var nombre:String = "Nazarii" //String
    var edad = 40 // Int
    var correo:String? = null
    lateinit var direccion: String
    val DNI = "123123A"

    println("Hola mi nombre es $nombre tengo $edad y mi dni es $DNI")
    println("Mi nombre tiene ${nombre.length} letras")
    println("Mi correo es ${correo?.length ?: "sin asignado"}")
    direccion = "Alcorcon"
    println("Mi Direccion es $direccion")
}

