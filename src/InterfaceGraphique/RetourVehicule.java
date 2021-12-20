package InterfaceGraphique;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import background.ClasseDeVehicule;
import background.Tarif;
import controleur.ClientControleur;
import controleur.LocationControleur;

public class RetourVehicule extends JFrame {

	private JPanel contentPane;
	private JTextField txtVehiculeEtat;
	private static JTextField txtRetourVehicule;
	private static RetourVehicule frame;
	private JTextField txtVehicule;
	private static JRadioButton rdbtnForfaitA ;
	private static JRadioButton rdbtnForfaitB;
	private static JRadioButton assuranceCompagnie;
	private static JRadioButton assurancePersonnelle;
	private JTextField txtDommageConsidrable;
	private JTextField txtEssenceManquante;
	private JTextField labelClient;
	private static Tarif tarif;
	private static ClientControleur controleurClient ;
	private static LocationControleur controleurLocation ;
	
	

	/**
	 * Launch the application.
	 * @throws Exception 
	 */
	public static void launch() throws Exception {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					frame = new RetourVehicule();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		controleurClient = new ClientControleur();
		controleurLocation = new LocationControleur(controleurClient);
	}

	/**
	 * Create the frame.
	 */
	public RetourVehicule() {
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
		
		txtVehiculeEtat = new JTextField();
		txtVehiculeEtat.setText("Pas en retard");
		txtVehiculeEtat.setHorizontalAlignment(SwingConstants.CENTER);
		txtVehiculeEtat.setForeground(Color.WHITE);
		txtVehiculeEtat.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtVehiculeEtat.setEditable(false);
		txtVehiculeEtat.setColumns(10);
		txtVehiculeEtat.setBackground(new Color(50, 205, 50));
		txtVehiculeEtat.setBounds(38, 42, 213, 27);
		Mid.add(txtVehiculeEtat);
		
		JTextPane txtDommage = new JTextPane();
		  txtDommage.setText((String) null);
		  txtDommage.setFont(new Font("Verdana", Font.PLAIN, 11));
		  txtDommage.setBounds(251, 195, 213, 27);
		  Mid.add(txtDommage);
		
		JButton btnEnvoyer = new JButton("Envoyer");
		btnEnvoyer.setForeground(Color.WHITE);
		btnEnvoyer.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnEnvoyer.setBackground(new Color(60, 179, 113));
		btnEnvoyer.setBounds(483, 362, 173, 29);
		Mid.add(btnEnvoyer);
		btnEnvoyer.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				controleurLocation.miseAJourReservoirVehicule(Double.parseDouble(txtDommage.getText().trim()));
				controleurLocation.miseAJourDommages(Double.parseDouble(txtDommage.getText().trim()));
				frame.dispose();
				Transaction.launch();
			}

		});
		
		Icon icon = new ImageIcon("editButton.jpg");
		
		txtVehicule = new JTextField();
		txtVehicule.setText("Kilom\u00E9trage parcouru");
		txtVehicule.setHorizontalAlignment(SwingConstants.CENTER);
		txtVehicule.setForeground(Color.WHITE);
		txtVehicule.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtVehicule.setEditable(false);
		txtVehicule.setColumns(10);
		txtVehicule.setBackground(Color.DARK_GRAY);
		txtVehicule.setBounds(38, 119, 213, 27);
		Mid.add(txtVehicule);
		  
		  
		  ButtonGroup bg = new ButtonGroup();
		  
		  JLabel labelForfait = new JLabel("Forfait :");
		  labelForfait.setFont(new Font("Tahoma", Font.BOLD, 16));
		  labelForfait.setBounds(65, 233, 88, 27);
		  Mid.add(labelForfait);
		  
		  ButtonGroup bg2 = new ButtonGroup();
		  
		  JLabel dateDebut = new JLabel("Date de D\u00E9but :");
		  dateDebut.setFont(new Font("Tahoma", Font.BOLD, 14));
		  dateDebut.setBackground(Color.ORANGE);
		  dateDebut.setBounds(38, 287, 130, 14);
		  Mid.add(dateDebut);
		  
		  JLabel dateFin = new JLabel("Date de Fin :");
		  dateFin.setFont(new Font("Tahoma", Font.BOLD, 14));
		  dateFin.setBounds(371, 287, 127, 14);
		  Mid.add(dateFin);
		  
		  JTextPane txtKilometreParcouru = new JTextPane();
		  txtKilometreParcouru.setText((String) null);
		  txtKilometreParcouru.setFont(new Font("Verdana", Font.PLAIN, 11));
		  txtKilometreParcouru.setBounds(251, 119, 213, 27);
		  Mid.add(txtKilometreParcouru);
		  
		  txtDommageConsidrable = new JTextField();
		  txtDommageConsidrable.setText("Dommages estim\u00E9s ");
		  txtDommageConsidrable.setHorizontalAlignment(SwingConstants.CENTER);
		  txtDommageConsidrable.setForeground(Color.WHITE);
		  txtDommageConsidrable.setFont(new Font("Verdana", Font.PLAIN, 14));
		  txtDommageConsidrable.setEditable(false);
		  txtDommageConsidrable.setColumns(10);
		  txtDommageConsidrable.setBackground(Color.DARK_GRAY);
		  txtDommageConsidrable.setBounds(38, 195, 213, 27);
		  Mid.add(txtDommageConsidrable);
		  
		  JTextPane txtKilometreParcouru_1 = new JTextPane();
		  txtKilometreParcouru_1.setText((String) null);
		  txtKilometreParcouru_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		  txtKilometreParcouru_1.setBounds(251, 157, 213, 27);
		  Mid.add(txtKilometreParcouru_1);
		  
		  txtEssenceManquante = new JTextField();
		  txtEssenceManquante.setText("Essence manquante  ");
		  txtEssenceManquante.setHorizontalAlignment(SwingConstants.CENTER);
		  txtEssenceManquante.setForeground(Color.WHITE);
		  txtEssenceManquante.setFont(new Font("Verdana", Font.PLAIN, 14));
		  txtEssenceManquante.setEditable(false);
		  txtEssenceManquante.setColumns(10);
		  txtEssenceManquante.setBackground(Color.DARK_GRAY);
		  txtEssenceManquante.setBounds(38, 157, 213, 27);
		  Mid.add(txtEssenceManquante);
		  
		  
		  
		  labelClient = new JTextField();
		  labelClient.setText("Client");
		  labelClient.setHorizontalAlignment(SwingConstants.CENTER);
		  labelClient.setForeground(Color.WHITE);
		  labelClient.setFont(new Font("Verdana", Font.PLAIN, 14));
		  labelClient.setEditable(false);
		  labelClient.setColumns(10);
		  labelClient.setBackground(Color.DARK_GRAY);
		  labelClient.setBounds(263, 42, 136, 27);
		  Mid.add(labelClient);
		  
		  JLabel lblDatedebut = new JLabel("dateDebut");
		  lblDatedebut.setFont(new Font("Tahoma", Font.PLAIN, 14));
		  lblDatedebut.setBackground(Color.ORANGE);
		  lblDatedebut.setBounds(154, 287, 107, 14);
		  Mid.add(lblDatedebut);
		  
		  JLabel lblDatefin = new JLabel("dateFin");
		  lblDatefin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		  lblDatefin.setBounds(468, 287, 107, 14);
		  Mid.add(lblDatefin);
		  
		  JLabel lblNewLabel = new JLabel("! Veuillez effectuer l'inspection avant de remplir !");
		  lblNewLabel.setForeground(new Color(178, 34, 34));
		  lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		  lblNewLabel.setBounds(129, 80, 402, 14);
		  Mid.add(lblNewLabel);
		  
		  JLabel lblClienttext = new JLabel("clientText");
		  lblClienttext.setForeground(Color.WHITE);
		  lblClienttext.setFont(new Font("Tahoma", Font.BOLD, 15));
		  lblClienttext.setBounds(409, 50, 254, 14);
		  Mid.add(lblClienttext);
		  
		  JLabel lblForfaittext = new JLabel("forfaitText");
		  lblForfaittext.setFont(new Font("Tahoma", Font.PLAIN, 14));
		  lblForfaittext.setBackground(Color.ORANGE);
		  lblForfaittext.setBounds(144, 241, 107, 14);
		  Mid.add(lblForfaittext);
		  
		 
		
		
		
		
		// Definir les vehicules afficher dans vehiculeBox grace au Enum de ClasseDeVehicule
				
				for (ClasseDeVehicule.Classe choix : ClasseDeVehicule.Classe.values()) { 
				    System.out.println(choix); 
				}
		
		txtRetourVehicule = new JTextField();
		txtRetourVehicule.setText("Retour de V\u00E9hicule");
		txtRetourVehicule.setHorizontalAlignment(SwingConstants.CENTER);
		txtRetourVehicule.setForeground(Color.WHITE);
		txtRetourVehicule.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtRetourVehicule.setEditable(false);
		txtRetourVehicule.setColumns(10);
		txtRetourVehicule.setBackground(new Color(25, 25, 112));
		contentPane.add(txtRetourVehicule, BorderLayout.NORTH);
		
		
	}
	
	public static void rendreVisible(boolean visible) {
		 frame.setVisible(visible);
	}
	
	public static void rendreInvisible(boolean invisible) {
		rdbtnForfaitA.setEnabled(invisible);
		rdbtnForfaitB.setEnabled(invisible);
		assuranceCompagnie.setEnabled(invisible);
		assurancePersonnelle.setEnabled(invisible);
		txtRetourVehicule.setText("V\\u00e9hicule disponible \\u00e0 la R\\u00e9servation");
	}
	
	
}
