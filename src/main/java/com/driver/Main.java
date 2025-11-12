package com.driver;
class Product{
    public int product(int x,int y){
        return x*y;
    };
    public int product(int x,int y,int z){
      return x*y*z;
    };
    public double product(double x,double y){
        return x*y;
    };
}
public class Main {


    public static void main(String[] args) {
        Product p=new Product();

        int x=2;
        int y=3;
        int z=4;

        System.out.println("first " + p.product(x,y));
        System.out.println("Second " +  p.product(x,y,z));
        System.out.println("third " + p.product(2.5,4.6));

    }
}