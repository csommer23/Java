package classes;

public class Aluno_Media extends Aluno {

	protected Float media;
	
	public Aluno_Media(String matricula, String nome, Float notaGA, Float notaGB) {
		super(matricula, nome, notaGA, notaGB);
	}

	public void fazMedia() {
		this.media = (this.notaGA + this.notaGB) / 2;
	}
	
	public Float getMedia() {
		return this.media;
	}

}
