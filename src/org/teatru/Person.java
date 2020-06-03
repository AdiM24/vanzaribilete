
package org.teatru;

public class Person {
	
	private String name;
	private String surname;
	private int  nrlocsala;
	
	
	public Person(){
		name = "unknown name";
		}
	
	
	public String getName(){
		return name;
	}
	
	public void setName(String anyName) {
		name = anyName;
	}

	public String getSurname(){
	     return surname;
	}
	
	public void setSurname(String anySurname){
		surname =  anySurname;
	}
	
	public int nrlocsala() {
		return nrlocsala;
	}


	public String toString(){
		return this.getName()+ " " + this.getSurname() + " (numar loc in sala : " + this.getNrlocsala() + ")";
	}

    public int getNrlocsala() {
    	return nrlocsala;
    }

    public void setNrlocsala(int nrlocsala) {
    	this.nrlocsala = nrlocsala;
    }

}


