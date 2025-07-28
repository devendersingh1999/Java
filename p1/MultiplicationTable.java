package p1;

public class MultiplicationTable {
 
	void printM() {
		printM(5,1,10);
	}
	
  void printM(int table) {
	  printM(table, 1 ,10);// avoding the duplication writing method like this
  }
  void printM(int table, int from, int to) {
		for(int i=from; i<=to; i++) {
			
			System.out.printf("%d * %d = %d ", table,i, table*i).println();
			}
	}
	
	
}
