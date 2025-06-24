import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public final class ItsTimeToDuel {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
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
        try {
            FastReader in = new FastReader();
            FastWriter out = new FastWriter();
            int testcase = in.nextInt();
            while (testcase-- > 0) {
                int n = in.nextInt();
                int a[] = new int[n];

                int flag = 0, countOne = 0;
                for(int i = 0 ; i < n ; i++){
                    a[i] = in.nextInt();
                    if(a[i] == 0){
                        if(i != 0 && a[i] == a[i - 1]){
                            flag = 1;
                        }
                    }else{
                        countOne++;
                    }
                }

                if(flag == 1){
                    out.println("YES");
                    continue;
                }

                if(countOne > n - 1){
                    out.println("YES");
                }else{
                    out.println("NO");
                }
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}
