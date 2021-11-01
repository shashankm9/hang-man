package test1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class rule_7 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rule_7 frame = new rule_7();
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
	public rule_7() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(rule_7.class.getResource("/images/logo.jpg")));
		setTitle("HANG MAN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 758, 507);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0,0,0,0));
		panel.setBounds(10, 10, 705, 436);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("");
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
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				home h = new home();
				h.setVisible(true);
				dispose();
			}
		});
		
		
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setIcon(new ImageIcon(rule_7.class.getResource("/images/back1.png")));
		btnNewButton.setBounds(10, 10, 50, 51);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("RULES");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(87, 10, 608, 51);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("RULE NO 7 :");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 20));
		lblNewLabel_1.setBounds(49, 127, 206, 38);
		panel.add(lblNewLabel_1);
		
		JTextArea txtrEnterOne = new JTextArea();
		txtrEnterOne.setText("7) You can check the letters which were already guessed\r\n incorrectly by you by clicking the button beside the text \r\n\"Failed Guesses\"");
		txtrEnterOne.setEditable(false);
		txtrEnterOne.setForeground(Color.LIGHT_GRAY);
		txtrEnterOne.setFont(new Font("Segoe Script", Font.BOLD, 22));
		txtrEnterOne.setBackground(new Color(0, 0, 0, 0));
		txtrEnterOne.setBounds(10, 190, 685, 102);
		panel.add(txtrEnterOne);
		
		JButton btnNewButton_1 = new JButton("PREV");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rule_6 h = new rule_6();
				h.setVisible(true);
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
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setFont(new Font("Segoe Script", Font.BOLD, 18));
		btnNewButton_1.setBounds(339, 317, 120, 43);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("NEXT");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rule_8 h = new rule_8();
				h.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton_1_1.setBackground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnNewButton_1_1.setBackground(Color.LIGHT_GRAY);
			}
		});
		btnNewButton_1_1.setFont(new Font("Segoe Script", Font.BOLD, 18));
		btnNewButton_1_1.setBorder(null);
		btnNewButton_1_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_1.setBounds(506, 317, 120, 43);
		panel.add(btnNewButton_1_1);
		
		JLabel lblBG = new JLabel("");
		lblBG.setIcon(new ImageIcon(rule_7.class.getResource("/images/background_rules.jpg")));
		lblBG.setBounds(0, 0, 744, 460);
		contentPane.add(lblBG);
	}
}