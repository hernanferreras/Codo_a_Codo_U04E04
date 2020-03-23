package u04e04;

import java.util.Scanner;

public class U04E04 {
    
    public static void main(String args[]) {
      Scanner entrada = new Scanner (System.in);
      int diam;
      double perimetro, radio;
      final double pi = Math.PI;
      System.out.print("Ingrese el diametro del circulo: ");
      diam = entrada.nextInt();
      radio = diam/2;
      perimetro = (int)(2*pi*radio);
      System.out.print("El perimetro del circulo es igual a: "+perimetro);
    }
}