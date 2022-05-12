package com.company;
import java.util.*;
public class pp1 {
    public static void main(String[] args) {

                Scanner sc=new Scanner(System.in);
                int A=5,b=4,area,peri;
                area=A*b;
                peri=2*(A+b);
                if(area>peri)
                {
                    System.out.println("Area of a rectangle is greater than Perimeter");
                }
                else
                {
                    System.out.println("Area of a rectangle is less than Perimeter");
                }
            }

        }


