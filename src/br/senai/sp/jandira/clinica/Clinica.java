/*
 * programador: Breno
 * Empresa:Senai
 * data:19-02-2025
 */


package br.senai.sp.jandira.clinica;

import java.time.LocalDate;

import br.senai.sp.jandira.clinica.model.Paciente;

public class Clinica {

	public static void main(String[] args) {
		
		// criação do objetos do tipo paciente
		Paciente p1 = new Paciente();
		p1.nome = "Ana Maria";
		p1.setAltura(1.87);
		p1.setPeso(40.000);
		p1.telefone = "(11)9888-8888";
	    p1.dataNacimento = LocalDate.of(2003, 2, 28);
		p1.estaInternado = true;
	    
			
				
		Paciente p2 = new Paciente();
	    p2.nome = "Breno";
        p2.setAltura(1.87);
        p2.telefone = "(11)978148193";
        p2.setPeso(41.000);
        p2.dataNacimento = LocalDate.of(2008, 10, 27);
        p1.estaInternado = true;
        
	    //Mostra dados do paciente1
        p1.mostrarFichaPaciente();
        p2.mostrarFichaPaciente();
        
        
	}

}
