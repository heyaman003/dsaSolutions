package bitwise.gfg;

public class Main {
    public static void main(String[] args) {
        long N = 100;
        long result = sqNum(N);
        System.out.println("Number of square numbers less than or equal to " + N + ": " + result);
    }

    static Long sqNum(Long n) {
        if (n == 0 || n == 1)
            return (long) 0;

        long count = 0;
        for (long i = 2; i * i <= n; i++) {
            if (Math.abs(i * i) == Math.round(i * i) && (i * i) <= n)
                count++;
        }
        return (long) count;
    }
}

