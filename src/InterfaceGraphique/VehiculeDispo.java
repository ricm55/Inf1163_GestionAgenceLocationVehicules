package InterfaceGraphique;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class VehiculeDispo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txtVehiculeDisponible;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VehiculeDispo frame = new VehiculeDispo();
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
	public VehiculeDispo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 875, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel Left = new JPanel();
		Left.setBackground(new Color(255, 140, 0));
		contentPane.add(Left, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("Location");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		
		JButton btnNewButton = new JButton("Location");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnNewButton.setBackground(Color.DARK_GRAY);
		
		JButton btnBackToHome = new JButton("Retour");
		btnBackToHome.setForeground(Color.WHITE);
		btnBackToHome.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnBackToHome.setBackground(Color.DARK_GRAY);
		GroupLayout gl_Left = new GroupLayout(Left);
		gl_Left.setHorizontalGroup(
			gl_Left.createParallelGroup(Alignment.LEADING)
				.addGap(0, 137, Short.MAX_VALUE)
				.addGroup(gl_Left.createSequentialGroup()
					.addGroup(gl_Left.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Left.createSequentialGroup()
							.addGap(5)
							.addGroup(gl_Left.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
								.addComponent(btnNewButton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)))
						.addGroup(gl_Left.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnBackToHome, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_Left.setVerticalGroup(
			gl_Left.createParallelGroup(Alignment.LEADING)
				.addGap(0, 402, Short.MAX_VALUE)
				.addGroup(gl_Left.createSequentialGroup()
					.addGap(83)
					.addComponent(btnNewButton)
					.addGap(18)
					.addComponent(btnNewButton_1)
					.addGap(191)
					.addComponent(btnBackToHome, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(23))
		);
		Left.setLayout(gl_Left);
		
		JPanel Mid = new JPanel();
		Mid.setLayout(null);
		Mid.setBackground(SystemColor.textHighlight);
		contentPane.add(Mid, BorderLayout.CENTER);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(486, 72, 184, 27);
		Mid.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText("Entrer le num\u00E9ro de t\u00E9l\u00E9phone");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setForeground(Color.WHITE);
		textField_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(Color.DARK_GRAY);
		textField_1.setBounds(357, 21, 313, 27);
		Mid.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("Nom");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setForeground(Color.WHITE);
		textField_2.setFont(new Font("Verdana", Font.PLAIN, 16));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBackground(Color.DARK_GRAY);
		textField_2.setBounds(131, 106, 313, 27);
		Mid.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("Continuer avec ce client ?");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setForeground(Color.DARK_GRAY);
		textField_3.setFont(new Font("Verdana", Font.PLAIN, 16));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(131, 144, 313, 27);
		Mid.add(textField_3);
		
		JButton btnOui = new JButton("Oui");
		btnOui.setForeground(Color.WHITE);
		btnOui.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnOui.setEnabled(false);
		btnOui.setBackground(new Color(60, 179, 113));
		btnOui.setBounds(131, 182, 122, 29);
		Mid.add(btnOui);
		
		JButton btnNon = new JButton("Non");
		btnNon.setForeground(Color.WHITE);
		btnNon.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnNon.setEnabled(false);
		btnNon.setBackground(new Color(165, 42, 42));
		btnNon.setBounds(322, 182, 122, 29);
		Mid.add(btnNon);
		
		JButton btnEnvoyer = new JButton("Envoyer");
		btnEnvoyer.setForeground(Color.WHITE);
		btnEnvoyer.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnEnvoyer.setBackground(new Color(60, 179, 113));
		btnEnvoyer.setBounds(377, 68, 99, 29);
		Mid.add(btnEnvoyer);
		
		txtVehiculeDisponible = new JTextField();
		txtVehiculeDisponible.setText("Vehicule Disponible");
		txtVehiculeDisponible.setHorizontalAlignment(SwingConstants.CENTER);
		txtVehiculeDisponible.setForeground(Color.WHITE);
		txtVehiculeDisponible.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtVehiculeDisponible.setEditable(false);
		txtVehiculeDisponible.setColumns(10);
		txtVehiculeDisponible.setBackground(new Color(25, 25, 112));
		contentPane.add(txtVehiculeDisponible, BorderLayout.NORTH);
	}
}
