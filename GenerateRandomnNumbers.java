import java.util.Scanner;
public class GenerateRandomnNumbers{
    public static void main(String args[]){
        Scanner snr=new Scanner(System.in);
	System.out.println("Enter how many numbers to be generated:");
        int n=snr.nextInt();
	System.out.println("The random "+n+" numbers are:");
        for(int i=0;i<n;i++){
            int m=(int)(Math.random()*100);
            System.out.println(m);
        }
    }
}