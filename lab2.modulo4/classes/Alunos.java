package classes;

public class Alunos {

	protected String caminho;
	protected int tamanhoArray;
	
	public Alunos(String caminho,int tamanhoArray) {
		this.caminho = caminho;	
		this.tamanhoArray = tamanhoArray;
	}

	private Aluno_Media[] fazMedias() {
		
		Aluno_Media[] alunos = new Aluno_Media[tamanhoArray];
		
		LerArquivo lerArquivo = new LerArquivo(this.caminho);

		int indeceAluno = 0;
		for(String aluno: lerArquivo.abrirArquivoERetornoEmLista()) {
			
			String campos[] = aluno.split(",");
			alunos[indeceAluno] = new 
					Aluno_Media("",
							campos[0], 
							Float.parseFloat(campos[1]),
							Float.parseFloat(campos[2])
						);
			
			alunos[indeceAluno].fazMedia();
			indeceAluno++;
		}
		
		return alunos;
	}
	
	public void mostraAlunosEMedias() {
		
		for(Aluno_Media aluno: this.fazMedias()) {
			if(aluno != null)
				System.out.format("Nome: %s Media: %.2f \n",aluno.getNome(),aluno.getMedia());
		}
	}
}
