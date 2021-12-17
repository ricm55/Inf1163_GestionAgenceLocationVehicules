package InterfaceGraphique;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
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

		JTextPane txtpnInformationsPermisDe = new JTextPane();
		txtpnInformationsPermisDe.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtpnInformationsPermisDe.setText("Informations Permis de Conduire");

		JTextPane txtpnInformationsPermisDe_1 = new JTextPane();
		txtpnInformationsPermisDe_1.setText("#");
		txtpnInformationsPermisDe_1.setFont(new Font("Verdana", Font.PLAIN, 16));

		JTextPane txtpnNom = new JTextPane();
		txtpnNom.setText("Nom");
		txtpnNom.setFont(new Font("Verdana", Font.PLAIN, 16));

		JTextPane txtpnPrnom = new JTextPane();
		txtpnPrnom.setText("Pr\u00E9nom");
		txtpnPrnom.setFont(new Font("Verdana", Font.PLAIN, 16));

		JTextPane txtpnDateDeNaissance = new JTextPane();
		txtpnDateDeNaissance.setText("Date de naissance: AAAA-MM-JJ");
		txtpnDateDeNaissance.setFont(new Font("Verdana", Font.PLAIN, 16));

		JTextPane txtpnRue = new JTextPane();
		txtpnRue.setText("# RUE");
		txtpnRue.setFont(new Font("Verdana", Font.PLAIN, 16));

		JTextPane txtpnClasses = new JTextPane();
		txtpnClasses.setText("Classe(S): #");
		txtpnClasses.setFont(new Font("Verdana", Font.PLAIN, 16));

		JTextPane txtpnDateExpirationDu = new JTextPane();
		txtpnDateExpirationDu.setText("Date expiration du permis: YYYY-MM-JJ");
		txtpnDateExpirationDu.setFont(new Font("Verdana", Font.PLAIN, 16));

		JTextPane txtpnDateDeDbut = new JTextPane();
		txtpnDateDeDbut.setText("Date de d\u00E9but de la location :");
		txtpnDateDeDbut.setFont(new Font("Verdana", Font.PLAIN, 16));

		JTextPane txtpnDate = new JTextPane();
		txtpnDate.setText("Date");
		txtpnDate.setFont(new Font("Verdana", Font.PLAIN, 16));

		JTextPane txtpnDateDeFin = new JTextPane();
		txtpnDateDeFin.setText("Date de fin de la location :");
		txtpnDateDeFin.setFont(new Font("Verdana", Font.PLAIN, 16));

		JTextPane txtpnDate_1 = new JTextPane();
		txtpnDate_1.setText("Date");
		txtpnDate_1.setFont(new Font("Verdana", Font.PLAIN, 16));

		JTextPane txtpnClasseDeVhicule = new JTextPane();
		txtpnClasseDeVhicule.setText("Classe de v\u00E9hicule souhait\u00E9:");
		txtpnClasseDeVhicule.setFont(new Font("Verdana", Font.PLAIN, 16));

		JTextPane txtpnClasse = new JTextPane();
		txtpnClasse.setText("Classe ");
		txtpnClasse.setFont(new Font("Verdana", Font.PLAIN, 16));

		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				//controleur validation informations client
			}
		});
		btnValider.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnValider.setBackground(Color.CYAN);

		GroupLayout gl_mid = new GroupLayout(mid);
		gl_mid.setHorizontalGroup(gl_mid.createParallelGroup(Alignment.TRAILING).addGroup(Alignment.LEADING, gl_mid
				.createSequentialGroup().addContainerGap()
				.addComponent(txtpnInformationsPermisDe, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
				.addComponent(txtpnDateDeDbut, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE)
				.addContainerGap())
				.addGroup(Alignment.LEADING,
						gl_mid.createSequentialGroup().addContainerGap()
								.addComponent(txtpnInformationsPermisDe_1, GroupLayout.PREFERRED_SIZE, 293,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
								.addComponent(txtpnDate, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
				.addGroup(Alignment.LEADING,
						gl_mid.createSequentialGroup().addContainerGap()
								.addComponent(txtpnNom, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
								.addComponent(txtpnDateDeFin, GroupLayout.PREFERRED_SIZE, 293,
										GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
				.addGroup(Alignment.LEADING,
						gl_mid.createSequentialGroup().addContainerGap()
								.addComponent(txtpnPrnom, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
								.addComponent(txtpnDate_1, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
				.addGroup(Alignment.LEADING, gl_mid.createSequentialGroup().addContainerGap()
						.addComponent(txtpnDateDeNaissance, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
						.addComponent(txtpnClasseDeVhicule, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
				.addGroup(gl_mid.createSequentialGroup()
						.addGroup(gl_mid.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_mid.createSequentialGroup().addContainerGap().addComponent(txtpnRue,
										GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_mid.createSequentialGroup().addContainerGap().addComponent(txtpnClasses,
										GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE)))
						.addGap(117)
						.addGroup(gl_mid.createParallelGroup(Alignment.LEADING)
								.addComponent(btnValider, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
								.addComponent(txtpnClasse, Alignment.TRAILING))
						.addContainerGap())
				.addGroup(Alignment.LEADING,
						gl_mid.createSequentialGroup().addContainerGap().addComponent(txtpnDateExpirationDu,
								GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(420, Short.MAX_VALUE)));
		gl_mid.setVerticalGroup(gl_mid.createParallelGroup(Alignment.LEADING).addGroup(gl_mid.createSequentialGroup()
				.addGroup(gl_mid.createParallelGroup(Alignment.LEADING).addGroup(gl_mid.createSequentialGroup()
						.addGap(20)
						.addGroup(gl_mid.createParallelGroup(Alignment.LEADING).addGroup(gl_mid.createSequentialGroup()
								.addGap(38)
								.addComponent(txtpnInformationsPermisDe_1, GroupLayout.PREFERRED_SIZE, 27,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(txtpnNom, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(txtpnPrnom, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(txtpnDateDeNaissance, GroupLayout.PREFERRED_SIZE, 27,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(txtpnRue, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_mid.createSequentialGroup().addGap(31)
										.addComponent(txtpnDate, GroupLayout.PREFERRED_SIZE, 27,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(txtpnDateDeFin, GroupLayout.PREFERRED_SIZE, 27,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(txtpnDate_1, GroupLayout.PREFERRED_SIZE, 27,
												GroupLayout.PREFERRED_SIZE)
										.addGap(13)
										.addComponent(txtpnClasseDeVhicule, GroupLayout.PREFERRED_SIZE, 27,
												GroupLayout.PREFERRED_SIZE)
										.addGap(11).addComponent(txtpnClasse, GroupLayout.PREFERRED_SIZE, 27,
												GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_mid.createSequentialGroup().addContainerGap()
								.addGroup(gl_mid.createParallelGroup(Alignment.LEADING)
										.addComponent(txtpnDateDeDbut, GroupLayout.PREFERRED_SIZE, 27,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(txtpnInformationsPermisDe, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
				.addPreferredGap(ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
				.addGroup(gl_mid.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_mid.createSequentialGroup()
								.addComponent(txtpnClasses, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
								.addGap(19).addComponent(txtpnDateExpirationDu, GroupLayout.PREFERRED_SIZE, 27,
										GroupLayout.PREFERRED_SIZE))
						.addComponent(btnValider, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
				.addContainerGap()));
		mid.setLayout(gl_mid);
	}
}
