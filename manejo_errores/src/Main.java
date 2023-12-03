import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creación de objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                // Solicita al usuario que introduzca un número
                System.out.println("Por favor, introduce un número o 'salir' para terminar:");
                String entrada = scanner.nextLine();

                // Si el usuario introduce 'salir', termina el programa
                if (entrada.equalsIgnoreCase("salir")) {
                    break;
                }

                // Intenta dividir 10 por el número introducido por el usuario
                int numero = Integer.parseInt(entrada);
                int resultado = 10 / numero;

                // Muestra el resultado de la división
                System.out.println("El resultado es: " + resultado);
                System.out.println("+---------------------------+");

            } catch (ArithmeticException e) {
                //Mensaje en caso de Excepción ArithmeticException
                System.out.println("Error: No se puede realizar división entre 0.");
            } catch (NumberFormatException e) {
                // Mensaje en caso de la excepción NumberFormatException
                System.out.println("Error: Debes introducir un número válido.");
            } catch (Exception e) {
                // Mensaje en caso de cualquier otra excepción
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}