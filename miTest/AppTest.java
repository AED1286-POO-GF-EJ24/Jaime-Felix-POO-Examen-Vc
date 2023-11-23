package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
    static Fecha f;

    @BeforeAll public static void setUp() {
        try
        {
            f = new Fecha(1971, 7, 6);
        }
        catch (FechaException cue )
        {
        }
    }

    @Test public void testDia() {
        assertTrue(f.getDia()==6);
    }

    @Test public void testMes() {
        assertTrue(f.getMes()==7);
    }

    @Test public void testYear() {
        assertTrue(f.getYear()==1971);
    }

    @Test public void testFecha() {
        assertTrue(f.toString().equals("06/07/1971"));
    }
}