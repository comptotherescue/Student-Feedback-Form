import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRootPane;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Font;

public class Server extends Thread {

	private JFrame frame;
	public ServerSocket socket;
	public Socket server;
	String por,pass;
	int port,po,a,yr,n,pp,sht,c[][];
	ArrayList<JTextField> xx;
	float e[][];
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t6;
	JPasswordField t5;
	private JTextField ak03;
	private JTextField ak02;
	private JTextField ak01;
	private JTextField ak00;
	private JTextField ak13;
	private JTextField ak12;
	private JTextField ak11;
	private JTextField ak10;
	private JTextField ak23;
	private JTextField ak22;
	private JTextField ak21;
	private JTextField ak20;
	private JTextField ak33;
	private JTextField ak32;
	private JTextField ak31;
	private JTextField ak30;
	private JTextField ak43;
	private JTextField ak42;
	private JTextField ak41;
	private JTextField ak40;
	private JTextField ak53;
	private JTextField ak52;
	private JTextField ak51;
	private JTextField ak50;
	private JTextField ak63;
	private JTextField ak62;
	private JTextField ak61;
	private JTextField ak60;
	private JTextField ak73;
	private JTextField ak72;
	private JTextField ak71;
	private JTextField ak70;
	private JTextField ak83;
	private JTextField ak82;
	private JTextField ak81;
	private JTextField ak80;
	private JTextField ak93;
	private JTextField ak92;
	private JTextField ak91;
	private JTextField ak90;
	private JTextField ak103;
	private JTextField ak102;
	private JTextField ak101;
	private JTextField ak100;
	private JTextField ak113;
	private JTextField ak112;
	private JTextField ak111;
	private JTextField ak110;
	private JTextField ak123;
	private JTextField ak122;
	private JTextField ak121;
	private JTextField ak120;
	private JTextField ak133;
	private JTextField ak132;
	private JTextField ak131;
	private JTextField ak130;
	private JTextField ak143;
	private JTextField ak142;
	private JTextField ak141;
	private JTextField ak140;
	private JTextField ak153;
	private JTextField ak152;
	private JTextField ak151;
	private JTextField ak150;
	private JTextField ak163;
	private JTextField ak162;
	private JTextField ak161;
	private JTextField ak160;
	private JTextField ak173;
	private JTextField ak172;
	private JTextField ak171;
	private JTextField ak170;
	private JTextField ak183;
	private JTextField ak182;
	private JTextField ak181;
	private JTextField ak180;
	private JTextField ak193;
	private JTextField ak192;
	private JTextField ak191;
	private JTextField ak190;
	private JTextField ak47;
	private JMenu mnNewMenu_1;
	private JMenuItem mntmNewMenuItem_3;
	private JMenuItem mntmNewMenuItem_4;
	private JTextField f1;
	private JLabel l2;
	private JMenuItem mntmNewMenuItem_5;
	private JMenuItem mntmNewMenuItem_6;
	private JMenuItem mntmNewMenuItem_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					first1ss window = new first1ss();
					window.frame.setVisible(true);
					window.start();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	public first1ss() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Dialog", Font.BOLD, 20));
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setBounds(0, 0, screen.width-30,screen.height-30);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		po=0;
		sht=0;
		c=new int[21][1];
		e=new float[20][4];
		xx=new ArrayList<JTextField>();
 
		ak03 = new JTextField();
		ak03.setBounds(1292, 91, 60, 19);
		ak03.setColumns(10);
		ak03.setEditable(false);
		frame.getContentPane().add(ak03);
		
		ak02 = new JTextField();
		ak02.setText("");
		ak02.setBounds(1220, 91, 60, 19);
		ak02.setEditable(false);
		frame.getContentPane().add(ak02);
		ak02.setColumns(10);
		
		ak01 = new JTextField();
		ak01.setBounds(1148, 91, 60, 19);
		frame.getContentPane().add(ak01);
		ak01.setColumns(10);
		ak01.setEditable(false);
		
		ak00 = new JTextField();
		ak00.setBounds(1076, 91, 60, 19);
		frame.getContentPane().add(ak00);
		ak00.setColumns(10);
		ak00.setEditable(false);
		
		ak13 = new JTextField();
		ak13.setBounds(1292, 117, 60, 19);
		frame.getContentPane().add(ak13);
		ak13.setColumns(10);
		ak13.setEditable(false);
		
		ak12 = new JTextField();
		ak12.setBounds(1220, 117, 60, 19);
		ak12.setEditable(false);
		frame.getContentPane().add(ak12);
		ak12.setColumns(10);
		
		ak11 = new JTextField();
		ak11.setText("");
		ak11.setBounds(1148, 117, 60, 19);
		frame.getContentPane().add(ak11);
		ak11.setColumns(10);
		ak11.setEditable(false);
		
		ak10 = new JTextField();
		ak10.setText("");
		ak10.setBounds(1076, 117, 60, 19);
		frame.getContentPane().add(ak10);
		ak10.setColumns(10);
		ak10.setEditable(false);
		
		ak23 = new JTextField();
		ak23.setBounds(1292, 143, 60, 19);
		frame.getContentPane().add(ak23);
		ak23.setColumns(10);
		ak23.setEditable(false);
		
		ak22 = new JTextField();
		ak22.setText("");
		ak22.setBounds(1220, 143, 60, 19);
		frame.getContentPane().add(ak22);
		ak22.setColumns(10);
		ak22.setEditable(false);
		
		ak21 = new JTextField();
		ak21.setText("");
		ak21.setBounds(1148, 143, 60, 19);
		frame.getContentPane().add(ak21);
		ak21.setColumns(10);
		ak21.setEditable(false);
		
		ak20 = new JTextField();
		ak20.setText("");
		ak20.setBounds(1076, 143, 60, 19);
		frame.getContentPane().add(ak20);
		ak20.setColumns(10);
		ak20.setEditable(false);
		
		ak33 = new JTextField();
		ak33.setBounds(1292, 171, 60, 19);
		frame.getContentPane().add(ak33);
		ak33.setColumns(10);
		ak33.setEditable(false);
		
		ak32 = new JTextField();
		ak32.setText("");
		ak32.setBounds(1220, 171, 60, 19);
		frame.getContentPane().add(ak32);
		ak32.setColumns(10);
		ak32.setEditable(false);
		
		ak31 = new JTextField();
		ak31.setBounds(1148, 171, 60, 19);
		frame.getContentPane().add(ak31);
		ak31.setColumns(10);
		ak31.setEditable(false);
		
		ak30 = new JTextField();
		ak30.setBounds(1076, 171, 60, 19);
		frame.getContentPane().add(ak30);
		ak30.setColumns(10);
		ak30.setEditable(false);
		
		ak43 = new JTextField();
		ak43.setBounds(1292, 197, 60, 19);
		frame.getContentPane().add(ak43);
		ak43.setColumns(10);
		ak43.setEditable(false);
		
		ak42 = new JTextField();
		ak42.setBounds(1220, 197, 60, 19);
		frame.getContentPane().add(ak42);
		ak42.setColumns(10);
		ak42.setEditable(false);
		
		ak41 = new JTextField();
		ak41.setBounds(1148, 197, 60, 19);
		frame.getContentPane().add(ak41);
		ak41.setColumns(10);
		ak41.setEditable(false);
		
		ak40 = new JTextField();
		ak40.setBounds(1076, 197, 60, 19);
		frame.getContentPane().add(ak40);
		ak40.setColumns(10);
		ak40.setEditable(false);
		
		ak53 = new JTextField();
		ak53.setText("");
		ak53.setBounds(1292, 223, 60, 19);
		frame.getContentPane().add(ak53);
		ak53.setColumns(10);
		ak53.setEditable(false);
		
		ak52 = new JTextField();
		ak52.setBounds(1220, 223, 60, 19);
		frame.getContentPane().add(ak52);
		ak52.setColumns(10);
		ak52.setEditable(false);
		
		ak51 = new JTextField();
		ak51.setBounds(1148, 223, 60, 19);
		frame.getContentPane().add(ak51);
		ak51.setColumns(10);
		ak51.setEditable(false);
		
		ak50 = new JTextField();
		ak50.setBounds(1076, 223, 60, 19);
		frame.getContentPane().add(ak50);
		ak50.setColumns(10);
		ak50.setEditable(false);
		
		ak63 = new JTextField();
		ak63.setText("");
		ak63.setBounds(1292, 249, 60, 19);
		frame.getContentPane().add(ak63);
		ak63.setColumns(10);
		ak63.setEditable(false);
		
		ak62 = new JTextField();
		ak62.setText("");
		ak62.setBounds(1220, 249, 60, 19);
		frame.getContentPane().add(ak62);
		ak62.setColumns(10);
		ak62.setEditable(false);
		
		ak61 = new JTextField();
		ak61.setBounds(1148, 249, 60, 19);
		frame.getContentPane().add(ak61);
		ak61.setColumns(10);
		ak61.setEditable(false);
		
		ak60 = new JTextField();
		ak60.setBounds(1076, 249, 60, 19);
		frame.getContentPane().add(ak60);
		ak60.setColumns(10);
		ak60.setEditable(false);
		
		ak73 = new JTextField();
		ak73.setBounds(1292, 275, 60, 19);
		frame.getContentPane().add(ak73);
		ak73.setColumns(10);
		ak73.setEditable(false);
		
		ak72 = new JTextField();
		ak72.setBounds(1220, 275, 60, 19);
		frame.getContentPane().add(ak72);
		ak72.setColumns(10);
		ak72.setEditable(false);
		
		ak71 = new JTextField();
		ak71.setBounds(1148, 275, 60, 19);
		frame.getContentPane().add(ak71);
		ak71.setColumns(10);
		ak71.setEditable(false);
		
		ak70 = new JTextField();
		ak70.setBounds(1076, 275, 60, 19);
		frame.getContentPane().add(ak70);
		ak70.setColumns(10);
		ak70.setEditable(false);
		
		ak83 = new JTextField();
		ak83.setBounds(1292, 301, 60, 19);
		frame.getContentPane().add(ak83);
		ak83.setColumns(10);
		ak83.setEditable(false);
		
		ak82 = new JTextField();
		ak82.setBounds(1220, 301, 60, 19);
		frame.getContentPane().add(ak82);
		ak82.setColumns(10);
		ak82.setEditable(false);
		
		ak81 = new JTextField();
		ak81.setBounds(1148, 301, 60, 19);
		frame.getContentPane().add(ak81);
		ak81.setColumns(10);
		ak81.setEditable(false);
		
		ak80 = new JTextField();
		ak80.setBounds(1076, 301, 60, 19);
		frame.getContentPane().add(ak80);
		ak80.setColumns(10);
		ak80.setEditable(false);
		
		ak93 = new JTextField();
		ak93.setBounds(1292, 327, 60, 19);
		frame.getContentPane().add(ak93);
		ak93.setColumns(10);
		ak93.setEditable(false);
		
		ak92 = new JTextField();
		ak92.setBounds(1220, 327, 60, 19);
		frame.getContentPane().add(ak92);
		ak92.setColumns(10);
		ak92.setEditable(false);
		
		ak91 = new JTextField();
		ak91.setBounds(1148, 327, 60, 19);
		frame.getContentPane().add(ak91);
		ak91.setColumns(10);
		ak91.setEditable(false);
		
		ak90 = new JTextField();
		ak90.setBounds(1076, 327, 60, 19);
		frame.getContentPane().add(ak90);
		ak90.setColumns(10);
		ak90.setEditable(false);
		
		ak103 = new JTextField();
		ak103.setText("");
		ak103.setBounds(1292, 355, 60, 19);
		frame.getContentPane().add(ak103);
		ak103.setColumns(10);
		ak103.setEditable(false);
		
		ak102 = new JTextField();
		ak102.setBounds(1220, 355, 60, 19);
		frame.getContentPane().add(ak102);
		ak102.setColumns(10);
		ak102.setEditable(false);
		
		ak101 = new JTextField();
		ak101.setBounds(1148, 355, 60, 19);
		frame.getContentPane().add(ak101);
		ak101.setColumns(10);
		ak101.setEditable(false);
		
		ak100 = new JTextField();
		ak100.setBounds(1076, 355, 60, 19);
		frame.getContentPane().add(ak100);
		ak100.setColumns(10);
		ak100.setEditable(false);
		
		ak113 = new JTextField();
		ak113.setText("");
		ak113.setBounds(1292, 381, 60, 19);
		frame.getContentPane().add(ak113);
		ak113.setColumns(10);
		ak113.setEditable(false);
		
		ak112 = new JTextField();
		ak112.setBounds(1220, 381, 60, 19);
		frame.getContentPane().add(ak112);
		ak112.setColumns(10);
		ak112.setEditable(false);
		
		ak111 = new JTextField();
		ak111.setBounds(1148, 381, 60, 19);
		frame.getContentPane().add(ak111);
		ak111.setColumns(10);
		ak111.setEditable(false);
		
		ak110 = new JTextField();
		ak110.setBounds(1076, 381, 60, 19);
		frame.getContentPane().add(ak110);
		ak110.setColumns(10);
		ak110.setEditable(false);
		
		ak123 = new JTextField();
		ak123.setText("");
		ak123.setBounds(1292, 405, 60, 19);
		frame.getContentPane().add(ak123);
		ak123.setColumns(10);
		ak123.setEditable(false);
		
		ak122 = new JTextField();
		ak122.setBounds(1220, 405, 60, 19);
		frame.getContentPane().add(ak122);
		ak122.setColumns(10);
		ak122.setEditable(false);
		
		ak121 = new JTextField();
		ak121.setBounds(1148, 405, 60, 19);
		frame.getContentPane().add(ak121);
		ak121.setColumns(10);
		ak121.setEditable(false);
		
		ak120 = new JTextField();
		ak120.setBounds(1076, 405, 60, 19);
		frame.getContentPane().add(ak120);
		ak120.setColumns(10);
		ak120.setEditable(false);
		
		ak133 = new JTextField();
		ak133.setText("");
		ak133.setBounds(1292, 431, 60, 19);
		frame.getContentPane().add(ak133);
		ak133.setColumns(10);
		ak133.setEditable(false);
		
		ak132 = new JTextField();
		ak132.setBounds(1220, 431, 60, 19);
		frame.getContentPane().add(ak132);
		ak132.setColumns(10);
		ak132.setEditable(false);
		
		ak131 = new JTextField();
		ak131.setBounds(1148, 431, 60, 19);
		frame.getContentPane().add(ak131);
		ak131.setColumns(10);
		ak131.setEditable(false);
		
		ak130 = new JTextField();
		ak130.setBounds(1076, 431, 60, 19);
		frame.getContentPane().add(ak130);
		ak130.setColumns(10);
		ak130.setEditable(false);
		
		ak143 = new JTextField();
		ak143.setBounds(1292, 457, 60, 19);
		frame.getContentPane().add(ak143);
		ak143.setColumns(10);
		ak143.setEditable(false);
		
		ak142 = new JTextField();
		ak142.setText("");
		ak142.setBounds(1220, 457, 60, 19);
		frame.getContentPane().add(ak142);
		ak142.setColumns(10);
		ak142.setEditable(false);
		
		ak141 = new JTextField();
		ak141.setBounds(1148, 457, 60, 19);
		frame.getContentPane().add(ak141);
		ak141.setColumns(10);
		ak141.setEditable(false);
		
		ak140 = new JTextField();
		ak140.setBounds(1076, 457, 60, 19);
		frame.getContentPane().add(ak140);
		ak140.setColumns(10);
		ak140.setEditable(false);
		
		ak153 = new JTextField();
		ak153.setText("");
		ak153.setBounds(1292, 483, 60, 19);
		frame.getContentPane().add(ak153);
		ak153.setColumns(10);
		ak153.setEditable(false);
		
		ak152 = new JTextField();
		ak152.setBounds(1220, 483, 60, 19);
		frame.getContentPane().add(ak152);
		ak152.setColumns(10);
		ak152.setEditable(false);
		
		ak151 = new JTextField();
		ak151.setBounds(1148, 483, 60, 19);
		frame.getContentPane().add(ak151);
		ak151.setColumns(10);
		ak151.setEditable(false);
		
		ak150 = new JTextField();
		ak150.setBounds(1076, 483, 60, 19);
		frame.getContentPane().add(ak150);
		ak150.setColumns(10);
		ak150.setEditable(false);
		
		ak163 = new JTextField();
		ak163.setText("");
		ak163.setBounds(1292, 509, 60, 19);
		frame.getContentPane().add(ak163);
		ak163.setColumns(10);
		ak163.setEditable(false);
		
		ak162 = new JTextField();
		ak162.setBounds(1220, 509, 60, 19);
		frame.getContentPane().add(ak162);
		ak162.setColumns(10);
		ak162.setEditable(false);
		
		ak161 = new JTextField();
		ak161.setBounds(1148, 509, 60, 19);
		frame.getContentPane().add(ak161);
		ak161.setColumns(10);
		ak161.setEditable(false);
		
		ak160 = new JTextField();
		ak160.setBounds(1076, 509, 60, 19);
		frame.getContentPane().add(ak160);
		ak160.setColumns(10);
		ak160.setEditable(false);
		
		ak173 = new JTextField();
		ak173.setBounds(1292, 535, 60, 19);
		frame.getContentPane().add(ak173);
		ak173.setColumns(10);
		ak173.setEditable(false);
		
		ak172 = new JTextField();
		ak172.setBounds(1220, 535, 60, 19);
		frame.getContentPane().add(ak172);
		ak172.setColumns(10);
		ak172.setEditable(false);
		
		ak171 = new JTextField();
		ak171.setBounds(1148, 535, 60, 19);
		frame.getContentPane().add(ak171);
		ak171.setColumns(10);
		ak171.setEditable(false);
		
		ak170 = new JTextField();
		ak170.setBounds(1076, 535, 60, 19);
		frame.getContentPane().add(ak170);
		ak170.setColumns(10);
		ak170.setEditable(false);
		
		ak183 = new JTextField();
		ak183.setBounds(1292, 561, 60, 19);
		frame.getContentPane().add(ak183);
		ak183.setColumns(10);
		ak183.setEditable(false);
		
		ak182 = new JTextField();
		ak182.setBounds(1220, 561, 60, 19);
		frame.getContentPane().add(ak182);
		ak182.setColumns(10);
		ak182.setEditable(false);
		
		ak181 = new JTextField();
		ak181.setBounds(1148, 561, 60, 19);
		frame.getContentPane().add(ak181);
		ak181.setColumns(10);
		ak181.setEditable(false);
		
		ak180 = new JTextField();
		ak180.setBounds(1076, 561, 60, 19);
		frame.getContentPane().add(ak180);
		ak180.setColumns(10);
		ak180.setEditable(false);
		
		ak193 = new JTextField();
		ak193.setText("");
		ak193.setBounds(1292, 587, 60, 19);
		frame.getContentPane().add(ak193);
		ak193.setColumns(10);
		ak193.setEditable(false);
		
		ak192 = new JTextField();
		ak192.setBounds(1220, 587, 60, 19);
		frame.getContentPane().add(ak192);
		ak192.setColumns(10);
		ak192.setEditable(false);
		
		ak191 = new JTextField();
		ak191.setBounds(1148, 587, 60, 19);
		frame.getContentPane().add(ak191);
		ak191.setColumns(10);
		ak191.setEditable(false);
		
		ak190 = new JTextField();
		ak190.setBounds(1076, 587, 60, 19);
		frame.getContentPane().add(ak190);
		ak190.setColumns(10);
		ak190.setEditable(false);
		
        xx.add(ak00);
        xx.add(ak01);
        xx.add(ak02);
        xx.add(ak03);
        xx.add(ak10);
        xx.add(ak11);
        xx.add(ak12);
        xx.add(ak13);
        xx.add(ak20);
        xx.add(ak21);
        xx.add(ak22);
        xx.add(ak23);
        xx.add(ak30);
        xx.add(ak31);
        xx.add(ak32);
        xx.add(ak33);
        xx.add(ak40);
        xx.add(ak41);
        xx.add(ak42);
        xx.add(ak43);
        xx.add(ak50);
        xx.add(ak51);
        xx.add(ak52);
        xx.add(ak53);
        xx.add(ak60);
        xx.add(ak61);
        xx.add(ak62);
        xx.add(ak63);
        xx.add(ak70);
        xx.add(ak71);
        xx.add(ak72);
        xx.add(ak73);
        xx.add(ak80);
        xx.add(ak81);
        xx.add(ak82);
        xx.add(ak83);
        xx.add(ak90);
        xx.add(ak91);
        xx.add(ak92);
        xx.add(ak93);
        xx.add(ak100);
        xx.add(ak101);
        xx.add(ak102);
        xx.add(ak103);
        xx.add(ak110);
        xx.add(ak111);
        xx.add(ak112);
        xx.add(ak113);
        xx.add(ak120);
        xx.add(ak121);
        xx.add(ak122);
        xx.add(ak123);
        xx.add(ak130);
        xx.add(ak131);
        xx.add(ak132);
        xx.add(ak133);
        xx.add(ak140);
        xx.add(ak141);
        xx.add(ak142);
        xx.add(ak143);
        xx.add(ak150);
        xx.add(ak151);
        xx.add(ak152);
        xx.add(ak153);
        xx.add(ak160);
        xx.add(ak161);
        xx.add(ak162);
        xx.add(ak163);
        xx.add(ak170);
        xx.add(ak171);
        xx.add(ak172);
        xx.add(ak173);
        xx.add(ak180);
        xx.add(ak181);
        xx.add(ak182);
        xx.add(ak183);
        xx.add(ak190);
        xx.add(ak191);
        xx.add(ak192);
        xx.add(ak193);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		final JLabel sub1 = new JLabel("");
		sub1.setBounds(69, 40, 87, 14);
		frame.getContentPane().add(sub1);
		
		JMenu mnNewMenu = new JMenu("Login");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Username/password");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				final JFrame abc=new JFrame();
				JPanel p1=new JPanel();
				abc.setBounds(100,100,300,300);
				abc.setUndecorated(true);
				abc.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
				JButton b1=new JButton("submit");
				JLabel la=new JLabel("Enter the Username/password:-");
				t6=new JTextField("Username",10);
				 t5=new JPasswordField("Password",10);
				b1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						pp=0;
						try{
						  MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
				            // Now connect to your databases
				            DB db = mongoClient.getDB( "password" );
				            DBCollection col=db.getCollection("pass");
				            DBCursor cursor=col.find();
				            DBObject doc=cursor.next();
				            String pq=(String) doc.get("user");
				            String ps=(String) doc.get("passw");
						String p=new String(t5.getPassword());
						if(p.equals(ps)&&(t6.getText()).equals(pq)){
						pp=1;
						JOptionPane.showMessageDialog(null, "Loged in Successfully","Success",JOptionPane.INFORMATION_MESSAGE);
						}
						else{
						JOptionPane.showMessageDialog(null, "Invalid password/Username try again..","Authentication problem", JOptionPane.ERROR_MESSAGE);

						}
						
						if(pp==1){
						abc.dispose();
						}
						}catch(IOException err){
							System.out.println(err);
						}
					}
				});
				p1.add(la);
				p1.add(t6);
				p1.add(t5);
				p1.add(b1);
				abc.getContentPane().add(p1);
				abc.setVisible(true);
				
				
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Change Password");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(pp==1){
					final JFrame abc=new JFrame();
					JPanel p1=new JPanel();
					abc.setBounds(100,100,300,300);
					abc.setUndecorated(true);
					abc.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
					JButton b1=new JButton("Update");
					JLabel la=new JLabel("Enter the new Username/password:-");
					t6=new JTextField("Username",10);
					 t5=new JPasswordField("Password",10);
					b1.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent arg0) {
							
							try{
							  MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
					            // Now connect to your databases
					            DB db = mongoClient.getDB( "password" );
					            DBCollection col=db.getCollection("pass");
					            DBCursor cursor=col.find();
					            DBObject doc=cursor.next();
					            String dp=(String) doc.get("user");
					            String pq=t6.getText();
							String p=new String(t5.getPassword());
							BasicDBObject pu=new BasicDBObject();
							pu.put("user", pq);
							pu.put("passw", p);
							BasicDBObject se=new BasicDBObject().append("user", dp);
							col.update(se, pu);
							JOptionPane.showMessageDialog(null, "Password Changed successfully!!","Success",JOptionPane.INFORMATION_MESSAGE);
							}catch(IOException err){
								System.out.println(err);
							}
							abc.dispose();
						}
					});
					p1.add(la);
					p1.add(t6);
					p1.add(t5);
					p1.add(b1);
					abc.getContentPane().add(p1);
					abc.setVisible(true);
				}
				else{
					JOptionPane.showMessageDialog(null, "pl login first!!","Authentication Error",JOptionPane.ERROR_MESSAGE);
				}
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
				sub1.setText("M I");
			}
		});
		mnFe.add(mntmM);
		
		JMenuItem mntmChemistry = new JMenuItem("CHEMISTRY");
		mntmChemistry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=2;
				sub1.setText("CHEMISTRY");
			}
		});
		mnFe.add(mntmChemistry);
		
		JMenuItem mntmElectrical = new JMenuItem("ELECTRICAL");
		mntmElectrical.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=3;
				sub1.setText("ELECTRICAL");
			}
		});
		mnFe.add(mntmElectrical);
		
		JMenuItem mntmCivil = new JMenuItem("CIVIL");
		mntmCivil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=4;
				sub1.setText("CIVIL");
			}
		});
		mnFe.add(mntmCivil);
		
		JMenuItem mntmGraphicsI = new JMenuItem("GRAPHICS I");
		mntmGraphicsI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=5;
				sub1.setText("GRAPHICS I");
			}
		});
		mnFe.add(mntmGraphicsI);
		
		JMenuItem mntmMIi = new JMenuItem("M II");
		mntmMIi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=6;
				sub1.setText("M II");
			}
		});
		mnFe.add(mntmMIi);
		
		JMenuItem mntmPhysics = new JMenuItem("PHYSICS");
		mntmPhysics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=7;
				sub1.setText("PHYSICS");
			}
		});
		mnFe.add(mntmPhysics);
		
		JMenuItem mntmMechanics = new JMenuItem("MECHANICS");
		mntmMechanics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=8;
				sub1.setText("MECHANICS");
			}
		});
		mnFe.add(mntmMechanics);
		
		JMenuItem mntmElectronics = new JMenuItem("ELECTRONICS");
		mntmElectronics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=9;
				sub1.setText("ELECTRONICS");
			}
		});
		mnFe.add(mntmElectronics);
		
		JMenuItem mntmMechanical = new JMenuItem("MECHANICAL");
		mntmMechanical.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=10;
				sub1.setText("MECHANICS");
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
				sub1.setText("DS");
			}
		});
		mnSe.add(mntmDiscreteStructure);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("DSPS");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=12;
				sub1.setText("DSPS");
			}
		});
		mnSe.add(mntmNewMenuItem);
		
		JMenuItem mntmDeld = new JMenuItem("DELD");
		mntmDeld.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=13;
				sub1.setText("DELD");
			}
		});
		mnSe.add(mntmDeld);
		
		JMenuItem mntmOsa = new JMenuItem("OSA");
		mntmOsa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=14;
				sub1.setText("OSA");
			}
		});
		mnSe.add(mntmOsa);
		
		JMenuItem mntmMa = new JMenuItem("MA");
		mntmMa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=15;
				sub1.setText("MA");
			}
		});
		mnSe.add(mntmMa);
		
		JMenuItem mntmMIii = new JMenuItem("M III");
		mntmMIii.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=16;
				sub1.setText("M III");
			}
		});
		mnSe.add(mntmMIii);
		
		JMenuItem mntmOomp = new JMenuItem("OOMP");
		mntmOomp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=17;
				sub1.setText("OOMP");
			}
		});
		mnSe.add(mntmOomp);
		
		JMenuItem mntmMit = new JMenuItem("MIT");
		mntmMit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=18;
				sub1.setText("MIT");
			}
		});
		mnSe.add(mntmMit);
		
		JMenuItem mntmCgg = new JMenuItem("CGG");
		mntmCgg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=19;
				sub1.setText("CGG");
			}
		});
		mnSe.add(mntmCgg);
		
		JMenuItem mntmCo = new JMenuItem("CO");
		mntmCo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=20;
				sub1.setText("CO");
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
		
		mntmNewMenuItem_5 = new JMenuItem("DAA");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a=31;
				sub1.setText("DAA");
			}
		});
		mnBe.add(mntmNewMenuItem_5);
		
		mntmNewMenuItem_6 = new JMenuItem("SSDA");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=32;
				sub1.setText("SSDA");
			}
		});
		mnBe.add(mntmNewMenuItem_6);
		
		mntmNewMenuItem_7 = new JMenuItem("PMCD");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=33;
				sub1.setText("PMCD");
			}
		});
		mnBe.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("ACP");
		mntmNewMenuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=34;
				sub1.setText("ACP");
			}
		});
		mnBe.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("DM");
		mntmNewMenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=35;
				sub1.setText("DM");
			}
		});
		mnBe.add(mntmNewMenuItem_9);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("PC");
		mntmNewMenuItem_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=36;
				sub1.setText("PC");
			}
		});
		mnBe.add(mntmNewMenuItem_10);
		
		JMenuItem mntmToc = new JMenuItem("TOC");
		mntmToc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=21;
				sub1.setText("TOC");
			}
		});
		mnTe.add(mntmToc);
		
		JMenuItem mntmOsd = new JMenuItem("OSD");
		mntmOsd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=22;
				sub1.setText("OSD");
			}
		});
		mnTe.add(mntmOsd);
		
		JMenuItem mntmDcwsn = new JMenuItem("DCWSN");
		mntmDcwsn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=23;
				sub1.setText("DCWSN");
			}
		});
		mnTe.add(mntmDcwsn);
		
		JMenuItem mntmDmsa = new JMenuItem("DMSA");
		mntmDmsa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=24;
				sub1.setText("DMSA");
			}
		});
		mnTe.add(mntmDmsa);
		
		JMenuItem mntmFca = new JMenuItem("FCA");
		mntmFca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=25;
				sub1.setText("FCA");
			}
		});
		mnTe.add(mntmFca);
		
		JMenuItem mntmPcdp = new JMenuItem("PCDP");
		mnTe.add(mntmPcdp);
		mntmPcdp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=26;
				sub1.setText("PCDP");
			}
		});
		
		JMenuItem mntmEos = new JMenuItem("EOS");
		mnTe.add(mntmEos);
		
			mntmEos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a=27;
					sub1.setText("EOS");
				}
			});

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
		JMenuItem mntmSe = new JMenuItem("SE");
		mnTe.add(mntmSe);
		JMenuItem mntmCn = new JMenuItem("CN");
		mnTe.add(mntmCn);
		
		JMenuItem mntmDspa = new JMenuItem("DSPA");
		mnTe.add(mntmDspa);
		
		mnNewMenu_1 = new JMenu("Shift");
		menuBar.add(mnNewMenu_1);
		
		mntmNewMenuItem_3 = new JMenuItem("I");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sht=1;
				l2.setText("Ist shift");
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		mntmNewMenuItem_4 = new JMenuItem("II");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sht=2;
				l2.setText("IInd shift");
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_4);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("A");
		lblNewLabel.setBounds(383, 12, 70, 22);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("B");
		lblNewLabel_1.setBounds(497, 16, 70, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("C");
		lblNewLabel_2.setBounds(609, 16, 70, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("D");
		lblNewLabel_3.setBounds(710, 16, 70, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		t1 = new JTextField();
		t1.setBounds(353, 35, 100, 19);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		t1.setEditable(false);
		
		t2 = new JTextField();
		t2.setBounds(467, 35, 100, 19);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		t2.setEditable(false);
		
		t3 = new JTextField();
		t3.setBounds(579, 35, 100, 19);
		frame.getContentPane().add(t3);
		t3.setColumns(10);
		t3.setEditable(false);
		
		t4 = new JTextField();
		t4.setBounds(691, 35, 100, 19);
		frame.getContentPane().add(t4);
		t4.setColumns(10);
		t4.setEditable(false);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(pp==1){
				try{
					if(sht!=0){
					long T2,T1=System.currentTimeMillis();
					int i,j;
					n=0;
					float a1,b1,c1,d1,a2,b2,c2,d2,sum,a12,b12,c12,d12;
					a1=b1=c1=d1=a2=b2=c2=d2=sum=0;
				 MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
		            // Now connect to your databases
		            DB db = mongoClient.getDB( "feedback" );
		            
		            DBCollection col=db.getCollection("ak"+sht+a);
		            DBCursor cursor1=col.find();
		            for(DBObject doc : cursor1){
		        	    n++;
		        	    a12=Float.parseFloat((String) doc.get("A"));
		        	    b12=Float.parseFloat((String) doc.get("B"));
		        	    c12=Float.parseFloat((String) doc.get("C"));
		        	    d12=Float.parseFloat((String) doc.get("D"));
		        	    a1=a1+a12;
		        	    b1=b1+b12;
		        	    c1=c1+c12;
		        	    d1=d1+d12;
		        	    a2=a12*5;
		        	    b2=b12*4;
		        	    c2=c12*3;
		        	    d2=d12*2;
		        	    sum=sum+a2+b2+c2+d2;
		            }
		            
		            String g=""+(Math.round(sum/n))+"%";
		            ak47.setText(g);
		            f1.setText(""+n);
		            for(i=0;i<20;i++){
		            	for(j=0;j<4;j++){
		            		e[i][j]=0;
		            	}
		            }

		            while(cursor1.hasNext()){
		            	DBObject obj=cursor1.next();
		            	BasicDBList abc=(BasicDBList) obj.get("values");
		            for(i=0;i<abc.size();i++){
		            	if(Integer.parseInt((String) abc.get(i))==1){
		            		e[i][0]+=1;

		            	}
		            	if(Integer.parseInt((String) abc.get(i))==2){
		            		e[i][1]+=1;

		            	}
		            	if(Integer.parseInt((String) abc.get(i))==3){
		            		e[i][2]+=1;
		            	}
		            	if(Integer.parseInt((String) abc.get(i))==4){
		            		e[i][3]+=1;
		            	}
		            }
		            }
		            String s;
		            
		            i=0;
		            j=0;
		        
		            for(JTextField t:xx){
		                s=""+(Math.round((e[i/4][j]/n)*100));
		            	t.setText(s);
		            	i++;
		            	j++;
		            	if(j>3){
		            		j=0;
		            	}
		            }
		            n=n*20;
		            a1=(Math.round((a1/n)*100));
		            b1=(Math.round((b1/n)*100));
		            c1=(Math.round((c1/n)*100));
		            d1=(Math.round((d1/n)*100));
		            t1.setText(""+a1+"%");
		            t2.setText(""+b1+"%");
		            t3.setText(""+c1+"%");
		            t4.setText(""+d1+"%");
		            T2=System.currentTimeMillis();
		            System.out.println((T2-T1)+"millisec");
					}
					else{
						JOptionPane.showMessageDialog(null, "Please Select Shift!!","Error",JOptionPane.ERROR_MESSAGE);

					}
				}catch(IOException er){
					System.out.println(er);
				}
				
				}
				else{
					JOptionPane.showMessageDialog(null, "Please Login first!!","Authentication Error",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton.setBounds(1235, 640, 117, 25);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(86, 24, 70, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Rating:-");
		lblNewLabel_5.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_5.setBounds(628, 642, 107, 23);
		frame.getContentPane().add(lblNewLabel_5);
		
		ak47 = new JTextField();
		ak47.setBounds(724, 643, 114, 19);
		frame.getContentPane().add(ak47);
		ak47.setColumns(10);
		ak47.setEditable(false);
		
		JLabel lblNewLabel_6 = new JLabel("A");
		lblNewLabel_6.setBounds(1097, 64, 70, 15);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("B");
		lblNewLabel_7.setBounds(1179, 64, 70, 15);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("C");
		lblNewLabel_8.setBounds(1247, 64, 70, 15);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("D");
		lblNewLabel_9.setBounds(1315, 64, 70, 15);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("-Project by Aditya and Sushant");
		lblNewLabel_10.setFont(new Font("Dialog", Font.BOLD, 6));
		lblNewLabel_10.setBounds(12, 648, 297, 15);
		frame.getContentPane().add(lblNewLabel_10);
		
		f1 = new JTextField();
		f1.setBounds(1220, 24, 87, 19);
		f1.setEditable(false);
		frame.getContentPane().add(f1);
		f1.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Number of feedback:-");
		lblNewLabel_11.setBounds(1054, 23, 152, 15);
		frame.getContentPane().add(lblNewLabel_11);
		
		l2 = new JLabel("");
		l2.setBounds(10, 13, 70, 15);
		frame.getContentPane().add(l2);
		
		
		
		mntmDspa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=30;
				sub1.setText("DSPA");
			}
		});
		mntmSe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=29;
				sub1.setText("SE");
			}
		});
		mntmCn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=28;
				sub1.setText("CN");
			}
		});
	}

	@Override
	public void run() {
		
		port=8888;	
		try {
			
			socket=new ServerSocket(port);
			while(true){
			server=socket.accept();
            new Thread(new acc(server)).start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public class acc implements Runnable{
		
		Socket server1;
		public acc(Socket Se){
			server1=Se;
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			String urol,a,A,B,C,D,tem;
			int no,shift;
			try{
				int i;
				while(true){
			InputStream is = server1.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            ArrayList<String> x=new ArrayList<String>();
            urol=br.readLine();
            a=br.readLine();
            A=br.readLine();
            B=br.readLine();
            C=br.readLine();
            D=br.readLine();
            String sh = br.readLine();
            for(i=1;i<21;i++){
            	tem=br.readLine();
            	x.add(tem);
            }
            shift=Integer.parseInt(sh);
       
            MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
            // Now connect to your databases
            DB db = mongoClient.getDB( "feedback" );
            DBCollection col=db.getCollection("ak"+shift+a);
            no=0;
        	BasicDBObject whereQuery = new BasicDBObject();
            whereQuery.put("urol", urol);
        	DBCursor cursor1 = col.find(whereQuery);
        	while(cursor1.hasNext()) {
        	    System.out.println(cursor1.next());
        	    no=1;
        	}
        	if(no==0){
            BasicDBObject ob=new BasicDBObject("urol",urol).append("A", A).append("B", B).append("C", C).append("D", D).append("values", x);
            
      
            col.insert(ob);
        	

            mongoClient.close();
        	}
        	else{
        	 
        	}
				}
			}catch(IOException er){
				er.printStackTrace();
			}
		}
		
	}
}