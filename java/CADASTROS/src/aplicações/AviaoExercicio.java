package aplicações;

import classes.ExercicioAviao;

public class AviaoExercicio {

	public static void main(String[] args) {
		ExercicioAviao aviao = new ExercicioAviao();
		
		aviao.companhiaAerea="American Air lines";
		aviao.decolarAviao=true;
		aviao.velocidadeAviao=0;
		aviao.aterrissagem=true;
		
		aviao.Velociodade();
		aviao.Velociodade();
		aviao.Velociodade();
		aviao.Velociodade();
		aviao.Velociodade();
		aviao.Velociodade();
		aviao.Velociodade();
		aviao.Velociodade();
		aviao.Velociodade();
		aviao.Velociodade();
		System.out.println("A velocidade chegou a 10 ");
		
		aviao.Descacelerando();
		aviao.Descacelerando();
		aviao.Descacelerando();
		aviao.Descacelerando();
		System.out.println("A velocidade diminuiu para 6");
	}

}
