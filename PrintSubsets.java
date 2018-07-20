import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**

 * Author : Anubhav Kaushik
 * Date : Jul 20, 2018
 */

/**
 * @author ANUBHAV
 *
 */
public class PrintSubsets {

	
	
	
	void prIntegerSubArrays(Integer[] mySet,Integer[]arrToPrInteger,Integer i){
		if(i==mySet.length-1){
			Arrays.stream(arrToPrInteger).forEach(u->System.out.print(u+","));
			System.out.println("");
			System.out.println("-------------------");
		}else{
			arrToPrInteger[i]=(Integer) null;
			prIntegerSubArrays(mySet, arrToPrInteger, i+1);
			arrToPrInteger[i]=(Integer) mySet[i];
			prIntegerSubArrays(mySet, arrToPrInteger, i+1);
		}
		
	}
	
	public static void main(String args[]){
		Integer k =4;
		Integer[] mySet;
		Integer[] arrToPrInteger;
			mySet = new Integer[k];
			for(Integer i=0;i<k;i++){
				mySet[i]=i;
			}
			
			arrToPrInteger = new Integer[k];
		
		PrintSubsets ps = new PrintSubsets();
		ps.prIntegerSubArrays(mySet, arrToPrInteger, 0);
	}
}
