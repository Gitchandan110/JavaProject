package packageJava;

public class JC_48_MultidimensionalArray {

	public static void main(String[] args) {
		
		  int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		  
		  /*
		   * Multidimesion Array value position on table
		   * 1,2,3,4 are present on oth row
		   * where as 5,6,7 are present on 1st row
		   * so their position will be like
		   * 1=[0]row[0]column
		   * 2=[0]row[1]column
		   * 3=[0]row[2]column
		   * 4=[0]row[3]column
		   * 5=[1]row[0]column
		   * 6=[1]row[1]column
		   * 7=[1]row[2]column
		   * 
		   */
		  
			  int x = myNumbers[1][2];
			  int y = myNumbers[0][2];
			  int z = myNumbers[1][0];
			  
		     System.out.println(x);  
		     System.out.println(y);  
		     System.out.println(z);  
		  }
		}
