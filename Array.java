import java.util.Scanner;

class Array{
    public static void main (String ar[]){
        Scanner scan= new Scanner (System.in);
        int max=0;
        int min=0;
        int num_values1[] = { 31, 67, 89, 12, 7 };
        num_values1 = new int[7];
    int i;
    for (i=0; i<num_values1.length; i++){
       if (num_values1[i] > max) 
        max = num_values1[i];
       else if (num_values1[i] < min)
        min = num_values1[i];
        } 
        System.out.println(max);
        System.out.println(min);
    }
}



//Average
class Array{
    public static void main (String ar[]){
        double number[] = {3.6,7.8,9.1,3.1,5.5,14.9};
        double result = 0 , average, num1;
        int i;
        num1=0;
        for (i=0; i<6; i++)
        result = result+number[i];
        average=result/5;
        System.out.println("Average of numbers is: "+average);

    for (i=0; i<number.length; i++){
       if (number[i]>average)
       num1=number[i];
    }
    System.out.println("The numbers greater than the average of numbers is :"+ num1);
  }
}



