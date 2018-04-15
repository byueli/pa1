// Lawn,java
// Becky Li
// byli
// pa1
// Program takes user input to calculate the area of a lawn, and outputs area and mowing time.

import java.util.Scanner;

class Lawn{
    public static void main (String[] args){
        double lotLength, lotWidth, lotArea;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length and width of the lot, in feet: ");
        lotLength = sc.nextDouble();
        lotWidth = sc.nextDouble();
        lotArea = lotLength*lotWidth;

        double hausLength, hausWidth, hausArea, lawnArea;
        Scanner nc = new Scanner(System.in);

        System.out.print("Enter the length and width of the house, in feet: ");
        hausLength = nc.nextDouble();
        hausWidth = nc.nextDouble();
        hausArea = hausLength*hausWidth;
        lawnArea = lotArea-hausArea;
        System.out.println("The lawn area is: "+lawnArea+" square feet.");

        double mowRate, mowSecs;
        Scanner lc = new Scanner(System.in);

        System.out.print("Enter the mowing rate, in square feet per second: ");
        mowRate = lc.nextDouble();
        mowSecs = lawnArea / mowRate;
        int hours = 0;
        int minutes = 0;
        int seconds = (int) mowSecs;
        if (seconds >=60){
            minutes = seconds/60;
            seconds = seconds - minutes*60;
        }
        if (minutes >= 60){
            hours = minutes/60;
            minutes = minutes - hours*60;
        }
        System.out.println("The mowing time is "+hours+" hour"+(hours==1?", ":"s, ")+minutes+" minute"+(minutes==1?", ":"s, ")+seconds+" second"+(seconds==1?".":"s."));

    }
}
