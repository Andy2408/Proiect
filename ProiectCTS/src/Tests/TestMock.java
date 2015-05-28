package Tests;

import junit.framework.TestCase;

import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import Patterns.Angajat;
import static org.mockito.Mockito.*;

public class TestMock extends TestCase {
	
	Angajat a;
	
	protected void setUp() throws Exception {
		
		a = mock(Angajat.class);
		when(a.getCNP()).thenAnswer(new Answer<String>() {

			public String answer(InvocationOnMock invocation) throws Throwable {
				return "1930821090035";
			}
		});
		
		when(a.getNume()).then(new Answer<String>(){
			public String answer(InvocationOnMock i ) throws Throwable{
				return "Alex";
			}
		});
		
		when(a.getNrTelefon()).then(new Answer<String>(){
			public String answer(InvocationOnMock i ) throws Throwable{
				return "0720123456";
			}
		});
		when(a.getEmail()).then(new Answer<String>(){
			public String answer(InvocationOnMock i ) throws Throwable{
				return "alex@yahoo.com";
			}
		});
		
		when(a.getSalariuAngajat()).then(new Answer<Double>(){
			public Double answer(InvocationOnMock i ) throws Throwable{
				return 800.52;
			}
		});	
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testMock(){
		assertEquals("getCNP", "1930821090035",a.getCNP());
	}

}
