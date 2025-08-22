import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChineseRemainderTheorem {
    private List<int[]> equations;

    public ChineseRemainderTheorem() {
        equations = new ArrayList<>();
    }

    public void addEquation(int a, int m) {
        this.equations.add(new int[]{a, m});
    }

    private boolean arePairwiseCoprime() {
        int n = equations.size();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int m1 = equations.get(i)[1];
                int m2 = equations.get(j)[1];
                Euclidian e = new Euclidian(m1, m2);
                if (e.gcd() != 1) {
                    return false;
                }
            }
        }
        return true;
    }

    private int modInverse(int a, int m) {
        int m0 = m, t, q;
        int t0 = 0, t1 = 1;

        if (m == 1) return 0;

        while (a > 1) {
            q = a / m;
            t = m;

            m = a % m;
            a = t;
            t = t0;

            t0 = t1 - q * t0;
            t1 = t;
        }

        if (t1 < 0)
            t1 += m0;

        return t1;
    }

    public int crt() {
        if (!arePairwiseCoprime()) {
            System.out.println("Unique solution does not exist.");
            return -1;
        }

        int n = this.equations.size();

        int[] a = new int[n];
        int[] m = new int[n];
        int M = 1;

        for (int i = 0; i < n; i++) {
            a[i] = this.equations.get(i)[0];
            m[i] = this.equations.get(i)[1];
            M *= m[i];
        }

        int[] Mn = new int[n];
        int[] MnInverse = new int[n];
        int x = 0;

        for (int i = 0; i < n; i++) {
            Mn[i] = M / m[i];
            MnInverse[i] = modInverse(Mn[i], m[i]);

            if (MnInverse[i] == 0) {
                return -1;
            }

            x += a[i] * Mn[i] * MnInverse[i];
        }

        x %= M; 
        System.out.println("M : " +  M);
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChineseRemainderTheorem crt = new ChineseRemainderTheorem();

        System.out.print("Enter number of equations: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Equation " + (i + 1) + " (a m): ");
            int a = sc.nextInt();
            int m = sc.nextInt();
            crt.addEquation(a, m);
        }

        int result = crt.crt();
        if (result != -1)
            System.out.println("x = " + result);
        
        sc.close();
    }
}
