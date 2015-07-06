package br.com.caelum.aula;

public class MaiorMenor {

	private int maior = Integer.MIN_VALUE;
	private int menor = Integer.MAX_VALUE;
	
	public int getMaior() {
		return maior;
	}
	public int getMenor() {
		return menor;
	}
	
	public void encontra(int[] nums){
		for(int n: nums){
			if(n < menor) menor = n;
			if (n > maior) maior = n;
		}
	}
	
}
