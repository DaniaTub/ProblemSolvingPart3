package ProblemSolving;

public class Four
{
    public int reverse(int x)
    {
        if (x == 0) {
            return x;
        }

        long rev = 0;
        while (x != 0) {
            int mod = x % 10;
            rev = rev * 10 + mod;
            if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
                return 0;
            }
            x /= 10;
        }
        return (int) rev;
    }


}
