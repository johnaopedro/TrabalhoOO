package Mecanica;

import java.util.List;

import javax.swing.JOptionPane;

//import javax.swing.JOptionPane;

public class OrdemServico {
    private String dadosCliente;
    private String dadosVeiculo;
    private List<Peça> pecasSubstituir;
    private List<Serviço> servicosRealizar;
    private String dataManutencao;
	private String nomeMecanico;
    
    public OrdemServico(String dadosCliente, String dadosVeiculo,
            List<Peça> pecasSubstituir, List<Serviço> servicosRealizar,
            String dataManutencao, String nomeMecanico) {
        	this.dadosCliente = dadosCliente;
        	this.dadosVeiculo = dadosVeiculo;
        	this.pecasSubstituir = pecasSubstituir;
        	this.servicosRealizar = servicosRealizar;
        	this.dataManutencao = dataManutencao;
        	this.nomeMecanico = nomeMecanico;
    }
    
    
    public String getDadosCliente() {
		return dadosCliente;
	}

	public void setDadosCliente(String dadosCliente) {
		this.dadosCliente = dadosCliente;
	}

	public String getDadosVeiculo() {
		return dadosVeiculo;
	}

	public void setDadosVeiculo(String dadosVeiculo) {
		this.dadosVeiculo = dadosVeiculo;
	}

	public String getDataManutencao() {
		return dataManutencao;
	}

	public void setDataManutencao(String dataManutencao) {
		this.dataManutencao = dataManutencao;
	}

	public String getNomeMecanico() {
		return nomeMecanico;
	}

	public void setNomeMecanico(String nomeMecanico) {
		this.nomeMecanico = nomeMecanico;
	}
    public void adicionarPeca(Peça peca) {
        pecasSubstituir.add(peca);
    }

    public void adicionarServico(Serviço servico) {
        servicosRealizar.add(servico);
    }
    public double calcularTotal() {
        double total = 0.0;

        for (Peça peca : pecasSubstituir) {
            total += peca.getValor();
        }

        for (Serviço servico : servicosRealizar) {
            total += servico.getValor();
        }

        return total;
    }
    public void dadosOrdem() {
        String msg = "Dados da Ordem de Serviço:\n"
                + String.format("Cliente: %s\n", dadosCliente)
                + String.format("Veículo: %s\n", dadosVeiculo)
                + String.format("Data de Manutenção: %s\n", dataManutencao)
                + String.format("Mecânico: %s\n", nomeMecanico)
                + "Peças a serem substituídas:\n";

        for (Peça peca : pecasSubstituir) {
            msg += String.format("- %s\n", peca.getDescricao());
        }

        msg += "Serviços a serem realizados:\n";

        for (Serviço servico : servicosRealizar) {
            msg += String.format("- %s\n", servico.getDescricao());
        }

        JOptionPane.showMessageDialog(null, msg);
    }
}