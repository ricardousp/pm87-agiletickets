package br.com.caelum.aula;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class MaiorMenorTest {
	
	private MaiorMenor mm;
	private static int cont;
	
	@Before
	public void setUp(){
		this.mm = new MaiorMenor();
		cont += 1;
	}
	
	@Test
	public void numerosEmQualquerOrdem() {	
		mm.encontra(new int[]{4, 15, 7, 8});
		Assert.assertEquals(15, mm.getMaior());
		Assert.assertEquals(4, mm.getMenor());
		System.out.println(cont);
	}
	
	@Test
	public void numerosOrdemCrescente() {		
		mm.encontra(new int[]{1, 5, 8, 10, 15});
		Assert.assertEquals(15, mm.getMaior());
		Assert.assertEquals(1, mm.getMenor());
		System.out.println(cont);
	}
	
	@Test
	public void numerosEmOrdemDecrescente() {	
		mm.encontra(new int[]{15, 7, 8, 2, 1});
		Assert.assertEquals(15, mm.getMaior());
		Assert.assertEquals(1, mm.getMenor());
		System.out.println(cont);
	}
	
	@Test
	public void testeUnicoNumero() {	
		mm.encontra(new int[]{1});
		Assert.assertEquals(1, mm.getMaior());
		Assert.assertEquals(1, mm.getMenor());
		System.out.println(cont);
	}
	
}
