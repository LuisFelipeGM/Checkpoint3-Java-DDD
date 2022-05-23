// RM: 96256  Nome: Albert Thiago Godinho Soares
// RM: 94615  Nome: Daniel Henrique Alcantara Oliveira Martins
// RM: 94051  Nome: Luís Felipe Garcia Menezes
// RM: 94707  Nome: Vinicius Mota dos Reis

package br.com.fiap;

import java.time.LocalDate;
import java.time.Period;

import javax.swing.JOptionPane;

public class Funcionario {

	private String nome;
	private LocalDate dataNascimento;
	private float valorHoraTrabalho;

	public Funcionario() {}

	public Funcionario(String nome, LocalDate dataNascimento, float valorHoraTrabalho) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.valorHoraTrabalho = valorHoraTrabalho;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		LocalDate inicio = LocalDate.parse("1899-12-31");
		LocalDate fim = LocalDate.now();
		try {
			if (dataNascimento.isAfter(inicio) && dataNascimento.isBefore(fim)) {
				this.dataNascimento = dataNascimento;
			} else {
				throw new Exception("Data fora do período permitido");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			System.exit(0);
			
		}
	}

	public float getValorHoraTrabalho() {
		return valorHoraTrabalho;
	}

	public void setValorHora(float valorHoraTrabalho) {
		this.valorHoraTrabalho = valorHoraTrabalho;
	}
	
	public float calculaSalario(float valorHoraTrabalho) {
		float salario = (getValorHoraTrabalho() * 40) * 4;
		return salario;
	}
	
	public int calculaIdade(LocalDate dataNascimento) {
		LocalDate dataAtual = LocalDate.now();
		Period idade = Period.between(dataNascimento, dataAtual);
		return idade.getYears();
	}
	

}
