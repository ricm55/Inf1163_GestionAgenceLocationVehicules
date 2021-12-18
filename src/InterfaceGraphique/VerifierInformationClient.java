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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

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
		txtpnInformationsPermisDe.setForeground(Color.WHITE);
		txtpnInformationsPermisDe.setBackground(Color.DARK_GRAY);
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
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnModifier.setBackground(Color.CYAN);
		
		textField = new JTextField();
		textField.setText("Forfait");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Verdana", Font.PLAIN, 16));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(Color.DARK_GRAY);
		
		textField_1 = new JTextField();
		textField_1.setText("Assurance");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setForeground(Color.WHITE);
		textField_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(Color.DARK_GRAY);
		
		textField_2 = new JTextField();
		textField_2.setText("Dur\u00E9e");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setForeground(Color.WHITE);
		textField_2.setFont(new Font("Verdana", Font.PLAIN, 16));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBackground(Color.DARK_GRAY);
		
		textField_3 = new JTextField();
		textField_3.setText("Classe");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setForeground(Color.WHITE);
		textField_3.setFont(new Font("Verdana", Font.PLAIN, 16));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBackground(Color.DARK_GRAY);
		
		textField_4 = new JTextField();
		textField_4.setText("Classe");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setForeground(Color.WHITE);
		textField_4.setFont(new Font("Verdana", Font.PLAIN, 16));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBackground(Color.DARK_GRAY);
		
		textField_5 = new JTextField();
		textField_5.setText("Classe");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setForeground(Color.WHITE);
		textField_5.setFont(new Font("Verdana", Font.PLAIN, 16));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBackground(Color.DARK_GRAY);
		
		textField_6 = new JTextField();
		textField_6.setText("Classe");
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setForeground(Color.WHITE);
		textField_6.setFont(new Font("Verdana", Font.PLAIN, 16));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBackground(Color.DARK_GRAY);

		GroupLayout gl_mid = new GroupLayout(mid);
		gl_mid.setHorizontalGroup(
			gl_mid.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_mid.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_mid.createParallelGroup(Alignment.LEADING)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_mid.createParallelGroup(Alignment.LEADING)
						.addComponent(txtpnNom, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
						.addComponent(txtpnPrnom, Alignment.TRAILING)
						.addComponent(txtpnDateDeNaissance, Alignment.TRAILING)
						.addComponent(txtpnRue, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE))
					.addContainerGap())
				.addGroup(gl_mid.createSequentialGroup()
					.addGap(45)
					.addComponent(btnModifier, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
					.addComponent(btnValider, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
					.addGap(51))
				.addGroup(gl_mid.createSequentialGroup()
					.addContainerGap()
					.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtpnInformationsPermisDe_1, GroupLayout.PREFERRED_SIZE, 562, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_mid.createSequentialGroup()
					.addContainerGap()
					.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtpnDateExpirationDu, GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_mid.createSequentialGroup()
					.addContainerGap()
					.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
					.addComponent(txtpnClasses, GroupLayout.PREFERRED_SIZE, 562, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_mid.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtpnInformationsPermisDe, GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_mid.setVerticalGroup(
			gl_mid.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mid.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_mid.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_mid.createSequentialGroup()
							.addComponent(txtpnNom, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtpnPrnom, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtpnDateDeNaissance, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtpnRue, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_mid.createSequentialGroup()
							.addGap(1)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))
					.addGap(11)
					.addGroup(gl_mid.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtpnInformationsPermisDe_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addGap(20)
					.addComponent(txtpnInformationsPermisDe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_mid.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtpnClasses, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_mid.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtpnDateExpirationDu, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
					.addGroup(gl_mid.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnValider, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnModifier, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(20))
		);
		mid.setLayout(gl_mid);
	}
}
