// el tipo record de java 

import java.time.LocalDate;

class Persona{
    private String nombre;
    private LocalDate fechaNacimiento;
    private Genero genero;

    enum Genero {
        HOMBRE, MUJER, OTRO
    }
    
    public Persona(){}
    
    @Override
    public String toString(){
        return super.toString();
    }

    
}



public class RecordExplained {
    
    public static void main(String[] args) {
        
    }
}
