import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Stack;

public final class HelpfulMaths{
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

    static boolean isNumber(char i){
        if(i == '1' || i == '2' || i == '3'){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        try{
            FastReader in = new FastReader();
            FastWriter out = new FastWriter();
            // int testcase = in.nextInt();
            // while(testcase-- > 0){
                
            // }

            String s = in.next();
            int n = s.length();
            if(n == 1){
                out.println(s);
            }else{
                Stack<Character> digits = new Stack<>();
                Stack<Character> plus = new Stack<>();

                for(int i = 0 ; i < n ; i++){
                    if(isNumber(s.charAt(i)) && !digits.isEmpty()){
                        while(Integer.parseInt(digits.peek()) > (int) s.charAt(i)){
                            
                        }
                    }
                }
            }
            out.close();
        } catch (Exception e){
            return;
        }
    }
}