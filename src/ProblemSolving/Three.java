package ProblemSolving;
//Fibonacci problem
      public class Three {
        public int fib(int n)
        {

            int n1=0;
            int n2=1;
            int sum=0;
            int n3=0;
            while(sum<n)
            {
                n3 = n2 + n1;
                n1 = n2;
                n2 = n3;
                sum = sum + 1;
            }
            return n1;
        }
}



