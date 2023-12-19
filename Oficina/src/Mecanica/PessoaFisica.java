package Mecanica;

import javax.swing.JOptionPane;

public class PessoaFisica {
    private String nome;
    private String cpf;

    public PessoaFisica(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
	public void setNome(String nome) {
		this.nome = nome;
	}
    public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void dadosPessoaFisica() {
    	String msg = "Dados da Pessoa Física:\n" +
    	String.format("Nome: %s\n", nome) +
    	String.format("CPF: %s\n", cpf);
    	JOptionPane.showMessageDialog(null, msg);
    }
}


