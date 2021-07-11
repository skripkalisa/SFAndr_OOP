package Mod6;

public class Ex63 {
    public static class Alphabet{
        public int a, b, c, d, e, f, g, h, i, j, k, l,
                m, n, o, p, q, r, s, t, u, v,
                w, x, y, z, sum;
        // public int setW(int w){
        //     return w;
        // }

        public int setW(int w){
            return this.w = w;
        }

        public int setA(int a){
            return this.a = a;
        }

        public int setS(int s){
            return this.s = s;
        }

        public int setD(int d){
            return this.d = d;
        }


        public int setY(int y){
            return this.y = y;
        }


        public int setQ(int q){
            return this.q = q;
        }

        public int setK(int k){
            return this.k = k;
        }


        public int setL(int l){
            return this.l = l;
        }


        public int setR(int r){
            return this.r = r;
        }


        public int setF(int f){
            return this.f = f;
        }

        public int setC(int c){
            return this.c = c;
        }

        public int setV(int v){
            return this.v = v;
        }

        public int getSum() {
            return a + b + c + d + e + f + g + h + i + j + k + l +
                    m + n + o + p + q + r + s + t + u + v +
                    w + x + y + z;
        }
}

    public static void main(String[] args) {
/*
Make Alphabet class,
so that this code and *similar ones* work correctly
*/
        Alphabet alphabet = new Alphabet();
        alphabet.setW(5);
        System.out.println(alphabet.getSum());
        alphabet.setA(5);
        alphabet.setS(7);
        alphabet.setD(7);
        System.out.println(alphabet.getSum());

/*
This fragment of code has to output

5
24

*/
}}
