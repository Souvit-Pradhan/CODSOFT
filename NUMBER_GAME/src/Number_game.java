import java.util.*;
public class Number_game {
    public static void guessnumber(){
        Scanner sc=new Scanner(System.in);
        int number=(int)(100*Math.random())+1;
        int k=5;
        int i,guess;
        System.out.println("Lets play Number Game.");
        System.out.println("A number is chosen "+"between 1 to 100."+"Guess the number "+"within 5 trials.");
        for(i=0;i<k;i++){
            System.out.println("Guess the number:");
            guess=sc.nextInt();
            if (number==guess){
                System.out.println("Congratulations!!!"+"You guessed the number.");
                break;
            }
            else if(number>guess && i!=k-1){
                System.out.println("The number is "+"greater than "+guess);
            }
            else if(number<guess && i!=k-1){
                System.out.println("The number is "+"less than "+guess);
            }
        }
        if (i == k) {
            System.out.println("You have exhausted "+" K trials.");
            System.out.println("The number was "+number);
        }
    }
    public static void main(String[] args) {
        guessnumber();
    }
}