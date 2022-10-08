package graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PresentacionLaminas extends JFrame implements ActionListener{
private JButton cargar;
private JPanel superior;
	public static void main(String[] args) {
		Runnable runable=new Runnable() {
			public void run() {
				new PresentacionLaminas();
			}
		};
		EventQueue.invokeLater(runable);
		
	}
	public PresentacionLaminas() {
		
		this.setDefaultCloseOperation(3);
		this.setVisible(true);
		this.setBounds(0, 0, 700, 500);
		
		 anterior=new JButton("Anterior");
		anterior.addActionListener(this);
		
		 siguiente=new JButton("Siguiente");
		siguiente.addActionListener(this);
		
		cargar=new JButton("Cargar");
		cargar.addActionListener(this);
	
	 superior=new JPanel();
		
		
		add(superior,BorderLayout.NORTH);
		Central();
		
		
		
		actualizar();
		
	
		
	}
private void Central() {
	 centro=new JPanel();
	 
	 centro.setLayout(new GridLayout(1,10));
	
	superior.add(anterior);
	superior.add(siguiente);
	superior.add(cargar);
	add(centro,BorderLayout.CENTER);
}
private JPanel Panel() {
	JPanel panel=new JPanel();
	
	int rojo=(int)(Math.random()*255);
	int verde=(int)(Math.random()*255);
	int azul=(int)(Math.random()*255);
	
	BoxLayout caja=new BoxLayout(panel,BoxLayout.X_AXIS);
	
	panel.setLayout(caja);
	
	 color=new Color(rojo,verde,azul);
	
	panel.setBackground(color);
	
	
	panel.setAlignmentY(Component.LEFT_ALIGNMENT);
	
	
return panel;
	
}
private void actualizar() {
	for(int i=0;i<l;i++) {

	
	JPanel contenedor=Panel();
	//contenedor.setOpaque(false);
	//contenedor.setBackground(Color.red);

	JButton boton=new JButton("boton");
	
	boton.setPreferredSize(new Dimension(150,50));
	
	boton.setAlignmentY(Component.BOTTOM_ALIGNMENT);
	
	contenedor.add(boton);
	
	centro.add(contenedor);
	
	con[i]=contenedor;
	//contenedor.setVisible(false);
	if(i==l)l--;
}
}
@Override
public void actionPerformed(ActionEvent e) {
	
	if(e.getSource()==anterior) {
		if(contador>0) {
			
			//con[contador].setVisible(false);
			con[contador-1].setVisible(true);
				contador--;
		}
		
	}else if(e.getSource()==siguiente) {
		if(contador<con.length-1) {
			con[contador+1].setVisible(true);
			con[contador].setVisible(false);
			contador++;
			
		}
		
	}else if(e.getSource()==cargar) {
		centro=null;
		Central();
		actualizar();
		centro.updateUI();
		contador=0;
	}
}
private Color color;
private JPanel centro;
private int l=10;
private int inicio=10;
private int contador=0;
private JButton anterior,siguiente;
private Container con[]=new Container[inicio];
}
