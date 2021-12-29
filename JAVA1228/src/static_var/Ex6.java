package static_var;

import java.util.Scanner;


class CalMin {
	public static Bridge min(Bridge[] b) {
		Bridge minBridge = b[0];
		for (int i=1; i<b.length; i++) {
			if(minBridge.total > b[i].total) minBridge = b[i];
		}
		return minBridge;
	}
}

class Bridge {
	int index;
	int total;
}

class Road {
	int[] arr = new int[10];
	
	public int sum(int start, int end) {
		int sum = 0;
		for (int i=start; i<end; i++) {
			sum+= this.arr[i];
		}
		return sum;
	}
}

public class Ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Road North = new Road();
		Road South = new Road();
		
		for (int i = 0; i < North.arr.length; i++) {
			North.arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < South.arr.length; i++) {
			South.arr[i] = sc.nextInt();
		}
		
		Bridge bridge1 = new Bridge();
		Bridge bridge2 = new Bridge();
		Bridge bridge3 = new Bridge();
		bridge1.index = sc.nextInt();
		bridge2.index = sc.nextInt();
		bridge3.index = sc.nextInt();
		
		bridge1.total = North.sum(0, bridge1.index) + South.sum(bridge1.index, South.arr.length-1);
		bridge2.total = North.sum(0, bridge2.index) + South.sum(bridge2.index, South.arr.length-1);
		bridge3.total = North.sum(0, bridge3.index) + South.sum(bridge3.index, South.arr.length-1);
		
		System.out.println("bridge1.total: "+ bridge1.total);
		System.out.println("bridge2.total: "+ bridge2.total);
		System.out.println("bridge3.total: "+ bridge3.total);
		
		Bridge[] bridges = {bridge1, bridge2, bridge3};
		
		Bridge min = CalMin.min(bridges);
		System.out.println(min.index);
		System.out.println(min.total);
		
		
	}
}
