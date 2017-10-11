import java.util.Scanner;


public class Multi {

    public static void main(String[] args) {
            int i;
            int j = 0;

            Scanner sc = new Scanner(System.in);
            System.out.println("introduce un numero");
            int n = sc.nextInt();
            for (i = 0; i<=100; ++i){
                 j = i * n;
                System.out.println(j +" "+ i);

            }
        System.out.println(j +" "+ i);
    }
}
