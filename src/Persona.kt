open class Persona(val nombre: String, var edad: Int, val id: String) {
    open fun mostrarRol() {
        println("$nombre es una persona")
    }
}