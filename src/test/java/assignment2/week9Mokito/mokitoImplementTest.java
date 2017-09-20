package assignment2.week9Mokito;

import static org.mockito.Mockito.*;

import junit.framework.TestCase;

public class mokitoImplementTest extends TestCase {
	
	mokitoImplement obj;
	int a,b;


	protected void setUp() throws Exception {
		obj = new mokitoImplement();
		a = 10;
		b = 2;
		mokitoInterface mockObj = mock(mokitoInterface.class);
		
		when(mockObj.add(a,b)).thenReturn(a+b);
		when(mockObj.subtract(a,b)).thenReturn(a-b);
		when(mockObj.multiply(a,b)).thenReturn(a*b);
		when(mockObj.divide(a,b)).thenReturn(a/b);
		
		obj.setInfoObj(mockObj);
	}



	public void testAdd() {
		assertEquals(12,obj.add(a, b));
		
	}
	

    public void testSubtract() {
       	assertEquals(8,obj.subtract(a, b));
	}
	

    public void testMultiply() {
     	assertEquals(20,obj.multiply(a, b));
    }
	

    public void testDivide() {
     	assertEquals(5,obj.divide(a, b));
    }
    
	protected void tearDown() throws Exception {
		obj = null;
		a = 0;
		b = 0;
	}
}
