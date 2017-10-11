import java.util.Scanner;


public class Multi {

    public static void main(String[] args) {
            int i;
            int j = 0;
            int e = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("introduce un numero");
            int n = sc.nextInt();
            for (i = 1; i<=n; ++i){
                for(e = 1; e<=10; e++) {
                    j = i * e;
                    System.out.println(e+" * "+i+" = "+j);
                    if (e==10){
                        System.out.println("-------------");
                    }
                }
            }
    }
}
