package Tests;

import Classes.DashboardBanco;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class DashboardBancoTest {

    @BeforeEach
    public void reset() {
        DashboardBanco db = DashboardBanco.getInstance();
        db.setUsoCPU(null);
        db.setUsoRAM(null);
        db.setUsoDisco(null);
        db.setConexoesAtivas(0);
        db.setTempoResposta(null);
    }

    @Test
    public void deveRetornarMesmaInstancia() {
        DashboardBanco d1 = DashboardBanco.getInstance();
        DashboardBanco d2 = DashboardBanco.getInstance();
        assertSame(d1, d2);
    }

    @Test
    public void deveRetornarUsoCPU() {
        DashboardBanco.getInstance().setUsoCPU("73%");
        assertEquals("73%", DashboardBanco.getInstance().getUsoCPU());
    }

    @Test
    public void deveRetornarUsoRAM() {
        DashboardBanco.getInstance().setUsoRAM("42%");
        assertEquals("42%", DashboardBanco.getInstance().getUsoRAM());
    }

    @Test
    public void deveRetornarUsoDisco() {
        DashboardBanco.getInstance().setUsoDisco("83%");
        assertEquals("83%", DashboardBanco.getInstance().getUsoDisco());
    }

    @Test
    public void deveRetornarConexoesAtivas() {
        DashboardBanco.getInstance().setConexoesAtivas(234);
        assertEquals(234, DashboardBanco.getInstance().getConexoesAtivas());
    }

    @Test
    public void deveRetornarTempoResposta() {
        DashboardBanco.getInstance().setTempoResposta("2.3ms");
        assertEquals("2.3ms", DashboardBanco.getInstance().getTempoResposta());
    }

}
