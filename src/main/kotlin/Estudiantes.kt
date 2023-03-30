class Estudiantes(nombre : String?, apellido : String?, edad : Int, var numeroEstudiante : String, var calificaciones : Double)
    : Persona(nombre!!, apellido!!, edad!!){

    fun nombre(){
        println("El nombre del estudiante es ${nombre}")
    }

    fun apellido(){
        println("El nombre del estudiante es ${apellido}")
    }

    fun edad(){
        println("El nombre del estudiante es ${edad}")
    }

}