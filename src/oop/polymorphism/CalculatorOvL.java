package oop.polymorphism;
//overloading
public class CalculatorOvL {
    public void sum (){
        int a=1;
        int b=2;
        int c=6;
        int d=8;
        int total= a+b;
        System.out.println(total);

    }
   public int sum (int a, int b,int c) {

        int sum1 = a +b+c;
        System.out.println(sum1);
        return sum1;

    }
    public int sum (int a, int b, int c, int d) {

        int sum2= a + b +c+d;
        System.out.println(sum2);
        return sum2;

    }

}
