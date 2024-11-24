import java.util.Scanner;

public class TipoClima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido");

        System.out.println("Por favor, ingrese la temperatura de hoy");
        float temperatura = scanner.nextFloat();

        String tipoClima;
        if (temperatura <=10) {
            tipoClima = "Frío";
        } else if (temperatura >10 && temperatura <20) {
            tipoClima = "Nublado";
        } else if (temperatura >20 && temperatura <30) {
            tipoClima = "Caluroso";
        } else {
            tipoClima = "Tropical";
        }

        System.out.printf("Hay %.1f grados. El tipo de clima hoy es %s.%n", temperatura, tipoClima);

        scanner.close();
    }
}
