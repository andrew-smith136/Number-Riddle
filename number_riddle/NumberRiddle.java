public class NumberRiddle
{
    public static void main(String[] args) 
    {
        // Starting number.
        int num = 5;
        
        // Adding the numbers.
        int numAdd = num + num;
        System.out.println(numAdd);
        
        // Adding six to the number.
        int numSix = numAdd + 6;
        System.out.println(numSix);
        
        // Diving the numbers.
        double numDivide = numSix / 2;
        System.out.println((int) numDivide);
        
        // Subtracting the numbers.
        int numSub = (int) (numDivide - num);
        
        // Final result.
        System.out.println(numSub);
    }
}