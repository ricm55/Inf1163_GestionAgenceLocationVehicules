package InterfaceGraphique;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.SystemColor;

public class VehiculeDisponible extends JFrame {

	private JFrame frame;
	private JTextField txtVehiculeDisponibleA;
	private JTextField txtClasse;
	private JTextField txtVehiculeSlectionn;
	private JTextField vehiculeChoisi;
	private JTextField txtAssuarance;
	private JTextField assuranceCompagnie;
	private JTextField assuranceClient;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VehiculeDisponible window = new VehiculeDisponible();
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
	public VehiculeDisponible() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 853, 487);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		txtVehiculeDisponibleA = new JTextField();
		txtVehiculeDisponibleA.setForeground(new Color(255, 255, 255));
		txtVehiculeDisponibleA.setBackground(new Color(25, 25, 112));
		txtVehiculeDisponibleA.setText("Vehicule disponible a la location");
		txtVehiculeDisponibleA.setHorizontalAlignment(SwingConstants.CENTER);
		txtVehiculeDisponibleA.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtVehiculeDisponibleA.setEditable(false);
		txtVehiculeDisponibleA.setColumns(10);
		frame.getContentPane().add(txtVehiculeDisponibleA, BorderLayout.NORTH);
		
		JPanel Left = new JPanel();
		Left.setBackground(new Color(255, 140, 0));
		frame.getContentPane().add(Left, BorderLayout.WEST);
		
		JButton inventaireBouton = new JButton("Inventaire");
		inventaireBouton.setForeground(Color.WHITE);
		inventaireBouton.setFont(new Font("Verdana", Font.PLAIN, 16));
		inventaireBouton.setBackground(Color.DARK_GRAY);
		
		JButton LocationBouton = new JButton("Location");
		LocationBouton.setForeground(Color.WHITE);
		LocationBouton.setFont(new Font("Verdana", Font.PLAIN, 16));
		LocationBouton.setBackground(Color.DARK_GRAY);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.setForeground(Color.WHITE);
		btnRetour.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnRetour.setBackground(Color.DARK_GRAY);
		GroupLayout gl_Left = new GroupLayout(Left);
		gl_Left.setHorizontalGroup(
			gl_Left.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Left.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_Left.createParallelGroup(Alignment.LEADING)
						.addComponent(btnRetour, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
						.addComponent(inventaireBouton, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
						.addComponent(LocationBouton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_Left.setVerticalGroup(
			gl_Left.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Left.createSequentialGroup()
					.addGap(83)
					.addComponent(LocationBouton)
					.addGap(18)
					.addComponent(inventaireBouton)
					.addPreferredGap(ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
					.addComponent(btnRetour)
					.addContainerGap())
		);
		Left.setLayout(gl_Left);
		
		JPanel Mid = new JPanel();
		Mid.setLayout(null);
		Mid.setBackground(SystemColor.textHighlight);
		frame.getContentPane().add(Mid, BorderLayout.CENTER);
		
		txtClasse = new JTextField();
		txtClasse.setText("Classe ");
		txtClasse.setHorizontalAlignment(SwingConstants.CENTER);
		txtClasse.setForeground(Color.WHITE);
		txtClasse.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtClasse.setEditable(false);
		txtClasse.setColumns(10);
		txtClasse.setBackground(Color.DARK_GRAY);
		txtClasse.setBounds(10, 42, 248, 27);
		Mid.add(txtClasse);
		
		txtVehiculeSlectionn = new JTextField();
		txtVehiculeSlectionn.setText("Vehicule s\u00E9lectionn\u00E9");
		txtVehiculeSlectionn.setHorizontalAlignment(SwingConstants.CENTER);
		txtVehiculeSlectionn.setForeground(Color.WHITE);
		txtVehiculeSlectionn.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtVehiculeSlectionn.setEditable(false);
		txtVehiculeSlectionn.setColumns(10);
		txtVehiculeSlectionn.setBackground(Color.DARK_GRAY);
		txtVehiculeSlectionn.setBounds(288, 42, 199, 27);
		Mid.add(txtVehiculeSlectionn);
		
		vehiculeChoisi = new JTextField();
		vehiculeChoisi.setText("VehiculeChoisi");
		vehiculeChoisi.setHorizontalAlignment(SwingConstants.CENTER);
		vehiculeChoisi.setForeground(Color.DARK_GRAY);
		vehiculeChoisi.setFont(new Font("Verdana", Font.PLAIN, 16));
		vehiculeChoisi.setEditable(false);
		vehiculeChoisi.setColumns(10);
		vehiculeChoisi.setBackground(Color.WHITE);
		vehiculeChoisi.setBounds(288, 80, 294, 62);
		Mid.add(vehiculeChoisi);
		
		JButton btnNon = new JButton("Confirmer");
		btnNon.setForeground(Color.DARK_GRAY);
		btnNon.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnNon.setBackground(Color.ORANGE);
		btnNon.setBounds(539, 366, 122, 29);
		Mid.add(btnNon);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 80, 239, 214);
		Mid.add(scrollPane);
		
		txtAssuarance = new JTextField();
		txtAssuarance.setText("Assurance");
		txtAssuarance.setHorizontalAlignment(SwingConstants.CENTER);
		txtAssuarance.setForeground(Color.WHITE);
		txtAssuarance.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtAssuarance.setEditable(false);
		txtAssuarance.setColumns(10);
		txtAssuarance.setBackground(Color.DARK_GRAY);
		txtAssuarance.setBounds(288, 188, 199, 27);
		Mid.add(txtAssuarance);
		
		assuranceCompagnie = new JTextField();
		assuranceCompagnie.setText("Assurance de la compagnie");
		assuranceCompagnie.setHorizontalAlignment(SwingConstants.CENTER);
		assuranceCompagnie.setForeground(Color.DARK_GRAY);
		assuranceCompagnie.setFont(new Font("Verdana", Font.PLAIN, 16));
		assuranceCompagnie.setEditable(false);
		assuranceCompagnie.setColumns(10);
		assuranceCompagnie.setBackground(Color.WHITE);
		assuranceCompagnie.setBounds(288, 252, 261, 27);
		Mid.add(assuranceCompagnie);
		
		assuranceClient = new JTextField();
		assuranceClient.setText("Assurance du client");
		assuranceClient.setHorizontalAlignment(SwingConstants.CENTER);
		assuranceClient.setForeground(Color.DARK_GRAY);
		assuranceClient.setFont(new Font("Verdana", Font.PLAIN, 16));
		assuranceClient.setEditable(false);
		assuranceClient.setColumns(10);
		assuranceClient.setBackground(Color.WHITE);
		assuranceClient.setBounds(288, 301, 261, 27);
		Mid.add(assuranceClient);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBounds(555, 255, 21, 20);
		Mid.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("");
		chckbxNewCheckBox_1.setBounds(555, 305, 21, 20);
		Mid.add(chckbxNewCheckBox_1);
	}
}
