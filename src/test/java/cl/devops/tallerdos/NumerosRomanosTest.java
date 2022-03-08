package cl.devops.tallerdos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumerosRomanosTest {
    @Test
    void test() {
        
        assertEquals("No definido", NumerosRomanos.numToRomano(-1));
        
        assertEquals("No definido", NumerosRomanos.numToRomano(0));
        
        assertEquals("I", NumerosRomanos.numToRomano(1));
        assertEquals("II", NumerosRomanos.numToRomano(2));
        assertEquals("III", NumerosRomanos.numToRomano(3));
        assertEquals("IV", NumerosRomanos.numToRomano(4));
        assertEquals("V", NumerosRomanos.numToRomano(5));
        assertEquals("VI", NumerosRomanos.numToRomano(6));
        assertEquals("VII", NumerosRomanos.numToRomano(7));
        assertEquals("VIII", NumerosRomanos.numToRomano(8));
        assertEquals("IX", NumerosRomanos.numToRomano(9));

        assertEquals("X", NumerosRomanos.numToRomano(10));
        assertEquals("XII", NumerosRomanos.numToRomano(12));
        assertEquals("XIV", NumerosRomanos.numToRomano(14));
        assertEquals("XV", NumerosRomanos.numToRomano(15));
        assertEquals("XIX", NumerosRomanos.numToRomano(19));
        assertEquals("XLIX", NumerosRomanos.numToRomano(49));
        assertEquals("LXXIX", NumerosRomanos.numToRomano(79));
        assertEquals("XCIX", NumerosRomanos.numToRomano(99));

        assertEquals("C", NumerosRomanos.numToRomano(100));
        assertEquals("CII", NumerosRomanos.numToRomano(102));
        assertEquals("CXIV", NumerosRomanos.numToRomano(114));
        assertEquals("CLIX", NumerosRomanos.numToRomano(159));
        assertEquals("CDLIX", NumerosRomanos.numToRomano(459));
        assertEquals("DCCXLIX", NumerosRomanos.numToRomano(749));
        assertEquals("CMXCIX", NumerosRomanos.numToRomano(999));

        assertEquals("M", NumerosRomanos.numToRomano(1000));
    }
}
