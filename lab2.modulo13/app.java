import classes.BST;


public class app {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		

		BST list = new BST();
		
		list.insert(50);
		list.insert(30);
		list.insert(45);

		System.out.println(list.isFull());
		
	}

}
