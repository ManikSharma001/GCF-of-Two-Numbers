//All lines of this program are commented on. Project by Manik Sharma
import java.util.Scanner;//Import the Scanner Class
public class GCF { //Initialize the main Class
  public static void main(String[] args) {//Main Program Start. Initialize public static void main
    Scanner input = new Scanner(System.in);//Create a Scanner Object
    int num1, num2, gcf;//Create variables to store the 2 numbers and their GCF
    System.out.println("What is the First Number? ");//Ask for the First Number
    num1 = Math.abs(input.nextInt()); //Take in the absolute value of the First Number
    System.out.println("What is the Second Number? ");//Ask for the Second Number
    num2 = Math.abs(input.nextInt());//Take in the absolute value of the Second Number
    gcf = gcfFinder(num1, num2);//Call upon method to find GCF
    System.out.println("The GCF is: " + gcf);//Print out answer
  }//Close Main Program -- public static void main
  public static int gcfFinder(int num1, int num2){//Create Method 
    int gcf = 1; //Create a variable gcf with beginning variable 1 (will be the answer if no other GCF is found)
    for (int i = 1; i <= num1; i++){//For loop start to find factors for num1
      if (num1 % i == 0){//If i is a factor of num1, start the other for loop
        for(int j = 1; j <= num2; j++){//For loop to find factors for num2 
          if ((num2 % j == 0) && (num1 % j == 0)){//If j is a factor of num1 and num2, then it is a common factor. As the numbers will keep increasing we will eventually find GCF 
            gcf = j;//J is the Common Factor but we will get the GCF eventually as the for loop will continue to iterate
          }//Close 2nd if statement
          else{//Else Statement to Continue if not a factor
            continue;//Continue if not a factor
          }//Close else Statement
        }//Close 2nd for loop
      }//Close first if statment
      else{//Else Statement to continue for first for loop if factor not found
        continue;//Continue keyword to tell program to continue if i is not a factor.
      }//Close Else Statement.
    }//Close first for loop
    return gcf;//Return the GCF.
  }//Close Method.
}//Close the public class as program is finished.
