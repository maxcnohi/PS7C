public class Sieve {
    public static boolean[] sieve(int n) {
        boolean[] isP = new boolean[n];    
        for (int i = 2; i < n; i++) {
            isP[i] = true;
        }
        for (int i = 2; i < n; i++) {
            if (isP[i]) {
                for (int j = i * 2; j < n; j += i) {
                    isP[j] = false;
                }
            }
        }
        return isP;
    }
    
    public static void main(String[] args) {
        int n = 30;
        boolean[] P = sieve(n);
        
        System.out.println("Prime numbers up to " + (n - 1) + ":");
        for (int i = 0; i < P.length; i++) {
            if (P[i]) {
                System.out.print(i + " ");
            }
        }
    }
}