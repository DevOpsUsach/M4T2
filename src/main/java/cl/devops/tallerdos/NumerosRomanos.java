package cl.devops.tallerdos;

public class NumerosRomanos {
    public static String numToRomano(int numero) {
        String resultado;
        int decena;
        int unidad;

        decena = (numero / 10) % 10;
        unidad = numero % 10;

        resultado = getDecena(decena) + getUnidad(unidad);

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
}
