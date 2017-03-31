import classes.Alunos;


public class trabalho {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		
		Alunos alunos = new Alunos("bin/alunos.txt",5);		
		alunos.mostraAlunosEMedias();
		
	}

}
