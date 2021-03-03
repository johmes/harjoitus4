import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LaskukoneTest {
	private Laskukone laskukone;

	@Test
	@DisplayName("Lisäämisen testaaminen")
	public void testLisää() {
		var laskin0 = new Laskukone();
		laskin0.lisaaLuku(5);
		assertEquals(6, laskin0.annaTulos());
	}
	
	@Test
	@DisplayName("Kertomisen testaaminen")
	public void testKerro() {
		var laskin1 = new Laskukone();
		laskin1.kerroLuvulla(4);
		assertEquals(6, laskin1.annaTulos());
	}
	@Test
	@DisplayName("vähentämisen testaaminen")
	public void testVahenna() {
		var laskin2 = new Laskukone();
		laskin2.vahennaLuku(5);
		assertEquals(-4, laskin2.annaTulos());
	}
	@Test
	@DisplayName("Potenssiin korottamalla testaaminen")
	public void testPotenssiin() {
		var laskin3 = new Laskukone();
		laskin3.korotaPotenssiin(4);
		assertEquals(4, laskin3.annaTulos());
	}
	@Test
	public void testNollaa() {
		var laskin4 = new Laskukone();
		laskin4.nollaa();
		assertEquals(0, laskin4.annaTulos());
	}

}