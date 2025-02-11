class Profesor(nombre: String, edad: Int, id: String, var departamento: String, var aniosExperiencia: Int): Persona(nombre,edad,id) {
    override fun mostrarRol() {
        println("$nombre es un profesor")
    }

    fun mostrarExperiencia() {
        println("$nombre tiene $aniosExperiencia años de experiencia")
    }
}