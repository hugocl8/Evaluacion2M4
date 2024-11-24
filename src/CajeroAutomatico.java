import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 1000.0;
        int opcion = 0;

        System.out.println("Bienvenidos al cajero automático");

        while (opcion != 3) {
            System.out.println("Seleccione una opcion");
            System.out.println("1. Depositar dinero a la cuenta");
            System.out.println("2. Retirar dinero de la cuenta");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El saldo inicial es de " + saldo);
                    System.out.println("Digite la cantidad de dinero que desea ingresar: ");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("El saldo actual es: " + saldo);
                    break;

                case 2:
                    System.out.println("El saldo inicial es de " + saldo);
                    System.out.println("Digite la cantidad que desea retirar: ");
                    double retiro = scanner.nextDouble();
                    if (retiro>saldo) {
                        System.out.println("El saldo es insuficiente, no se puede retirar esa cantidad.");
                    }else{
                        saldo -= retiro;
                        System.out.println("El saldo actual es: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Gracias por operar con nosotros");
            }
        }
    scanner.close();
    }
}
