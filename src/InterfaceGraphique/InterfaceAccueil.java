  package InterfaceGraphique;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Button;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.TextArea;
import java.awt.Color;
import java.awt.SystemColor;

public class InterfaceAccueil extends JFrame {

	private JPanel contentPane;
	private JTextField locationAccueil;
	private static InterfaceAccueil frame ;
	private static RechercheClient rc ;

	/**
	 * Launch the application.
	 */
	public static void launch() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new InterfaceAccueil();
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
	public InterfaceAccueil() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 875, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel leftPanel = new JPanel();
		leftPanel.setBackground(new Color(255, 165, 0));
		contentPane.add(leftPanel, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("Location");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		
		JButton btnNewButton_1_1 = new JButton("Location");
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnNewButton_1_1.setBackground(Color.DARK_GRAY);
		
		JButton logout = new JButton("Deconnexion");
		logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		logout.setForeground(Color.WHITE);
		logout.setFont(new Font("Verdana", Font.PLAIN, 12));
		logout.setBackground(Color.DARK_GRAY);
		
		JButton btnCreerLocation = new JButton("Creer Location");
		btnCreerLocation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				rc.launch();
			}
		});
		btnCreerLocation.setForeground(Color.WHITE);
		btnCreerLocation.setFont(new Font("Verdana", Font.PLAIN, 10));
		btnCreerLocation.setBackground(Color.DARK_GRAY);
		GroupLayout gl_leftPanel = new GroupLayout(leftPanel);
		gl_leftPanel.setHorizontalGroup(
			gl_leftPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_leftPanel.createSequentialGroup()
					.addGroup(gl_leftPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_leftPanel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_leftPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_leftPanel.createSequentialGroup()
							.addGap(15)
							.addComponent(logout, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)))
					.addGap(33))
				.addGroup(gl_leftPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnCreerLocation, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(49, Short.MAX_VALUE))
		);
		gl_leftPanel.setVerticalGroup(
			gl_leftPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_leftPanel.createSequentialGroup()
					.addGap(20)
					.addComponent(btnCreerLocation, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(121)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(107)
					.addComponent(logout, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(19, Short.MAX_VALUE))
		);
		leftPanel.setLayout(gl_leftPanel);
		
		JPanel midPanel = new JPanel();
		midPanel.setBackground(SystemColor.textHighlight);
		contentPane.add(midPanel, BorderLayout.CENTER);
		midPanel.setLayout(null);
		
		JTextArea txtrPrnomEtNom = new JTextArea();
		txtrPrnomEtNom.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtrPrnomEtNom.setText("Pr\u00E9nom et nom");
		txtrPrnomEtNom.setBounds(10, 11, 200, 38);
		midPanel.add(txtrPrnomEtNom);
		
		JTextArea txtrPrnomEtNom_1 = new JTextArea();
		txtrPrnomEtNom_1.setText("Pr\u00E9nom et nom");
		txtrPrnomEtNom_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtrPrnomEtNom_1.setBounds(10, 60, 200, 38);
		midPanel.add(txtrPrnomEtNom_1);
		
		JTextArea txtrPrnomEtNom_3 = new JTextArea();
		txtrPrnomEtNom_3.setText("Pr\u00E9nom et nom");
		txtrPrnomEtNom_3.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtrPrnomEtNom_3.setBounds(10, 109, 200, 38);
		midPanel.add(txtrPrnomEtNom_3);
		
		JButton locationBouton_1_4 = new JButton("Location");
		locationBouton_1_4.setFont(new Font("Verdana", Font.PLAIN, 16));
		locationBouton_1_4.setBounds(362, 15, 110, 35);
		midPanel.add(locationBouton_1_4);
		
		JButton locationBouton_1_5 = new JButton("Location");
		locationBouton_1_5.setFont(new Font("Verdana", Font.PLAIN, 16));
		locationBouton_1_5.setBounds(362, 64, 110, 35);
		midPanel.add(locationBouton_1_5);
		
		JButton locationBouton_1_6 = new JButton("Location");
		locationBouton_1_6.setFont(new Font("Verdana", Font.PLAIN, 16));
		locationBouton_1_6.setBounds(362, 112, 110, 35);
		midPanel.add(locationBouton_1_6);
		
		locationAccueil = new JTextField();
		locationAccueil.setText("Location en cours");
		locationAccueil.setHorizontalAlignment(SwingConstants.CENTER);
		locationAccueil.setForeground(Color.WHITE);
		locationAccueil.setFont(new Font("Verdana", Font.PLAIN, 16));
		locationAccueil.setEditable(false);
		locationAccueil.setColumns(10);
		locationAccueil.setBackground(new Color(25, 25, 112));
		contentPane.add(locationAccueil, BorderLayout.NORTH);
	}
}
