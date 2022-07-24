// MakeBricks
// We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and 
//  big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks. This is a little harder than 
// it looks and can be done without any loops. See also: Introduction to MakeBricks


// makeBricks(3, 1, 8) → true
// makeBricks(3, 1, 9) → false
// makeBricks(3, 2, 10) → true

import java.util.*;

public class MakeBricks {
    public static boolean makeBricks(int small, int big, int goal) {
        int bigBrick = big * 5;
        int sum = small + big;
        if(goal > bigBrick + small) {
          return false;
        }
        if(goal % 5 > small){
          return false;
        }
        return true;
      }
      

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter value of c: ");
        int c = sc.nextInt();
        boolean make_bricks = makeBricks(a, b, c);
        System.out.println("Is it possible to make the goal by choosing from the given bricks: " + make_bricks);
        sc.close();
    }

}