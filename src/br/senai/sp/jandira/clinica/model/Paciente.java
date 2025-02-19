package br.senai.sp.jandira.clinica.model;

import java.time.LocalDate;

import javax.imageio.metadata.IIOMetadataNode;

public class Paciente {

	public String nome;
	public LocalDate dataNacimento;
	public double peso;
	public double altura;
	public String telefone;
	public boolean estaInternado;
	
	public void mostrarFichaPaciente() {
		System.out.println("nome: " + nome);
        System.out.println("pesso: " + peso);
        System.out.println("altura: " + altura);
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
	
	}
	
	private String obterDiaSemanaNacimento() {
		String diaSemana = dataNacimento.getDayOfWeek().toString();
		return diaSemana;
	}
	
	
}
