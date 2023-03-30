import javax.swing.JOptionPane

fun main(args: Array<String>) {

    var person1 = Persona("Juan Luis", "Coutino", 19)
    var stundent = Estudiantes("Juan Luis", "Coutino", 19, "63320003", 9.14)

    JOptionPane.showMessageDialog(null, "El nombre de la persona es ${person1.nombre}, su apelido es ${person1.apellido} y su edad ${person1.edad}")
    JOptionPane.showMessageDialog(null, "El nombre del estudiante es ${stundent.nombre}, su apelido es ${stundent.apellido}, su edad ${stundent.edad}, su numero de estudiante es ${stundent.numeroEstudiante} y su calificacion es ${stundent.calificaciones}")

}