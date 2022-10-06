package paneles;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CambiarLaminas extends JFrame implements ActionListener{
	public static void main(String[] args) {
		Runnable runable=new Runnable() {
			public void run() {
				new CambiarLaminas();
			}
		};
		EventQueue.invokeLater(runable);
	}
	public CambiarLaminas() {
		this.setDefaultCloseOperation(3);
		this.setVisible(true);
		this.setLayout(null);
		this.setBounds(0, 0, 750, 500);
		this.setLocationRelativeTo(null);
		
		c=new JButton("Lamina 2");
		d=new JButton("Lamina 1");
		
		c.addActionListener(this);
		d.addActionListener(this);
		
		c.setBounds(5, 5, 150, 35);
		d.setBounds(200, 5, 150, 35);
		add(c);
		add(d);
		
		LaminaUno();
		LaminaDos();
		Lamina1.setBounds(10,  50, getWidth()-20, this.getHeight() );
		Lamina2.setBounds(10,  50, getWidth()-20, this.getHeight() );
		add(Lamina1);
		add(Lamina2);
		
	}

private void LaminaDos() {
	Lamina2=new JPanel();
	Lamina2.setLayout(null);
	//Lamina2.setBackground(Color.black);
	Lamina2.setVisible(true);
	b=new JButton("Lamina dos");
	Lamina2.setBackground(Color.red);
	Lamina2.add(b);
	b.setBounds(100, 0, 150, 35);
	
	
	}
private void LaminaUno() {
	Lamina1=new JPanel();
	Lamina1.setLayout(null);
	Lamina1.setVisible(false);
	a=new JButton("Lamina Uno");
	a.setBounds(200, 0, 150, 35);
	Lamina1.setBackground(Color.black);
	
	Lamina1.add(a);
	}

private JButton b,a,c,d;
private JPanel Lamina1,Lamina2;
@Override
public void actionPerformed(ActionEvent e) {
	
	if(e.getSource()==c) {
		Lamina1.setVisible(true);
		Lamina2.setVisible(false);
	}else if(e.getSource()==d) {
		Lamina1.setVisible(false);
		Lamina2.setVisible(true);
	}
}
}







