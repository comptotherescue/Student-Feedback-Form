import java.awt.Checkbox;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;

public class Client{

	private JFrame frame;
	Socket client;
	String ip,port,urol;
	JLabel sub;
    int a,i,A,B,C,D,co,p,yr,ro,shift,done;
    String[] s=new String[40];
    int[][] c,d;
    int[] subar1;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client window = new Client();
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
	public Client() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public int Check(int a){
		int r=1;
		for(int i=0;i<5;i++){
			if(subar1[i]==a){
				r=0;
			}
		}
		return r;
	}
	private void initialize() {
	    done=0;
		final JLabel sub = new JLabel("");
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		co=a=ro=0;
		subar1=new int[5];
		for(i=0;i<5;i++){
			subar1[i]=0;
		}
		c=new int[21][2];
		d=new int[21][2];
		for(i=1;i<21;i++){
			c[i][1]=0;
		}
		A=B=C=0;
		shift=0;
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setBounds(0, 0,screen.width,screen.height - 30);
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JRadioButton r1 = new JRadioButton("1");
		r1.setBackground(Color.CYAN);
		r1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[1][1]=1;
			}
		});
		
		JLabel lblexecellent = new JLabel("1-Strongly agree  2-Agree 3-Disagree 4-Strongly disagree");
		lblexecellent.setBounds(931, 71, 423, 23);
		frame.getContentPane().add(lblexecellent);
		r1.setBounds(1058, 89, 44, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2= new JRadioButton("2");
		r2.setBackground(Color.CYAN);
		r2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c[1][1]=2;
			}
		});
		r2.setBounds(1104, 89, 44, 23);
		frame.getContentPane().add(r2);
		
		
		JRadioButton r3 = new JRadioButton("3");
		r3.setBackground(Color.CYAN);
		r3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c[1][1]=3;
			}
		});
		r3.setBounds(1150, 89, 44, 23);
		frame.getContentPane().add(r3);
		
		JRadioButton r4 = new JRadioButton("4");
		r4.setBackground(Color.CYAN);
		r4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c[1][1]=4;
			}
		});
		r4.setBounds(1196, 89, 44, 23);
		frame.getContentPane().add(r4);
		final ButtonGroup group1=new ButtonGroup();
		group1.add(r1);
		group1.add(r2);
		group1.add(r3);
		group1.add(r4);
		
		
		
		JRadioButton r5 = new JRadioButton("1");
		r5.setBackground(Color.CYAN);
		r5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[2][1]=1;
			}
		});
		r5.setBounds(1058, 115, 44, 23);
		frame.getContentPane().add(r5);
		
		JRadioButton r6 = new JRadioButton("2");
		r6.setBackground(Color.CYAN);
		r6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[2][1]=2;
			}
		});
		r6.setBounds(1104, 115, 44, 23);
		frame.getContentPane().add(r6);
		
		JRadioButton r7 = new JRadioButton("3");
		r7.setBackground(Color.CYAN);
		r7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[2][1]=3;
			}
		});
		r7.setBounds(1150, 115, 44, 23);
		frame.getContentPane().add(r7);
		
		JRadioButton r8 = new JRadioButton("4");
		r8.setBackground(Color.CYAN);
		r8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[2][1]=4;
			}
		});
		r8.setBounds(1195, 115, 45, 23);
		frame.getContentPane().add(r8);
		final ButtonGroup group2=new ButtonGroup();
		group2.add(r5);
		group2.add(r6);
		group2.add(r7);
		group2.add(r8);
		
		JRadioButton r9 = new JRadioButton("1");
		r9.setBackground(Color.CYAN);
		r9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[3][1]=1;
			}
		});
		r9.setBounds(1058, 141, 44, 23);
		frame.getContentPane().add(r9);
		
		JRadioButton r10 = new JRadioButton("2");
		r10.setBackground(Color.CYAN);
		r10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[3][1]=2;
			}
		});
		r10.setBounds(1104, 141, 44, 23);
		frame.getContentPane().add(r10);
		
		JRadioButton r11 = new JRadioButton("3");
		r11.setBackground(Color.CYAN);
		r11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[3][1]=3;
			}
		});
		r11.setBounds(1150, 141, 44, 23);
		frame.getContentPane().add(r11);
		
		JRadioButton r12 = new JRadioButton("4");
		r12.setBackground(Color.CYAN);
		r12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[3][1]=4;
			}
		});
		r12.setBounds(1196, 141, 44, 23);
		frame.getContentPane().add(r12);
		final ButtonGroup group3=new ButtonGroup();
		group3.add(r9);
		group3.add(r10);
		group3.add(r11);
		group3.add(r12);
		
		JRadioButton r13 = new JRadioButton("1");
		r13.setBackground(Color.CYAN);
		r13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[4][1]=1;
			}
		});
		r13.setBounds(1058, 169, 44, 23);
		frame.getContentPane().add(r13);
		
		JRadioButton r14 = new JRadioButton("2");
		r14.setBackground(Color.CYAN);
		r14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[4][1]=2;
			}
		});
		r14.setBounds(1104, 169, 44, 23);
		frame.getContentPane().add(r14);
		
		JRadioButton r15 = new JRadioButton("3");
		r15.setBackground(Color.CYAN);
		r15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[4][1]=3;
			}
		});
		r15.setBounds(1150, 169, 44, 23);
		frame.getContentPane().add(r15);
		
		JRadioButton r16 = new JRadioButton("4");
		r16.setBackground(Color.CYAN);
		r16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[4][1]=4;
			}
		});
		r16.setBounds(1196, 169, 44, 23);
		frame.getContentPane().add(r16);
		final ButtonGroup group4=new ButtonGroup();
		group4.add(r13);
		group4.add(r14);
		group4.add(r15);
		group4.add(r16);
		
		JRadioButton r17 = new JRadioButton("1");
		r17.setBackground(Color.CYAN);
		r17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[5][1]=1;
			}
		});
		r17.setBounds(1058, 195, 44, 23);
		frame.getContentPane().add(r17);
		
		JRadioButton r18 = new JRadioButton("2");
		r18.setBackground(Color.CYAN);
		r18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[5][1]=2;
			}
		});
		r18.setBounds(1104, 195, 44, 23);
		frame.getContentPane().add(r18);
		
		JRadioButton r19 = new JRadioButton("3");
		r19.setBackground(Color.CYAN);
		r19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[5][1]=3;
			}
		});
		r19.setBounds(1150, 195, 44, 23);
		frame.getContentPane().add(r19);
		
		JRadioButton r20 = new JRadioButton("4");
		r20.setBackground(Color.CYAN);
		r20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[5][1]=4;
			}
		});
		r20.setBounds(1196, 195, 44, 23);
		frame.getContentPane().add(r20);
		final ButtonGroup group5=new ButtonGroup();
		group5.add(r17);
		group5.add(r18);
		group5.add(r19);
		group5.add(r20);
		
		JRadioButton r21 = new JRadioButton("1");
		r21.setBackground(Color.CYAN);
		r21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[6][1]=1;
			}
		});
		r21.setBounds(1058, 221, 44, 23);
		frame.getContentPane().add(r21);
		
		JRadioButton r22 = new JRadioButton("2");
		r22.setBackground(Color.CYAN);
		r22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[6][1]=2;
			}
		});
		r22.setBounds(1104, 221, 44, 23);
		frame.getContentPane().add(r22);
		
		JRadioButton r23 = new JRadioButton("3");
		r23.setBackground(Color.CYAN);
		r23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[6][1]=3;
			}
		});
		r23.setBounds(1150, 221, 44, 23);
		frame.getContentPane().add(r23);
		
		JRadioButton r24 = new JRadioButton("4");
		r24.setBackground(Color.CYAN);
		r24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[6][1]=4;
			}
		});
		r24.setBounds(1196, 221, 44, 23);
		frame.getContentPane().add(r24);
		final ButtonGroup group6=new ButtonGroup();
		group6.add(r21);
		group6.add(r22);
		group6.add(r23);
		group6.add(r24);
		
		JRadioButton r25 = new JRadioButton("1");
		r25.setBackground(Color.CYAN);
		r25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[7][1]=1;
			}
		});
		r25.setBounds(1058, 247, 44, 23);
		frame.getContentPane().add(r25);
		
		JRadioButton r26 = new JRadioButton("2");
		r26.setBackground(Color.CYAN);
		r26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[7][1]=2;
			}
		});
		r26.setBounds(1104, 247, 44, 23);
		frame.getContentPane().add(r26);
		
		JRadioButton r27 = new JRadioButton("3");
		r27.setBackground(Color.CYAN);
		r27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[7][1]=3;
			}
		});
		r27.setBounds(1150, 247, 44, 23);
		frame.getContentPane().add(r27);
		
		JRadioButton r28 = new JRadioButton("4");
		r28.setBackground(Color.CYAN);
		r28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[7][1]=4;
			}
		});
		r28.setBounds(1196, 247, 44, 23);
		frame.getContentPane().add(r28);
		final ButtonGroup group7=new ButtonGroup();
		group7.add(r25);
		group7.add(r26);
		group7.add(r27);
		group7.add(r28);
		
		JRadioButton r29 = new JRadioButton("1");
		r29.setBackground(Color.CYAN);
		r29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[8][1]=1;
			}
		});
		r29.setBounds(1058, 273, 44, 23);
		frame.getContentPane().add(r29);
		
		JRadioButton r30 = new JRadioButton("2");
		r30.setBackground(Color.CYAN);
		r30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[8][1]=2;
			}
		});
		r30.setBounds(1104, 273, 44, 23);
		frame.getContentPane().add(r30);
		
		JRadioButton r31 = new JRadioButton("3");
		r31.setBackground(Color.CYAN);
		r31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[8][1]=3;
			}
		});
		r31.setBounds(1150, 273, 44, 23);
		frame.getContentPane().add(r31);
		
		JRadioButton r32 = new JRadioButton("4");
		r32.setBackground(Color.CYAN);
		r32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[8][1]=4;
			}
		});
		r32.setBounds(1196, 273, 44, 23);
		frame.getContentPane().add(r32);
		final ButtonGroup group8=new ButtonGroup();
		group8.add(r29);
		group8.add(r30);
		group8.add(r31);
		group8.add(r32);
		
		JRadioButton r33 = new JRadioButton("1");
		r33.setBackground(Color.CYAN);
		r33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[9][1]=1;
			}
		});
		r33.setBounds(1058, 299, 44, 23);
		frame.getContentPane().add(r33);
		
		JRadioButton r34 = new JRadioButton("2");
		r34.setBackground(Color.CYAN);
		r34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[9][1]=2;
			}
		});
		r34.setBounds(1104, 299, 44, 23);
		frame.getContentPane().add(r34);
		
		JRadioButton r35 = new JRadioButton("3");
		r35.setBackground(Color.CYAN);
		r35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[9][1]=3;
			}
		});
		r35.setBounds(1150, 299, 44, 23);
		frame.getContentPane().add(r35);
		
		JRadioButton r36 = new JRadioButton("4");
		r36.setBackground(Color.CYAN);
		r36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[9][1]=4;
			}
		});
		r36.setBounds(1196, 299, 44, 23);
		frame.getContentPane().add(r36);
		final ButtonGroup group9=new ButtonGroup();
		group9.add(r33);
		group9.add(r34);
		group9.add(r35);
		group9.add(r36);
		
		JRadioButton r37 = new JRadioButton("1");
		r37.setBackground(Color.CYAN);
		r37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[10][1]=1;
			}
		});
		r37.setBounds(1058, 325, 44, 23);
		frame.getContentPane().add(r37);
		
		JRadioButton r38 = new JRadioButton("2");
		r38.setBackground(Color.CYAN);
		r38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[10][1]=2;
			}
		});
		r38.setBounds(1104, 325, 44, 23);
		frame.getContentPane().add(r38);
		
		JRadioButton r39 = new JRadioButton("3");
		r39.setBackground(Color.CYAN);
		r39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[10][1]=3;
			}
		});
		r39.setBounds(1150, 325, 44, 23);
		frame.getContentPane().add(r39);
		
		JRadioButton r40 = new JRadioButton("4");
		r40.setBackground(Color.CYAN);
		r40.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[10][1]=4;
			}
		});
		r40.setBounds(1196, 325, 44, 23);
		frame.getContentPane().add(r40);
		final ButtonGroup group10=new ButtonGroup();
		group10.add(r37);
		group10.add(r38);
		group10.add(r39);
		group10.add(r40);
		
		JRadioButton r41 = new JRadioButton("1");
		r41.setBackground(Color.CYAN);
		r41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[11][1]=1;
			}
		});
		r41.setBounds(1058, 351, 44, 23);
		frame.getContentPane().add(r41);
		
		JRadioButton r42 = new JRadioButton("2");
		r42.setBackground(Color.CYAN);
		r42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[11][1]=2;
			}
		});
		r42.setBounds(1104, 351, 44, 23);
		frame.getContentPane().add(r42);
		
		JRadioButton r43 = new JRadioButton("3");
		r43.setBackground(Color.CYAN);
		r43.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[11][1]=3;
			}
		});
		r43.setBounds(1150, 351, 44, 23);
		frame.getContentPane().add(r43);
		
		JRadioButton r44 = new JRadioButton("4");
		r44.setBackground(Color.CYAN);
		r44.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[11][1]=4;
			}
		});
		r44.setBounds(1196, 351, 44, 23);
		frame.getContentPane().add(r44);
		final ButtonGroup group11=new ButtonGroup();
		group11.add(r41);
		group11.add(r42);
		group11.add(r43);
		group11.add(r44);
		
		JRadioButton r45 = new JRadioButton("1");
		r45.setBackground(Color.CYAN);
		r45.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[12][1]=1;
			}
		});
		r45.setBounds(1057, 377, 44, 23);
		frame.getContentPane().add(r45);
		
		JRadioButton r46 = new JRadioButton("2");
		r46.setBackground(Color.CYAN);
		r46.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[12][1]=2;
			}
		});
		r46.setBounds(1104, 377, 44, 23);
		frame.getContentPane().add(r46);
		
		JRadioButton r47 = new JRadioButton("3");
		r47.setBackground(Color.CYAN);
		r47.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[12][1]=3;
			}
		});
		r47.setBounds(1150, 377, 44, 23);
		frame.getContentPane().add(r47);
		
		JRadioButton r48 = new JRadioButton("4");
		r48.setBackground(Color.CYAN);
		r48.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[12][1]=4;
			}
		});
		r48.setBounds(1196, 377, 44, 23);
		frame.getContentPane().add(r48);
		final ButtonGroup group12=new ButtonGroup();
		group12.add(r45);
		group12.add(r46);
		group12.add(r47);
		group12.add(r48);
		
		JRadioButton r49 = new JRadioButton("1");
		r49.setBackground(Color.CYAN);
		r49.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[13][1]=1;
			}
		});
		r49.setBounds(1058, 403, 44, 23);
		frame.getContentPane().add(r49);
		
		JRadioButton r50 = new JRadioButton("2");
		r50.setBackground(Color.CYAN);
		r50.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[13][1]=2;
			}
		});
		r50.setBounds(1104, 403, 44, 23);
		frame.getContentPane().add(r50);
		
		JRadioButton r51 = new JRadioButton("3");
		r51.setBackground(Color.CYAN);
		r51.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[13][1]=3;
			}
		});
		r51.setBounds(1150, 403, 44, 23);
		frame.getContentPane().add(r51);
		
		JRadioButton r52 = new JRadioButton("4");
		r52.setBackground(Color.CYAN);
		r52.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[13][1]=4;
			}
		});
		r52.setBounds(1196, 403, 44, 23);
		frame.getContentPane().add(r52);
		final ButtonGroup group13=new ButtonGroup();
		group13.add(r49);
		group13.add(r50);
		group13.add(r51);
		group13.add(r52);
		
		JRadioButton r53 = new JRadioButton("1");
		r53.setBackground(Color.CYAN);
		r53.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[14][1]=1;
			}
		});
		r53.setBounds(1058, 429, 44, 23);
		frame.getContentPane().add(r53);
		
		JRadioButton r54 = new JRadioButton("2");
		r54.setBackground(Color.CYAN);
		r54.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[14][1]=2;
			}
		});
		r54.setBounds(1104, 429, 44, 23);
		frame.getContentPane().add(r54);
		
		JRadioButton r55 = new JRadioButton("3");
		r55.setBackground(Color.CYAN);
		r55.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[14][1]=3;
			}
		});
		r55.setBounds(1150, 429, 44, 23);
		frame.getContentPane().add(r55);
		
		JRadioButton r56 = new JRadioButton("4");
		r56.setBackground(Color.CYAN);
		r56.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[14][1]=4;
			}
		});
		r56.setBounds(1196, 429, 44, 23);
		frame.getContentPane().add(r56);
		final ButtonGroup group14=new ButtonGroup();
		group14.add(r53);
		group14.add(r54);
		group14.add(r55);
		group14.add(r56);
		
		JRadioButton r57 = new JRadioButton("1");
		r57.setBackground(Color.CYAN);
		r57.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[15][1]=1;
			}
		});
		r57.setBounds(1058, 455, 44, 23);
		frame.getContentPane().add(r57);
		
		JRadioButton r58 = new JRadioButton("2");
		r58.setBackground(Color.CYAN);
		r58.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[15][1]=2;
			}
		});
		r58.setBounds(1104, 455, 44, 23);
		frame.getContentPane().add(r58);
		
		JRadioButton r59 = new JRadioButton("3");
		r59.setBackground(Color.CYAN);
		r59.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[15][1]=3;
			}
		});
		r59.setBounds(1150, 455, 45, 23);
		frame.getContentPane().add(r59);
		
		JRadioButton r60 = new JRadioButton("4");
		r60.setBackground(Color.CYAN);
		r60.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[15][1]=4;
			}
		});
		r60.setBounds(1196, 455, 44, 23);
		frame.getContentPane().add(r60);
		final ButtonGroup group15=new ButtonGroup();
		group15.add(r57);
		group15.add(r58);
		group15.add(r59);
		group15.add(r60);
		
		JRadioButton r61 = new JRadioButton("1");
		r61.setBackground(Color.CYAN);
		r61.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[16][1]=1;
			}
		});
		r61.setBounds(1058, 481, 44, 23);
		frame.getContentPane().add(r61);
		
		JRadioButton r62 = new JRadioButton("2");
		r62.setBackground(Color.CYAN);
		r62.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[16][1]=2;
			}
		});
		r62.setBounds(1104, 481, 44, 23);
		frame.getContentPane().add(r62);
		
		JRadioButton r63 = new JRadioButton("3");
		r63.setBackground(Color.CYAN);
		r63.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[16][1]=3;
			}
		});
		r63.setBounds(1150, 481, 44, 23);
		frame.getContentPane().add(r63);
		
		JRadioButton r64 = new JRadioButton("4");
		r64.setBackground(Color.CYAN);
		r64.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[16][1]=4;
			}
		});
		r64.setBounds(1196, 481, 44, 23);
		frame.getContentPane().add(r64);
		final ButtonGroup group16=new ButtonGroup();
		group16.add(r61);
		group16.add(r62);
		group16.add(r63);
		group16.add(r64);
		
		JRadioButton r65 = new JRadioButton("1");
		r65.setBackground(Color.CYAN);
		r65.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[17][1]=1;
			}
		});
		r65.setBounds(1058, 507, 44, 23);
		frame.getContentPane().add(r65);
		
		JRadioButton r66 = new JRadioButton("2");
		r66.setBackground(Color.CYAN);
		r66.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[17][1]=2;
			}
		});
		r66.setBounds(1104, 507, 44, 23);
		frame.getContentPane().add(r66);
		
		JRadioButton r67 = new JRadioButton("3");
		r67.setBackground(Color.CYAN);
		r67.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[17][1]=3;
			}
		});
		r67.setBounds(1150, 507, 44, 23);
		frame.getContentPane().add(r67);
		
		JRadioButton r68 = new JRadioButton("4");
		r68.setBackground(Color.CYAN);
		r68.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[17][1]=4;
			}
		});
		r68.setBounds(1196, 507, 44, 23);
		frame.getContentPane().add(r68);
		final ButtonGroup group17=new ButtonGroup();
		group17.add(r65);
		group17.add(r66);
		group17.add(r67);
		group17.add(r68);
		
		JRadioButton r69 = new JRadioButton("1");
		r69.setBackground(Color.CYAN);
		r69.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[18][1]=1;
			}
		});
		r69.setBounds(1058, 533, 44, 23);
		frame.getContentPane().add(r69);
		
		JRadioButton r70 = new JRadioButton("2");
		r70.setBackground(Color.CYAN);
		r70.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[18][1]=2;
			}
		});
		r70.setBounds(1104, 533, 44, 23);
		frame.getContentPane().add(r70);
		
		JRadioButton r71 = new JRadioButton("3");
		r71.setBackground(Color.CYAN);
		r71.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[18][1]=3;
			}
		});
		r71.setBounds(1150, 533, 44, 23);
		frame.getContentPane().add(r71);
		
		JRadioButton r72 = new JRadioButton("4");
		r72.setBackground(Color.CYAN);
		r72.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[18][1]=4;
			}
		});
		r72.setBounds(1196, 533, 44, 23);
		frame.getContentPane().add(r72);
		final ButtonGroup group18=new ButtonGroup();
		group18.add(r69);
		group18.add(r70);
		group18.add(r71);
		group18.add(r72);
		
		JRadioButton r73 = new JRadioButton("1");
		r73.setBackground(Color.CYAN);
		r73.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[19][1]=1;
			}
		});
		r73.setBounds(1058, 559, 44, 23);
		frame.getContentPane().add(r73);
		
		JRadioButton r74 = new JRadioButton("2");
		r74.setBackground(Color.CYAN);
		r74.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[19][1]=2;
			}
		});
		r74.setBounds(1104, 559, 44, 23);
		frame.getContentPane().add(r74);
		
		JRadioButton r75 = new JRadioButton("3");
		r75.setBackground(Color.CYAN);
		r75.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[19][1]=3;
			}
		});
		r75.setBounds(1150, 559, 44, 23);
		frame.getContentPane().add(r75);
		
		JRadioButton r76 = new JRadioButton("4");
		r76.setBackground(Color.CYAN);
		r76.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[19][1]=4;
			}
		});
		r76.setBounds(1196, 559, 44, 23);
		frame.getContentPane().add(r76);
		final ButtonGroup group19=new ButtonGroup();
		group19.add(r73);
		group19.add(r74);
		group19.add(r75);
		group19.add(r76);
		
		JRadioButton r77 = new JRadioButton("1");
		r77.setBackground(Color.CYAN);
		r77.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[20][1]=1;
			}
		});
		r77.setBounds(1058, 585, 44, 23);
		frame.getContentPane().add(r77);
		
		JRadioButton r78 = new JRadioButton("2");
		r78.setBackground(Color.CYAN);
		r78.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[20][1]=2;
			}
		});
		r78.setBounds(1104, 585, 44, 23);
		frame.getContentPane().add(r78);
		
		JRadioButton r79 = new JRadioButton("3");
		r79.setBackground(Color.CYAN);
		r79.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[20][1]=3;
			}
		});
		r79.setBounds(1150, 585, 44, 23);
		frame.getContentPane().add(r79);
		
		JRadioButton r80 = new JRadioButton("4");
		r80.setBackground(Color.CYAN);
		r80.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c[20][1]=4;
			}
		});
		r80.setBounds(1196, 585, 44, 23);
		frame.getContentPane().add(r80);
		final ButtonGroup group20=new ButtonGroup();
		group20.add(r77);
		group20.add(r78);
		group20.add(r79);
		group20.add(r80);
		
		
		JLabel lblmyTeacherIs = new JLabel("1.  My teacher is punctual to the class");
		lblmyTeacherIs.setBounds(10, 93, 999, 14);
		frame.getContentPane().add(lblmyTeacherIs);
		
		JLabel lbliUnderstandEasily = new JLabel("2.  I understand easily what my teacher is teaching");
		lbliUnderstandEasily.setBounds(10, 119, 999, 14);
		frame.getContentPane().add(lbliUnderstandEasily);
		
		JLabel lblmyTeacherIs_1 = new JLabel("3.  My teacher is well prepared for the class at all Lectures");
		lblmyTeacherIs_1.setBounds(10, 145, 999, 14);
		frame.getContentPane().add(lblmyTeacherIs_1);
		
		JLabel lblmyTeacherCommunicates = new JLabel("4.  My teacher communicates clearly");
		lblmyTeacherCommunicates.setBounds(10, 173, 999, 14);
		frame.getContentPane().add(lblmyTeacherCommunicates);
		
		JLabel lblmyTeacherMakes = new JLabel("5.  My teacher makes good use of example and illustrations");
		lblmyTeacherMakes.setBounds(10, 195, 999, 23);
		frame.getContentPane().add(lblmyTeacherMakes);
		
		JLabel lblmyTeacherIs_2 = new JLabel("6.  My teacher is actively helpful when academic difficulties");
		lblmyTeacherIs_2.setBounds(10, 225, 999, 14);
		frame.getContentPane().add(lblmyTeacherIs_2);
		
		JLabel lblmyTeacherCompletes = new JLabel("7.  My teacher completes the syllabus on time during the semester");
		lblmyTeacherCompletes.setBounds(10, 251, 999, 14);
		frame.getContentPane().add(lblmyTeacherCompletes);
		
		JLabel lblmyTeacherMeets = new JLabel("8.  My teacher meets the students regularly");
		lblmyTeacherMeets.setBounds(10, 277, 999, 14);
		frame.getContentPane().add(lblmyTeacherMeets);
		
		JLabel lblmyTeacherFollowups = new JLabel("9.  My teacher follow-ups the regularity of the student");
		lblmyTeacherFollowups.setBounds(10, 303, 999, 14);
		frame.getContentPane().add(lblmyTeacherFollowups);
		
		JLabel lblmyTeacherIs_3 = new JLabel("10.  My teacher is helpful to weaker student");
		lblmyTeacherIs_3.setBounds(10, 329, 999, 14);
		frame.getContentPane().add(lblmyTeacherIs_3);
		
		JLabel lblmyTeacherIs_4 = new JLabel("11.  My teacher is fair to all stduents in evalution/grading");
		lblmyTeacherIs_4.setBounds(10, 355, 999, 19);
		frame.getContentPane().add(lblmyTeacherIs_4);
		
		JLabel lblmyTeacherInspiresmotivates = new JLabel("12.  My teacher inspires/Motivates me for learning the subject");
		lblmyTeacherInspiresmotivates.setBounds(10, 381, 999, 19);
		frame.getContentPane().add(lblmyTeacherInspiresmotivates);
		
		JLabel lblmyTeacherIs_5 = new JLabel("13.  My teacher is available during practical/Lab hours and is helpful");
		lblmyTeacherIs_5.setBounds(10, 407, 999, 14);
		frame.getContentPane().add(lblmyTeacherIs_5);
		
		JLabel lblmyTeacherTakes = new JLabel("14.  My teacher takes active part in all student co-curricular activities");
		lblmyTeacherTakes.setBounds(10, 433, 999, 14);
		frame.getContentPane().add(lblmyTeacherTakes);
		
		JLabel lblmyTeacherCreates = new JLabel("15.  My teacher creates awareness of recent development in the subject");
		lblmyTeacherCreates.setBounds(10, 459, 999, 14);
		frame.getContentPane().add(lblmyTeacherCreates);
		
		JLabel lblmyTeacherGives = new JLabel("16.  My teacher gives more information about the subject as per other than books");
		lblmyTeacherGives.setBounds(10, 485, 999, 14);
		frame.getContentPane().add(lblmyTeacherGives);
		
		JLabel lblmyTeacherHolds = new JLabel("17.  My teacher holds the attention of the student throughout the class");
		lblmyTeacherHolds.setBounds(10, 511, 999, 14);
		frame.getContentPane().add(lblmyTeacherHolds);
		
		JLabel lblmyTeacherEncourages = new JLabel("18.  My teacher encourages discussion in the class");
		lblmyTeacherEncourages.setBounds(10, 537, 999, 14);
		frame.getContentPane().add(lblmyTeacherEncourages);
		
		JLabel lblmyTeacherIs_6 = new JLabel("19.  My teacher is giving useful explanation while returning answer papers and");
		lblmyTeacherIs_6.setBounds(10, 563, 999, 14);
		frame.getContentPane().add(lblmyTeacherIs_6);
		
		JLabel lbloverallRatingOf = new JLabel("20.  Overall rating of the teacher among the teachers of the class");
		lbloverallRatingOf.setBounds(10, 589, 999, 14);
		frame.getContentPane().add(lbloverallRatingOf);
		
		JLabel lblNewLabel_10 = new JLabel("-Project by Aditya Kulkarni");
		lblNewLabel_10.setFont(new Font("Dialog", Font.BOLD, 6));
		lblNewLabel_10.setBounds(12, 648, 297, 15);
		frame.getContentPane().add(lblNewLabel_10);
       
		final JLabel l2 = new JLabel("");
		l2.setBounds(12, 17, 70, 15);
		frame.getContentPane().add(l2);
		
		final JTextArea tex = new JTextArea("");
		tex.setBackground(Color.GREEN);
		tex.setBounds(976, 38, 322, 15);
		frame.getContentPane().add(tex);
		tex.setEditable(false);
		
		JButton submit1 = new JButton("Submit");
		submit1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		
				
				A=B=C=D=0; 
				int y;
				if(ro==0){
				JOptionPane.showMessageDialog(null, "pl Enter your PRN number!!!","No PRN number",JOptionPane.ERROR_MESSAGE);

				}
				else{
				if(co==1){
				 for(i=1;i<21;i++){
					   if(c[i][1]==1){
						   A++;
						   d[i][1]=1;
						   
					   }
					   if(c[i][1]==2){
						   B++;
						   d[i][1]=2;
					   }
					   if(c[i][1]==3){
						   C++;
						   d[i][1]=3;
					   }
					   if(c[i][1]==4){
						   D++;
						   d[i][1]=4;
					   }
					}
				 
				 if(shift==0){
					 JOptionPane.showMessageDialog(null, "pl Select your Shift!!!","Shift",JOptionPane.ERROR_MESSAGE);
				 }
				 else{
				 if(a==0){
				 JOptionPane.showMessageDialog(null, "pl Select the subject!!!","No Subject",JOptionPane.ERROR_MESSAGE);
	
				 }
				 if(A+B+C+D!=20&&a!=0){
				 JOptionPane.showMessageDialog(null, "You left out some questions!!!","Question Remaining",JOptionPane.ERROR_MESSAGE);

				 }
				 else{
				if(Check(a)==1){
					subar1[done]=a;
				JOptionPane.showMessageDialog(null, "value of A B C D are"+A+""+B+""+C+""+D);
				y=JOptionPane.showConfirmDialog(null, "Are you sure,you want to send the feedback for this subject?");

				if(y==0){
					try{
		                
				PrintWriter pout=new PrintWriter(client.getOutputStream(),true);
				pout.println(urol);
				pout.println(String.valueOf(a));
				pout.println(String.valueOf(A));
				pout.println(String.valueOf(B));
				pout.println(String.valueOf(C));
				pout.println(String.valueOf(D));
				pout.println(String.valueOf(shift));
				for(i=1;i<21;i++){
					pout.println(String.valueOf(d[i][1])); 
					c[i][1]=0;
					
				}
				done++;
				 tex.append(done+"."+s[a]+" ");
				 if(done==5){
					 JOptionPane.showMessageDialog(null, "Thanks for giving your feedback!!");
					
					 done=0;
					 urol=null;
					 ro=0;
					 a=0;
					 shift=0;
					 sub.setText("");
					 l2.setText("");
					 tex.setText("");
					 
				 }
				group1.clearSelection();
				group2.clearSelection();
				group3.clearSelection();
				group4.clearSelection();
				group5.clearSelection();
				group6.clearSelection();
				group7.clearSelection();
				group8.clearSelection();
				group9.clearSelection();
				group10.clearSelection();
				group11.clearSelection();
				group12.clearSelection();
				group13.clearSelection();
				group14.clearSelection();
				group15.clearSelection();
				group16.clearSelection();
				group17.clearSelection();
				group18.clearSelection();
				group19.clearSelection();
				group20.clearSelection();
				
				
			   
					}catch(IOException ex){
						JOptionPane.showMessageDialog(null, ex);
					}
				}
				 }
				else{
					JOptionPane.showMessageDialog(null, "You have sent the feedback for this subject!!");
				}
				 }
				 }
			}
				else{
				JOptionPane.showMessageDialog(null, "Connect to server first:-");
	
				}
				}
			
			}
		});
		submit1.setBounds(1151, 650, 89, 23);
		frame.getContentPane().add(submit1);
		
		
		sub.setBounds(57, 49, 97, 14);
		frame.getContentPane().add(sub);
		
		JLabel lblNewLabel = new JLabel("ALL INDIA SHRI SHIVAJI MEMORIAL SOCIETY");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel.setBounds(473, 12, 412, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("INSTITUTE OF INFORMATION TECHNOLOGY");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_1.setBounds(497, 27, 353, 36);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("TEACHER EVALUATION BY STUDENT");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setBounds(554, 58, 265, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(1341, 38, -402, 15);
		frame.getContentPane().add(textArea);
		
		JLabel lblNewLabel_3 = new JLabel("Done:-");
		lblNewLabel_3.setBounds(908, 38, 70, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		
		
		
		
		
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.CYAN);
		frame.setJMenuBar(menuBar);
			
			JMenu mnConnect = new JMenu("Connect");
			menuBar.add(mnConnect);
			
			JMenuItem mntmServerIp = new JMenuItem("Server ip/port");
			mntmServerIp.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ip=JOptionPane.showInputDialog("Enter ip address");
					JOptionPane.showMessageDialog(null, "ip address is:-"+ip);
					port="8888";
					co=1;
				    p=Integer.parseInt(port);
				    try{
					client =new Socket(ip,p);
					JOptionPane.showMessageDialog(null,"Just connected to "
		                      + client.getRemoteSocketAddress());
				    }catch(IOException exp){
				    	JOptionPane.showMessageDialog(null, exp);
				    }
					
				}
			});
			mnConnect.add(mntmServerIp);
			
			JMenu mnNewMenu_1 = new JMenu("PRN");
			menuBar.add(mnNewMenu_1);
			
			JMenuItem mntmUniversityRollno = new JMenuItem("PRN number");
			mnNewMenu_1.add(mntmUniversityRollno);
			mntmUniversityRollno.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					urol=JOptionPane.showInputDialog("Enter PRN number:-");
					if(urol!=null){
					ro=1;
					}
					if(urol.length()!=9){
						JOptionPane.showMessageDialog(null, "Invalid PRN number","Invalid number",JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			
			JMenu mnNewMenu = new JMenu("Shift");
			menuBar.add(mnNewMenu);
			
			JMenuItem mntmNewMenuItem_1 = new JMenuItem("I");
			mntmNewMenuItem_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					shift=1;
					l2.setText("Ist shift");
				}
			});
			mnNewMenu.add(mntmNewMenuItem_1);
			
			JMenuItem mntmNewMenuItem_2 = new JMenuItem("II");
			mntmNewMenuItem_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					shift=2;
					l2.setText("IInd shift");
				}
			});
			mnNewMenu.add(mntmNewMenuItem_2);
			
			JMenu mnYear = new JMenu("Year and Subject");
			menuBar.add(mnYear);
			
			JMenu mnFe = new JMenu("FE");
			mnFe.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					yr=1;
				}
			});
			mnYear.add(mnFe);
			
			JMenuItem mntmM = new JMenuItem("M I");
			mntmM.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a=1;
					sub.setText("M I");
					s[1]="M I";
				}
			});
			mnFe.add(mntmM);
			
			JMenuItem mntmChemistry = new JMenuItem("CHEMISTRY");
			mntmChemistry.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a=2;
					sub.setText("CHEMISTRY");
					s[2]="CHEMISTRY";
				}
			});
			mnFe.add(mntmChemistry);
			
			JMenuItem mntmElectrical = new JMenuItem("ELECTRICAL");
			mntmElectrical.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a=3;
					sub.setText("ELECTRICAL");
					s[3]="ELECTRICAL";
				}
			});
			mnFe.add(mntmElectrical);
			
			JMenuItem mntmCivil = new JMenuItem("CIVIL");
			mntmCivil.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a=4;
					sub.setText("CIVIL");
					s[4]="CIVIL";
				}
			});
			mnFe.add(mntmCivil);
			
			JMenuItem mntmGraphicsI = new JMenuItem("GRAPHICS I");
			mntmGraphicsI.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a=5;
					sub.setText("GRAPHICS I");
					s[5]="GRAPHICS I";
				}
			});
			mnFe.add(mntmGraphicsI);
			
			JMenuItem mntmMIi = new JMenuItem("M II");
			mntmMIi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a=6;
					sub.setText("M II");
					s[6]="M II";
				}
			});
			mnFe.add(mntmMIi);
			
			JMenuItem mntmPhysics = new JMenuItem("PHYSICS");
			mntmPhysics.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a=7;
					sub.setText("PHYSICS");
					s[7]="PHYSICS";
				}
			});
			mnFe.add(mntmPhysics);
			
			JMenuItem mntmMechanics = new JMenuItem("MECHANICS");
			mntmMechanics.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a=8;
					sub.setText("MECHANICS");
					s[8]="MECHANICS";
				}
			});
			mnFe.add(mntmMechanics);
			
			JMenuItem mntmElectronics = new JMenuItem("ELECTRONICS");
			mntmElectronics.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a=9;
					sub.setText("ELECTRONICS");
					s[9]="ELECTRONICS";
				}
			});
			mnFe.add(mntmElectronics);
			
			JMenuItem mntmMechanical = new JMenuItem("MECHANICAL");
			mntmMechanical.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a=10;
					sub.setText("MECHANICS");
					s[10]="MECHANICS";
				}
			});
			mnFe.add(mntmMechanical);
			
			JMenu mnSe = new JMenu("SE");
			mnSe.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					yr=2;
				}
			});
			mnYear.add(mnSe);
			
			JMenuItem mntmDiscreteStructure = new JMenuItem("DS");
			mntmDiscreteStructure.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a=11;
					sub.setText("DS");
					s[11]="DS";
				}
			});
			mnSe.add(mntmDiscreteStructure);
			
			JMenuItem mntmNewMenuItem = new JMenuItem("DSPS");
			mntmNewMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a=12;
					sub.setText("DSPS");
					s[12]="DSPS";
				}
			});
			mnSe.add(mntmNewMenuItem);
			
			JMenuItem mntmDeld = new JMenuItem("DELD");
			mntmDeld.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a=13;
					sub.setText("DELD");
					s[13]="DELD";
				}
			});
			mnSe.add(mntmDeld);
			
			JMenuItem mntmOsa = new JMenuItem("OSA");
			mntmOsa.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a=14;
					sub.setText("OSA");
					s[14]="OSA";
				}
			});
			mnSe.add(mntmOsa);
			
			JMenuItem mntmMa = new JMenuItem("MA");
			mntmMa.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a=15;
					sub.setText("MA");
					s[15]="MA";
				}
			});
			mnSe.add(mntmMa);
			
			JMenuItem mntmMIii = new JMenuItem("M III");
			mntmMIii.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a=16;
					sub.setText("M III");
					s[16]="M III";
				}
			});
			mnSe.add(mntmMIii);
			
			JMenuItem mntmOomp = new JMenuItem("OOMP");
			mntmOomp.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a=17;
					sub.setText("OOMP");
					s[17]="OOMP";
				}
			});
			mnSe.add(mntmOomp);
			
			JMenuItem mntmMit = new JMenuItem("MIT");
			mntmMit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a=18;
					sub.setText("MIT");
					s[18]="MIT";
				}
			});
			mnSe.add(mntmMit);
			
			JMenuItem mntmCgg = new JMenuItem("CGG");
			mntmCgg.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a=19;
					sub.setText("CGG");
					s[19]="CGG";
				}
			});
			mnSe.add(mntmCgg);
			
			JMenuItem mntmCo = new JMenuItem("CO");
			mntmCo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a=20;
					sub.setText("CO");
					s[20]="CO";
				}
			});
			mnSe.add(mntmCo);
			
			JMenu mnTe = new JMenu("TE");
			mnTe.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					yr=3;
				}
			});
			mnYear.add(mnTe);
			JMenu mnBe = new JMenu("BE");
			mnBe.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					yr=4;
				}
			});
			mnYear.add(mnBe);
			
			JMenuItem mntmNewMenuItem_3 = new JMenuItem("DAA");
			mntmNewMenuItem_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a=31;
					sub.setText("DAA");
					s[31]="DAA";
				}
			});
			mnBe.add(mntmNewMenuItem_3);
			
			JMenuItem mntmNewMenuItem_4 = new JMenuItem("SSDA");
			mntmNewMenuItem_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a=32;
					sub.setText("SSDA");
					s[32]="SSDA";
				}
			});
			mnBe.add(mntmNewMenuItem_4);
			
			JMenuItem mntmNewMenuItem_5 = new JMenuItem("PMCD");
			mntmNewMenuItem_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a=33;
					sub.setText("PMCD");
					s[33]="PMCD";
				}
			});
			mnBe.add(mntmNewMenuItem_5);
			
			JMenuItem mntmNewMenuItem_6 = new JMenuItem("ACP");
			mntmNewMenuItem_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a=34;
					sub.setText("ACP");
					s[34]="ACP";
				}
			});
			mnBe.add(mntmNewMenuItem_6);
			
			JMenuItem mntmNewMenuItem_7 = new JMenuItem("DM");
			mntmNewMenuItem_7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a=35;
					sub.setText("DM");
					s[35]="DM";
				}
			});
			mnBe.add(mntmNewMenuItem_7);
			
			JMenuItem mntmNewMenuItem_8 = new JMenuItem("PC");
			mntmNewMenuItem_8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a=36;
					sub.setText("PC");
					s[36]="PC";
				}
			});
			mnBe.add(mntmNewMenuItem_8);
			
			JMenuItem mntmToc = new JMenuItem("TOC");
			mntmToc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a=21;
					sub.setText("TOC");
					s[21]="TOC";
				}
			});
			mnTe.add(mntmToc);
			
			JMenuItem mntmOsd = new JMenuItem("OSD");
			mntmOsd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a=22;
					sub.setText("OSD");
					s[22]="OSD";
				}
			});
			mnTe.add(mntmOsd);
			
			JMenuItem mntmDcwsn = new JMenuItem("DCWSN");
			mntmDcwsn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a=23;
					sub.setText("DCWSN");
					s[23]="DCWSN";
				}
			});
			mnTe.add(mntmDcwsn);
			
			JMenuItem mntmDmsa = new JMenuItem("DMSA");
			mntmDmsa.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a=24;
					sub.setText("DMSA");
					s[24]="DMSA";
				}
			});
			mnTe.add(mntmDmsa);
			
			JMenuItem mntmFca = new JMenuItem("FCA");
			mntmFca.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a=25;
					sub.setText("FCA");
					s[25]="FCA";
				}
			});
			mnTe.add(mntmFca);
			
			JMenuItem mntmPcdp = new JMenuItem("PCDP");
			mnTe.add(mntmPcdp);
			mntmPcdp.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a=26;
					sub.setText("PCDP");
					s[26]="PCDP";
				}
			});
			
			JMenuItem mntmEos = new JMenuItem("EOS");
			mnTe.add(mntmEos);
			
				mntmEos.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						a=27;
						sub.setText("EOS");
						s[27]="EOS";
					}
				});
				JMenuItem mntmSe = new JMenuItem("SE");
				mnTe.add(mntmSe);
				JMenuItem mntmCn = new JMenuItem("CN");
				mnTe.add(mntmCn);
				
				JMenuItem mntmDspa = new JMenuItem("DSPA");
				mnTe.add(mntmDspa);
				mntmDspa.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						a=30;
						sub.setText("DSPA");
						s[30]="DSPA";
					}
				});
				mntmSe.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						a=29;
						sub.setText("SE");
						s[29]="SE";
					}
				});
				mntmCn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						a=28;
						sub.setText("CN");
						s[28]="CN";
					}
				});
			
			
	}
}