/**
 * Author : Anubhav Kaushik
 * Date : Jul 20, 2018
 */

/**
 * @author ANUBHAV
 *
 */
public class PrintMatrixPaths {
	
	int row = 4;
	int col = 4;
	int[][] matrix = new int[row-1][col-1];
	int count=0;
	void printPath(int i,int j,String path){
		
		path = path+"->"+i+","+j;
		if(i==(row-1)&&j==(col-1)){
			count++;
			System.out.println(path);
			return;
		}
		if(i<=row-1){
		printPath(i+1,j,path);}
		if(j+1<=col-1){
		printPath(i,j+1,path);}
		return ;
		
	}
	
	public static void main(String []args){
		PrintMatrixPaths pmp = new PrintMatrixPaths();
		pmp.printPath(0, 0, "");
		System.out.println(pmp.count);
	}
}
