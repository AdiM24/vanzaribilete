package org.teatru;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;


public class Vanzarile {

	private JFrame frame;
	private JTextField numeteatru;
	private JTextField numeperson;
	private JTextField prenumeperson;
	private JTextField nr;
	private JTextField nume;
	private JTextField datarularii;
	private JTextField loc;
	private JTextField piessa;
	private JTextField sali;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vanzarile window = new Vanzarile();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Vanzarile() {
		initialize();
	}
	
	public void afisare(Teatru t, JTextArea textArea){
		int i=0;
		textArea.setText(t.getName());
		
		for(PiesaDeTeatru piesa : t.getPiesateatru()){
			textArea.append("\nNume: " + piesa.getName().toString() + ", Data rularii: "+ piesa.getDatarularii().toString() + ", " + piesa.getSala().toString() + "\n");
			
			if(piesa.getPeople() != null)
			   
				for(Person people : piesa.getPeople()){
					textArea.append(people.toString() + ",");
				    i++;
				    
				    if(i==5){
				    	textArea.append("\n");
					    i=0;
				}
			}
		}
	}
	
	public int cauta(int nr,PiesaDeTeatru piesa){
		if(piesa.getPeople() != null)
			if(nr>0 && nr<=piesa.getSala().getNrlocuri()){
				
				for(Person people : piesa.getPeople())
					
					if(nr==people.getNrlocsala())
						
					    return 1;
			}else return 1;
		return 0;
	}
	
	public int cauta(String nume,String surname,int nr,String p1,Teatru t,JTextArea textArea){
		if(t.getPiesateatru() != null)
			
			for(PiesaDeTeatru piesa : t.getPiesateatru())
			
				if(p1.equals(piesa.getName())){
					
					if(cauta(nr,piesa)==0){
											
					    Person people = new Person();
				        people.setName(nume);
				        people.setSurname(surname);
				        people.setNrlocsala(nr);
				        piesa.setPeople(people);
				    
				        return 1;
			        } else return 2;
				}
		return 0;
	}
	
	public int cauta(String name,Teatru t){
		if(t.getPiesateatru() != null)
		for(PiesaDeTeatru piesa : t.getPiesateatru()){
			if(name.equals(piesa.getName()))
				return 1;
		}
		return 0;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame("Vanzari Bilete");
		frame.setBounds(200, 200, 700, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(211, 211, 211));
		panel.setLayout(null);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		numeteatru = new JTextField();
		numeteatru.setBounds(177, 25, 172, 20);
		panel.add(numeteatru);
		numeteatru.setColumns(10);
		
		final Teatru teatru = new Teatru();
		
		numeperson = new JTextField();
		numeperson.setBounds(125, 78, 108, 20);
		panel.add(numeperson);
		numeperson.setColumns(10);
		
		prenumeperson = new JTextField();
		prenumeperson.setBounds(125, 109, 108, 20);
		panel.add(prenumeperson);
		prenumeperson.setColumns(10);
		
		nr = new JTextField();
		nr.setBounds(125, 146, 108, 20);
		panel.add(nr);
		nr.setColumns(10);
		
		nume = new JTextField();
		nume.setBounds(402, 78, 108, 20);
		panel.add(nume);
		nume.setColumns(10);
		
		datarularii = new JTextField();
		datarularii.setBounds(402, 109, 108, 20);
		panel.add(datarularii);
		datarularii.setColumns(10);
		
		loc = new JTextField();
		loc.setBounds(402, 177, 108, 20);
		panel.add(loc);
		loc.setColumns(10);
		
		piessa = new JTextField();
		piessa.setBounds(125, 177, 108, 20);
		panel.add(piessa);
		piessa.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nume :");
		lblNewLabel.setBounds(30, 77, 46, 22);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Prenume :");
		lblNewLabel_1.setBounds(30, 109, 59, 20);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Numar loc :");
		lblNewLabel_2.setBounds(30, 146, 72, 20);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nume piesa :");
		lblNewLabel_3.setBounds(29, 179, 86, 17);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nume piesa :");
		lblNewLabel_4.setBounds(306, 81, 86, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Data rulari :");
		lblNewLabel_5.setBounds(306, 112, 72, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Locuri :");
		lblNewLabel_6.setBounds(306, 180, 46, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Sala :");
		lblNewLabel_7.setBounds(306, 149, 46, 14);
		panel.add(lblNewLabel_7);
		
		sali = new JTextField();
		sali.setBounds(402, 146, 108, 20);
		panel.add(sali);
		sali.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Nume teatru :");
		lblNewLabel_8.setBounds(87, 26, 80, 19);
		panel.add(lblNewLabel_8);
		
		final JTextArea textArea = new JTextArea();
		textArea.setBounds(30, 251, 605, 180);
		textArea.setVisible(true);
		panel.add(textArea);
		
		JButton btnNewButton = new JButton("Nume Teatru");
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			
				if(!numeteatru.getText().equals("")){
				
					teatru.setName(numeteatru.getText());
				    afisare(teatru, textArea);
				    numeteatru.setText(null);
				    }
				else{
					JOptionPane.showMessageDialog(frame,
							"Inserati numele.",
					        "Warning !",
					        JOptionPane.WARNING_MESSAGE);
				    }
			}
		});
		btnNewButton.setBounds(402, 24, 108, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Persoana");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(!numeperson.getText().equals("") && !prenumeperson.getText().equals("") && !nr.getText().equals("") && !piessa.getText().equals("")){
				
					if(cauta(numeperson.getText(),prenumeperson.getText(),Integer.parseInt(nr.getText()),piessa.getText(),teatru, textArea)==1){
												
						numeperson.setText(null);
					    prenumeperson.setText(null);
					    nr.setText(null);
					    piessa.setText(null);
					    afisare(teatru, textArea);
					}
					else{
						if(cauta(numeperson.getText(),prenumeperson.getText(),Integer.parseInt(nr.getText()),piessa.getText(),teatru, textArea)==2){
							JOptionPane.showMessageDialog(frame,
									"Schimbati numarul locului.",
							        "Warning !",
							        JOptionPane.WARNING_MESSAGE);
						}
						else{
						JOptionPane.showMessageDialog(frame,
								"Piesa nu a fost gasita.",
						        "Warning !",
						        JOptionPane.WARNING_MESSAGE);
					}}}
				else{
					JOptionPane.showMessageDialog(frame,
					    "Completati cele 4 campuri.",
					    "Warning !",
					    JOptionPane.WARNING_MESSAGE);
				}
			}
		});	
		btnNewButton_1.setBounds(125, 208, 108, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Piesa Teatru");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!nume.getText().equals("") && !datarularii.getText().equals("") && !sali.getText().equals("") && !loc.getText().equals("")){
					
					if(cauta(nume.getText(),teatru)==0){
						
						PiesaDeTeatru piesa = new PiesaDeTeatru();
					    Sala sala = new Sala();
					    teatru.setPiesateatru(piesa);
					    teatru.setSala(sala);
					    piesa.setName(nume.getText());
					    piesa.setDatarularii(datarularii.getText());
					    piesa.setSala(sala);
					    sala.setName(sali.getText());
					    sala.setNrlocuri(Integer.parseInt(loc.getText()));
					    afisare(teatru, textArea);
					
					    nume.setText(null);
					    datarularii.setText(null);
					    sali.setText(null);
					    loc.setText(null);
					}
					else{
						JOptionPane.showMessageDialog(frame,
							    "Aceasta piesa exista introduceti alta.",
							    "Avertisment !",
							    JOptionPane.WARNING_MESSAGE);
					}
				}
				else{
					JOptionPane.showMessageDialog(frame,
					    "Completati toate 4 campurile.",
					    "Avertisment !",
					    JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnNewButton_2.setBounds(402, 208, 108, 23);
		panel.add(btnNewButton_2);
	}
}