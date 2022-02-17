package Usos;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

	static JTextField jtxt = new JTextField();

	public static void main(String[] args) {

		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("GridBag Layout ITACA");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		listener list = new listener();

		JButton cero = new JButton("0");
		JButton uno = new JButton("1");
		JButton dos = new JButton("2");
		JButton tres = new JButton("3");
		JButton cuatro = new JButton("4");
		JButton cinco = new JButton("5");
		JButton seis = new JButton("6");
		JButton siete = new JButton("7");
		JButton ocho = new JButton("8");
		JButton nueve = new JButton("9");

		JButton botonC = new JButton("C");
		JButton botonPunto = new JButton(".");
		JButton botonMasMenos = new JButton("+/-");
		JButton botonEnter = new JButton("->");
		JButton botonMultiplicar = new JButton("x");
		JButton botonDividir = new JButton("%");
		JButton botonRestar = new JButton("-");
		JButton botonSumar = new JButton("+");
		JButton botonResultado = new JButton("=");
		
		cero.addActionListener(list);
		uno.addActionListener(list);
		dos.addActionListener(list);
		tres.addActionListener(list);
		cuatro.addActionListener(list);
		cinco.addActionListener(list);
		seis.addActionListener(list);
		siete.addActionListener(list);
		ocho.addActionListener(list);
		nueve.addActionListener(list);
		
		botonC.addActionListener(list);
		botonPunto.addActionListener(list);
		botonMasMenos.addActionListener(list);
		botonEnter.addActionListener(list);
		botonMultiplicar.addActionListener(list);
		botonDividir.addActionListener(list);
		botonRestar.addActionListener(list);
		botonSumar.addActionListener(list);
		botonResultado.addActionListener(list);
		
		jtxt.setHorizontalAlignment(SwingConstants.CENTER);

		JPanel panel = new JPanel();
		GridBagLayout layout = new GridBagLayout();
		panel.setLayout(layout);

		GridBagConstraints gbc0 = new GridBagConstraints();
		gbc0.fill = GridBagConstraints.HORIZONTAL;
		gbc0.gridx = 0;
		gbc0.gridy = 0;
		gbc0.gridwidth = 5;
		panel.add(jtxt, gbc0);

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 1;
		panel.add(siete, gbc);

		GridBagConstraints gbc2 = new GridBagConstraints();
		gbc2.fill = GridBagConstraints.HORIZONTAL;
		gbc2.gridx = 1;
		gbc2.gridy = 1;
		panel.add(ocho, gbc2);

		GridBagConstraints gbc3 = new GridBagConstraints();
		gbc3.fill = GridBagConstraints.HORIZONTAL;
		gbc3.gridx = 2;
		gbc3.gridy = 1;
		panel.add(nueve, gbc3);

		GridBagConstraints gbc4 = new GridBagConstraints();
		gbc4.fill = GridBagConstraints.HORIZONTAL;
		gbc4.gridx = 3;
		gbc4.gridy = 1;
		panel.add(botonMasMenos, gbc4);

		GridBagConstraints gbc5 = new GridBagConstraints();
		gbc5.fill = GridBagConstraints.HORIZONTAL;
		gbc5.gridx = 4;
		gbc5.gridy = 1;
		panel.add(botonEnter, gbc5);

		GridBagConstraints gbc6 = new GridBagConstraints();
		gbc6.fill = GridBagConstraints.HORIZONTAL;
		gbc6.gridx = 0;
		gbc6.gridy = 2;
		panel.add(cuatro, gbc6);

		GridBagConstraints gbc7 = new GridBagConstraints();
		gbc7.fill = GridBagConstraints.HORIZONTAL;
		gbc7.gridx = 1;
		gbc7.gridy = 2;
		panel.add(cinco, gbc7);

		GridBagConstraints gbc8 = new GridBagConstraints();
		gbc8.fill = GridBagConstraints.HORIZONTAL;
		gbc8.gridx = 2;
		gbc8.gridy = 2;
		panel.add(seis, gbc8);

		GridBagConstraints gbc9 = new GridBagConstraints();
		gbc9.fill = GridBagConstraints.HORIZONTAL;
		gbc9.gridx = 3;
		gbc9.gridy = 2;
		panel.add(botonMultiplicar, gbc9);

		GridBagConstraints gbc10 = new GridBagConstraints();
		gbc10.fill = GridBagConstraints.HORIZONTAL;
		gbc10.gridx = 4;
		gbc10.gridy = 2;
		panel.add(botonDividir, gbc10);
		
		GridBagConstraints gbc11 = new GridBagConstraints();
		gbc11.fill = GridBagConstraints.HORIZONTAL;
		gbc11.gridx = 0;
		gbc11.gridy = 3;
		panel.add(uno, gbc11);

		GridBagConstraints gbc12 = new GridBagConstraints();
		gbc12.fill = GridBagConstraints.HORIZONTAL;
		gbc12.gridx = 1;
		gbc12.gridy = 3;
		panel.add(dos, gbc12);

		GridBagConstraints gbc13 = new GridBagConstraints();
		gbc13.fill = GridBagConstraints.HORIZONTAL;
		gbc13.gridx = 2;
		gbc13.gridy = 3;
		panel.add(tres, gbc13);

		GridBagConstraints gbc14 = new GridBagConstraints();
		gbc14.fill = GridBagConstraints.HORIZONTAL;
		gbc14.gridx = 3;
		gbc14.gridy = 3;
		panel.add(botonRestar, gbc14);

		GridBagConstraints gbc15 = new GridBagConstraints();
		gbc15.fill = GridBagConstraints.HORIZONTAL;
		gbc15.gridx = 0;
		gbc15.gridy = 4;
		panel.add(botonC, gbc15);

		GridBagConstraints gbc16 = new GridBagConstraints();
		gbc16.fill = GridBagConstraints.HORIZONTAL;
		gbc16.gridx = 1;
		gbc16.gridy = 4;
		panel.add(cero, gbc16);

		GridBagConstraints gbc17 = new GridBagConstraints();
		gbc17.fill = GridBagConstraints.HORIZONTAL;
		gbc17.gridx = 2;
		gbc17.gridy = 4;
		panel.add(botonPunto, gbc17);

		GridBagConstraints gbc18 = new GridBagConstraints();
		gbc18.fill = GridBagConstraints.HORIZONTAL;
		gbc18.gridx = 3;
		gbc18.gridy = 4;
		panel.add(botonSumar, gbc18);

		GridBagConstraints gbc19 = new GridBagConstraints();
		gbc19.fill = GridBagConstraints.VERTICAL;
		gbc19.gridx = 4;
		gbc19.gridy = 3;
		gbc19.gridheight = 2;
		panel.add(botonResultado, gbc19);
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);

	}

	public static class listener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton origen = (JButton) e.getSource();
		System.out.println("Has pulsado el boton: " + origen.getText());
		String cambiarString = origen.getText();
		jtxt.setText(cambiarString);
		
		
	}

}

}
