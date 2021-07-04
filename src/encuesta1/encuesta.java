package encuesta1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.*;
import java.awt.*;

public class encuesta extends JFrame implements ActionListener{

	private JPanel contentPane;
	JLabel valor;
	ButtonGroup grupo;
	JRadioButton win;
	JRadioButton lin;
	JRadioButton mac;
	JCheckBox dg;
	JCheckBox prog;
	JCheckBox adm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					encuesta frame = new encuesta();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public encuesta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 318, 614);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JSeparator separator = new JSeparator();
		separator.setBounds(36, 171, 226, 2);
		contentPane.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(36, 359, 226, 2);
		contentPane.add(separator_1);

		JLabel lblNewLabel = new JLabel("Elige un sistema operativo:");
		lblNewLabel.setForeground(new Color(0, 153, 255));
		lblNewLabel.setFont(new Font("Calibri Light", Font.BOLD, 14));
		lblNewLabel.setBounds(36, 27, 226, 14);
		contentPane.add(lblNewLabel);

		win = new JRadioButton("Windows");
		win.setBounds(44, 75, 131, 23);
		contentPane.add(win);

		lin = new JRadioButton("Linux");
		lin.setBounds(44, 101, 131, 23);
		contentPane.add(lin);

		mac = new JRadioButton("Mac");
		mac.setBounds(44, 127, 131, 23);
		contentPane.add(mac);

		grupo = new ButtonGroup();
		grupo.add(win);
		grupo.add(lin);
		grupo.add(mac);

		JLabel lblEligeTuEspecialidad = new JLabel("Elige tu especialidad:");
		lblEligeTuEspecialidad.setForeground(new Color(0, 153, 255));
		lblEligeTuEspecialidad.setFont(new Font("Calibri Light", Font.BOLD, 14));
		lblEligeTuEspecialidad.setBounds(36, 201, 226, 14);
		contentPane.add(lblEligeTuEspecialidad);

		JLabel lblNewLabel_2 = new JLabel("Horas que te dedicas a trabajar:");
		lblNewLabel_2.setForeground(new Color(0, 153, 255));
		lblNewLabel_2.setFont(new Font("Calibri Light", Font.BOLD, 14));
		lblNewLabel_2.setBounds(36, 393, 226, 14);
		contentPane.add(lblNewLabel_2);

		dg = new JCheckBox("Dise\u00F1o Gr\u00E1fico");
		dg.setBounds(44, 275, 118, 23);
		contentPane.add(dg);

		prog = new JCheckBox("Programaci\u00F3n");
		prog.setBounds(44, 249, 118, 23);
		contentPane.add(prog);

		adm = new JCheckBox("Administraci\u00F3n");
		adm.setBounds(44, 301, 118, 23);
		contentPane.add(adm);

		JSlider slider = new JSlider();
		slider.setValue(5);
		slider.setMaximum(10);
		slider.setBounds(36, 470, 200, 19);
		contentPane.add(slider);

		valor = new JLabel("");
		valor.setBounds(36, 489, 49, 14);
		contentPane.add(valor);

		JButton guardar = new JButton("Guardar");
		guardar.setBounds(100, 525, 89, 23);
		contentPane.add(guardar);

		guardar.addActionListener(this);

		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				valor.setText(Integer.toString(slider.getValue()));
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String sis;
		if(win.isSelected()) {
			sis = win.getText();
		}else if(lin.isSelected()) {
			sis = lin.getText();
		}else if(mac.isSelected()) {
			sis = mac.getText();
		}else {
			sis = "Ninguno";
		}
		
		String eprog="";
		String edg="";
		String eadm="";
		String esp = "";

		if(prog.isSelected()) {
			eprog = prog.getText();
		}if(dg.isSelected()) {
			edg = dg.getText();
		}if(mac.isSelected()) {
			eadm = adm.getText();
		}
		
		String horas = valor.getText();
		
			JOptionPane.showMessageDialog(null, ("Tu sistema preferido es: "+sis+"\n Tus especialidades son: "+eprog+" "+edg+" "+" "+eadm+"\n Tus horas de trabajo son: "+horas));;
	}
}
