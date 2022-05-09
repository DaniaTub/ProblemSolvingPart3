package ProblemSolving;
//You are climbing a staircase.
// It takes n steps to reach the top.
//Each time you can either climb 1 or 2 steps.
// In how many distinct ways can you climb to the top?
public class Two
{
    public int climbStairs(int n) {
        int[] stairs = new int[46];
        stairs[1] = 1;
        stairs[2] = 2;
        //base case for the last two elements

        for (int i = 3; i <= 45; i++) { //starting after the two bases element
            stairs[i] = stairs[i - 1] + stairs[i - 2]; //sum of the two pervoius elements
        }
        return stairs[n];

    }

}
