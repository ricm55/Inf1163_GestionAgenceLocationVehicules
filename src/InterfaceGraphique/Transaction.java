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

public class Transaction extends JFrame {

	private JPanel contentPane;
	private JTextField txtTransactiondetransaction;
	private JTextField txtForfaitType;
	private JTextField txtAssurance;
	private JTextField txtDureLocationjour;
	private JTextField txtLocationClassType;
	private JTextField txtTotal;
	private JTextField txtPremierVersement;
	private JTextField txtTotalForfait;
	private JTextField txtTotalAssurance;
	private JTextField txtLocationtotal;
	private JTextField textField_3;
	private JTextField txtTotaltotal;
	private JTextField txtPremierversementtotal;
	private JTextField txtDurtotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transaction frame = new Transaction();
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
		
		txtTransactiondetransaction = new JTextField();
		txtTransactiondetransaction.setForeground(new Color(255, 255, 255));
		txtTransactiondetransaction.setBackground(new Color(25, 25, 112));
		txtTransactiondetransaction.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtTransactiondetransaction.setEditable(false);
		txtTransactiondetransaction.setText("Transaction: #DeTransaction");
		txtTransactiondetransaction.setHorizontalAlignment(SwingConstants.CENTER);
		Top.add(txtTransactiondetransaction, BorderLayout.NORTH);
		txtTransactiondetransaction.setColumns(10);
		
		JPanel Left = new JPanel();
		Left.setBackground(SystemColor.textHighlight);
		contentPane.add(Left, BorderLayout.WEST);
		
		JButton inventaireBouton = new JButton("Inventaire");
		inventaireBouton.setForeground(Color.WHITE);
		inventaireBouton.setFont(new Font("Verdana", Font.PLAIN, 16));
		inventaireBouton.setBackground(Color.DARK_GRAY);
		
		JButton locationBouton_1_1_2_1 = new JButton("Location");
		locationBouton_1_1_2_1.setForeground(Color.WHITE);
		locationBouton_1_1_2_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		locationBouton_1_1_2_1.setBackground(Color.DARK_GRAY);
		
		JButton locationBouton_1_1_2_2 = new JButton("Location");
		locationBouton_1_1_2_2.setForeground(Color.WHITE);
		locationBouton_1_1_2_2.setFont(new Font("Verdana", Font.PLAIN, 16));
		locationBouton_1_1_2_2.setBackground(Color.DARK_GRAY);
		
		JButton locationBouton_1_1_2_3 = new JButton("Location");
		locationBouton_1_1_2_3.setForeground(Color.WHITE);
		locationBouton_1_1_2_3.setFont(new Font("Verdana", Font.PLAIN, 16));
		locationBouton_1_1_2_3.setBackground(Color.DARK_GRAY);
		
		JButton locationBouton_1_1_2_3_2 = new JButton("Retour");
		locationBouton_1_1_2_3_2.setForeground(Color.WHITE);
		locationBouton_1_1_2_3_2.setFont(new Font("Verdana", Font.PLAIN, 16));
		locationBouton_1_1_2_3_2.setBackground(Color.DARK_GRAY);
		GroupLayout gl_Left = new GroupLayout(Left);
		gl_Left.setHorizontalGroup(
			gl_Left.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Left.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_Left.createParallelGroup(Alignment.LEADING, false)
						.addComponent(inventaireBouton, GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
						.addComponent(locationBouton_1_1_2_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(locationBouton_1_1_2_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(locationBouton_1_1_2_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(locationBouton_1_1_2_3_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(63, Short.MAX_VALUE))
		);
		gl_Left.setVerticalGroup(
			gl_Left.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Left.createSequentialGroup()
					.addGap(22)
					.addComponent(locationBouton_1_1_2_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(inventaireBouton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(locationBouton_1_1_2_2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(locationBouton_1_1_2_3, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
					.addComponent(locationBouton_1_1_2_3_2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		Left.setLayout(gl_Left);
		
		JPanel Mid = new JPanel();
		Mid.setBackground(new Color(255, 140, 0));
		contentPane.add(Mid, BorderLayout.CENTER);
		
		txtForfaitType = new JTextField();
		txtForfaitType.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtForfaitType.setText("Forfait: TYPE");
		txtForfaitType.setEditable(false);
		txtForfaitType.setColumns(10);
		
		txtAssurance = new JTextField();
		txtAssurance.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtAssurance.setText("ASSurance");
		txtAssurance.setEditable(false);
		txtAssurance.setColumns(10);
		
		txtDureLocationjour = new JTextField();
		txtDureLocationjour.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtDureLocationjour.setText("Dur\u00E9e location (jour");
		txtDureLocationjour.setEditable(false);
		txtDureLocationjour.setColumns(10);
		
		txtLocationClassType = new JTextField();
		txtLocationClassType.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtLocationClassType.setText("Location class: TYPE");
		txtLocationClassType.setEditable(false);
		txtLocationClassType.setColumns(10);
		
		txtTotal = new JTextField();
		txtTotal.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtTotal.setText("Total");
		txtTotal.setEditable(false);
		txtTotal.setColumns(10);
		
		txtPremierVersement = new JTextField();
		txtPremierVersement.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtPremierVersement.setText("Premier versement \u00E0 payer");
		txtPremierVersement.setEditable(false);
		txtPremierVersement.setColumns(10);
		
		txtTotalForfait = new JTextField();
		txtTotalForfait.setText("forfaitTotal");
		txtTotalForfait.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtTotalForfait.setEditable(false);
		txtTotalForfait.setColumns(10);
		
		txtTotalAssurance = new JTextField();
		txtTotalAssurance.setText("assuranceTotal");
		txtTotalAssurance.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtTotalAssurance.setEditable(false);
		txtTotalAssurance.setColumns(10);
		
		txtLocationtotal = new JTextField();
		txtLocationtotal.setText("locationTotal");
		txtLocationtotal.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtLocationtotal.setEditable(false);
		txtLocationtotal.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setText("Forfait: TYPE");
		textField_3.setFont(new Font("Verdana", Font.PLAIN, 16));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		
		txtTotaltotal = new JTextField();
		txtTotaltotal.setText("totalTotal");
		txtTotaltotal.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtTotaltotal.setEditable(false);
		txtTotaltotal.setColumns(10);
		
		txtPremierversementtotal = new JTextField();
		txtPremierversementtotal.setText("premierVersementTotal");
		txtPremierversementtotal.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtPremierversementtotal.setEditable(false);
		txtPremierversementtotal.setColumns(10);
		
		txtDurtotal = new JTextField();
		txtDurtotal.setText("dur\u00E9LocationTotal");
		txtDurtotal.setFont(new Font("Verdana", Font.PLAIN, 16));
		txtDurtotal.setEditable(false);
		txtDurtotal.setColumns(10);
		
		JButton locationBouton_1_1_2_3_1 = new JButton("Comptant");
		locationBouton_1_1_2_3_1.setForeground(new Color(255, 255, 0));
		locationBouton_1_1_2_3_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		locationBouton_1_1_2_3_1.setBackground(new Color(0, 128, 0));
		
		JButton locationBouton_1_1_2_3_1_1 = new JButton("Interac");
		locationBouton_1_1_2_3_1_1.setForeground(new Color(255, 255, 0));
		locationBouton_1_1_2_3_1_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		locationBouton_1_1_2_3_1_1.setBackground(new Color(0, 128, 0));
		
		JButton locationBouton_1_1_2_3_1_2 = new JButton("Cr\u00E9dit");
		locationBouton_1_1_2_3_1_2.setForeground(new Color(255, 255, 0));
		locationBouton_1_1_2_3_1_2.setFont(new Font("Verdana", Font.PLAIN, 16));
		locationBouton_1_1_2_3_1_2.setBackground(new Color(0, 128, 0));
		GroupLayout gl_Mid = new GroupLayout(Mid);
		gl_Mid.setHorizontalGroup(
			gl_Mid.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Mid.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_Mid.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Mid.createSequentialGroup()
							.addGroup(gl_Mid.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Mid.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_Mid.createSequentialGroup()
										.addGroup(gl_Mid.createParallelGroup(Alignment.LEADING)
											.addComponent(txtForfaitType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(txtAssurance, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(txtDureLocationjour, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
											.addComponent(txtPremierVersement, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE))
										.addGap(16))
									.addGroup(gl_Mid.createSequentialGroup()
										.addComponent(txtLocationClassType)
										.addPreferredGap(ComponentPlacement.RELATED)))
								.addGroup(gl_Mid.createSequentialGroup()
									.addComponent(txtTotal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(119)))
							.addGroup(gl_Mid.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Mid.createParallelGroup(Alignment.LEADING, false)
									.addComponent(txtLocationtotal, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
									.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
									.addComponent(txtTotaltotal, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
									.addComponent(txtTotalAssurance, GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
									.addComponent(txtTotalForfait)
									.addComponent(txtPremierversementtotal)
									.addGroup(Alignment.TRAILING, gl_Mid.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(locationBouton_1_1_2_3_1_2, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)))
								.addComponent(txtDurtotal, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE))
							.addGap(128))
						.addGroup(gl_Mid.createSequentialGroup()
							.addComponent(locationBouton_1_1_2_3_1, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
							.addGap(31)
							.addComponent(locationBouton_1_1_2_3_1_1, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_Mid.setVerticalGroup(
			gl_Mid.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Mid.createSequentialGroup()
					.addGap(29)
					.addGroup(gl_Mid.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Mid.createSequentialGroup()
							.addComponent(txtForfaitType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(txtAssurance, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Mid.createSequentialGroup()
							.addComponent(txtTotalForfait, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtTotalAssurance, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Mid.createParallelGroup(Alignment.LEADING)
						.addComponent(txtDurtotal, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtDureLocationjour, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Mid.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Mid.createParallelGroup(Alignment.BASELINE)
							.addComponent(txtLocationClassType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Mid.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtLocationtotal, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))
					.addGap(35)
					.addGroup(gl_Mid.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Mid.createSequentialGroup()
							.addComponent(txtTotal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtPremierVersement, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Mid.createSequentialGroup()
							.addComponent(txtTotaltotal, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtPremierversementtotal, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
					.addGroup(gl_Mid.createParallelGroup(Alignment.LEADING)
						.addComponent(locationBouton_1_1_2_3_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(locationBouton_1_1_2_3_1_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(locationBouton_1_1_2_3_1_2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(54))
		);
		Mid.setLayout(gl_Mid);
	}
}
