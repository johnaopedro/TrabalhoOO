package Mecanica;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Main {
	
public static void todasAsPeças(List<Peça> pecasOrdem){
	for (Peça peca : pecasOrdem) {
		peca.dadosItem();
		}
	}
public static void totalOrdemServico(OrdemServico ordemCliente){
	double totalCliente = ordemCliente.calcularTotal();
	String msg = String.format("Valor total da Ordem de Serviço: %.2f", totalCliente);
	JOptionPane.showMessageDialog(null, msg);
}
public static void todosOsServicos(List<Serviço> servicosOrdem) {
	for (Serviço servico : servicosOrdem) {
		servico.dadosItem();
		}
	}
public static void Interface(PessoaFisica pessoa, OrdemServico ordemCliente, Veiculo carro, List<Peça> pecasOrdem, List<Serviço> servicosOrdem){
	String Escolha;
	String comandos = "Comandos disponiveis:\n-\"pessoa\" para ver os dados do cliente\n-\"ordem\" para ver os dados da ordem de servico\n-\"veiculo\" para ver os dados do veiculo\n-\"pecas\" para ver os dados de todas as pecas\n-\"servico\" para ver os dados de todos os servicos\n-\"item\" para ver o valor total gasto pelo usuario\n-\"sair\" para sair do programa";
	JOptionPane.showMessageDialog(null, comandos);
	do {
		Escolha = JOptionPane.showInputDialog("Digite um comando:");
		if (Escolha.equals("pessoa")) {
			pessoa.dadosPessoaFisica();
		}
		if (Escolha.equals("ordem")) {
			ordemCliente.dadosOrdem();
		}
		if (Escolha.equals("veiculo")) {
			carro.dadosVeiculo();
		}
		if (Escolha.equals("servico")) {
		    todosOsServicos(servicosOrdem);
		}
		if (Escolha.equals("pecas")) {
			todasAsPeças(pecasOrdem);
		}
		if (Escolha.equals("item")) {
			totalOrdemServico(ordemCliente);
		}
		
}while(!Escolha.equals("sair"));
}

public static void main(String[] args) {
	String msg = String.format	("Registre os dados do veiculo: ");
	JOptionPane.showMessageDialog(null, msg);
	String modelo= JOptionPane.showInputDialog("Modelo do veiculo: ");
	String marca= JOptionPane.showInputDialog("Marca do veiculo: ");
	String fab= JOptionPane.showInputDialog("Ano de fabricação: ");
	int fabricacao = Integer.parseInt(fab);
	String anomo= JOptionPane.showInputDialog("Ano do Modelo: ");
	int anomodelo = Integer.parseInt(anomo);
	String strquilo = JOptionPane.showInputDialog("Quilometragem atual: ");
	double quilometragem = Double.parseDouble(strquilo);
	String strporc = JOptionPane.showInputDialog("Nível de combustível em porcentagem: ");
	double porcentagem = Double.parseDouble(strporc);

	msg = String.format	("Cadastrar cliente: ");
	JOptionPane.showMessageDialog(null, msg);
	String nome= JOptionPane.showInputDialog("Nome do cliente: ");
	String cpf= JOptionPane.showInputDialog("Digite o CPF: ");
	String dv= JOptionPane.showInputDialog("Dados gerais do veiculo: ");
	String manu= JOptionPane.showInputDialog("Data da manutenção: (Formato: 0/0/0)\n ");
	String nomemec= JOptionPane.showInputDialog("Nome do mecanico: ");
	
    int qtdPecas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de peças a serem adicionadas:"));
    int qtdServicos = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de serviços a serem adicionados:"));

    List<Peça> pecasOrdem = new ArrayList<>();
    List<Serviço> servicosOrdem = new ArrayList<>();
	
    for (int i = 0; i < qtdPecas; i++) {
        Item pecar = new Peça(0,0,"");
        Peça peca = (Peça) pecar;
        peca.capturarDados();
        pecasOrdem.add(peca);
    }
    
    for (int i = 0; i < qtdServicos; i++) {
    	Item servicor = new Serviço(0,0,"");
    	Serviço servico = (Serviço) servicor;
        servico.capturarDados();
        servicosOrdem.add(servico);
    }
    
	Veiculo carro = new Veiculo(modelo, marca, fabricacao, anomodelo, quilometragem, porcentagem);
	OrdemServico ordemCliente = new OrdemServico(nome,dv, pecasOrdem, servicosOrdem, manu, nomemec);
	PessoaFisica pessoa = new PessoaFisica(nome, cpf);
	
	Interface(pessoa, ordemCliente, carro, pecasOrdem, servicosOrdem);
    }
}
