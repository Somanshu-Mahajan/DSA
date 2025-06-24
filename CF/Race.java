import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public final class Race {
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
                int a = in.nextInt();
                int x = in.nextInt();
                int y = in.nextInt();

                int d1 = Math.abs(a - x);
                int d2 = Math.abs(a - y);

                int low = Math.max(x - d1 + 1, y - d2 + 1);
                int high = Math.min(x + d1 - 1, y + d2 - 1);

                boolean found = false;
                for (int i = low; i <= high; i++) {
                    if (i != a) {
                        out.println("YES");
                        found = true;
                        break; // Exit loop after finding a valid position
                    }
                }

                if (!found) {
                    out.println("NO");
                }
            }

            out.close();
        } catch (Exception e) {
            return;
        }
    }
}
