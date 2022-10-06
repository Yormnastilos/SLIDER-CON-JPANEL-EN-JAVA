package paneles;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelesDinamicos extends JFrame implements ActionListener{
public static void main(String[] args) {
	Runnable runable=new Runnable() {
		public void run() {
			new PanelesDinamicos();
		}
	};
	EventQueue.invokeLater(runable);
}
	public PanelesDinamicos() {
		
		this.setDefaultCloseOperation(3);
		this.setVisible(true);
		this.setBounds(0, 0, 700, 500);
		this.setLocationRelativeTo(null);
		
		JPanel botones=new JPanel();
		
		JButton anterior=new JButton("Anterior");
		JButton siguiente=new JButton("Siguiente");
		
		anterior.addActionListener(this);
		siguiente.addActionListener(this);
		
		botones.add(anterior);
		botones.add(siguiente);
		
		
		add(botones,BorderLayout.NORTH);
		
		
	}

@Override
public void actionPerformed(ActionEvent e) {
	
	
}
private JPanel paneles;
}
