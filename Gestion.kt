
open class Persona(val nombre: String, val edad: Int, val id: String){

    open fun mostrarRol(): String{
        return "Su rol es: $id"
    }

}



class Estudiante(nombre: String, edad: Int, id: String, val curso: String, val calificacionPromedio: Double): Persona(nombre,edad,id){

    override fun mostrarRol(): String {
        return "Es un estudiante del curso $curso."
    }



    fun mostrarCalificacion(): String{
        return "Su calificación es de : $calificacionPromedio"
    }

}



class Profesor(nombre: String, edad: Int, id: String, val departamento: String, val aniosExperiencia: Int): Persona(nombre, edad, id){

    override fun mostrarRol(): String {
        return "Es un profesor del departamento de $departamento."
    }


    fun mostrarExperiencia(): String{
        return "Tiene $aniosExperiencia años de experiencia"
    }
}




fun main(){

    val estudiante1 = Estudiante("Lucas", 18, "Estudiante", "1ºDAM", 9.5)
    val profesor1 = Profesor("Juan", 56, "Profesor", "Programación", 5)



    println(estudiante1.mostrarRol())
    println("Calificación del alumno: ${estudiante1.mostrarCalificacion()}\n")

    println(profesor1.mostrarRol())
    println("Años de experiencia: ${profesor1.mostrarExperiencia()}")
}