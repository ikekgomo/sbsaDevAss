import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 
 */

/**
 * @author A228724
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// left 2i + 1 | right 2i + 2
		System.out.println("Array Sorted Binary level Printer");
		int[] tree = {7,6,5,4,3,2,1}; 
		int h = 7;
//		List<Node> nodes = new ArrayList();
//		int[] tree2 = new int[7];
//		
//		System.out.println("7");
////		for (int i = 0; i < tree.length; i++){
//////			System.out.print(tree[((2*i) + 1)]);
//////			System.out.print(tree[((2*i) + 2)]);
////			
//////			int l = tree[((2*i) + 1)];
//////			int r = tree[((2*i) + 2)];
////			
//////			Node n = new Node(Math.min(l, r), Math.max(l, r));
//////			n.left = Math.min(l, r);
//////			n.right = Math.max(l, r);
//////			nodes.add(n);
////			tree2[i] = Math.min(tree[((2*i) + 1)], tree[((2*i) + 2)]);
////			tree2[i+1] = Math.min(tree[((2*i) + 1)], tree[((2*i) + 2)]);
////			System.out.print(tree2[i]);
////		}
//		
		for (int i = 0; i < tree.length-1; i++){
			System.out.print(tree[((2*i) + 1)]);
			System.out.print(tree[((2*i) + 2)]);
		}
	}
//		System.out.println("Array Sorted Binary level Printer");
//		int[] tree = {7,6,5,4,3,2,1}; 
//		int h = 7;
////		test(tree);
//		int k = 1;
//		test2(tree, 0, tree.length-1);
//	}
//	private static void test(int[] tree){
////		System.out.println("Array Sorted Binary level Printer");
////		int[] tree = {7,6,5,4,3,2,1}; 
////		int h = 7;
//		
//		System.out.println("7");
//		for (int i = 0; i < tree.length-1; i++){
//			System.out.print(tree[((2*i) + 1)]);
//			System.out.print(tree[((2*i) + 2)]);
//		}
//	}
//	
//	private static void test2(int[] tree, int s, int e){
//		if (s > e) return;
//		test2(tree, s*2 + 1, e);
//		 System.out.print(tree[s] + " ");
//		 test2(tree, s*2 + 2, e); 
//	}
//	
//	private static void test3(int[] tree, int s, int e, int k){
//		if (s > e) 
//			return;
////		System.out.print(tree[((2*s) + 1)]);
////		System.out.print(tree[((2*s) + 2)]);
////		System.out.print(tree[s] + " ");
//		int k1 = k==1?2:1;
//		System.out.print("k="+k+" ");
//		test3(tree, s*2 + k1, e, k1); 
//		System.out.print(tree[s] + " ");
//	}
	

}
