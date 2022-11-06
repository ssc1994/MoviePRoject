package com.project.movie;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LogInSwing {
	
	Font font1=new Font("맑은고딕",Font.BOLD,15);
	Map<String,String> infoname = new HashMap<>();
	Map<String,String> infoage = new HashMap<>();
	Map<String,String> infopw = new HashMap<>();
	//값을 가져오기 위한 멤버변수. 
	private String line;
	private String[] info;
	private String InfoID;
	private String InfoName;
	private String InfoAge;
	//뒤로가기
	JButton back = new JButton("뒤로가기");

	




	//생성자-파일에서 읽어와 회원정보 저장
	public LogInSwing() {
		try {
			//아이디, 이름, 나이 저장된 파일에서 가져와서 map에 저장
			BufferedReader bfr = new BufferedReader(new FileReader("/Users/css/Desktop/login.txt"));
			while(true) {	
				this.line = bfr.readLine();
				if(line==null) break;
				this.info = this.line.split("\t");
				this.infopw.put(this.info[0], this.info[1]);
				this.infoname.put(this.info[0], this.info[2]);
				this.infoage.put(this.info[0], this.info[3]);
			}
			bfr.close();
			//로그인 창 부르기
			myLogin();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void myLogin() {
		JFrame l = new JFrame();
		l.setTitle("로그인");//프레임 타이틀
		l.setFont(font1);
		l.setSize(600,600);//프레임 사이즈 통일
		l.setLocationRelativeTo(null);//언제나 가운데에 뜨기
		l.setLayout(new FlowLayout());//프레임 사이즈 벗어나면 자동 줄바꿈
		l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//창이 닫히면 종료
		l.setVisible(true);

		
		//아이디입력란
		JPanel loginidpanel = new JPanel();
		JTextField loginidtext = new JTextField(15);
		JLabel loginidlabel = new JLabel("아이디:");
		loginidlabel.setLocation(100, 200);
		loginidpanel.add(loginidlabel);
		loginidpanel.setPreferredSize(new Dimension(600,40));
		loginidpanel.add(loginidtext);
		l.add(loginidpanel);


		//비밀번호입력란
		JPanel loginpwpanel = new JPanel();
		JTextField loginpwtext = new JTextField(15);
		JLabel loginpwlabel = new JLabel("비밀번호:");
		loginpwpanel.add(loginpwlabel);
		loginpwpanel.setPreferredSize(new Dimension(600,40));
		loginpwpanel.add(loginpwtext);
		l.add(loginpwpanel);

		//로그인버튼-아이디와 비밀번호 넣고한번에
		JPanel loginbuttonpanel = new JPanel();
		JButton loginbutton = new JButton("로그인");
		loginbuttonpanel.add(loginbutton);
		l.add(loginbuttonpanel);

		//뒤로가기 버튼넣기
		JPanel backpanel = new JPanel();
		backpanel.add(back);
		l.add(backpanel);
		
		
		loginbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!loginpwtext.getText().equals(infopw.get(loginidtext.getText()))) {
					JOptionPane.showMessageDialog(null,"아이디 또는 비밀번호가 일치하지 않습니다");
					loginidtext.setText(null);
					loginpwtext.setText(null);
				}else {
					//맞으면 정보 저장
					JOptionPane.showMessageDialog(null,"로그인 성공!");
//					InfoID=(loginidtext.getText());
//					InfoName=(infoname.get(loginidtext.getText()));
//					InfoAge=(infoage.get(loginidtext.getText()));
					setInfoID(loginidtext.getText());
					setInfoname(infoname.get(loginidtext.getText()));
					setInfoAge(infoage.get(loginidtext.getText()));
					//로그인했으면 예매창으로 넘어가기
					new Select();
					l.setVisible(false);
					
				}
			}
		});
		
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new MainMenuSwing();
				l.setVisible(false);
			}
		});
		
	}
	

	public void setInfoID(String infoID) {
		this.InfoID = infoID;
	}
	
	public void setInfoname(String infoname) {
		this.InfoName = infoname;
	}

	public void setInfoAge(String infoAge) {
		this.InfoAge = infoAge;
	}
	
	
	//key:아이디 
		public String getID() {
			return "아이디:" + InfoID;
		}

		//key:아이디 value:이름
		public String getname() {
			return "이름:"+InfoName;
		}

		//key:아이디 value:나이
		public String getage() {
			return "나이:"+InfoAge;
		}

	public static void main(String[] args) {
		new LogInSwing();
	
		
	}

}
