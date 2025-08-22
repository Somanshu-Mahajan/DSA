public class ExtendedEuclidian {
    private int r1, r2, q, r, s1 = 1, s2 = 0 ,s, t1 = 0, t2 = 1, t;

    public ExtendedEuclidian(int r1, int r2) {
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
        // System.out.printf(" %-5s| %-5s| %-5s|", "s1", "s2", "s");
        // System.out.printf(" %-5s| %-5s| %-5s|\n", "t1", "t2", "t");

        while(r2 != 0) {
            this.q = this.r1 / this.r2;
            this.r = this.r1 % this.r2;
            this.s = s1 - s2 * this.q;
            this.t = t1 - t2 * this.q;

            // System.out.printf("| %-5d| %-5d| %-5d| %-5d|", this.q, this.r1, this.r2, this.r);
            // System.out.printf(" %-5d| %-5d| %-5d|", this.s1, this.s2, this.s);
            // System.out.printf(" %-5d| %-5d| %-5d|\n", this.t1, this.t2, this.t);

            this.r1 = this.r2;
            this.r2 = this.r;
            this.s1 = this.s2;
            this.s2 = this.s;
            this.t1 = this.t2;
            this.t2 = this.t;
        }

        // System.out.printf("| %-5s| %-5d| %-5d| %-5s|", "-", this.r1, this.r2, "-");
        // System.out.printf(" %-5d| %-5d| %-5s|", this.s1, this.s2, "-");
        // System.out.printf(" %-5d| %-5d| %-5s|\n", this.t1, this.t2, "-");
        // System.out.println("GCD : " + this.r1);

        return this.r1;
    }
}
