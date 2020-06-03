package org.teatru;

public class Sala {
	private String name;
	private int nrlocuri;
	
	public Sala(){
		name = "unknown name";
		nrlocuri=1000;
		}

	public String getName(){
		return name;
	}
	
	public void setName(String sala) {
		name = sala;
	}
	
	public int nrlocuri() {
		return nrlocuri;
	}

	public int getNrlocuri() {
		return nrlocuri;
	}

	public void setNrlocuri(int nrlocuri) {
		this.nrlocuri = nrlocuri;
	}
	
	public String toString(){
		return "Sala: " + this.name + ", locuri: " + this.nrlocuri + " ";
	}
	
}
