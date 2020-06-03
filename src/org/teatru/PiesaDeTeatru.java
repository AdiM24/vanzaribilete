package org.teatru;


import java.util.ArrayList;


public class PiesaDeTeatru {
	String name;
	String datarularii;
	Sala sala;
	ArrayList<Person> people;
	
	public PiesaDeTeatru(){
		
	}
	
	public PiesaDeTeatru(String myName){
		this.name = myName;
		this.people=new ArrayList<Person>();
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDatarularii() {
		return datarularii;
	}

	public void setDatarularii(String datarularii) {
		this.datarularii = datarularii;
	}
	
	

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}


	public ArrayList<Person> getPeople() {
		return people;
	}

	public void setPeople(Person p) {
		if (this.people == null) this.people=new ArrayList<Person>();
		this.people.add(p);
	}



	public String toString(){
		return this.name + "\n" + this.datarularii + ", " + this.sala + "\n" + this.people;
	}
	
	
	
	
}

