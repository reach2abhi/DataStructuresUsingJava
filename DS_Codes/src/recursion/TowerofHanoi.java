package recursion;

public class TowerofHanoi {
	   public static void main(String[] args) {
	      int disks = 3;
	      move(disks, 'A', 'B', 'C');
	   }
	   public static void move(int n, char source, char aux, char dest) {
	      if (n == 1) {
	         System.out.println("Disk 1 from " + source + " to " + dest);
	      } else {
	    	  move(n - 1, source, dest, aux);
	         System.out.println("Disk " + n + " from " + source + " to " + dest);
	         move(n - 1, aux, source, dest);
	      }
	   }
	}
