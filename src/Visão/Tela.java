package Visão;

import java.util.Scanner;

import controle.CtrlVoto;

public class Tela {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		CtrlVoto ctrlVoto = new CtrlVoto();
		
		Integer nota;
		
		Boolean valida;
		
		System.out.println("##########   A N Á L I S E   D E   A T E N D I M E N T O    ##########");
		
		
		System.out.print("\nDê a sua nota de 0 á 10 ao nosso atendimento: ");
		nota = ler.nextInt();
		
		valida = ctrlVoto.validarEntrada(nota);
		
		ctrlVoto.salvarVoto(nota);
		
		System.out.println("Obrigado pela preferência. Volte Sempre!");

	}

}
