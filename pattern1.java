package pattern;
import java.util.*;
public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int o = sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=o;j++){
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
