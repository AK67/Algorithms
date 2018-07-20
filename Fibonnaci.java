import java.util.Hashtable;

/**
 * Author : Anubhav Kaushik
 * Date : Jul 20, 2018
 */

/**
 * @author ANUBHAV
 *  Recursion using dinamic programming
 */
public class Fibonnaci {

	
	Hashtable holder = new Hashtable<Integer,Integer>();
	Fibonnaci(){
		holder.put(0, 0);
		holder.put(1, 1);
		
	}
	
	public int calculate(int n){
		if(holder.containsKey(n)){
			return (int) holder.get(n);
		}else
			return calculate(n-1)+calculate(n-2);
	}
	
	public static void main(String args[]){
		 Fibonnaci fibonnaci = new Fibonnaci();
		 System.out.println(fibonnaci.calculate(30));
	}
			
}
