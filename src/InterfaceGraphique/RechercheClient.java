package InterfaceGraphique;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import background.Client;
import background.PermisDeConduire;
import constante.ClasseVehicule;

public class RechercheClient extends JFrame {

	private JPanel contentPane;
	private JTextField txtRechercheDeClient;
	private JTextField textField;
	private JTextField txtEntre;
	private JTextField txtNom;
	private JTextField txtContinuerAvecCe;
	private static RechercheClient frame ;
	private static VehiculeDispo vd ;
	
	/**
	 * Launch the application.
	 */
	public static void launch() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					/*RechercheClient*/ frame = new RechercheClient();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		ClasseVehicule Cv = ClasseVehicule.CLASSE1 ;
       // PermisDeConduire Ptest = new PermisDeConduire(new Date(2023,8,8),Cv);
       // Client ClientTest = new Client("Marilou Fugere", new Date(1997,01,01),"123 Chemin Chelsea","8191234567",false, Ptest);
		Client c = new Client(-1,"TestNom","TestPrenom","1234567890",java.time.LocalDate.now(),"test@gmail.com",new Date(1999,8,11),"Rue des Benoits",true);
        PermisDeConduire permis = new PermisDeConduire(new Date(2025,06,22), new ArrayList<String>() { {add("CLASSE1");add("CLASSE2");add("CLASSE6B");} } );
        
	}

	/**
	 * Create the frame.
	 */
	public RechercheClient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 875, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		ClasseVehicule Cv = ClasseVehicule.CLASSE1 ;
       // PermisDeConduire Ptest = new PermisDeConduire(new Date(2023,8,8),Cv);
        //Client ClientTest = new Client("Marilou Fugere", new Date(1997,01,01),"123 Chemin Chelsea","8191234567",false, Ptest);
		Client c = new Client(-1,"TestNom","TestPrenom","1234567890",java.time.LocalDate.now(),"test@gmail.com",new Date(1999,8,11),"Rue des Benoits",true);
        PermisDeConduire permis = new PermisDeConduire(new Date(2025,06,22), new ArrayList<String>() { {add("CLASSE1");add("CLASSE2");add("CLASSE6B");} } );
        
		JPanel Left = new JPanel();
		Left.setBackground(new Color(255, 140, 0));
		contentPane.add(Left, BorderLayout.WEST);
		
		JButton btnNewButton = new JButton("Location");
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 16));
		
		JButton btnNewButton_1 = new JButton("Location");
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		
		JButton btnBackToHome = new JButton("Retour");
		btnBackToHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfaceAccueil ia = new InterfaceAccueil();
				frame.dispose();
				ia.launch();
				
			}
		});
		btnBackToHome.setForeground(Color.WHITE);
		btnBackToHome.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnBackToHome.setBackground(Color.DARK_GRAY);
		GroupLayout gl_Left = new GroupLayout(Left);
		gl_Left.setHorizontalGroup(
			gl_Left.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Left.createSequentialGroup()
					.addGroup(gl_Left.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Left.createSequentialGroup()
							.addGap(5)
							.addGroup(gl_Left.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
								.addComponent(btnNewButton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)))
						.addGroup(gl_Left.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnBackToHome, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_Left.setVerticalGroup(
			gl_Left.createParallelGroup(Alignment.LEADING)
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
		
		JPanel Up = new JPanel();
		contentPane.add(Up, BorderLayout.NORTH);
		Up.setLayout(new BorderLayout(0, 0));
		
		txtRechercheDeClient = new JTextField();
		txtRechercheDeClient.setForeground(new Color(255, 255, 255));
		txtRechercheDeClient.setBackground(new Color(25, 25, 112));
		txtRechercheDeClient.setEditable(false);
		txtRechercheDeClient.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtRechercheDeClient.setHorizontalAlignment(SwingConstants.CENTER);
		txtRechercheDeClient.setText("Recherche de client");
		Up.add(txtRechercheDeClient);
		txtRechercheDeClient.setColumns(10);
		
		JPanel Mid = new JPanel();
		Mid.setBackground(SystemColor.textHighlight);
		contentPane.add(Mid, BorderLayout.CENTER);
		Mid.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(260, 68, 184, 27);
		Mid.add(textField);
		textField.setColumns(10);
		//if(textField == Cv.getNumTelephone()){
		//		txtNom = Cv.getNom();
		// }
		
		
		txtEntre = new JTextField();
		txtEntre.setForeground(Color.WHITE);
		txtEntre.setBackground(Color.DARK_GRAY);
		txtEntre.setText("Entrer le num\u00E9ro de t\u00E9l\u00E9phone");
		txtEntre.setHorizontalAlignment(SwingConstants.CENTER);
		txtEntre.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtEntre.setEditable(false);
		txtEntre.setColumns(10);
		txtEntre.setBounds(131, 28, 313, 27);
		Mid.add(txtEntre);
		
		txtNom = new JTextField();
		txtNom.setForeground(Color.WHITE);
		txtNom.setText("Nom");
		txtNom.setHorizontalAlignment(SwingConstants.CENTER);
		txtNom.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtNom.setEditable(false);
		txtNom.setColumns(10);
		txtNom.setBackground(Color.DARK_GRAY);
		txtNom.setBounds(131, 106, 313, 27);
		Mid.add(txtNom);
		
		txtContinuerAvecCe = new JTextField();
		txtContinuerAvecCe.setForeground(Color.DARK_GRAY);
		txtContinuerAvecCe.setText("Continuer avec ce client ?");
		txtContinuerAvecCe.setHorizontalAlignment(SwingConstants.CENTER);
		txtContinuerAvecCe.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtContinuerAvecCe.setEditable(false);
		txtContinuerAvecCe.setColumns(10);
		txtContinuerAvecCe.setBackground(Color.WHITE);
		txtContinuerAvecCe.setBounds(131, 144, 313, 27);
		Mid.add(txtContinuerAvecCe);
		
		JButton btnOui = new JButton("Oui");
		btnOui.setEnabled(false);
		btnOui.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VehiculeDispo vd = new VehiculeDispo();
				frame.dispose();
				vd.launch();
				
			}
		});
		btnOui.setForeground(Color.WHITE);
		btnOui.setBackground(new Color(60, 179, 113));
		btnOui.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnOui.setBounds(131, 182, 122, 29);
		Mid.add(btnOui);
		
		JButton btnNon = new JButton("Non");
		btnNon.setEnabled(false);
		btnNon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNon.setForeground(Color.WHITE);
		btnNon.setBackground(new Color(165, 42, 42));
		btnNon.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnNon.setBounds(322, 182, 122, 29);
		Mid.add(btnNon);
		
		JButton btnEnvoyer = new JButton("Envoyer");
		btnEnvoyer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnOui.setEnabled(true);
				btnNon.setEnabled(true);
				if(textField.getText().equals(c.getNumTelephone())){
					txtNom.setText(c.getNom());
				 }
			}
			
		});
		btnEnvoyer.setBackground(new Color(60, 179, 113));
		btnEnvoyer.setForeground(Color.WHITE);
		btnEnvoyer.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnEnvoyer.setBounds(131, 68, 99, 29);
		Mid.add(btnEnvoyer);
	}
}
