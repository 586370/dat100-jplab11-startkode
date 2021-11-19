package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {
	
	// TODO - deklarering av objektvariable
	private int id;
	private int likes;
	private String dato;
	private String bruker;
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {

		// TODO 
		this.setBruker(bruker);
		this.setDato(dato);
		likes = 0;
		
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		// TODO - START
		this.setBruker(bruker);
		this.setDato(dato);
		
		
	}
	
	public String getBruker() {
		
		return bruker;

	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	public String getDato() {
		return dato;
		
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public int getId() {
		return id;

	}

	public int getLikes() {
		return likes;

	}
	
	public void doLike () {
		likes += 1;
	}
	
	public boolean erLik(Innlegg innlegg) {
		throw new UnsupportedOperationException(TODO.method());

	}
	
	@Override
	public String toString() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
