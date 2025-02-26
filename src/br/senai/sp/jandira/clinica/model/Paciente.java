package br.senai.sp.jandira.clinica.model;

import java.time.LocalDate;

import javax.imageio.metadata.IIOMetadataNode;

public class Paciente {

	public String nome;
	public LocalDate dataNacimento;
	private double peso;
	private double altura;
	public String telefone;
	public boolean estaInternado;
	private double imc;
	
	public void setAltura(double altura){
		
		if (altura > 0) {
			//true
			this.altura = altura;
		}else {
			//false
			System.out.println("A Altura do(a) paciente " + nome + " está incoreta");
		}
		
		
	}
	public void setPeso(double peso){
		
		if (peso >= 40) {
			//true
			this.peso = peso;
		}else {
			//false
		System.out.println("o peso do(a) paciente " + nome + " está incoreto");
		}
	}
	
	
	
	
	public void mostrarFichaPaciente() {
		
		calcularImc();
		
		System.out.println("nome: " + nome);
        System.out.println("peso: " + peso);
        System.out.println("altura: " + altura);
        System.out.println("IMC: " + imc);
        System.out.println("telefone: " + telefone);
        System.out.println("data nasc: " + dataNacimento);
        System.out.println("dia nasc: " + obterDiaSemanaNacimento());
        System.out.println("internado: " + estaInternado);
        System.out.println("---------------------");
        
        
	}
	
	public void classifcarImc() {
		
	}
	
	public void cacularIdade() {
		
	}
	
	public void calcularImc() {
	imc = peso / (altura * altura);
	
	}
	
	private String obterDiaSemanaNacimento() {
		String diaSemana = dataNacimento.getDayOfWeek().toString();
		return diaSemana;
	}
	
	
}
