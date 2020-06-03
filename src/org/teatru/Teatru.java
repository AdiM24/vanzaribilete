package org.teatru;
import java.util.ArrayList;

public class Teatru {
    String nume;
	ArrayList<PiesaDeTeatru> piesateatru;
	ArrayList<Sala> sali;
	
	public Teatru(){
		this.nume = "";
		this.piesateatru = new ArrayList<PiesaDeTeatru>();
		this.sali = new ArrayList<Sala>();
	}
	

	public String getName() {
		return nume;
	}

	public void setName(String nume) {
		this.nume = nume;
	}
	
	public ArrayList<PiesaDeTeatru> getPiesateatru() {
		return piesateatru;
	}

	public void setPiesateatru(PiesaDeTeatru p) {
		this.piesateatru.add(p);
	} 
	
	public ArrayList<Sala> getSala() {
		return sali;
	}
    
	public void setSala(Sala s) {
		this.sali.add(s);
	}
}
