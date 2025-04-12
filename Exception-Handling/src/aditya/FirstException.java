package aditya;
import java .util.*;

public class FirstException{
	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
		System.out.println("Plz enter two number: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		try{
			
			if(num2==0){
			throw new DivideByZeroException("Cannot Divide by zero");
			}
			else{
				int div = num1/num2;
				System.out.println("Divison: "+div);
			}
		}
		catch(DivideByZeroException e){
			System.out.println(e);
		}
}
}
