package test1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class playAgain_lost extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					playAgain_lost frame = new playAgain_lost();
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
	public playAgain_lost() {
		setTitle("HANG MAN");
		setIconImage(Toolkit.getDefaultToolkit().getImage(playAgain_lost.class.getResource("/images/logo.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnPlayAgain = new JButton("PLAY AGAIN");
		btnPlayAgain.setBounds(52, 165, 147, 37);
		btnPlayAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmHangMan h = new frmHangMan();
				h.setVisible(true);
				dispose();
			}
		});
		btnPlayAgain.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JButton btnNewButton = new JButton("EXIT TO MAIN MENU");
		btnNewButton.setBounds(307, 165, 170, 36);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				home h = new home();
				h.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.setLayout(null);
		
		JTextArea txtrOopsTheMan = new JTextArea();
		txtrOopsTheMan.setEditable(false);
		txtrOopsTheMan.setBounds(52, 15, 425, 118);
		txtrOopsTheMan.setFont(new Font("Calibri", Font.PLAIN, 30));
		txtrOopsTheMan.setText("       OOPS!!! The man is hanged. \r\n         You have lost the game. \r\n           Better luck next time");
		txtrOopsTheMan.setBackground(SystemColor.control);
		contentPane.add(txtrOopsTheMan);
		contentPane.add(btnPlayAgain);
		contentPane.add(btnNewButton);
	}

}
