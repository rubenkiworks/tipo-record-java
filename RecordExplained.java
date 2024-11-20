// el tipo record de java 

import java.time.LocalDate;


enum Genero{
    HOMBRE, MUJER, OTRO
}
record Persona(String nombre, LocalDate fechaNacimiento, Genero genero){}



public class RecordExplained {
    
    public static void main(String[] args) {
        Persona persona = new Persona("Ruben", LocalDate.now(), Genero.HOMBRE);

        System.out.println(persona.nombre());
    }
}
