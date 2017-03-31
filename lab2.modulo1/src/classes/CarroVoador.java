package classes;

public class CarroVoador extends Veiculo {

	protected String nome;
	protected String cor;
	protected final int MAX_VELOCIDADE = 10000;
	
	public CarroVoador(String nome, String cor) {
		this.nome = nome;
		this.cor = cor;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void acelera(int incremento) {
		if(verificaVelocidadeMaxima(incremento)) {
			super.acelera(incremento);
		}		
	}
	
	private Boolean verificaVelocidadeMaxima(int incremento) {
		return incrementaVelocidade(incremento) < this.MAX_VELOCIDADE;
	}
	
	private int incrementaVelocidade(int incremento) {
		return super.velocidade + incremento;
	}
	
	public String toString() {
		return new String("Velocidade MAX: " + velocidade);
	}

}
