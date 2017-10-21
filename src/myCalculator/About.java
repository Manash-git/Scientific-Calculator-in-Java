package myCalculator;

//import java.awt.EventQueue;

import javax.swing.JFrame;
//import javax.swing.JTextArea;
//import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class About {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					About window = new About();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public About() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 487, 634);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 205, 170));
		panel.setBounds(0, 0, 471, 69);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Developer");
		lblNewLabel.setFont(new Font("Helvetica", Font.BOLD, 32));
		lblNewLabel.setBounds(147, 21, 195, 37);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.menu);
		panel_1.setBounds(0, 70, 471, 526);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\u09AE\u09BE\u09A8\u09B8 \u0995\u09C1\u09AE\u09BE\u09B0 \u09AE\u09A3\u09CD\u09A1\u09B2");
		lblNewLabel_1.setFont(new Font("Siyam Rupali", Font.BOLD, 23));
		lblNewLabel_1.setBounds(109, 267, 199, 40);
		panel_1.add(lblNewLabel_1);
		
		
		
		JLabel lblNewLael = new JLabel("manash.jpg");
		lblNewLael.setHorizontalAlignment(SwingConstants.CENTER);
		Image Manash=new ImageIcon(this.getClass().getResource("/manash.jpg")).getImage();
		//lblNewLael.setIcon(new ImageIcon("E:\\Java\\Java Lab Project\\resource\\manash.jpg"));
		lblNewLael.setIcon(new ImageIcon(Manash));
		lblNewLael.setBounds(120, 50, 153, 159);
		panel_1.add(lblNewLael);
		
		
		JLabel label_4 = new JLabel("161-15-7245");
		label_4.setFont(new Font("Century Gothic", Font.BOLD, 19));
		label_4.setBounds(119, 318, 199, 32);
		panel_1.add(label_4);
	}

}
