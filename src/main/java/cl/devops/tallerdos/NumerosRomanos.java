package cl.devops.tallerdos;

public class NumerosRomanos {
    public static String numToRomano(int numero) {
        String resultado;
        int unidadmil;
        int centena;
        int decena;
        int unidad;
        
        if (numero <= 0) {
            return "No definido";
        }

        unidadmil = (numero / 1000) % 10;
        centena = (numero / 100) % 10;
        decena = (numero / 10) % 10;
        unidad = numero % 10;

        resultado = getUnidadMil(unidadmil) + getCentena(centena) + getDecena(decena) + getUnidad(unidad);

        return resultado;
    }

    private static String getUnidad(int numero) {
        return switch (numero) {
            case 1 -> "I";
            case 2 -> "II";
            case 3 -> "III";
            case 4 -> "IV";
            case 5 -> "V";
            case 6 -> "VI";
            case 7 -> "VII";
            case 8 -> "VIII";
            case 9 -> "IX";
            default -> "";
        };
    }

    private static String getDecena(int numero) {
        return switch (numero) {
            case 1 -> "X";
            case 2 -> "XX";
            case 3 -> "XXX";
            case 4 -> "XL";
            case 5 -> "L";
            case 6 -> "LX";
            case 7 -> "LXX";
            case 8 -> "LXXX";
            case 9 -> "XC";
            default -> "";
        };
    }

    private static String getCentena(int numero) {
        return switch (numero) {
            case 1 -> "C";
            case 2 -> "CC";
            case 3 -> "CCC";
            case 4 -> "CD";
            case 5 -> "D";
            case 6 -> "DC";
            case 7 -> "DCC";
            case 8 -> "DCCC";
            case 9 -> "CM";
            default -> "";
        };
    }

    private static String getUnidadMil(int numero) {
        return switch (numero) {
            case 1 -> "M";
            default -> "";
        };
    }
}
