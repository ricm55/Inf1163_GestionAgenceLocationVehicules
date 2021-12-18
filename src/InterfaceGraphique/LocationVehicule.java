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

public class LocationVehicule extends JFrame {

	private JPanel contentPane;
	private JTextField txtClasse;
	private static JTextField txtVehiculeDisponible;
	private static LocationVehicule frame;
	private JTextField txtVehicule;
	private JTextField textField;
	private JTextField textField_1;
	private static JRadioButton rdbtnForfaitA ;
	private static JRadioButton rdbtnForfaitB;
	private static JRadioButton assuranceCompagnie;
	private static JRadioButton assurancePersonnelle;
	
	

	/**
	 * Launch the application.
	 */
	public static void launch() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new LocationVehicule();
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
	public LocationVehicule() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 875, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel Left = new JPanel();
		Left.setBackground(new Color(255, 165, 0));
		contentPane.add(Left, BorderLayout.WEST);
		
		JButton btnBackToHome = new JButton("Retour");
		btnBackToHome.setForeground(Color.WHITE);
		btnBackToHome.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnBackToHome.setBackground(Color.DARK_GRAY);
		
		JButton locationBtn = new JButton("Location");
		locationBtn.setForeground(Color.WHITE);
		locationBtn.setFont(new Font("Verdana", Font.PLAIN, 16));
		locationBtn.setBackground(Color.DARK_GRAY);
		
		JButton reservationBtn = new JButton("R\u00E9servation");
		reservationBtn.setForeground(Color.WHITE);
		reservationBtn.setFont(new Font("Verdana", Font.PLAIN, 16));
		reservationBtn.setBackground(Color.DARK_GRAY);
		
		JButton catalogueBtn = new JButton("Catalogue");
		catalogueBtn.setForeground(Color.WHITE);
		catalogueBtn.setFont(new Font("Verdana", Font.PLAIN, 16));
		catalogueBtn.setBackground(Color.DARK_GRAY);
		
		JButton compteClientBtn = new JButton("Compte Client");
		compteClientBtn.setForeground(Color.WHITE);
		compteClientBtn.setFont(new Font("Verdana", Font.PLAIN, 16));
		compteClientBtn.setBackground(Color.DARK_GRAY);
		GroupLayout gl_Left = new GroupLayout(Left);
		gl_Left.setHorizontalGroup(
			gl_Left.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Left.createSequentialGroup()
					.addGroup(gl_Left.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_Left.createSequentialGroup()
							.addGap(5)
							.addComponent(locationBtn, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_Left.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnBackToHome, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_Left.createSequentialGroup()
							.addContainerGap(15, Short.MAX_VALUE)
							.addComponent(catalogueBtn, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_Left.createSequentialGroup()
							.addContainerGap(15, Short.MAX_VALUE)
							.addComponent(compteClientBtn, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_Left.createSequentialGroup()
							.addContainerGap(15, Short.MAX_VALUE)
							.addComponent(reservationBtn, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_Left.setVerticalGroup(
			gl_Left.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Left.createSequentialGroup()
					.addContainerGap()
					.addComponent(locationBtn, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(reservationBtn, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(catalogueBtn, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(compteClientBtn, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(192)
					.addComponent(btnBackToHome, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(67))
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
		btnEnvoyer.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				frame.dispose();
				Transaction.launch();
			}

		});
		
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
		
		txtVehicule = new JTextField();
		txtVehicule.setText("Vehicule");
		txtVehicule.setHorizontalAlignment(SwingConstants.CENTER);
		txtVehicule.setForeground(Color.WHITE);
		txtVehicule.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtVehicule.setEditable(false);
		txtVehicule.setColumns(10);
		txtVehicule.setBackground(Color.DARK_GRAY);
		txtVehicule.setBounds(38, 118, 107, 27);
		Mid.add(txtVehicule);
		
		JLabel assuranceLabel = new JLabel("Assurance :");
		assuranceLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		assuranceLabel.setBounds(404, 164, 107, 27);
		Mid.add(assuranceLabel);
		
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
		  
		  JLabel labelForfait = new JLabel("Forfait :");
		  labelForfait.setFont(new Font("Tahoma", Font.BOLD, 16));
		  labelForfait.setBounds(404, 56, 88, 27);
		  Mid.add(labelForfait);
		  
		  JRadioButton rdbtnForfaitA = new JRadioButton("Forfait A :\r\n21 cents/Km apres 500Km");
		  rdbtnForfaitA.setFont(new Font("Tahoma", Font.PLAIN, 12));
		  rdbtnForfaitA.setForeground(Color.WHITE);
		  rdbtnForfaitA.setBackground(Color.DARK_GRAY);
		  rdbtnForfaitA.setBounds(455, 85, 235, 30);
		  Mid.add(rdbtnForfaitA);
		  
		  JRadioButton rdbtnForfaitB = new JRadioButton("Forfait B : 18,45$ // Km illimitee");
		  rdbtnForfaitB.setFont(new Font("Tahoma", Font.PLAIN, 12));
		  rdbtnForfaitB.setForeground(Color.WHITE);
		  rdbtnForfaitB.setBackground(Color.DARK_GRAY);
		  rdbtnForfaitB.setBounds(455, 115, 235, 30);
		  Mid.add(rdbtnForfaitB);
		  
		  ButtonGroup bg2 = new ButtonGroup(); 
		  bg2.add(rdbtnForfaitA);
		  bg2.add(rdbtnForfaitB);
		  
		  JPanel panel = new JPanel();
		  panel.setBackground(Color.LIGHT_GRAY);
		  panel.setBounds(38, 198, 336, 98);
		  Mid.add(panel);
		  
		  JLabel couleurLabel = new JLabel("Couleur :");
		  couleurLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		  
		  JLabel kiloLabel = new JLabel("Kilom\u00E9trage :");
		  kiloLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		  
		  JLabel anneeLabel = new JLabel("Ann\u00E9e :");
		  anneeLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		  
		  JLabel anneeValueTxt = new JLabel("anneeVehicule");
		  
		  JLabel couleurValueTxt = new JLabel("couleurVehicule");
		  
		  JLabel kiloValueTxt = new JLabel("kiloVehicule");
		  GroupLayout gl_panel = new GroupLayout(panel);
		  gl_panel.setHorizontalGroup(
		  	gl_panel.createParallelGroup(Alignment.LEADING)
		  		.addGroup(gl_panel.createSequentialGroup()
		  			.addGap(24)
		  			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
		  				.addGroup(gl_panel.createSequentialGroup()
		  					.addComponent(anneeLabel)
		  					.addGap(18)
		  					.addComponent(anneeValueTxt))
		  				.addGroup(gl_panel.createSequentialGroup()
		  					.addComponent(couleurLabel)
		  					.addGap(18)
		  					.addComponent(couleurValueTxt, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
		  				.addGroup(gl_panel.createSequentialGroup()
		  					.addComponent(kiloLabel)
		  					.addPreferredGap(ComponentPlacement.RELATED)
		  					.addComponent(kiloValueTxt, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)))
		  			.addContainerGap(120, Short.MAX_VALUE))
		  );
		  gl_panel.setVerticalGroup(
		  	gl_panel.createParallelGroup(Alignment.LEADING)
		  		.addGroup(gl_panel.createSequentialGroup()
		  			.addGap(16)
		  			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
		  				.addComponent(anneeLabel)
		  				.addComponent(anneeValueTxt))
		  			.addPreferredGap(ComponentPlacement.UNRELATED)
		  			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
		  				.addComponent(couleurLabel)
		  				.addComponent(couleurValueTxt))
		  			.addPreferredGap(ComponentPlacement.UNRELATED)
		  			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
		  				.addComponent(kiloLabel)
		  				.addComponent(kiloValueTxt))
		  			.addContainerGap(12, Short.MAX_VALUE))
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
		  
		  JLabel dateDebut = new JLabel("Date de Debut");
		  dateDebut.setFont(new Font("Tahoma", Font.PLAIN, 12));
		  dateDebut.setBackground(Color.ORANGE);
		  dateDebut.setBounds(38, 308, 107, 14);
		  Mid.add(dateDebut);
		  
		  JLabel dateFin = new JLabel("Date de Fin");
		  dateFin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		  dateFin.setBounds(254, 307, 107, 14);
		  Mid.add(dateFin);
		  
		 
		
		
		
		
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
	
	public static void rendreVisible(boolean visible) {
		 frame.setVisible(visible);
	}
	
	public static void rendreInvisible(boolean invisible) {
		rdbtnForfaitA.setEnabled(invisible);
		rdbtnForfaitB.setEnabled(invisible);
		assuranceCompagnie.setEnabled(invisible);
		assurancePersonnelle.setEnabled(invisible);
		txtVehiculeDisponible.setText("V\\u00e9hicule disponible \\u00e0 la R\\u00e9servation");
	}
}
