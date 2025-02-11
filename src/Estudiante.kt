class Estudiante(nombre: String, edad: Int, id: String, var curso: String, var calificacionPromedio: Double): Persona(nombre,edad,id) {
    override fun mostrarRol() {
        println("$nombre es un estudiante")
    }

    fun mostrarCalificacion() {
        println("La calificación promedia de $nombre es $calificacionPromedio")
    }
}