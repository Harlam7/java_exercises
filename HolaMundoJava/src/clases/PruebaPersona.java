package clases;

public class PruebaPersona {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        persona1.desplegarInfo();

        Persona persona2 = new Persona();
        persona2.nombre = "Jhon";
        persona2.apellido = "Rojas";
        persona2.desplegarInfo();
    }

}
