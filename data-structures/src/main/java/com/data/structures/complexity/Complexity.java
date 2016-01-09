package com.data.structures.complexity;

/**
 * Created by asheeshdwivedi on 1/7/16.
 */
public class Complexity {

    /**
     * Complexity is base on the size of input
     *
     * simpleFunction is a constant time operation , O(1)
     * the code is gonna take the same amount of time whatever the value of N
     * N is not a size of input it is the  value itself .
     */
    public static void simpleFunction(int n){
        int a = 9;
        int b = 3;
        int sum = a + b + n;
        int product = a * b * n;
        int quotient = a * n/b;
        System.out.println(String.format("The sum is : %s , product is : %s  and the quotient is : %s " , sum , product ,quotient));

    }

    /**
     *
     * @param n Input is the size of the input
     *
     *    The number of operation obviously changes with the size of input
     *    The complexity of the operation is O(N) , the operation change linear with the size of input.
     *    as size grow operation grows.
     */

    public static void singleForLoop(int n){
        for (int i = 0; i <n; i++){
            System.out.println(String.format("Square of %s is %s" , i , Math.pow(i,2.0)));
        }
    }

    /**
     *
     * @param n  the is conceptually similar to singleForLoop same complexity will be O(N)
     */

    public static void singleWhileLoop(int n){
        int i = 0;
        while(i < n){
            System.out.println(String.format("Square of %s is %s" , i , Math.pow(i,2.0)));
            i++;
        }
    }

    /**
     *
     * @param n
     *
     * NOTE : complexity analysis is based on works case scenario.
     *  worst case will be input  number is odd and its
     *  going to perform n operations
     *  so the complexity of this method will be O(N).
     */
    public static void ifStatement(int n){
        if(n % 2 == 0){
            System.out.print("The input is even");
        } else {
            for (int i = 0; i < n; i++){
                System.out.print("Printing: " +i);
            }
        }
    }

    /**
     *
     * @param n
     *
     *  complexity is O(N * N)
     *
     */
    public static void nestedForLoop(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j< n; j++){
                System.out.println(String.format("Product of %s and %s is %s ", i,j, i*j ));
            }
        }
    }

    /**
     *
     * @param n
     *
     *     O(N+100) ~ O(N) if N is very large
     *   so Complexity is O(N)
     */
    public static void twoForLoops(int n){
        for(int i = 0; i< n; i++){
            System.out.println("Printing :" + i );
        }
        for(int i = 0; i<100; i++){
            System.out.println("Printing :" +i);
        }
    }

    /**
     *
     * @param n
     *@param m
     *   so Complexity is O(N + M)
     *   its a additive
     */
    public static void twoForLoops(int n , int m){
        for(int i = 0; i< n; i++){
            System.out.println("Printing :" + i );
        }
        for(int i = 0; i<m; i++){
            System.out.println("Printing :" +i);
        }
    }

    /**
     *
     * @param n
     * @param m
     *
     * complexity is O(N * M)
     */
    public static void twoForLoopNandM(int n , int m){
        for(int i = 0; i < n; i++){
            for(int j = 0; j< m; j++){
                System.out.println(String.format("Product of %s and %s is %s ", i,j, i*j ));
            }
        }
    }

    /**
     *
     * @param n
     *
     *  O(N*N + N)
     *
     * Note : Only care about the highest order term.
     *
     * so the complexity is O(N*N)
     */
    public static void twoForLoopNestedAndNonNested(int n ){
        for(int i = 0; i < n; i++){
            for(int j = 0; j< n; j++){
                System.out.println(String.format("Product of %s and %s is %s ", i,j, i*j ));
            }
        }
        for(int i = 0; i < n ; i++){
            System.out.println("Printing :" + i);
        }
    }

    /**
     *
     * @param n
     *
     * O(N * N/2)
     * so the complexity is O(N*N)
     */
    public static void twoForLoopsNotCompletelyStraightForward(int n){
        for(int i=0;  i < n ; i++){
            for(int j= n; j > n/2 ; j--){
                System.out.println(String.format("Value of i: %s j : %s" , i,j));
            }
        }
    }

    /**
     *
     * @param n
     *
     * and each operation we double the i;
     * i.e value of i doubles at every iteration.
     * that means there is some number K exist for which
     * 2 raise to K = N
     *
     * 2 to the power K  =  N
     *  Log(2 pow K) = log N
     *  Klog⁡ 2 = log N
     * K = log N
     * So the complexity is O(log N)
     *
     * Any time when we half the input or
     * we go twice as fast to input at that situation complexity will be log N
     *
     */
    public static void decrementSpacialCaseForLoop(int n){
        for(int i =1; i<n;){
            System.out.println("Value of i is : " + i);
            i=i*2;
        }
    }


}
