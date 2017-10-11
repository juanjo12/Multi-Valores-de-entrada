import java.util.Scanner;


public class Multi {

    public static void main(String[] args) {
            int i;
            int j = 0;
            int e = 0;
            Scanner sc = new Scanner(System.in); //metodo para introducir valores en pantalla por el teclado
            System.out.println("introduce un numero");
            int n = sc.nextInt(); // valor de entrada
            for (i = 1; i<=n; ++i){ // bucle que empieza en 1 y n representa el valor de entrada y el tope del bucle
                for(e = 1; e<=10; e++) { //bucle del 1 al 10 para la multiplicacion
                    j = i * e; //resultado
                    System.out.println(e+" * "+i+" = "+j); //tabla
                    if (e==10){ //separador de tablas
                        System.out.println("<<------------->>");
                    }
                }
            }
    }
}
