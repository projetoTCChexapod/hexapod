package br.com.hexapod.redeNeuralArtificial;

public abstract class FuncaoAtivacao {
	
	public abstract double funcaoSigmoide(double valor);
	
	public abstract double funcaoLinear(double valor);
	
	public abstract double funcaoTangenteHiperbolica(double valor);
}
