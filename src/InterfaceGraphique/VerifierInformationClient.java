package InterfaceGraphique;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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

public class VerifierInformationClient extends JFrame {

	private JPanel contentPane;
	private JTextField txtVeuillezVrifierQue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VerifierInformationClient frame = new VerifierInformationClient();
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
	public VerifierInformationClient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 879, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel up = new JPanel();
		contentPane.add(up, BorderLayout.NORTH);
		up.setLayout(new BoxLayout(up, BoxLayout.X_AXIS));
		
		txtVeuillezVrifierQue = new JTextField();
		txtVeuillezVrifierQue.setHorizontalAlignment(SwingConstants.CENTER);
		txtVeuillezVrifierQue.setEditable(false);
		txtVeuillezVrifierQue.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtVeuillezVrifierQue.setText("Veuillez v\u00E9rifier que les informations du client sont exactes");
		txtVeuillezVrifierQue.setColumns(10);
		up.add(txtVeuillezVrifierQue);
		
		JPanel left = new JPanel();
		contentPane.add(left, BorderLayout.WEST);
		
		JButton locationBouton_1_1 = new JButton("Location");
		locationBouton_1_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		locationBouton_1_1.setBackground(Color.CYAN);
		
		JButton locationBouton_1_1_1 = new JButton("Location");
		locationBouton_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		locationBouton_1_1_1.setBackground(Color.CYAN);
		
		JButton locationBouton_1_1_2 = new JButton("Location");
		locationBouton_1_1_2.setFont(new Font("Verdana", Font.PLAIN, 16));
		locationBouton_1_1_2.setBackground(Color.CYAN);
		
		JButton locationBouton_1_1_3 = new JButton("Location");
		locationBouton_1_1_3.setFont(new Font("Verdana", Font.PLAIN, 16));
		locationBouton_1_1_3.setBackground(Color.CYAN);
		
		JButton locationBouton_1_1_3_2 = new JButton("Retour");
		locationBouton_1_1_3_2.setFont(new Font("Verdana", Font.PLAIN, 16));
		locationBouton_1_1_3_2.setBackground(Color.CYAN);
		GroupLayout gl_left = new GroupLayout(left);
		gl_left.setHorizontalGroup(
			gl_left.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_left.createSequentialGroup()
					.addContainerGap()
					.addComponent(locationBouton_1_1_3, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_left.createSequentialGroup()
					.addContainerGap()
					.addComponent(locationBouton_1_1_2, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_left.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(locationBouton_1_1_1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_left.createSequentialGroup()
					.addContainerGap()
					.addComponent(locationBouton_1_1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_left.createSequentialGroup()
					.addContainerGap()
					.addComponent(locationBouton_1_1_3_2, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_left.setVerticalGroup(
			gl_left.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_left.createSequentialGroup()
					.addContainerGap()
					.addComponent(locationBouton_1_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(locationBouton_1_1_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(locationBouton_1_1_2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(locationBouton_1_1_3, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
					.addComponent(locationBouton_1_1_3_2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		left.setLayout(gl_left);
		
		JPanel mid = new JPanel();
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
		
		JButton locationBouton_1_1_3_1 = new JButton("Valider");
		locationBouton_1_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		locationBouton_1_1_3_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		locationBouton_1_1_3_1.setBackground(Color.CYAN);
		GroupLayout gl_mid = new GroupLayout(mid);
		gl_mid.setHorizontalGroup(
			gl_mid.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mid.createSequentialGroup()
					.addComponent(txtpnInformationsPermisDe, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
					.addComponent(txtpnDateDeDbut, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_mid.createSequentialGroup()
					.addComponent(txtpnInformationsPermisDe_1, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
					.addComponent(txtpnDate, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_mid.createSequentialGroup()
					.addComponent(txtpnNom, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
					.addComponent(txtpnDateDeFin, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_mid.createSequentialGroup()
					.addComponent(txtpnPrnom, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
					.addComponent(txtpnDate_1, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_mid.createSequentialGroup()
					.addComponent(txtpnDateDeNaissance, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
					.addComponent(txtpnClasseDeVhicule, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE))
				.addGroup(Alignment.TRAILING, gl_mid.createSequentialGroup()
					.addGroup(gl_mid.createParallelGroup(Alignment.LEADING)
						.addComponent(txtpnRue, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtpnDateExpirationDu, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtpnClasses, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
					.addGroup(gl_mid.createParallelGroup(Alignment.LEADING)
						.addComponent(locationBouton_1_1_3_1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtpnClasse, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)))
		);
		gl_mid.setVerticalGroup(
			gl_mid.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mid.createSequentialGroup()
					.addGroup(gl_mid.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_mid.createSequentialGroup()
							.addGap(20)
							.addGroup(gl_mid.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_mid.createSequentialGroup()
									.addGap(38)
									.addComponent(txtpnInformationsPermisDe_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(txtpnNom, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(txtpnPrnom, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtpnDateDeNaissance, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(txtpnRue, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_mid.createSequentialGroup()
									.addGap(31)
									.addComponent(txtpnDate, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(txtpnDateDeFin, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(txtpnDate_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
									.addGap(13)
									.addComponent(txtpnClasseDeVhicule, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
									.addGap(11)
									.addComponent(txtpnClasse, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
							.addGroup(gl_mid.createParallelGroup(Alignment.LEADING)
								.addComponent(txtpnClasses, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
								.addComponent(locationBouton_1_1_3_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtpnDateExpirationDu, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_mid.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_mid.createParallelGroup(Alignment.LEADING)
								.addComponent(txtpnDateDeDbut, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtpnInformationsPermisDe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		mid.setLayout(gl_mid);
	}
}
