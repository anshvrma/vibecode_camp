import java.util.Scanner;

public class Learnjavafunc {
    public static int fact(int x) {
        int rv = 1;

        for(int i = 1; i <= x; i++) {
            rv = rv * i;
        }

        return rv;
    }

    public static void main(String[] args) {
        Scanner scn_num = new Scanner(System.in);
        int n = scn_num.nextInt();
        int r = scn_num.nextInt();

        int nfact = fact(n);
        int nmrfact = fact(n - r);

        int npr = nfact / nmrfact;
        System.out.println(n + "P" + r + " = " + npr); 
    }



}
