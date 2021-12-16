package InterfaceGraphique;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.w3c.dom.events.UIEvent;

import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import javax.swing.JLayeredPane;
import javax.swing.JInternalFrame;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import background.ClasseDeVehicule;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;

public class VehiculeDispo extends JFrame {

	private JPanel contentPane;
	private JTextField txtClasse;
	private JTextField txtVehiculeDisponible;
	private static VehiculeDispo frame;
	private JTextField txtModele;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void launch() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new VehiculeDispo();
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
		Left.setBackground(new Color(255, 165, 0));
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
		
		txtClasse = new JTextField();
		txtClasse.setText("Classe");
		txtClasse.setHorizontalAlignment(SwingConstants.CENTER);
		txtClasse.setForeground(Color.WHITE);
		txtClasse.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtClasse.setEditable(false);
		txtClasse.setColumns(10);
		txtClasse.setBackground(Color.DARK_GRAY);
		txtClasse.setBounds(38, 56, 107, 27);
		Mid.add(txtClasse);
		
		JButton btnEnvoyer = new JButton("Envoyer");
		btnEnvoyer.setForeground(Color.WHITE);
		btnEnvoyer.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnEnvoyer.setBackground(new Color(60, 179, 113));
		btnEnvoyer.setBounds(517, 362, 173, 29);
		Mid.add(btnEnvoyer);
		
		Icon icon = new ImageIcon("editButton.jpg");
		
		JComboBox choixDeClasseVehiculeBox = new JComboBox();
		choixDeClasseVehiculeBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		choixDeClasseVehiculeBox.setModel(new DefaultComboBoxModel(new String[] {"Economique", "Moyenne", "Confort", "Luxe", "Utilitaire"}));
		choixDeClasseVehiculeBox.setMaximumRowCount(6);
		choixDeClasseVehiculeBox.setToolTipText("Classe");
		choixDeClasseVehiculeBox.setBounds(144, 56, 230, 27);
		Mid.add(choixDeClasseVehiculeBox);
		
			
		JComboBox vehiculeBox = new JComboBox();
		vehiculeBox.setModel(new DefaultComboBoxModel(new String[] {"Toyota Yaris 2001 Jaune", "Honda Civic 2015 Grise", "Hyundai Accent 2011 Rouge"}));
		vehiculeBox.setToolTipText("Classe");
		vehiculeBox.setMaximumRowCount(6);
		vehiculeBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		vehiculeBox.setBounds(144, 118, 230, 27);
		Mid.add(vehiculeBox);
		
		txtModele = new JTextField();
		txtModele.setText("Vehicule");
		txtModele.setHorizontalAlignment(SwingConstants.CENTER);
		txtModele.setForeground(Color.WHITE);
		txtModele.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtModele.setEditable(false);
		txtModele.setColumns(10);
		txtModele.setBackground(Color.DARK_GRAY);
		txtModele.setBounds(38, 118, 107, 27);
		Mid.add(txtModele);
		
		JLabel lblNewLabel = new JLabel("Assurance :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(404, 164, 107, 27);
		Mid.add(lblNewLabel);
		
		JRadioButton assurancePersonnelle = new JRadioButton("Assurance personnelle du client\r\n"); 
		assurancePersonnelle.setForeground(Color.WHITE);
		assurancePersonnelle.setBackground(Color.DARK_GRAY);
		  JRadioButton assuranceCompagnie = new JRadioButton("Assurance de la compagnie"); 
		  assuranceCompagnie.setForeground(Color.WHITE);
		  assuranceCompagnie.setBackground(Color.DARK_GRAY);
		  
		  
		  assurancePersonnelle.setBounds(455, 239, 235, 30); 
		  assuranceCompagnie.setBounds(455, 208, 235, 30);
		  
		  
		  ButtonGroup bg = new ButtonGroup(); 
		  bg.add(assurancePersonnelle);
		  bg.add(assuranceCompagnie);
		  
		  Mid.add(assurancePersonnelle);
		  Mid.add(assuranceCompagnie);
		  
		  JLabel lblForfait = new JLabel("Forfait :");
		  lblForfait.setFont(new Font("Tahoma", Font.BOLD, 16));
		  lblForfait.setBounds(404, 56, 88, 27);
		  Mid.add(lblForfait);
		  
		  JRadioButton rdbtnForfait = new JRadioButton("Forfait A :\r\n21 cents/Km apres 500Km");
		  rdbtnForfait.setFont(new Font("Tahoma", Font.PLAIN, 12));
		  rdbtnForfait.setForeground(Color.WHITE);
		  rdbtnForfait.setBackground(Color.DARK_GRAY);
		  rdbtnForfait.setBounds(455, 85, 235, 30);
		  Mid.add(rdbtnForfait);
		  
		  JRadioButton rdbtnForfait_1 = new JRadioButton("Forfait B : 18,45$ // Km illimitee");
		  rdbtnForfait_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		  rdbtnForfait_1.setForeground(Color.WHITE);
		  rdbtnForfait_1.setBackground(Color.DARK_GRAY);
		  rdbtnForfait_1.setBounds(455, 115, 235, 30);
		  Mid.add(rdbtnForfait_1);
		  
		  ButtonGroup bg2 = new ButtonGroup(); 
		  bg2.add(rdbtnForfait);
		  bg2.add(rdbtnForfait_1);
		  
		  JPanel panel = new JPanel();
		  panel.setBackground(Color.LIGHT_GRAY);
		  panel.setBounds(38, 198, 336, 98);
		  Mid.add(panel);
		  
		  JLabel lblNewLabel_1 = new JLabel("Couleur :");
		  lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		  
		  JLabel lblNewLabel_2 = new JLabel("Kilom\u00E9trage :");
		  lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		  
		  JLabel lblNewLabel_3 = new JLabel("Ann\u00E9e :");
		  lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		  
		  JLabel lblNewLabel_4 = new JLabel("anneeVehicule");
		  
		  JLabel lblNewLabel_4_1 = new JLabel("couleurVehicule");
		  
		  JLabel lblNewLabel_4_1_1 = new JLabel("kiloVehicule");
		  GroupLayout gl_panel = new GroupLayout(panel);
		  gl_panel.setHorizontalGroup(
		  	gl_panel.createParallelGroup(Alignment.LEADING)
		  		.addGroup(gl_panel.createSequentialGroup()
		  			.addGap(24)
		  			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
		  				.addGroup(gl_panel.createSequentialGroup()
		  					.addComponent(lblNewLabel_3)
		  					.addGap(18)
		  					.addComponent(lblNewLabel_4))
		  				.addGroup(gl_panel.createSequentialGroup()
		  					.addComponent(lblNewLabel_1)
		  					.addGap(18)
		  					.addComponent(lblNewLabel_4_1, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
		  				.addGroup(gl_panel.createSequentialGroup()
		  					.addComponent(lblNewLabel_2)
		  					.addPreferredGap(ComponentPlacement.RELATED)
		  					.addComponent(lblNewLabel_4_1_1, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)))
		  			.addContainerGap(151, Short.MAX_VALUE))
		  );
		  gl_panel.setVerticalGroup(
		  	gl_panel.createParallelGroup(Alignment.LEADING)
		  		.addGroup(gl_panel.createSequentialGroup()
		  			.addGap(16)
		  			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
		  				.addComponent(lblNewLabel_3)
		  				.addComponent(lblNewLabel_4))
		  			.addPreferredGap(ComponentPlacement.UNRELATED)
		  			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
		  				.addComponent(lblNewLabel_1)
		  				.addComponent(lblNewLabel_4_1))
		  			.addPreferredGap(ComponentPlacement.UNRELATED)
		  			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
		  				.addComponent(lblNewLabel_2)
		  				.addComponent(lblNewLabel_4_1_1))
		  			.addContainerGap(54, Short.MAX_VALUE))
		  );
		  panel.setLayout(gl_panel);
		  
		  textField = new JTextField();
		  textField.setBounds(38, 333, 86, 20);
		  Mid.add(textField);
		  textField.setColumns(10);
		  
		  textField_1 = new JTextField();
		  textField_1.setColumns(10);
		  textField_1.setBounds(258, 333, 86, 20);
		  Mid.add(textField_1);
		  
		  JLabel lblNewLabel_4_2 = new JLabel("Date de Debut");
		  lblNewLabel_4_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		  lblNewLabel_4_2.setBackground(Color.ORANGE);
		  lblNewLabel_4_2.setBounds(38, 308, 107, 14);
		  Mid.add(lblNewLabel_4_2);
		  
		  JLabel lblNewLabel_4_3 = new JLabel("Date de Fin");
		  lblNewLabel_4_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		  lblNewLabel_4_3.setBounds(254, 307, 107, 14);
		  Mid.add(lblNewLabel_4_3);
		  
		 
		
		
		
		
		// Definir les vehicules afficher dans vehiculeBox grace au Enum de ClasseDeVehicule
				
				for (ClasseDeVehicule.Classe choix : ClasseDeVehicule.Classe.values()) { 
				    System.out.println(choix); 
				}
		
		txtVehiculeDisponible = new JTextField();
		txtVehiculeDisponible.setText("Vehicule Disponible a la Location");
		txtVehiculeDisponible.setHorizontalAlignment(SwingConstants.CENTER);
		txtVehiculeDisponible.setForeground(Color.WHITE);
		txtVehiculeDisponible.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtVehiculeDisponible.setEditable(false);
		txtVehiculeDisponible.setColumns(10);
		txtVehiculeDisponible.setBackground(new Color(25, 25, 112));
		contentPane.add(txtVehiculeDisponible, BorderLayout.NORTH);
	}
}
