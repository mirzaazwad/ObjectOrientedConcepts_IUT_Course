package org.example;

public class Main {
    public static int Sum(String arcn,Integer... args){
        Integer sum=0;
        for(Integer i:args){
            sum+=i;
        }
        System.out.println(arcn);
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(Sum("Hello Fuchka",1,2,3,4,5));
    }
}