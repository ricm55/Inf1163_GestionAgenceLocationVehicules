package InterfaceGraphique;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import InterfaceGraphique.InterfaceAccueil.Action;
import controleur.ClientControleur;

public class RechercheClient extends JFrame
{

	private JPanel contentPane;
	private JTextField txtRechercheDeClient;
	private JTextField textTelephone;
	private JTextField txtEntre;
	private JTextField txtNom;
	private JTextField txtContinuerAvecCe;
	private static RechercheClient frame;
	private static ClientControleur controleurClient;
	private static Action actionEnCours;

	/**
	 * Launch the frame.
	 */
	public static void launch(Action action)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					frame = new RechercheClient();
					frame.setVisible(true);
					actionEnCours = action;
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
	public RechercheClient()
	{
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
		btnBackToHome.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				frame.dispose();
				InterfaceAccueil.launch();
			}
		});
		btnBackToHome.setForeground(Color.WHITE);
		btnBackToHome.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnBackToHome.setBackground(Color.DARK_GRAY);
		GroupLayout gl_Left = new GroupLayout(Left);
		gl_Left.setHorizontalGroup(
			gl_Left.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Left.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnBackToHome, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_Left.setVerticalGroup(
			gl_Left.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_Left.createSequentialGroup()
					.addContainerGap(354, Short.MAX_VALUE)
					.addComponent(btnBackToHome, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		Left.setLayout(gl_Left);

		JPanel up = new JPanel();
		contentPane.add(up, BorderLayout.NORTH);
		up.setLayout(new BorderLayout(0, 0));

		txtRechercheDeClient = new JTextField();
		txtRechercheDeClient.setForeground(new Color(255, 255, 255));
		txtRechercheDeClient.setBackground(new Color(25, 25, 112));
		txtRechercheDeClient.setEditable(false);
		txtRechercheDeClient.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtRechercheDeClient.setHorizontalAlignment(SwingConstants.CENTER);
		txtRechercheDeClient.setText("Recherche de client");
		up.add(txtRechercheDeClient);
		txtRechercheDeClient.setColumns(10);

		JPanel mid = new JPanel();
		mid.setBackground(SystemColor.textHighlight);
		contentPane.add(mid, BorderLayout.CENTER);
		mid.setLayout(null);

		textTelephone = new JTextField();
		textTelephone.setBounds(269, 108, 275, 27);
		mid.add(textTelephone);
		textTelephone.setColumns(10);

		txtEntre = new JTextField();
		txtEntre.setForeground(Color.WHITE);
		txtEntre.setBackground(Color.DARK_GRAY);
		txtEntre.setText("Entrer le num\u00E9ro de t\u00E9l\u00E9phone");
		txtEntre.setHorizontalAlignment(SwingConstants.CENTER);
		txtEntre.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtEntre.setEditable(false);
		txtEntre.setColumns(10);
		txtEntre.setBounds(125, 73, 419, 27);
		mid.add(txtEntre);

		txtNom = new JTextField();
		txtNom.setForeground(Color.WHITE);
		txtNom.setText("Nom");
		txtNom.setHorizontalAlignment(SwingConstants.CENTER);
		txtNom.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtNom.setEditable(false);
		txtNom.setColumns(10);
		txtNom.setBackground(Color.DARK_GRAY);
		txtNom.setBounds(125, 169, 419, 27);
		mid.add(txtNom);

		txtContinuerAvecCe = new JTextField();
		txtContinuerAvecCe.setForeground(Color.DARK_GRAY);
		txtContinuerAvecCe.setText("Continuer avec ce client ?");
		txtContinuerAvecCe.setHorizontalAlignment(SwingConstants.CENTER);
		txtContinuerAvecCe.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtContinuerAvecCe.setEditable(false);
		txtContinuerAvecCe.setColumns(10);
		txtContinuerAvecCe.setBackground(Color.WHITE);
		txtContinuerAvecCe.setBounds(125, 207, 419, 27);
		mid.add(txtContinuerAvecCe);

		JButton btnOui = new JButton("Oui");
		btnOui.setEnabled(false);
		btnOui.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				frame.dispose();
				VerifierInformationClient.launch(actionEnCours, controleurClient);
				
				/*switch(actionEnCours)
				{
					case LOCATION:
						LocationVehicule.launch();
						break;
					case RESERVATION:
						//interface reservation
						break;
					case VOIR_COMPTE_CLIENT:
						//interface compte client
						break;
					default:
						break;
				}*/
			}
		});
		btnOui.setForeground(Color.WHITE);
		btnOui.setBackground(new Color(60, 179, 113));
		btnOui.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnOui.setBounds(125, 245, 192, 29);
		mid.add(btnOui);

		JButton btnNon = new JButton("Non");
		btnNon.setEnabled(false);
		btnNon.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			}
		});
		btnNon.setForeground(Color.WHITE);
		btnNon.setBackground(new Color(165, 42, 42));
		btnNon.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnNon.setBounds(352, 245, 192, 29);
		mid.add(btnNon);

		JButton btnEnvoyer = new JButton("Envoyer");
		btnEnvoyer.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try {
					controleurClient = new ClientControleur(textTelephone.getText());
				} catch (SQLException e2) {
					// TODO Auto-generated catch block

					e2.printStackTrace();
				} catch (ParseException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();

				}
				
				
					
						try {
							if(controleurClient.getClient() == null)
							{
								JOptionPane.showMessageDialog(null, "Ce num\u00E9ro n'est pas li\u00E9 \u00E0 un compte client.");
							}
							else
							{
								try {
									textTelephone.setText(controleurClient.getNomClient() + ", " + controleurClient.getPrenomClient());
								} catch (SQLException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								} catch (ParseException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								btnOui.setEnabled(true);
								btnNon.setEnabled(true);
							}
						} catch (HeadlessException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (ParseException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					
				
			}

		});
		btnEnvoyer.setBackground(new Color(60, 179, 113));
		btnEnvoyer.setForeground(Color.WHITE);
		btnEnvoyer.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnEnvoyer.setBounds(125, 108, 122, 27);
		mid.add(btnEnvoyer);
	}
}
