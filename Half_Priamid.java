package pattern;

public class Half_Priamid {
    public static void main(String[] args) {
        int n = 5;
        for (int i=n;i>=1;i--){         //sidha pattern print karne ke liye(i=1;i<=n;i++)
            for (int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
