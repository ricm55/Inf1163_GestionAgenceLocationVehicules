package InterfaceGraphique;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class RechercheClient extends JFrame {

	private JPanel contentPane;
	private JTextField txtRechercheDeClient;
	private JTextField textField;
	private JTextField txtEntre;
	private JTextField txtNom;
	private JTextField txtContinuerAvecCe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RechercheClient frame = new RechercheClient();
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
	public RechercheClient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 875, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel Left = new JPanel();
		Left.setBackground(Color.WHITE);
		contentPane.add(Left, BorderLayout.WEST);
		
		JButton btnNewButton = new JButton("Location");
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 16));
		
		JButton btnNewButton_1 = new JButton("Location");
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		GroupLayout gl_Left = new GroupLayout(Left);
		gl_Left.setHorizontalGroup(
			gl_Left.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Left.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_Left.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
						.addComponent(btnNewButton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_Left.setVerticalGroup(
			gl_Left.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Left.createSequentialGroup()
					.addGap(83)
					.addComponent(btnNewButton)
					.addGap(18)
					.addComponent(btnNewButton_1)
					.addGap(245))
		);
		Left.setLayout(gl_Left);
		
		JPanel Up = new JPanel();
		contentPane.add(Up, BorderLayout.NORTH);
		Up.setLayout(new BorderLayout(0, 0));
		
		txtRechercheDeClient = new JTextField();
		txtRechercheDeClient.setEditable(false);
		txtRechercheDeClient.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtRechercheDeClient.setHorizontalAlignment(SwingConstants.CENTER);
		txtRechercheDeClient.setText("Recherche de client");
		Up.add(txtRechercheDeClient);
		txtRechercheDeClient.setColumns(10);
		
		JPanel Mid = new JPanel();
		Mid.setBackground(Color.WHITE);
		contentPane.add(Mid, BorderLayout.CENTER);
		Mid.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(260, 68, 184, 27);
		Mid.add(textField);
		textField.setColumns(10);
		
		JButton btnEnvoyer = new JButton("Envoyer");
		btnEnvoyer.setBackground(Color.DARK_GRAY);
		btnEnvoyer.setForeground(Color.WHITE);
		btnEnvoyer.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnEnvoyer.setBounds(131, 68, 99, 29);
		Mid.add(btnEnvoyer);
		
		txtEntre = new JTextField();
		txtEntre.setForeground(Color.WHITE);
		txtEntre.setBackground(Color.DARK_GRAY);
		txtEntre.setText("Entrer le num\u00E9ro de t\u00E9l\u00E9phone");
		txtEntre.setHorizontalAlignment(SwingConstants.CENTER);
		txtEntre.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtEntre.setEditable(false);
		txtEntre.setColumns(10);
		txtEntre.setBounds(131, 28, 313, 27);
		Mid.add(txtEntre);
		
		txtNom = new JTextField();
		txtNom.setForeground(Color.WHITE);
		txtNom.setText("Nom");
		txtNom.setHorizontalAlignment(SwingConstants.CENTER);
		txtNom.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtNom.setEditable(false);
		txtNom.setColumns(10);
		txtNom.setBackground(Color.DARK_GRAY);
		txtNom.setBounds(131, 106, 313, 27);
		Mid.add(txtNom);
		
		txtContinuerAvecCe = new JTextField();
		txtContinuerAvecCe.setForeground(Color.DARK_GRAY);
		txtContinuerAvecCe.setText("Continuer avec ce client ?");
		txtContinuerAvecCe.setHorizontalAlignment(SwingConstants.CENTER);
		txtContinuerAvecCe.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtContinuerAvecCe.setEditable(false);
		txtContinuerAvecCe.setColumns(10);
		txtContinuerAvecCe.setBackground(Color.WHITE);
		txtContinuerAvecCe.setBounds(131, 144, 313, 27);
		Mid.add(txtContinuerAvecCe);
		
		JButton btnOui = new JButton("Oui");
		btnOui.setForeground(Color.WHITE);
		btnOui.setBackground(new Color(64, 64, 64));
		btnOui.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnOui.setBounds(131, 182, 122, 29);
		Mid.add(btnOui);
		
		JButton btnNon = new JButton("Non");
		btnNon.setForeground(Color.WHITE);
		btnNon.setBackground(Color.DARK_GRAY);
		btnNon.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnNon.setBounds(322, 182, 122, 29);
		Mid.add(btnNon);
	}
}
