package cl.devops.tallerdos;

public class NumerosRomanos {
    public static String numToRomano(int numero) {
        return getUnidad(numero);
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
}
