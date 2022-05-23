// RM: 96256  Nome: Albert Thiago Godinho Soares
// RM: 94615  Nome: Daniel Henrique Alcantara Oliveira Martins
// RM: 94051  Nome: Luís Felipe Garcia Menezes
// RM: 94707  Nome: Vinicius Mota dos Reis

package br.com.fiap;

import java.time.LocalDate;

public class Garcom extends Funcionario {
	private float gorjeta;

	public Garcom() {
	}

	public Garcom(String nome, LocalDate dataNascimento, float valorHoraTrabalho, float gorjeta) {
		super.setNome(nome);
		super.setDataNascimento(dataNascimento);
		super.setValorHora(valorHoraTrabalho);
		this.gorjeta = gorjeta;
	}

	public float getGorjeta() {
		return gorjeta;
	}

	public void setGorjeta(float gorjeta) {
		this.gorjeta = gorjeta;
	}
	
	public float calculaSalario(float valorHoraTrabalho) {
		float salario = (super.getValorHoraTrabalho() * 40) * 4 + getGorjeta();
		return salario;
	}

}
