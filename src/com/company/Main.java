package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Asize = sc.nextInt();
        int[] A = new int[Asize];

        if (Asize==0)
        {System.exit(0);}

        for (int i = 0; i < Asize; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < A.length; i++)
        {
            for (int j = i + 1; j < A.length; j++)
            {
                if (A[i] > A[j])
                {
                    int Vardi;

                    Vardi = A[i];
                    A[i] = A[j];
                    A[j] = Vardi;
                }
            }
        }

        for (int i = 0; i < Asize - 1; i++)
        {
            System.out.print(A[i] + " ");
        }
        System.out.println(A[A.length - 1]);
    }
}

