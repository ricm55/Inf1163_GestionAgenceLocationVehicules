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
					actionEnCours = action;
					controleurClient = controleur;
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
		btnRetour.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				frame.dispose();
				InterfaceAccueil.launch();
			}
		});
		btnRetour.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnRetour.setBackground(Color.CYAN);

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

		JButton btnValider = new JButton("Valider");
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
		btnValider.setBackground(Color.CYAN);

		JButton btnModifier = new JButton("Modifier");
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
			}
		});
		btnModifier.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnModifier.setBackground(Color.CYAN);

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
		

		GroupLayout gl_mid = new GroupLayout(mid);
		gl_mid.setHorizontalGroup(
			gl_mid.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mid.createSequentialGroup()
					.addGap(38)
					.addComponent(btnModifier, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
					.addComponent(btnValider, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
					.addGap(51))
				.addGroup(gl_mid.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_mid.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_mid.createSequentialGroup()
							.addComponent(labelExpiration, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtExpiration))
						.addGroup(gl_mid.createSequentialGroup()
							.addComponent(labelClasses, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(txtClasses, GroupLayout.PREFERRED_SIZE, 551, GroupLayout.PREFERRED_SIZE))
						.addComponent(labelInformationsPermis, Alignment.LEADING)
						.addGroup(Alignment.LEADING, gl_mid.createSequentialGroup()
							.addComponent(labelTelephone, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtTelephone))
						.addGroup(Alignment.LEADING, gl_mid.createSequentialGroup()
							.addGroup(gl_mid.createParallelGroup(Alignment.LEADING)
								.addComponent(labelNom, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
								.addComponent(labelPrnom, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
								.addComponent(labelDateDeNaissance, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
								.addComponent(labelAdresse, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE))
							.addGap(10)
							.addGroup(gl_mid.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtAdresse)
								.addComponent(txtDateDeNaissance)
								.addComponent(txtPrnom)
								.addComponent(txtNom, GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE))))
					.addContainerGap(21, Short.MAX_VALUE))
		);
		gl_mid.setVerticalGroup(
			gl_mid.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mid.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_mid.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_mid.createSequentialGroup()
							.addComponent(txtNom, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtPrnom, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtDateDeNaissance, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtAdresse, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_mid.createSequentialGroup()
							.addGap(1)
							.addComponent(labelNom, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(labelPrnom, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(labelDateDeNaissance, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(labelAdresse, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_mid.createParallelGroup(Alignment.LEADING)
						.addComponent(labelTelephone, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtTelephone, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addGap(20)
					.addComponent(labelInformationsPermis, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_mid.createParallelGroup(Alignment.LEADING)
						.addComponent(labelClasses, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtClasses, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_mid.createParallelGroup(Alignment.LEADING)
						.addComponent(labelExpiration, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtExpiration, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
					.addGroup(gl_mid.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnValider, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnModifier, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(20))
		);
		mid.setLayout(gl_mid);
	}
}
