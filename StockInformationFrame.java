import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class StockInformationFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StockInformationFrame window = new StockInformationFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StockInformationFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(800,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Stock Name");
		lblNewLabel.setBounds(313, 28, 146, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JTextArea txtrInformationAboutStock = new JTextArea();
		txtrInformationAboutStock.setText("Information about Stock");
		txtrInformationAboutStock.setBounds(211, 102, 346, 291);
		frame.getContentPane().add(txtrInformationAboutStock);
		
		JButton btnBuy = new JButton("Sell");
		btnBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnBuy.setBounds(211, 443, 171, 41);
		frame.getContentPane().add(btnBuy);
		
		JButton button = new JButton("Go Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setBounds(386, 443, 171, 41);
		frame.getContentPane().add(button);
		
		JLabel lblYourBalanceIs = new JLabel("Your Balance is");
		lblYourBalanceIs.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblYourBalanceIs.setBounds(26, 28, 185, 33);
		frame.getContentPane().add(lblYourBalanceIs);
	}
}
