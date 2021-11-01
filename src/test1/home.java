package test1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home frame = new home();
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
	public home() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(home.class.getResource("/images/logo.jpg")));
		setTitle("HANG MAN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 757, 538);
		contentPane = new JPanel();
		contentPane.setOpaque(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("PLAY GAME");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton.setBackground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnNewButton.setBackground(Color.LIGHT_GRAY);
			}
		});
		
		
		btnNewButton.setBorder(null);
		btnNewButton.setBounds(269, 236, 284, 51);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmHangMan game = new frmHangMan();
				game.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Segoe Script", Font.BOLD, 30));
		
		JButton btnNewButton_1 = new JButton("HOW TO PLAY");
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBounds(269, 305, 284, 48);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rule_1 i = new rule_1();
				i.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton_1.setBackground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnNewButton_1.setBackground(Color.LIGHT_GRAY);
			}
		});
		btnNewButton_1.setFont(new Font("Segoe Script", Font.BOLD, 30));
		
		JButton btnNewButton_2 = new JButton("QUIT GAME");
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBounds(269, 371, 284, 47);
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton_2.setBackground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnNewButton_2.setBackground(Color.LIGHT_GRAY);
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton_2.setFont(new Font("Segoe Script", Font.BOLD, 30));
		
		JLabel lblNewLabel = new JLabel("WELCOME TO HANGMAN GAME");
		lblNewLabel.setBounds(142, 81, 576, 88);
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblBgImg = new JLabel("");
		lblBgImg.setBounds(5, 5, 728, 489);
		lblBgImg.setIcon(new ImageIcon(home.class.getResource("/images/background_menu.jpg")));
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		contentPane.add(btnNewButton_1);
		contentPane.add(btnNewButton_2);
		contentPane.add(lblNewLabel);
		contentPane.add(lblBgImg);
	}
}
