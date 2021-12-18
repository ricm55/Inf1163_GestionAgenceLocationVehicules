package InterfaceGraphique;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import InterfaceGraphique.InterfaceAccueil.Action;
import controleur.ClientControleur;

import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JRadioButton;

public class VerifierInformationClient extends JFrame
{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtVeuillezVerifierQue;
	private static VerifierInformationClient frame;
	private static Action actionEnCours;
	private static ClientControleur controleurClient;
	private JTextField labelNom;
	private JTextField labelPrnom;
	private JTextField labelDateDeNaissance;
	private JTextField labelAdresse;
	private JTextField labelClasses;
	private JTextField labelExpiration;

	private JTextField labelTelephone;

	
	String pattern = "yyyy-MM-dd";
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
	private JTextField txtEmail;
	private JTextField txtAssurancePersonnelle;


	/**
	 * Launch the application.
	 */
	public static void launch(Action action, ClientControleur controleur)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					frame = new VerifierInformationClient();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		actionEnCours = action;
		controleurClient = controleur;
	}

	/**
	 * Create the frame.
	 */
	public VerifierInformationClient()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 879, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel up = new JPanel();
		contentPane.add(up, BorderLayout.NORTH);
		up.setLayout(new BoxLayout(up, BoxLayout.X_AXIS));

		txtVeuillezVerifierQue = new JTextField();
		txtVeuillezVerifierQue.setForeground(Color.WHITE);
		txtVeuillezVerifierQue.setBackground(new Color(25, 25, 112));
		txtVeuillezVerifierQue.setHorizontalAlignment(SwingConstants.CENTER);
		txtVeuillezVerifierQue.setEditable(false);
		txtVeuillezVerifierQue.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtVeuillezVerifierQue.setText("Veuillez v\u00E9rifier que les informations du client sont exactes");
		txtVeuillezVerifierQue.setColumns(10);
		up.add(txtVeuillezVerifierQue);

		JPanel left = new JPanel();
		left.setBackground(new Color(255, 165, 0));
		contentPane.add(left, BorderLayout.WEST);

		JButton btnRetour = new JButton("Retour");
		btnRetour.setForeground(Color.WHITE);
		btnRetour.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				frame.dispose();
				InterfaceAccueil.launch();
			}
		});
		btnRetour.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnRetour.setBackground(Color.DARK_GRAY);

		GroupLayout gl_left = new GroupLayout(left);
		gl_left.setHorizontalGroup(gl_left.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_left.createSequentialGroup().addContainerGap()
						.addComponent(btnRetour, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		gl_left.setVerticalGroup(gl_left.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				gl_left.createSequentialGroup().addContainerGap(355, Short.MAX_VALUE)
						.addComponent(btnRetour, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		left.setLayout(gl_left);

		JPanel mid = new JPanel();
		mid.setBackground(SystemColor.textHighlight);
		contentPane.add(mid, BorderLayout.CENTER);

		JTextPane labelInformationsPermis = new JTextPane();
		labelInformationsPermis.setEditable(false);
		labelInformationsPermis.setForeground(Color.WHITE);
		labelInformationsPermis.setBackground(Color.DARK_GRAY);
		labelInformationsPermis.setFont(new Font("Verdana", Font.PLAIN, 11));
		labelInformationsPermis.setText("Informations sur le permis de conduire");
	
		JTextPane txtTelephone = new JTextPane();
        txtTelephone.setEditable(false);
        txtTelephone.setText(controleurClient.getNumTelephoneClient());
        txtTelephone.setFont(new Font("Verdana", Font.PLAIN, 16));
        
		JTextPane txtNom = new JTextPane();
		txtNom.setEditable(false);
		txtNom.setText(controleurClient.getNomClient());
		txtNom.setFont(new Font("Verdana", Font.PLAIN, 16));

		JTextPane txtPrnom = new JTextPane();
		txtPrnom.setEditable(false);
		txtPrnom.setText(controleurClient.getPrenomClient());
		txtPrnom.setFont(new Font("Verdana", Font.PLAIN, 16));

		JTextPane txtDateDeNaissance = new JTextPane();
		txtDateDeNaissance.setEditable(false);
		txtDateDeNaissance.setText(controleurClient.getDateNaissanceClient().toString());
		txtDateDeNaissance.setFont(new Font("Verdana", Font.PLAIN, 16));

		JTextPane txtAdresse = new JTextPane();
		txtAdresse.setEditable(false);
		txtAdresse.setText(controleurClient.getAdresseClient());
		txtAdresse.setFont(new Font("Verdana", Font.PLAIN, 16));

		JTextPane txtClasses = new JTextPane();
		txtClasses.setEditable(false);
		txtClasses.setText(controleurClient.getClassesPermisClient());
		txtClasses.setFont(new Font("Verdana", Font.PLAIN, 16));

		JTextPane txtExpiration = new JTextPane();
		txtExpiration.setEditable(false);
		txtExpiration.setText(controleurClient.getDateExpirationPermisClient());
		txtExpiration.setFont(new Font("Verdana", Font.PLAIN, 16));
		
		JTextPane txtCourriel = new JTextPane();
		txtCourriel.setText((String) null);
		txtCourriel.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtCourriel.setEditable(false);
		
		JRadioButton rdBtnAssurance = new JRadioButton("Oui");
		rdBtnAssurance.setBackground(SystemColor.textHighlight);
		rdBtnAssurance.setForeground(Color.WHITE);
		JRadioButton rdbtnAssuranceNon = new JRadioButton("Non");
		rdbtnAssuranceNon.setForeground(Color.WHITE);
		rdbtnAssuranceNon.setBackground(SystemColor.textHighlight);

		JButton btnValider = new JButton("Valider");
		btnValider.setForeground(Color.WHITE);
		btnValider.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				if(!controleurClient.verificationExpirationPermisConduire())
				{
					JOptionPane.showMessageDialog(null, "Le permis de conduire est expir\u00E9.");
				}
				else if(!controleurClient.verificationAgeClient())
				{
					JOptionPane.showMessageDialog(null, "Le client n'a pas 25 ans.");
				}
				else
				{
					controleurClient.setNomClient(txtNom.getText());
					controleurClient.setPrenomClient(txtPrnom.getText());
					controleurClient.setAdresseClient(txtAdresse.getText());
					controleurClient.setNumTelephoneClient(txtTelephone.getText());
					controleurClient.setClassesPermisClient(txtClasses.getText());
					controleurClient.setCourrielClient(txtCourriel.getText());
					controleurClient.setAssurancePersonnelleClient(rdBtnAssurance.isSelected()) ;
					
							
						
					
					try
					{
						controleurClient.setDateDeNaissanceClient(simpleDateFormat.parse(txtDateDeNaissance.getText()));
						controleurClient.setDateExpirationPermisClient(simpleDateFormat.parse(txtExpiration.getText()));
					} catch (ParseException e)
					{
						e.printStackTrace();
					}
					
					switch(actionEnCours)
					{
						case LOCATION:
							frame.dispose();
							LocationVehicule.launch();
							break;
						case RESERVATION:
							frame.dispose();
							//interface reservation
							LocationVehicule.launch();
							LocationVehicule.rendreInvisible(false);
							break;
						case VOIR_COMPTE_CLIENT:
							break;
						default:
							break;
					}
				}
			}
		});
		btnValider.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnValider.setBackground(Color.DARK_GRAY);

		JButton btnModifier = new JButton("Modifier");
		btnModifier.setForeground(Color.WHITE);
		btnModifier.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				txtNom.setEditable(true);
				txtPrnom.setEditable(true);
				txtDateDeNaissance.setEditable(true);
				txtAdresse.setEditable(true);
				txtClasses.setEditable(true);
				txtExpiration.setEditable(true);
				txtCourriel.setEditable(true);
			}
		});
		btnModifier.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnModifier.setBackground(Color.DARK_GRAY);

		labelNom = new JTextField();
		labelNom.setText("Nom");
		labelNom.setHorizontalAlignment(SwingConstants.CENTER);
		labelNom.setForeground(Color.WHITE);
		labelNom.setFont(new Font("Verdana", Font.PLAIN, 11));
		labelNom.setEditable(false);
		labelNom.setColumns(10);
		labelNom.setBackground(Color.DARK_GRAY);

		labelPrnom = new JTextField();
		labelPrnom.setText("Pr\u00E9nom");
		labelPrnom.setHorizontalAlignment(SwingConstants.CENTER);
		labelPrnom.setForeground(Color.WHITE);
		labelPrnom.setFont(new Font("Verdana", Font.PLAIN, 11));
		labelPrnom.setEditable(false);
		labelPrnom.setColumns(10);
		labelPrnom.setBackground(Color.DARK_GRAY);

		labelDateDeNaissance = new JTextField();
		labelDateDeNaissance.setText("Date de naissance");
		labelDateDeNaissance.setHorizontalAlignment(SwingConstants.CENTER);
		labelDateDeNaissance.setForeground(Color.WHITE);
		labelDateDeNaissance.setFont(new Font("Verdana", Font.PLAIN, 11));
		labelDateDeNaissance.setEditable(false);
		labelDateDeNaissance.setColumns(10);
		labelDateDeNaissance.setBackground(Color.DARK_GRAY);

		labelAdresse = new JTextField();
		labelAdresse.setText("Adresse");
		labelAdresse.setHorizontalAlignment(SwingConstants.CENTER);
		labelAdresse.setForeground(Color.WHITE);
		labelAdresse.setFont(new Font("Verdana", Font.PLAIN, 11));
		labelAdresse.setEditable(false);
		labelAdresse.setColumns(10);
		labelAdresse.setBackground(Color.DARK_GRAY);

		labelClasses = new JTextField();
		labelClasses.setText("Classe(s)");
		labelClasses.setHorizontalAlignment(SwingConstants.CENTER);
		labelClasses.setForeground(Color.WHITE);
		labelClasses.setFont(new Font("Verdana", Font.PLAIN, 11));
		labelClasses.setEditable(false);
		labelClasses.setColumns(10);
		labelClasses.setBackground(Color.DARK_GRAY);

		labelExpiration = new JTextField();
		labelExpiration.setText("Expiration");
		labelExpiration.setHorizontalAlignment(SwingConstants.CENTER);
		labelExpiration.setForeground(Color.WHITE);
		labelExpiration.setFont(new Font("Verdana", Font.PLAIN, 11));
		labelExpiration.setEditable(false);
		labelExpiration.setColumns(10);
		labelExpiration.setBackground(Color.DARK_GRAY);
		
		labelTelephone = new JTextField();
		labelTelephone.setText("T\u00E9l\u00E9phone");
		labelTelephone.setHorizontalAlignment(SwingConstants.CENTER);
		labelTelephone.setForeground(Color.WHITE);
		labelTelephone.setFont(new Font("Verdana", Font.PLAIN, 11));
		labelTelephone.setEditable(false);
		labelTelephone.setColumns(10);
		labelTelephone.setBackground(Color.DARK_GRAY);
		
		txtEmail = new JTextField();
		txtEmail.setText("Email");
		txtEmail.setHorizontalAlignment(SwingConstants.CENTER);
		txtEmail.setForeground(Color.WHITE);
		txtEmail.setFont(new Font("Verdana", Font.PLAIN, 11));
		txtEmail.setEditable(false);
		txtEmail.setColumns(10);
		txtEmail.setBackground(Color.DARK_GRAY);
		
		
		
		txtAssurancePersonnelle = new JTextField();
		txtAssurancePersonnelle.setText("Assurance personnelle");
		txtAssurancePersonnelle.setHorizontalAlignment(SwingConstants.CENTER);
		txtAssurancePersonnelle.setForeground(Color.WHITE);
		txtAssurancePersonnelle.setFont(new Font("Verdana", Font.PLAIN, 11));
		txtAssurancePersonnelle.setEditable(false);
		txtAssurancePersonnelle.setColumns(10);
		txtAssurancePersonnelle.setBackground(Color.DARK_GRAY);
		
		
		

		GroupLayout gl_mid = new GroupLayout(mid);
		gl_mid.setHorizontalGroup(
			gl_mid.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_mid.createSequentialGroup()
					.addGap(38)
					.addComponent(btnModifier, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
					.addComponent(btnValider, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
					.addGap(51))
				.addGroup(gl_mid.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(txtCourriel, GroupLayout.PREFERRED_SIZE, 551, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(21, Short.MAX_VALUE))
				.addGroup(gl_mid.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_mid.createParallelGroup(Alignment.LEADING)
						.addComponent(labelInformationsPermis, GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
						.addGroup(gl_mid.createSequentialGroup()
							.addComponent(labelTelephone, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtTelephone, GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE))
						.addGroup(gl_mid.createSequentialGroup()
							.addComponent(txtAssurancePersonnelle, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(rdBtnAssurance, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(rdbtnAssuranceNon, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_mid.createSequentialGroup()
							.addGroup(gl_mid.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_mid.createParallelGroup(Alignment.TRAILING)
									.addComponent(labelAdresse, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
									.addGroup(gl_mid.createParallelGroup(Alignment.LEADING)
										.addComponent(labelNom, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
										.addComponent(labelDateDeNaissance, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)))
								.addComponent(labelPrnom, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE))
							.addGap(10)
							.addGroup(gl_mid.createParallelGroup(Alignment.LEADING)
								.addComponent(txtPrnom, GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
								.addComponent(txtAdresse, GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
								.addComponent(txtDateDeNaissance, GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
								.addComponent(txtNom, GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)))
						.addGroup(gl_mid.createSequentialGroup()
							.addGroup(gl_mid.createParallelGroup(Alignment.LEADING)
								.addComponent(labelExpiration, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
								.addComponent(labelClasses, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
							.addGroup(gl_mid.createParallelGroup(Alignment.LEADING)
								.addComponent(txtClasses, GroupLayout.PREFERRED_SIZE, 551, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtExpiration, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(21))
		);
		gl_mid.setVerticalGroup(
			gl_mid.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mid.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_mid.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_mid.createSequentialGroup()
							.addGap(1)
							.addComponent(labelNom, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtNom, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_mid.createParallelGroup(Alignment.LEADING, false)
						.addComponent(txtPrnom, 0, 0, Short.MAX_VALUE)
						.addComponent(labelPrnom, GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_mid.createParallelGroup(Alignment.LEADING, false)
						.addComponent(txtDateDeNaissance, Alignment.TRAILING, 0, 0, Short.MAX_VALUE)
						.addComponent(labelDateDeNaissance, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_mid.createParallelGroup(Alignment.LEADING, false)
						.addComponent(txtAdresse, 0, 0, Short.MAX_VALUE)
						.addComponent(labelAdresse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_mid.createParallelGroup(Alignment.TRAILING)
						.addComponent(labelTelephone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtTelephone, 0, 0, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
					.addGroup(gl_mid.createParallelGroup(Alignment.TRAILING)
						.addComponent(txtCourriel, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_mid.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtAssurancePersonnelle, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdBtnAssurance)
						.addComponent(rdbtnAssuranceNon))
					.addGap(18)
					.addComponent(labelInformationsPermis, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(13)
					.addGroup(gl_mid.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(txtClasses, 0, 0, Short.MAX_VALUE)
						.addComponent(labelClasses, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_mid.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(txtExpiration, 0, 0, Short.MAX_VALUE)
						.addComponent(labelExpiration, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_mid.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnValider, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnModifier, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(20))
		);
		mid.setLayout(gl_mid);
	}
}
