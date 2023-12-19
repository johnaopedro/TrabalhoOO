package Mecanica;

import javax.swing.JOptionPane;

public class Item {
    private int codigo;
    private double valor;
    private String descricao;

    public Item(int codigo, double valor, String descricao) {
        this.codigo = codigo;
        this.valor = valor;
        this.descricao = descricao;
    }
    public void capturarDados() {
        String Strcodigo = JOptionPane.showInputDialog("Digite o codigo do item:");
        this.setCodigo(Integer.parseInt(Strcodigo));

        String Strvalor = JOptionPane.showInputDialog("Digite o valor do item:");
        this.setValor(Double.parseDouble(Strvalor));

        String Strdescricao = JOptionPane.showInputDialog("Digite a descricao do item:");
        this.setDescricao(Strdescricao);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void dadosItem() {
    	String msg = "Dados do Item:\n" +
    		String.format("Codigo: %s\n", codigo) +
    		String.format("Valor: %.2f\n", valor) +
    		String.format("Descricao: %s\n", descricao);
    		JOptionPane.showMessageDialog(null, msg);
    }
}

