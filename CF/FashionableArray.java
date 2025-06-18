import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public final class FashionableArray {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st == null || !st.hasMoreTokens()){
                try{
                    st = new StringTokenizer(br.readLine());
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str = "";
            try{
                str = br.readLine().trim();
            }catch (Exception e){
                e.printStackTrace();
            }
            return str;
        }
    }
    static class FastWriter{
        private final BufferedWriter bw;
        public FastWriter(){
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }
        public void print(Object object) throws IOException {
            bw.append("" + object);
        }
        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }
        public void close() throws IOException {
            bw.close();
        }
    }

    public static void main(String[] args) {
        try{
            FastReader in = new FastReader();
            FastWriter out = new FastWriter();
            int testcase = in.nextInt();
            while(testcase-- > 0){
                int n = in.nextInt();

                int a[] = new int[n];
                for(int i = 0 ; i < n ; i++){
                    a[i] = in.nextInt();
                }

                if(n == 1){
                    out.println(0);
                    continue;
                }

                Arrays.sort(a);

                int first = 0, last = 0;
                for(int i = 0 ; i < n ; i++){
                    
                }
                
            }
            out.close();
        } catch (Exception e){
            return;
        }
    }
}
