package test1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JInternalFrame;

public class frmHangMan extends JFrame {

	private JPanel contentPane;
	private JTextField txtCharInput;
	private JLabel lblWord;
	
	
	/**
	 * Launch the application.
	
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmHangMan frame = new frmHangMan();
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
	public frmHangMan() {
		setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 18));
		setTitle("HANG MAN");
		setIconImage(Toolkit.getDefaultToolkit().getImage(frmHangMan.class.getResource("/images/logo.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 739, 542);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(1, 1, 1, 1));
		setContentPane(contentPane);
		
		JLabel lblCharInput = new JLabel("ENTER THE INPUT :");
		lblCharInput.setBounds(11, 364, 327, 46);
		lblCharInput.setForeground(Color.LIGHT_GRAY);
		lblCharInput.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 30));
		
		txtCharInput = new JTextField();
		txtCharInput.setBorder(null);
		txtCharInput.setBounds(367, 364, 238, 46);
		txtCharInput.setBackground(Color.WHITE);
		txtCharInput.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtCharInput.setBackground(new Color(224, 255, 255));
			}
		});
		txtCharInput.setColumns(10);
		
		JButton btnCheck = new JButton("CHECK");
		btnCheck.setBounds(132, 437, 138, 32);
		btnCheck.setBorder(null);
		btnCheck.setBackground(Color.LIGHT_GRAY);
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		
		
		btnCheck.setFont(new Font("Calibri", Font.BOLD, 16));
		
		lblWord = new JLabel();
		lblWord.setBounds(33, 164, 321, 66);
		lblWord.setForeground(Color.LIGHT_GRAY);
		lblWord.setBackground(Color.BLACK);
		lblWord.setFont(new Font("OCR A Extended", Font.BOLD, 50));
		lblWord.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblHangMan = new JLabel("");
		lblHangMan.setBounds(399, 43, 200, 200);
		lblHangMan.setHorizontalAlignment(SwingConstants.CENTER);
		lblHangMan.setIcon(new ImageIcon(frmHangMan.class.getResource("/images/empty1.png")));
		
		List<String> a = new ArrayList<>(); 
        List<String> b = new ArrayList<>(); 
        List<Integer> f = new ArrayList<>();
        List<String> g = new ArrayList<>(); 
        List<Character> fg = new ArrayList<>();

        String p;
        String q;

        a.add("mahesh"); 
        a.add("kanishq"); 
        a.add("shashank"); 
        a.add("murari"); 
        a.add("jayanth");  
        a.add("sritej"); 
        a.add("venkat"); 
        a.add("saketh"); 
        a.add("vinay"); 
        a.add("ravi");    
        

        b.add("_a_e__"); 
        b.add("_a_i___");                                       
        b.add("__a__a__");
        b.add("_u_a_i");
        b.add("_a_a___");
        b.add("__i_e_");
        b.add("_e__a_");
        b.add("_a_e__");
        b.add("_i_a_");
        b.add("_a_i");
        
        f.add(7);
		
		Random rand = new Random();
		int r = rand.nextInt(1000);

		if(r>a.size())
		{
			r = r%a.size();
		}

		p=a.get(r);                
        q=b.get(r);
        
        g.add(q);
        
        lblWord.setText(q);
        
        boolean h = q.contains("_");
    	if(!h)
    	{
    		JOptionPane.showMessageDialog(null, "Congratulations!!! You have won the game.");
    		System.exit(0);
    	}
    	
    	else{
    		for(int i=0;i<1;i++)
    		{
    				
    			btnCheck.addActionListener(new ActionListener() 
    			{
    				public void actionPerformed(ActionEvent arg0) 
    				{	
	    					String k=txtCharInput.getText();
	    					
	    					if(k.length()==1) 
	    					{
	    						char c = k.charAt(0);
	    						
	    						List<Integer> m = frmHangMan.consistsOf(c,p);
	    		    			boolean v = m.isEmpty();
	    		    			if(!v)
	    		    			{
	    		        			for(int u=0;u<m.size();u++)
	    		        			{
	    		        				g.add(g.get(g.size()-1).substring(0, m.get(u)) + c + g.get(g.size()-1).substring(m.get(u)+1));		        				        
	    		        			}
	    		        			lblWord.setText("");
	    		        			lblWord.setText(g.get(g.size()-1));
	    		    			}
	
	    		    			else
	    		    			{
	    		    				fg.add(c);
	    		    				
	    		    				f.add(f.get(f.size()-1)-1);
	    		    				JOptionPane.showMessageDialog(null, "Oops!!! Wrong choice.");
	    		    				lblWord.setText(g.get(g.size()-1));
	    		    			}
	    		    			
	    		    			if(f.get(f.size()-1)==7)
	    		    			{
	    		    				lblHangMan.setHorizontalAlignment(SwingConstants.CENTER);
	    		    				lblHangMan.setIcon(new ImageIcon(frmHangMan.class.getResource("/images/empty1.png")));
	    		    			}
	    		    			
	    		    			else if(f.get(f.size()-1)==6)
	    		    			{
	    		    				lblHangMan.setHorizontalAlignment(SwingConstants.CENTER);
	    		    				lblHangMan.setIcon(new ImageIcon(frmHangMan.class.getResource("/images/head1.png")));
	    		    			}
	    		    			
	    		    			else if(f.get(f.size()-1)==5)
	    		    			{
	    		    				lblHangMan.setHorizontalAlignment(SwingConstants.CENTER);
	    		    				lblHangMan.setIcon(new ImageIcon(frmHangMan.class.getResource("/images/body1.png")));
	    		    			}
	    		    			
	    		    			else if(f.get(f.size()-1)==4)
	    		    			{
	    		    				lblHangMan.setHorizontalAlignment(SwingConstants.CENTER);
	    		    				lblHangMan.setIcon(new ImageIcon(frmHangMan.class.getResource("/images/hand1.png")));
	    		    			}
	    		    			
	    		    			else if(f.get(f.size()-1)==3)
	    		    			{
	    		    				lblHangMan.setHorizontalAlignment(SwingConstants.CENTER);
	    		    				lblHangMan.setIcon(new ImageIcon(frmHangMan.class.getResource("/images/hands1.png")));
	    		    			}
	    		    			
	    		    			else if(f.get(f.size()-1)==2)
	    		    			{
	    		    				lblHangMan.setHorizontalAlignment(SwingConstants.CENTER);
	    		    				lblHangMan.setIcon(new ImageIcon(frmHangMan.class.getResource("/images/leg1.png")));
	    		    			}
	    		    			
	    		    			else if(f.get(f.size()-1)==1)
	    		    			{
	    		    				lblHangMan.setHorizontalAlignment(SwingConstants.CENTER);
	    		    				lblHangMan.setIcon(new ImageIcon(frmHangMan.class.getResource("/images/legs1.png")));
	    		    			}
	    		    			
	
	    		    			else if(f.get(f.size()-1)==0)
	    		    			{
	    		    				playAgain_lost h = new playAgain_lost();
		    						h.setVisible(true);
		    						dispose();
	    		    			}
	
	    					}
	    					else
	    					{
	    						JOptionPane.showMessageDialog(null, "Invalid Input");
	    					}
	    					
	    					boolean w = g.get(g.size()-1).contains("_");
	    					if(!w) {
	    						playAgain h = new playAgain();
	    						h.setVisible(true);
	    						dispose();
	    					}
	    					
	    					txtCharInput.setText("");
    					}
    								
    			});	
    		}	
    	}
		
		JButton btnGoBack = new JButton("");
		btnGoBack.setBounds(11, 11, 54, 54);
		btnGoBack.setBorder(null);
		btnGoBack.setIcon(new ImageIcon(frmHangMan.class.getResource("/images/back1.png")));
		btnGoBack.setForeground(Color.WHITE);
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				home h = new home();
				h.setVisible(true);
				dispose();
			}
		});
		
		
		btnGoBack.setBackground(Color.LIGHT_GRAY);
		btnGoBack.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 18));
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.setBounds(454, 437, 134, 30);
		btnAdd.setBorder(null);
		btnAdd.setBackground(Color.LIGHT_GRAY);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String k=txtCharInput.getText();
				a.add(k);
				String l=k;
				for(int i=0;i<k.length();i++) {
					if(l.charAt(i)=='a' || l.charAt(i)=='e' || l.charAt(i)=='i' || l.charAt(i)=='o' || l.charAt(i)=='u') {
						l = l.substring(0, i) + '_' + l.substring(i+1);
						b.add(l);
					}
				}
				
				
				JOptionPane.showMessageDialog(null, "Word added!");
				
			}
		});
		btnAdd.setFont(new Font("Calibri", Font.BOLD, 18));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(665, 11, 54, 54);
		btnNewButton.setIcon(new ImageIcon(frmHangMan.class.getResource("/images/bulb.png")));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBorder(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "The List of Words are :\n" +a);
			}
		});
		
		
		
		JLabel lblNewLabel_1 = new JLabel("FAILED GUESSES :");
		lblNewLabel_1.setBounds(324, 281, 190, 21);
		lblNewLabel_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		
		JButton btnNewButton_1 = new JButton("VIEW");
		btnNewButton_1.setBounds(546, 281, 114, 21);
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
		btnCheck.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnCheck.setBackground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnCheck.setBackground(Color.LIGHT_GRAY);
			}
		});
		btnAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnAdd.setBackground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnAdd.setBackground(Color.LIGHT_GRAY);
			}
		});
		btnGoBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnGoBack.setBackground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnGoBack.setBackground(Color.LIGHT_GRAY);
			}
		});
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
		btnNewButton_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_1.setFont(new Font("Calibri", Font.BOLD, 14));
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Your Failed Guesses are :\n" +fg);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnCheck);
		contentPane.add(btnAdd);
		contentPane.add(lblCharInput);
		contentPane.add(lblWord);
		contentPane.add(btnGoBack);
		contentPane.add(lblHangMan);
		contentPane.add(btnNewButton);
		contentPane.add(txtCharInput);
		contentPane.add(lblNewLabel_1);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 758, 509);
		lblNewLabel.setIcon(new ImageIcon(frmHangMan.class.getResource("/images/background_hang.jpg")));
		contentPane.add(lblNewLabel);
	}
	
	public static List <Integer> consistsOf(char c, String p) {
		List<Integer> a = new ArrayList<>(); 
		for(int i=0;i<p.length();i++){
			if(c==p.charAt(i)){			
				a.add(i);
			}
		}
		return a;
	}
}