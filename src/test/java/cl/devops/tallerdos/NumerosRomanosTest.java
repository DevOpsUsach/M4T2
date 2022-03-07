package cl.devops.tallerdos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumerosRomanosTest {
    @Test
    void test() {
        assertEquals("I", NumerosRomanos.numToRomano(1));
        assertEquals("II", NumerosRomanos.numToRomano(2));
        assertEquals("III", NumerosRomanos.numToRomano(3));
        assertEquals("IV", NumerosRomanos.numToRomano(4));
        assertEquals("V", NumerosRomanos.numToRomano(5));
        assertEquals("VI", NumerosRomanos.numToRomano(6));
        assertEquals("VII", NumerosRomanos.numToRomano(7));
        assertEquals("VIII", NumerosRomanos.numToRomano(8));
        assertEquals("IX", NumerosRomanos.numToRomano(9));
    }
}
