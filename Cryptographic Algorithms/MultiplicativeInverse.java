import java.util.Scanner;

public class MultiplicativeInverse{
    private int r1, r2, q, r, t1 = 0, t2 = 1, t;

    public MultiplicativeInverse(int r1, int r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    public int gcd(){
        if(r1 < r2) {
            int temp = r1;
            r1 = r2;
            r2 = temp;
        }

        // System.out.printf("| %-5s| %-5s| %-5s| %-5s|", "q", "r1", "r2", "r");
        // System.out.printf(" %-5s| %-5s| %-5s|\n", "t1", "t2", "t");

        while(r2 != 0) {
            this.q = this.r1 / this.r2;
            this.r = this.r1 % this.r2;
            this.t = t1 - t2 * this.q;

            // System.out.printf("| %-5d| %-5d| %-5d| %-5d|", this.q, this.r1, this.r2, this.r);
            // System.out.printf(" %-5d| %-5d| %-5d|\n", this.t1, this.t2, this.t);

            this.r1 = this.r2;
            this.r2 = this.r;
            this.t1 = this.t2;
            this.t2 = this.t;
        }

        // System.out.printf("| %-5s| %-5d| %-5d| %-5s|", "-", this.r1, this.r2, "-");
        // System.out.printf(" %-5d| %-5d| %-5s|\n", this.t1, this.t2, "-");
        
        if(this.r1 == 1){
            // System.out.println("GCD : " + this.r1);
            // System.out.println("Mulitplicative Inverse : " + this.t1);
            return this.t1;
        } else{
            // System.out.println("GCD : " + this.r1);
            this.t1 = -1;
            // System.out.println("Mulitplicative Inverse does not exist as GCD is not 1.");
        }

        return this.t1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int r1, r2;

        System.out.print("Enter r1, r2 : ");
        r1 = scan.nextInt();
        r2 = scan.nextInt();

        MultiplicativeInverse m = new MultiplicativeInverse(r1, r2);
        m.gcd();

        scan.close();
    }
}