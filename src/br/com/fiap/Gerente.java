// RM: 96256  Nome: Albert Thiago Godinho Soares
// RM: 94615  Nome: Daniel Henrique Alcantara Oliveira Martins
// RM: 94051  Nome: Luís Felipe Garcia Menezes
// RM: 94707  Nome: Vinicius Mota dos Reis

package br.com.fiap;

import java.time.LocalDate;

public class Gerente extends Funcionario {

	private float bonus;

	public Gerente() {}

	public Gerente(String nome, LocalDate dataNascimento, float valorHoraTrabalho, float bonus) {
		super.setNome(nome);
		super.setDataNascimento(dataNascimento);
		super.setValorHora(valorHoraTrabalho);
		this.bonus = bonus;
	}

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	
	public float calculaSalario(float valorHoraTrabalho) {
		float salario = ((super.getValorHoraTrabalho() * 40) * 4) * (1 + bonus/100);
		return salario;
	}

}
