package Voetbal;
import java.util.Random;


public class Keeper {

	public static void main(String[] args){

		Random rng = new Random(); 

		int keeper = rng.nextInt(3)+1;

		System.out.println(keeper);
	}
}