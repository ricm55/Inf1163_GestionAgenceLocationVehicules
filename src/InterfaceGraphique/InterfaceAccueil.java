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
import javax.swing.JList;

public class InterfaceAccueil extends JFrame
{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField locationAccueil;
	private static InterfaceAccueil frame;
	private JTextField txtLocationEnCours;
	
	public enum Action {LOCATION, RESERVATION, CONSULTER_INVENTAIRE, VOIR_COMPTE_CLIENT}

	/**
	 * Launch the frame.
	 */
	public static void launch()
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					frame = new InterfaceAccueil();
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
	public InterfaceAccueil()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 875, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel leftPanel = new JPanel();
		leftPanel.setBackground(new Color(255, 165, 0));
		contentPane.add(leftPanel, BorderLayout.WEST);

		/**
		 * Bouton de deconnexion
		 */
		JButton btnDeconnextion = new JButton("D\u00E9connexion");
		btnDeconnextion.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				frame.dispose();
			}
		});
		btnDeconnextion.setForeground(Color.WHITE);
		btnDeconnextion.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnDeconnextion.setBackground(Color.DARK_GRAY);

		/**
		 * Bouton de location
		 */
		JButton btnLocation = new JButton("Location");
		btnLocation.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				frame.dispose();
				RechercheClient.launch(Action.LOCATION);
			}
		});
		btnLocation.setForeground(Color.WHITE);
		btnLocation.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnLocation.setBackground(Color.DARK_GRAY);

		/**
		 * Bouton de reservation
		 */
		JButton btnReservation = new JButton("R\u00E9servation");
		btnReservation.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				frame.dispose();
				RechercheClient.launch(Action.RESERVATION);
			}
		});
		btnReservation.setForeground(Color.WHITE);
		btnReservation.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnReservation.setBackground(Color.DARK_GRAY);

		/**
		 * Bouton catalogue
		 */
		JButton btnCatalogue = new JButton("Catalogue");
		btnCatalogue.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				frame.dispose();
				RechercheClient.launch(Action.CONSULTER_INVENTAIRE);
			}
		});
		btnCatalogue.setForeground(Color.WHITE);
		btnCatalogue.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnCatalogue.setBackground(Color.DARK_GRAY);

		/**
		 * Bouton de compte client
		 */
		JButton btnCompteClient = new JButton("Compte Client");
		btnCompteClient.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				frame.dispose();
				RechercheClient.launch(Action.VOIR_COMPTE_CLIENT);
			}
		});
		btnCompteClient.setForeground(Color.WHITE);
		btnCompteClient.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnCompteClient.setBackground(Color.DARK_GRAY);
		
		GroupLayout gl_leftPanel = new GroupLayout(leftPanel);
		gl_leftPanel.setHorizontalGroup(gl_leftPanel.createParallelGroup(Alignment.TRAILING).addGroup(gl_leftPanel
				.createSequentialGroup()
				.addGroup(gl_leftPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_leftPanel.createSequentialGroup().addGap(15).addComponent(btnDeconnextion,
								GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
						.addGroup(gl_leftPanel.createSequentialGroup().addContainerGap().addComponent(btnLocation,
								GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
						.addGroup(gl_leftPanel.createSequentialGroup().addContainerGap().addComponent(btnReservation,
								GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_leftPanel.createSequentialGroup().addContainerGap().addComponent(btnCatalogue,
								GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_leftPanel.createSequentialGroup().addContainerGap().addComponent(btnCompteClient,
								GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap()));
		gl_leftPanel.setVerticalGroup(gl_leftPanel.createParallelGroup(Alignment.LEADING).addGroup(gl_leftPanel
				.createSequentialGroup().addGap(20)
				.addComponent(btnLocation, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE).addGap(18)
				.addComponent(btnReservation, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE).addGap(18)
				.addComponent(btnCatalogue, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE).addGap(18)
				.addComponent(btnCompteClient, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE).addGap(143)
				.addComponent(btnDeconnextion, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE).addContainerGap()));
		leftPanel.setLayout(gl_leftPanel);

		JPanel midPanel = new JPanel();
		midPanel.setBackground(SystemColor.textHighlight);
		contentPane.add(midPanel, BorderLayout.CENTER);
		midPanel.setLayout(null);

		txtLocationEnCours = new JTextField();
		txtLocationEnCours.setForeground(Color.WHITE);
		txtLocationEnCours.setBackground(Color.DARK_GRAY);
		txtLocationEnCours.setHorizontalAlignment(SwingConstants.CENTER);
		txtLocationEnCours.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtLocationEnCours.setText("Locations en cours");
		txtLocationEnCours.setBounds(30, 27, 609, 20);
		midPanel.add(txtLocationEnCours);
		txtLocationEnCours.setColumns(10);

		JTextArea txtListeLocations = new JTextArea();
		txtListeLocations.setEditable(false);
		txtListeLocations.setForeground(Color.WHITE);
		txtListeLocations.setBackground(SystemColor.textHighlight);
		txtListeLocations.setLineWrap(true);
		txtListeLocations.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtListeLocations.setText("C\u00F4t\u00E9, Gabriel : Mazda 5, 2015, Rouge, jusqu'au 2021-12-21");
		txtListeLocations.setBounds(30, 58, 609, 318);
		midPanel.add(txtListeLocations);

		locationAccueil = new JTextField();
		locationAccueil.setText("Accueil");
		locationAccueil.setHorizontalAlignment(SwingConstants.CENTER);
		locationAccueil.setForeground(Color.WHITE);
		locationAccueil.setFont(new Font("Verdana", Font.PLAIN, 16));
		locationAccueil.setEditable(false);
		locationAccueil.setColumns(10);
		locationAccueil.setBackground(new Color(25, 25, 112));
		contentPane.add(locationAccueil, BorderLayout.NORTH);
	}
}
