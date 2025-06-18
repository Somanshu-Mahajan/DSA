import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public final class NextRound {
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
            // int testcase = in.nextInt();
            // while(testcase-- > 0){
                
            // }
            int n = in.nextInt();
            int k = in.nextInt();

            int arr[] = new int[n];
            for(int i = 0 ; i < n ; i++){
                arr[i] = in.nextInt();
            }

            int kthScore = arr[k - 1];
            int ans = 0;
            if(kthScore == 0){
                for(int i = 0 ; i < k - 1 ; i++){
                    if(arr[i] == 0){
                        break;
                    }
                    ans++;
                }
                out.println(ans);
            }else{
                ans = k;
                for(int i = k ; i < n ; i++){
                    if(arr[i] != kthScore){
                        break;
                    }
                    ans++;
                }

                out.println(ans);
            }
            out.close();
        } catch (Exception e){
            return;
        }
    }
}
