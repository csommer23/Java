import classes.ListaOrdenada;


public class ListTeste {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		System.out.println("Inicio lista encadeadas");

		ListaOrdenada list = new ListaOrdenada();
		
		list.insert("7");
		list.insert("3");
		list.insert("2");
		list.insert("4");
		list.insert("1");
		list.insert("6");
		list.insert("5");
		list.insert("0");

		list.printAscending();
		list.printDescending();
	}

}
