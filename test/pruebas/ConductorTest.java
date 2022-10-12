package pruebas;

import java.time.LocalDate;
import org.junit.Test;
import org.junit.Assert;

public class ConductorTest {
    @Test
    public void siNoTieneEdadSuficienteNoDebeSerConductorValido() {
        Conductor c = new Conductor();
        Assert.assertFalse(c.esValido(17, true, LocalDate.of(2022, 10, 10), true));
    }
            
    @Test
    public void siNoTieneCarnetNoDebeSerConductorValido() {
        Conductor c = new Conductor();
        Assert.assertFalse(c.esValido(18, false, LocalDate.of(2022, 10, 10), true));
    }
    
    @Test
    public void siNoTienePatenteAlDiaNoDebeSerConductorValido() {
        Conductor c = new Conductor();
        Assert.assertFalse(c.esValido(18, true, LocalDate.of(2022, 9, 27), true));        
    }
    
    @Test
    public void siNoTieneSeguroNoDebeSerConductorValido() {
        Conductor c = new Conductor();
        Assert.assertFalse(c.esValido(18, true, LocalDate.of(2022, 10, 10), false));        
    }
    
    @Test
    public void siTieneEdadCarnetPatenteAlDiaYSeguroEsConductorValido() {
        Conductor c = new Conductor();
        Assert.assertTrue(c.esValido(18, true, LocalDate.of(2022, 10, 10), true));                
    }
}
