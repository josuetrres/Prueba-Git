import java.util.Scanner;

public class Suma
{
    public static void main( String[] args )
    {
        int n1, n2, n3, suma;

        Scanner teclado = new Scanner( System.in );

        System.out.print( "Introduzca primer número: " );
        n1 = teclado.nextInt();

        System.out.print( "Introduzca segundo número: " );
        n2 = teclado.nextInt();

        System.out.print( "Introduzca tercer número: " );
        n3 = teclado.nextInt();

        suma = n1 + n2 + n3;

        System.out.println( "La suma de " + n1 + " más " + n2 + " mas " + n3 + " es " + suma + "." );
    }
}