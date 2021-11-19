package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;

public class Bilde extends Tekst {

	// TODO - objekt variable
	
	private String url;
	
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		this.setTekst(tekst);
		this.setUrl(url);
		this.setBruker(bruker);
		this.setDato(dato);
		
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		throw new UnsupportedOperationException(TODO.constructor("Bilde"));
	}
	
	public String getUrl() {
return url;

	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		throw new UnsupportedOperationException(TODO.method ());

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
