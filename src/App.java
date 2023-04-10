import java.util.Scanner;
import java.util.Locale;

public class App {

    public static void main(String[] args) throws Exception {
        float C;
        float F;
        Locale locale = new Locale("pt", "BR");
        Scanner entrada = new Scanner(System.in);
   
       System.out.println("Entre com a temperatura Fahrenheit: ");
       Scanner teclado = new Scanner(System.in);
       F = teclado.nextFloat();
       F = 5 * ((F -32 / 9));

      System.out.println(" A medida covertida é " + F + "ºC");
    }
    }

