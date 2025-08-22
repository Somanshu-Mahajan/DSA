public class Euclidian {
    private int r1, r2, q, r;
    
    public Euclidian(int r1, int r2){
        this.r1 = r1;
        this.r2 = r2;
    }

    public int gcd() {
        if(r1 < r2) {
            int temp = r1;
            r1 = r2;
            r2 = temp;
        }
        
        // System.out.printf("| %-5s| %-5s| %-5s| %-5s|\n", "q", "r1", "r2", "r");
        
        while(r2 != 0) {
            this.q = this.r1 / this.r2;
            this.r = this.r1 % this.r2;

            // System.out.printf("| %-5d| %-5d| %-5d| %-5d|\n", this.q, this.r1, this.r2, this.r);

            this.r1 = this.r2;
            this.r2 = this.r;
        }
        
        // System.out.printf("| %-5s| %-5d| %-5d| %-5s|\n", "-", this.r1, this.r2, "-");
        // System.out.println("GCD : " + this.r1);

        return this.r1;
    }
}