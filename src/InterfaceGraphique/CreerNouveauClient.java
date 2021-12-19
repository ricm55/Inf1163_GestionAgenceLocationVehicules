package InterfaceGraphique;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controleur.ClientControleur;

import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class CreerNouveauClient extends JFrame
{

	private JPanel contentPane;
	private JTextField txtVeuillezEntrerLes;
	private JTextField labelExpiration;
	private JTextField labelClasses;
	private JTextField labelTelephone;
	private JTextField labelNom;
	private JTextField labelPrenom;
	private JTextField labelDateNaissance;
	private JTextField labelAdresse;
	private static CreerNouveauClient frame;
	private static ClientControleur controleurClient;
	
	String pattern = "yyyy-MM-dd";
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
	private JTextField labelEmail;
	private JTextField labelAssurance;

	/**
	 * Launch the application.
	 */
	public static void launch()
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					frame = new CreerNouveauClient();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CreerNouveauClient()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 872, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel left = new JPanel();
		left.setBackground(new Color(255, 165, 0));
		contentPane.add(left, BorderLayout.WEST);

		JButton btnRetour = new JButton("Retour");
		btnRetour.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				frame.dispose();
				InterfaceAccueil.launch();
			}
		});
		btnRetour.setForeground(Color.WHITE);
		btnRetour.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnRetour.setBackground(Color.DARK_GRAY);
		GroupLayout gl_left = new GroupLayout(left);
		gl_left.setHorizontalGroup(gl_left.createParallelGroup(Alignment.LEADING).addGap(0, 130, Short.MAX_VALUE)
				.addGroup(gl_left.createSequentialGroup().addContainerGap()
						.addComponent(btnRetour, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		gl_left.setVerticalGroup(gl_left.createParallelGroup(Alignment.TRAILING).addGap(0, 401, Short.MAX_VALUE)
				.addGroup(gl_left.createSequentialGroup().addContainerGap(355, Short.MAX_VALUE)
						.addComponent(btnRetour, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		left.setLayout(gl_left);

		txtVeuillezEntrerLes = new JTextField();
		txtVeuillezEntrerLes.setText("Veuillez entrer les informations du client");
		txtVeuillezEntrerLes.setHorizontalAlignment(SwingConstants.CENTER);
		txtVeuillezEntrerLes.setForeground(Color.WHITE);
		txtVeuillezEntrerLes.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtVeuillezEntrerLes.setEditable(false);
		txtVeuillezEntrerLes.setColumns(10);
		txtVeuillezEntrerLes.setBackground(new Color(25, 25, 112));
		contentPane.add(txtVeuillezEntrerLes, BorderLayout.NORTH);

		JPanel mid = new JPanel();
		mid.setBackground(SystemColor.textHighlight);
		contentPane.add(mid, BorderLayout.CENTER);

		labelExpiration = new JTextField();
		labelExpiration.setText("Expiration");
		labelExpiration.setHorizontalAlignment(SwingConstants.CENTER);
		labelExpiration.setForeground(Color.WHITE);
		labelExpiration.setFont(new Font("Verdana", Font.PLAIN, 11));
		labelExpiration.setEditable(false);
		labelExpiration.setColumns(10);
		labelExpiration.setBackground(Color.DARK_GRAY);

		JTextPane txtExpiration = new JTextPane();
		txtExpiration.setText((String) null);
		txtExpiration.setFont(new Font("Verdana", Font.PLAIN, 11));

		labelClasses = new JTextField();
		labelClasses.setText("Classe(s)");
		labelClasses.setHorizontalAlignment(SwingConstants.CENTER);
		labelClasses.setForeground(Color.WHITE);
		labelClasses.setFont(new Font("Verdana", Font.PLAIN, 11));
		labelClasses.setEditable(false);
		labelClasses.setColumns(10);
		labelClasses.setBackground(Color.DARK_GRAY);

		JTextPane txtClasses = new JTextPane();
		txtClasses.setText((String) null);
		txtClasses.setFont(new Font("Verdana", Font.PLAIN, 11));

		JTextPane labelInformationsPermis = new JTextPane();
		labelInformationsPermis.setText("Informations sur le permis de conduire");
		labelInformationsPermis.setForeground(Color.WHITE);
		labelInformationsPermis.setFont(new Font("Verdana", Font.PLAIN, 11));
		labelInformationsPermis.setEditable(false);
		labelInformationsPermis.setBackground(Color.DARK_GRAY);

		labelTelephone = new JTextField();
		labelTelephone.setText("T\u00E9l\u00E9phone");
		labelTelephone.setHorizontalAlignment(SwingConstants.CENTER);
		labelTelephone.setForeground(Color.WHITE);
		labelTelephone.setFont(new Font("Verdana", Font.PLAIN, 11));
		labelTelephone.setEditable(false);
		labelTelephone.setColumns(10);
		labelTelephone.setBackground(Color.DARK_GRAY);

		JTextPane txtTelephone = new JTextPane();
		txtTelephone.setText((String) null);
		txtTelephone.setFont(new Font("Verdana", Font.PLAIN, 11));

		labelNom = new JTextField();
		labelNom.setText("Nom");
		labelNom.setHorizontalAlignment(SwingConstants.CENTER);
		labelNom.setForeground(Color.WHITE);
		labelNom.setFont(new Font("Verdana", Font.PLAIN, 11));
		labelNom.setEditable(false);
		labelNom.setColumns(10);
		labelNom.setBackground(Color.DARK_GRAY);

		labelPrenom = new JTextField();
		labelPrenom.setText("Pr\u00E9nom");
		labelPrenom.setHorizontalAlignment(SwingConstants.CENTER);
		labelPrenom.setForeground(Color.WHITE);
		labelPrenom.setFont(new Font("Verdana", Font.PLAIN, 11));
		labelPrenom.setEditable(false);
		labelPrenom.setColumns(10);
		labelPrenom.setBackground(Color.DARK_GRAY);

		labelDateNaissance = new JTextField();
		labelDateNaissance.setText("Date de naissance");
		labelDateNaissance.setHorizontalAlignment(SwingConstants.CENTER);
		labelDateNaissance.setForeground(Color.WHITE);
		labelDateNaissance.setFont(new Font("Verdana", Font.PLAIN, 11));
		labelDateNaissance.setEditable(false);
		labelDateNaissance.setColumns(10);
		labelDateNaissance.setBackground(Color.DARK_GRAY);

		labelAdresse = new JTextField();
		labelAdresse.setText("Adresse");
		labelAdresse.setHorizontalAlignment(SwingConstants.CENTER);
		labelAdresse.setForeground(Color.WHITE);
		labelAdresse.setFont(new Font("Verdana", Font.PLAIN, 11));
		labelAdresse.setEditable(false);
		labelAdresse.setColumns(10);
		labelAdresse.setBackground(Color.DARK_GRAY);

		JTextPane txtAdresse = new JTextPane();
		txtAdresse.setText((String) null);
		txtAdresse.setFont(new Font("Verdana", Font.PLAIN, 11));

		JTextPane txtDateDeNaissance = new JTextPane();
		txtDateDeNaissance.setText((String) null);
		txtDateDeNaissance.setFont(new Font("Verdana", Font.PLAIN, 11));

		JTextPane txtPrenom = new JTextPane();
		txtPrenom.setText((String) null);
		txtPrenom.setFont(new Font("Verdana", Font.PLAIN, 11));

		JTextPane txtNom = new JTextPane();
		txtNom.setText((String) null);
		txtNom.setFont(new Font("Verdana", Font.PLAIN, 11));
		
		JTextPane txtCourriel = new JTextPane();
		txtCourriel.setText((String) null);
		txtCourriel.setFont(new Font("Verdana", Font.PLAIN, 11));
		txtCourriel.setEditable(false);
		
		JRadioButton rdBtnAssurance = new JRadioButton("Oui");
		rdBtnAssurance.setForeground(Color.WHITE);
		rdBtnAssurance.setBackground(SystemColor.textHighlight);
		
		JRadioButton rdbtnAssuranceNon = new JRadioButton("Non");
		rdbtnAssuranceNon.setForeground(Color.WHITE);
		rdbtnAssuranceNon.setBackground(SystemColor.textHighlight);
		
		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//ajouter courriel et assurance, voir clientControleur ligne 62 pour la structure
				controleurClient.creerNouveauClient(txtNom.getText(), txtPrenom.getText(), simpleDateFormat.parse(txtDateDeNaissance.getText()),
						txtAdresse.getText(), txtTelephone.getText(), txtClasses.getText(), simpleDateFormat.parse(txtExpiration.getText()),
						rdBtnAssurance.isSelected(), txtCourriel.getText());
			}
		});
		btnValider.setForeground(Color.WHITE);
		btnValider.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnValider.setBackground(Color.DARK_GRAY);
		
		labelEmail = new JTextField();
		labelEmail.setText("Email");
		labelEmail.setHorizontalAlignment(SwingConstants.CENTER);
		labelEmail.setForeground(Color.WHITE);
		labelEmail.setFont(new Font("Verdana", Font.PLAIN, 11));
		labelEmail.setEditable(false);
		labelEmail.setColumns(10);
		labelEmail.setBackground(Color.DARK_GRAY);
		
		labelAssurance = new JTextField();
		labelAssurance.setText("Assurance personnelle");
		labelAssurance.setHorizontalAlignment(SwingConstants.CENTER);
		labelAssurance.setForeground(Color.WHITE);
		labelAssurance.setFont(new Font("Verdana", Font.PLAIN, 11));
		labelAssurance.setEditable(false);
		labelAssurance.setColumns(10);
		labelAssurance.setBackground(Color.DARK_GRAY);
		
		
		GroupLayout gl_mid = new GroupLayout(mid);
		gl_mid.setHorizontalGroup(
			gl_mid.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mid.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_mid.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_mid.createSequentialGroup()
							.addComponent(labelAssurance, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(rdBtnAssurance, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnAssuranceNon, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(404, Short.MAX_VALUE))
						.addGroup(gl_mid.createSequentialGroup()
							.addGroup(gl_mid.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_mid.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_mid.createSequentialGroup()
										.addComponent(labelTelephone, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(txtTelephone, GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE))
									.addGroup(gl_mid.createSequentialGroup()
										.addGroup(gl_mid.createParallelGroup(Alignment.LEADING)
											.addComponent(labelNom, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
											.addComponent(labelPrenom, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
											.addComponent(labelDateNaissance, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
											.addComponent(labelAdresse, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE))
										.addGap(10)
										.addGroup(gl_mid.createParallelGroup(Alignment.LEADING)
											.addComponent(txtNom, GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
											.addComponent(txtAdresse, GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
											.addComponent(txtDateDeNaissance, GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
											.addComponent(txtPrenom, GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)))
									.addGroup(gl_mid.createSequentialGroup()
										.addComponent(labelExpiration, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(txtExpiration, GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE))
									.addGroup(gl_mid.createSequentialGroup()
										.addComponent(labelEmail, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(txtCourriel, GroupLayout.PREFERRED_SIZE, 551, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_mid.createSequentialGroup()
									.addComponent(labelClasses, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(txtClasses, GroupLayout.PREFERRED_SIZE, 551, GroupLayout.PREFERRED_SIZE)))
							.addGap(19))
						.addGroup(gl_mid.createSequentialGroup()
							.addComponent(labelInformationsPermis, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(476, Short.MAX_VALUE))))
				.addGroup(gl_mid.createSequentialGroup()
					.addGap(189)
					.addComponent(btnValider, GroupLayout.PREFERRED_SIZE, 325, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(202, Short.MAX_VALUE))
		);
		gl_mid.setVerticalGroup(
			gl_mid.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_mid.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_mid.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_mid.createSequentialGroup()
							.addComponent(txtNom, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtPrenom, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtDateDeNaissance, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtAdresse, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_mid.createSequentialGroup()
							.addGap(1)
							.addComponent(labelNom, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(labelPrenom, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(labelDateNaissance, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(labelAdresse, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_mid.createParallelGroup(Alignment.LEADING)
						.addComponent(labelTelephone, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtTelephone, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_mid.createParallelGroup(Alignment.LEADING)
						.addComponent(labelEmail, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCourriel, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_mid.createParallelGroup(Alignment.BASELINE)
						.addComponent(labelAssurance, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdBtnAssurance)
						.addComponent(rdbtnAssuranceNon))
					.addPreferredGap(ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
					.addComponent(labelInformationsPermis, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_mid.createParallelGroup(Alignment.TRAILING)
						.addComponent(labelClasses, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtClasses, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_mid.createParallelGroup(Alignment.LEADING)
						.addComponent(txtExpiration, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(labelExpiration, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnValider, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(6))
		);
		mid.setLayout(gl_mid);
	}
}
