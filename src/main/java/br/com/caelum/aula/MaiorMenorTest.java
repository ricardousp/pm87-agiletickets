package br.com.caelum.aula;

import junit.framework.Assert;

import org.junit.Test;

public class MaiorMenorTest {
	
	@Test
	public void numerosEmQualquerOrdem() {
		MaiorMenor alg = new MaiorMenor();
		alg.encontra(new int[]{4, 15, 7, 8});
		Assert.assertEquals(15, alg.getMaior());
		Assert.assertEquals(4, alg.getMenor());
	}
	
	@Test
	public void numerosOrdemCrescente() {
		MaiorMenor alg = new MaiorMenor();
		alg.encontra(new int[]{1, 5, 8, 10, 15});
		Assert.assertEquals(15, alg.getMaior());
		Assert.assertEquals(1, alg.getMenor());
	}
	
	@Test
	public void numerosEmOrdemDecrescente() {
		MaiorMenor alg = new MaiorMenor();
		alg.encontra(new int[]{15, 7, 8, 2, 1});
		Assert.assertEquals(15, alg.getMaior());
		Assert.assertEquals(1, alg.getMenor());
	}
	
	@Test
	public void testeUnicoNumero() {
		MaiorMenor alg = new MaiorMenor();
		alg.encontra(new int[]{1});
		Assert.assertEquals(1, alg.getMaior());
		Assert.assertEquals(1, alg.getMenor());
	}
	
}
