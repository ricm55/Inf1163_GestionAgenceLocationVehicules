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

public class InterfaceAccueil extends JFrame {

	private JPanel contentPane;
	private JTextField Titre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceAccueil frame = new InterfaceAccueil();
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
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		contentPane.add(panel, BorderLayout.NORTH);
		
		Titre = new JTextField();
		Titre.setEditable(false);
		Titre.setHorizontalAlignment(SwingConstants.CENTER);
		Titre.setFont(new Font("Verdana", Font.BOLD, 16));
		Titre.setText("Location en cours");
		panel.add(Titre);
		Titre.setColumns(10);
		
		JPanel leftPanel = new JPanel();
		leftPanel.setBackground(Color.WHITE);
		contentPane.add(leftPanel, BorderLayout.WEST);
		
		JButton locationBouton_1 = new JButton("Location");
		locationBouton_1.setBackground(Color.CYAN);
		locationBouton_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		locationBouton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton locationBouton_1_1 = new JButton("Location");
		locationBouton_1_1.setBackground(Color.CYAN);
		locationBouton_1_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		
		JButton locationBouton_1_2 = new JButton("Location");
		locationBouton_1_2.setBackground(Color.CYAN);
		locationBouton_1_2.setFont(new Font("Verdana", Font.PLAIN, 16));
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.BLACK);
		GroupLayout gl_leftPanel = new GroupLayout(leftPanel);
		gl_leftPanel.setHorizontalGroup(
			gl_leftPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_leftPanel.createSequentialGroup()
					.addGap(18)
					.addGroup(gl_leftPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(locationBouton_1_2, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
						.addComponent(locationBouton_1_1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
						.addComponent(locationBouton_1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 5, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_leftPanel.setVerticalGroup(
			gl_leftPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_leftPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(locationBouton_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(locationBouton_1_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(locationBouton_1_2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(241, Short.MAX_VALUE))
				.addComponent(textArea, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
		);
		leftPanel.setLayout(gl_leftPanel);
		
		JPanel midPanel = new JPanel();
		midPanel.setBackground(Color.WHITE);
		contentPane.add(midPanel, BorderLayout.CENTER);
		midPanel.setLayout(null);
		
		JPanel rightPanel = new JPanel();
		rightPanel.setBackground(Color.WHITE);
		rightPanel.setBounds(496, 0, 174, 393);
		midPanel.add(rightPanel);
		
		JButton locationBouton_1_3 = new JButton("Cr\u00E9er Location");
		locationBouton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		locationBouton_1_3.setFont(new Font("Verdana", Font.PLAIN, 16));
		GroupLayout gl_rightPanel = new GroupLayout(rightPanel);
		gl_rightPanel.setHorizontalGroup(
			gl_rightPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_rightPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(locationBouton_1_3, GroupLayout.PREFERRED_SIZE, 123, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_rightPanel.setVerticalGroup(
			gl_rightPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_rightPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(locationBouton_1_3, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(347, Short.MAX_VALUE))
		);
		rightPanel.setLayout(gl_rightPanel);
		
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
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBackground(Color.BLACK);
		textArea_1.setBounds(481, 0, 5, 393);
		midPanel.add(textArea_1);
	}
}
