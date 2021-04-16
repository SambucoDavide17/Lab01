package it.polito.tdp.parole.model;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Parole {
	
	private  LinkedList<String> elencoParole;
		
	public Parole() {
		elencoParole =  new LinkedList<String>();
	}
	
	public void addParola(String p) {
		elencoParole.add(p);
	}
	
	public List<String> getElenco() {
		
		LinkedList<String> paroleOrdinate = new LinkedList<String>(elencoParole);
		paroleOrdinate.sort(new ComparatoreParole());
		return paroleOrdinate;
	}
	
	public String elenco(List<String> elenco) {
		
		String risultato = "";
		for(String s: elenco) {
			risultato += s + "\n";
		}
		return risultato;
	}
	
	public void reset() {
		elencoParole.clear();
	}
	
	public void cancella(String input) {
		
		for(String s: elencoParole) {
			if(s.equals(input))
				elencoParole.remove(s);
		}
	}

}