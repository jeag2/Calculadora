package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class CalcBeanTest {

	
	@Test
	public void testprueba() {
			
		assertEquals(1,1);
	}
	
	@Test
	public void testprueba2() {
		CalcBean obj= Mockito.mock(CalcBean.class);		
		int resultado =obj.testeada(10);		
		assertEquals(0,resultado);
	}
	
	@Test
	public void testprueba3() {
		//PREPARACION
		CalcBean obj= Mockito.mock(CalcBean.class);	
		Mockito.when(obj.testeada(10)).thenReturn(210);
		//EJECUCION
		CalcBean obj2 =new CalcBean(); 
		int resultado = obj2.testeada(10);
			
		assertEquals(0,resultado);
	}


}
