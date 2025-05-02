package functionsInJava;

import java.util.Scanner;

public class Example1 {
    public static float volumeOfCuboid(float l,float b, float h)
    {
        float volume = l * b * h;
        return volume;
    }

    public static void main(String[] args){
        float len;
        float bre;
        float hei;
        float result;

        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the length of cuboid : ");
        len = Input.nextFloat();

        System.out.println("Enter the breadth of cuboid : ");
        bre = Input.nextFloat();

        System.out.println("Enter the height of cuboid : ");
        hei = Input.nextFloat();

        result = volumeOfCuboid(len,bre,hei);
        System.out.println("Volume of cuboid : " + result);

    }
}
