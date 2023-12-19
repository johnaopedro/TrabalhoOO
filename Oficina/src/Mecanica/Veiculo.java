package Mecanica;

import javax.swing.JOptionPane;

public class Veiculo {
    private String modelo;
    private String marca;
    private int anoDeFabricacao;
    private int anoDoModelo;
    private double quilometragemAtual;
    private double nivelDeCombustivel;

    public Veiculo(String modelo, String marca, int anoDeFabricacao, int anoDoModelo,
        double quilometragemAtual, double nivelDeCombustivel) {
    	this.modelo = modelo;
    	this.marca = marca;
    	this.anoDeFabricacao = anoDeFabricacao;
    	this.anoDoModelo = anoDoModelo;
    	this.quilometragemAtual = quilometragemAtual;
    	this.nivelDeCombustivel = nivelDeCombustivel;
    }
    
    public void dadosVeiculo(){
    	String msg = "Dados do Veículo:\n" +
    	String.format("Modelo: %s\n", modelo) +
        String.format("Marca: %s\n", marca) +
        String.format("Ano de Fabricação: %d\n", anoDeFabricacao) +
        String.format("Ano do Modelo: %d\n", anoDoModelo) +
        String.format("Quilometragem Atual: %.2f\n", quilometragemAtual) +
        String.format("Nível de Combustível: %.2f\n", nivelDeCombustivel);
		JOptionPane.showMessageDialog(null, msg);
    }
}
