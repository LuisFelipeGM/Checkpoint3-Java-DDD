// RM: 96256  Nome: Albert Thiago Godinho Soares
// RM: 94615  Nome: Daniel Henrique Alcantara Oliveira Martins
// RM: 94051  Nome: Lu�s Felipe Garcia Menezes
// RM: 94707  Nome: Vinicius Mota dos Reis

package br.com.fiap;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class UsaFuncionario {
	public static void main(String[] args) {
		
		String aux, nome, escolha = "sim", dataNascimento, menu, formatoUSA, dataFormatada;
		float valorHora, bonus, gorjeta;
		LocalDate datan;
		DateTimeFormatter dft;
		
		while (escolha.equalsIgnoreCase("sim")) {
			try {
				menu = JOptionPane.showInputDialog("Qual tipo de F�ncionaro "
						+ "voc� deseja calcular o s�lario?\n(1) Gar�om\n(2) Gerente");
				
				switch (menu) {
				case "1":
					Garcom gar = new Garcom();
					nome = JOptionPane.showInputDialog("Digite o nome do Gar�om: ");
					gar.setNome(nome);
					dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento do Gar�om(coloque as barras): ");
					formatoUSA = dataNascimento.substring(6, 10);
					formatoUSA += "-" + dataNascimento.substring(3, 5);
					formatoUSA += "-" + dataNascimento.substring(0, 2);
					datan = LocalDate.parse(formatoUSA);
					gar.setDataNascimento(datan);
					
					dft= DateTimeFormatter.ofPattern("dd-MM-yyyy");
					dataFormatada = gar.getDataNascimento().format(dft);
					
					aux = JOptionPane.showInputDialog("Digite o Valor da hora trabalhada do Gar�om: ");
					valorHora = Float.parseFloat(aux);
					gar.setValorHora(valorHora);
					
					aux = JOptionPane.showInputDialog("Digite a Gorjeta do Gar�om: ");
					gorjeta = Float.parseFloat(aux);
					gar.setGorjeta(gorjeta);
					
					JOptionPane.showMessageDialog(null, "O Nome do Gar�om �: " + gar.getNome()
					+ "\nData de Nascimento: " + dataFormatada + "\nIdade: " + gar.calculaIdade(datan) +
					"\nValor da Hora: " + gar.getValorHoraTrabalho()
					+ "\nSal�rio: " + gar.calculaSalario(valorHora));
					
					break;
					
				case "2":
					Gerente gert = new Gerente();
					nome = JOptionPane.showInputDialog("Digite o nome do Gerente: ");
					gert.setNome(nome);
					dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento do Gerente(coloque as barras): ");
					formatoUSA = dataNascimento.substring(6, 10);
					formatoUSA += "-" + dataNascimento.substring(3, 5);
					formatoUSA += "-" + dataNascimento.substring(0, 2);
					datan = LocalDate.parse(formatoUSA);
					gert.setDataNascimento(datan);
					
					dft= DateTimeFormatter.ofPattern("dd-MM-yyyy");
					dataFormatada = gert.getDataNascimento().format(dft);
					
					aux = JOptionPane.showInputDialog("Digite o Valor da hora trabalhada do Gerente: ");
					valorHora = Float.parseFloat(aux);
					gert.setValorHora(valorHora);
					
					aux = JOptionPane.showInputDialog("Digite o Bonus do Gerente: ");
					bonus = Float.parseFloat(aux);
					gert.setBonus(bonus);
					
					JOptionPane.showMessageDialog(null, "O Nome do Gerente �: " + gert.getNome()
					+ "\nData de Nascimento: " + dataFormatada +"\nIdade: " + gert.calculaIdade(datan) +
					"\nValor da Hora: " + gert.getValorHoraTrabalho()
					+ "\nSal�rio: " + gert.calculaSalario(valorHora));
					
					break;

				default:
					break;
				}
				
				escolha = JOptionPane.showInputDialog("Deseja continuar? ");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
		JOptionPane.showMessageDialog(null, "Programa Encerrado!");

	}

}
