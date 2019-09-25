package app;

import java.util.Random;

public class App {

    public static void main_array(String[] args) throws Exception {
        double princle = 10000;
        double rate = 0.01;
        double total;
        for ( int day=1; day<=20; day++){
            total = princle * Math.pow(1 + rate, day);
            System.out.println(day + " " + total);
        }

        int counter = 30;
        do {
            System.out.println(counter);
            counter++;
        }while(counter<20);

        Random dice = new Random();
        counter = 0;
        do {
            int iRandom = 1 + dice.nextInt(5);
            System.out.println(iRandom);
            counter++;
        }while(counter <= 10);
        
        int bucky[]={12,2,23,44,5,6};
        //System.out.println(bucky[2]);

        //System.out.println("index\tValue");

        counter = 0;
        for ( counter=0; counter < bucky.length; counter++){
            //System.out.println(counter + "\t" + bucky[counter]);
        }

        int sum = 0;
        for (counter =0; counter < bucky.length; counter++){
            sum += bucky[counter];
        }
        System.out.println(sum);

        int freq[]=new int[7];
        for (counter = 0; counter < 1000; counter++){

            ++freq[1+dice.nextInt(6)];
        }

        for (counter = 0; counter < freq.length; counter++){
            //System.out.println(freq[counter]);
        }

        sum=0;
        for (int x:bucky){
            sum+=x;
        }
        //System.out.println(sum);

        printarray(bucky);
        changearray(bucky);
        printarray(bucky);

    }

    public static void main(String[] args) throws Exception {
        tuna tunaObj = new tuna();
        tunaObj.setTime(11, 12, 34);
        System.out.println(tunaObj.toMinlitary());
        System.out.println(tunaObj.toString());
    }
    public static void changearray(int array[]){
        for (int index=0; index<array.length; index++){
            array[index]=array[index]+5;
        }
    }
    public static void printarray(int array[]){
        System.out.println("index\tvalue");
        for (int index=0; index<array.length; index++){
            System.out.println(index + "\t" + array[index]);
        }
    }
}