package Clase7;

import java.util.Scanner;

public class JuegoDados extends Juego implements InterfazJuego{
	
	private int dado1;
	private int dado2;
	
	
	public JuegoDados() {
		
	}
	
	public int getDado1() {
		return dado1;
	}
	public void setDado1(int dado1) {
		this.dado1 = dado1;
	}
	public int getDado2() {
		return dado2;
	}
	public void setDado2(int dado2) {
		this.dado2 = dado2;
	}

	@Override
	public void empezar() {
		Scanner scn = new Scanner(System.in);
		String p1=scn.nextLine();
		this.setParticipante1(p1);
		String p2=scn.nextLine();
		this.setParticipante2(p2);
	}

	@Override
	public void jugar() {
		this.dado1 = 1+(int)(Math.random()*6);
		this.dado2 = 1+(int)(Math.random()*6);
	}

	@Override
	public void terminar() {
		if(dado1>dado2) {
			System.out.println("Gano: "+this.getParticipante1());
		}
		if(dado1<dado2) {
			System.out.println("Gano: "+this.getParticipante2());
		}
		if(dado1==dado2) {
			System.out.println("Empeato");
		}
		
	}

	@Override
	public void cartelBienvenida() {
		System.out.println("********Bienvenidos al juego de Dados*******");
		
	}
	
	
	

}
