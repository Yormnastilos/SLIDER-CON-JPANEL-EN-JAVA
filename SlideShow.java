package paneles;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SlideShow extends JFrame implements ActionListener {
	public static void main(String[] args) {
		Runnable runable = new Runnable() {
			public void run() {
				new SlideShow();
			}
		};
		EventQueue.invokeLater(runable);
	}

	public SlideShow() {

		a = new JPanel();
		b = new JPanel();
		c = new JPanel();
		d = new JPanel();
		f = new JPanel();
		h = new JPanel();

		a.setLayout(null);
		b.setLayout(null);
		c.setLayout(null);
		d.setLayout(null);
		f.setLayout(null);
		h.setLayout(null);

		paneles[0] = a;
		paneles[1] = b;
		paneles[2] = c;
		paneles[3] = d;
		paneles[4] = f;
		paneles[5] = h;

		setLayout(null);
		setLocationRelativeTo(null);

		setBounds(0, 0, 1000, 750);
		setVisible(true);
		setDefaultCloseOperation(3);

		anterior = new JButton("Anterior");
		siguiente = new JButton("Siguiente");

		anterior.setBounds(150, 10, 200, 50);
		siguiente.setBounds(350, 10, 200, 50);

		anterior.addActionListener(this);
		siguiente.addActionListener(this);

		add(anterior);
		add(siguiente);
		la();

	}

	private void la() {

		a.setBounds(0, 100, getWidth(), getHeight());
		a.setBackground(Color.black);

		add(a);

		b.setBounds(0, 100, getWidth(), getHeight());
		b.setBackground(Color.red);
		add(b);

		c.setBounds(0, 100, getWidth(), getHeight());
		c.setBackground(Color.blue);
		add(c);

		d.setBounds(0, 100, getWidth(), getHeight());
		d.setBackground(Color.gray);
		add(d);

		f.setBounds(0, 100, getWidth(), getHeight());
		f.setBackground(Color.DARK_GRAY);
		add(f);

		h.setBounds(0, 100, getWidth(), getHeight());
		h.setBackground(Color.yellow);
		add(h);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == anterior) {
			if (l > 0) {
				l--;
				Switch(paneles[l]);

				if (l == 0) {
					anterior.setEnabled(false);
				} else if (!siguiente.isEnabled() && l < paneles.length) {
					siguiente.setEnabled(true);
				}
			}
		}
//////////////////////////////////////////////////
		if (e.getSource() == siguiente) {

			if (l < paneles.length) {
				l++;
				Switch(paneles[l]);
				if (l == paneles.length - 1) {

					siguiente.setEnabled(false);
				} else if (!anterior.isEnabled() && l > 0) {
					anterior.setEnabled(true);
				}
			}
		}
	}

	private void Switch(JPanel p) {

		for (int i = 0; i < paneles.length; i++) {
			if (paneles[i] == p) {
				paneles[k].setVisible(false);
				p.setVisible(true);
				p.setBounds(0, 100, getWidth(), getHeight());
				k = i;
			} else {
				paneles[i].setVisible(false);
				paneles[i].setBounds(getWidth() - (getWidth() * 2), 100, getWidth(), getHeight());

			}
		}
	}

	private static int k = 0;
	private JPanel paneles[] = new JPanel[6];

	private static int l = 0;
	private JPanel a, b, c, d, f, h;
	private JButton anterior, siguiente;

}
