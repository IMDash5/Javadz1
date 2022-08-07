package org.example;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int TriangleNum = n * (n+1) / 2;
        System.out.println(TriangleNum);
    }
}