package ProblemSolving;

public class Nine
{

    public double myPow(double x, int n) {
//
//      double prod=1.0;
//
//      if (x>0) {
//          for (int i = 0; i < n; i++) {
//              prod = prod * x;
//          }
//      }
//      else {
//        x=1/x;
//          for (int i = 0; i < n; i++) {
//              prod = prod * x;
//          }
//
//      }
//        return  prod;
//    }

        double ans = Math.pow(x, n);
        return ans;
    }
}
