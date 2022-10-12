package pruebas;

import java.time.LocalDate;

public class Conductor {
    public boolean esValido(int edad, boolean carnet, LocalDate patente, boolean seguro) {
        LocalDate hoy = LocalDate.now();
        
        if (edad <= 17)
            return false;
        
        if (!carnet)
            return false;
        
        if (!patente.isAfter(hoy))
            return false;
        
        if(!seguro)
            return false;
        else
            return true;
    }
    
    public static void main(String[] args) {
        
    }
}
