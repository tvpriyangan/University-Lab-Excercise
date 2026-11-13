package lab3exe1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueryStringTest {
	
	@Test
	public void testGetName() {
		QueryString x=new QueryString("name=Alice&age=19&country=UK");
		assertEquals("Alice",x.getParameter("name"));	
	}
	
	
	@Test
	public void testGetAge() {
		 QueryString x = new QueryString("name=Alice&age=19&country=UK");
		 assertEquals("19",x.getParameter("age"));		
	}
	
	
	@Test
	public void testGetCountry() {
		QueryString x = new QueryString("name=Alice&age=19&country=UK");
		assertEquals("UK", x.getParameter("country"));
		
	}
	
	@Test
	public void testHasParameter() {
		QueryString x = new QueryString("name=Alice&age=19&country=UK");
		assertTrue (x.hasParameter("age"));		
	}
	
	@Test
	public void testHasMissingParameter() {
		QueryString x = new QueryString("name=Alice&age=19&country=UK");
		assertFalse(x.hasParameter("city"));		
		
	}
	
	@Test
	public void testNameOffset() {
		QueryString x = new QueryString("name=Alice&age=19&country=UK");
		assertEquals (0,x.getParameterOffset("name"));
	}
	
	@Test
	public void testAgeOffset() {
		QueryString x = new QueryString("name=Alice&age=19&country=UK");
		assertEquals(11, x.getParameterOffset("age"));
		
		
	}
	
	
	@Test
	public void testMissingParameterOffset() {
		QueryString x = new QueryString("name=Alice&age=19&country=UK");
		assertEquals (-1, x.getParameterOffset("city"));
	}
	
	@Test
	public void testDecode(){
		
		String input ="Hello%2C+world%21";
		String output = QueryString.decode(input);
		assertEquals ("Hello, world!",output);
		
	}

}
