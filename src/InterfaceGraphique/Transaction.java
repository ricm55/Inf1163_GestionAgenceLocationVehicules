package InterfaceGraphique;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class Transaction extends JFrame {

	private JPanel contentPane;
	private JTextField txtTransaction;
	private JTextField forfait_textField;
	private JTextField txtForfait;
	private JTextField assurance_textField;
	private JTextField txtAssurance;
	private JTextField duree_textField;
	private JTextField txtDure;
	private JTextField classe_textField;
	private JTextField txtClasse;
	private JTextField total_textField;
	private JTextField txtTotal;
	private JTextField forfaitTotalTxt;
	private JTextField assuranceTotalTxt;
	private JTextField dureeTotalTxt;
	private JTextField classeTotalTxt;
	private JTextField totalTxt;
	private JTextField versement_textfield;
	private JTextField pVersementTotal;
	public static int cash = 1 ;
	private static Transaction frame;

	/**
	 * Launch the application.
	 */
	public static void launch() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Transaction();
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
	public Transaction() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 878, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel Top = new JPanel();
		contentPane.add(Top, BorderLayout.NORTH);
		Top.setLayout(new BorderLayout(0, 0));
		
		txtTransaction = new JTextField();
		txtTransaction.setText("Transaction #");
		txtTransaction.setHorizontalAlignment(SwingConstants.CENTER);
		txtTransaction.setForeground(Color.WHITE);
		txtTransaction.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtTransaction.setEditable(false);
		txtTransaction.setColumns(10);
		txtTransaction.setBackground(new Color(25, 25, 112));
		Top.add(txtTransaction, BorderLayout.NORTH);
		
		JPanel Left = new JPanel();
		Left.setBackground(new Color(255, 165, 0));
		contentPane.add(Left, BorderLayout.WEST);
		
		JButton reservationBtn = new JButton("R\u00E9servation");
		reservationBtn.setForeground(Color.WHITE);
		reservationBtn.setFont(new Font("Verdana", Font.PLAIN, 16));
		reservationBtn.setBackground(Color.DARK_GRAY);
		
		JButton locationBtn = new JButton("Location");
		locationBtn.setForeground(Color.WHITE);
		locationBtn.setFont(new Font("Verdana", Font.PLAIN, 16));
		locationBtn.setBackground(Color.DARK_GRAY);
		
		JButton btnBackToHome = new JButton("Retour");
		btnBackToHome.setForeground(Color.WHITE);
		btnBackToHome.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnBackToHome.setBackground(Color.DARK_GRAY);
		btnBackToHome.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				frame.dispose();
				LocationVehicule.rendreVisible(true);
			}
		});
		
		JButton catalogueBtn = new JButton("Catalogue");
		catalogueBtn.setForeground(Color.WHITE);
		catalogueBtn.setFont(new Font("Verdana", Font.PLAIN, 16));
		catalogueBtn.setBackground(Color.DARK_GRAY);
		
		JButton compteClientBtn = new JButton("Compte Client");
		compteClientBtn.setForeground(Color.WHITE);
		compteClientBtn.setFont(new Font("Verdana", Font.PLAIN, 16));
		compteClientBtn.setBackground(Color.DARK_GRAY);
		GroupLayout gl_Left = new GroupLayout(Left);
		gl_Left.setHorizontalGroup(
			gl_Left.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_Left.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_Left.createParallelGroup(Alignment.TRAILING)
						.addComponent(locationBtn, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
						.addComponent(reservationBtn, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 122, Short.MAX_VALUE)
						.addComponent(compteClientBtn, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
						.addComponent(catalogueBtn, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
						.addComponent(btnBackToHome, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_Left.setVerticalGroup(
			gl_Left.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Left.createSequentialGroup()
					.addGap(19)
					.addComponent(locationBtn)
					.addGap(18)
					.addComponent(reservationBtn)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(catalogueBtn, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(compteClientBtn, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(168)
					.addComponent(btnBackToHome, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(22))
		);
		Left.setLayout(gl_Left);
		
		
		
		JPanel Mid = new JPanel();
		Mid.setLayout(null);
		Mid.setBackground(SystemColor.textHighlight);
		contentPane.add(Mid, BorderLayout.CENTER);
		
		forfait_textField = new JTextField();
		forfait_textField.setColumns(10);
		forfait_textField.setBounds(167, 22, 156, 27);
		Mid.add(forfait_textField);
		
		txtForfait = new JTextField();
		txtForfait.setText("Forfait");
		txtForfait.setHorizontalAlignment(SwingConstants.CENTER);
		txtForfait.setForeground(Color.WHITE);
		txtForfait.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtForfait.setEditable(false);
		txtForfait.setColumns(10);
		txtForfait.setBackground(Color.DARK_GRAY);
		txtForfait.setBounds(26, 22, 131, 27);
		Mid.add(txtForfait);
		
		JButton btnComptant = new JButton("Comptant");
		btnComptant.setForeground(Color.WHITE);
		btnComptant.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnComptant.setBackground(new Color(60, 179, 113));
		btnComptant.setBounds(87, 310, 122, 29);
		Mid.add(btnComptant);
		
		assurance_textField = new JTextField();
		assurance_textField.setColumns(10);
		assurance_textField.setBounds(167, 60, 156, 27);
		Mid.add(assurance_textField);
		
		txtAssurance = new JTextField();
		txtAssurance.setText("Assurance");
		txtAssurance.setHorizontalAlignment(SwingConstants.CENTER);
		txtAssurance.setForeground(Color.WHITE);
		txtAssurance.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtAssurance.setEditable(false);
		txtAssurance.setColumns(10);
		txtAssurance.setBackground(Color.DARK_GRAY);
		txtAssurance.setBounds(26, 60, 131, 27);
		Mid.add(txtAssurance);
		
		duree_textField = new JTextField();
		duree_textField.setColumns(10);
		duree_textField.setBounds(167, 98, 156, 27);
		Mid.add(duree_textField);
		
		txtDure = new JTextField();
		txtDure.setText("Dur\u00E9e");
		txtDure.setHorizontalAlignment(SwingConstants.CENTER);
		txtDure.setForeground(Color.WHITE);
		txtDure.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtDure.setEditable(false);
		txtDure.setColumns(10);
		txtDure.setBackground(Color.DARK_GRAY);
		txtDure.setBounds(26, 98, 131, 27);
		Mid.add(txtDure);
		
		classe_textField = new JTextField();
		classe_textField.setColumns(10);
		classe_textField.setBounds(167, 136, 156, 27);
		Mid.add(classe_textField);
		
		txtClasse = new JTextField();
		txtClasse.setText("Classe");
		txtClasse.setHorizontalAlignment(SwingConstants.CENTER);
		txtClasse.setForeground(Color.WHITE);
		txtClasse.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtClasse.setEditable(false);
		txtClasse.setColumns(10);
		txtClasse.setBackground(Color.DARK_GRAY);
		txtClasse.setBounds(26, 136, 131, 27);
		Mid.add(txtClasse);
		
		total_textField = new JTextField();
		total_textField.setColumns(10);
		total_textField.setBounds(167, 221, 156, 27);
		Mid.add(total_textField);
		
		txtTotal = new JTextField();
		txtTotal.setText("Total");
		txtTotal.setHorizontalAlignment(SwingConstants.CENTER);
		txtTotal.setForeground(Color.WHITE);
		txtTotal.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtTotal.setEditable(false);
		txtTotal.setColumns(10);
		txtTotal.setBackground(Color.DARK_GRAY);
		txtTotal.setBounds(26, 221, 131, 27);
		Mid.add(txtTotal);
		
		forfaitTotalTxt = new JTextField();
		forfaitTotalTxt.setColumns(10);
		forfaitTotalTxt.setBounds(359, 22, 156, 27);
		Mid.add(forfaitTotalTxt);
		
		assuranceTotalTxt = new JTextField();
		assuranceTotalTxt.setColumns(10);
		assuranceTotalTxt.setBounds(359, 60, 156, 27);
		Mid.add(assuranceTotalTxt);
		
		dureeTotalTxt = new JTextField();
		dureeTotalTxt.setColumns(10);
		dureeTotalTxt.setBounds(359, 98, 156, 27);
		Mid.add(dureeTotalTxt);
		
		classeTotalTxt = new JTextField();
		classeTotalTxt.setColumns(10);
		classeTotalTxt.setBounds(359, 136, 156, 27);
		Mid.add(classeTotalTxt);
		
		totalTxt = new JTextField();
		totalTxt.setColumns(10);
		totalTxt.setBounds(359, 221, 156, 27);
		Mid.add(totalTxt);
		
		versement_textfield = new JTextField();
		versement_textfield.setText("Premier versement \u00E0 payer");
		versement_textfield.setHorizontalAlignment(SwingConstants.CENTER);
		versement_textfield.setForeground(Color.WHITE);
		versement_textfield.setFont(new Font("Verdana", Font.PLAIN, 16));
		versement_textfield.setEditable(false);
		versement_textfield.setColumns(10);
		versement_textfield.setBackground(Color.DARK_GRAY);
		versement_textfield.setBounds(26, 259, 297, 27);
		Mid.add(versement_textfield);
		
		pVersementTotal = new JTextField();
		pVersementTotal.setColumns(10);
		pVersementTotal.setBounds(359, 259, 156, 27);
		Mid.add(pVersementTotal);
		
		JLabel lblNewLabel = new JLabel("=");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setBounds(333, 28, 46, 14);
		Mid.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("=");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_1.setBounds(333, 66, 46, 14);
		Mid.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("=");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_2.setBounds(333, 104, 46, 14);
		Mid.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("=");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_3.setBounds(333, 142, 46, 14);
		Mid.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("=");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_4.setBounds(333, 227, 46, 14);
		Mid.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("=");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_4_1.setBounds(333, 268, 46, 14);
		Mid.add(lblNewLabel_4_1);
		
		JButton btnInteract = new JButton("Interact");
		btnInteract.setForeground(Color.WHITE);
		btnInteract.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnInteract.setBackground(new Color(60, 179, 113));
		btnInteract.setBounds(239, 310, 122, 29);
		Mid.add(btnInteract);
		
		JButton btnCredit = new JButton("Cr\u00E9dit");
		btnCredit.setForeground(Color.WHITE);
		btnCredit.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnCredit.setBackground(new Color(60, 179, 113));
		btnCredit.setBounds(393, 310, 122, 29);
		Mid.add(btnCredit);
		
		btnComptant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cash++;
				money.setText(String.valueOf(cash)+ " patate");
				
			}
		});
	}
}
