package com.project.movie;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SignInSwing {
	JFrame s;
	private String Id=""; //아이디
	private String Pw=""; //비밀번호
	private String Name=""; //사용자 이름
	private String Age=""; //나이
	PrintStream signup;
	Font font1=new Font("맑은고딕",Font.BOLD,15);
	JButton back = new JButton("뒤로가기");

	//생성자
	SignInSwing(){
		super();
		setid();
	}
	//아이디메서드
	public void setid(){
		s = new JFrame();
		
		JPanel idpanel = new JPanel();
		JTextField idtext = new JTextField(15);
		JLabel idlabel = new JLabel("아이디입력");
		JButton idbutton = new JButton("아이디 확인");

		//프레임 세팅
		s.setTitle("회원가입2");//프레임 타이틀
		s.setFont(font1);
		s.setSize(600,600);//프레임 사이즈 통일
		s.setLocationRelativeTo(null);//언제나 가운데에 뜨기
		s.getContentPane().setLayout(null);//프레임 사이즈 벗어나면 자동 줄바꿈
		idlabel.setLocation(100, 200);
		idbutton.setFont(font1);


		//add 아이디
		idpanel.setBounds(0,20,600,50);
		idpanel.add(idlabel);
		idpanel.add(idtext);
		idpanel.add(idbutton);
		s.add(idpanel);
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//창이 닫히면 종료
		s.setVisible(true);

		//뒤로가기 버튼넣기
		JPanel backpanel = new JPanel();
		backpanel.setBounds(0,500,600,50);
		backpanel.add(back);
		s.add(backpanel);
		
		
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new MainMenuSwing();
				s.setVisible(false);
			}
		});

		//아이디창
		idbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					//기존에 있는 아이디 가져오기
					BufferedReader bfr = new BufferedReader(new FileReader("/Users/css/Desktop/login.txt"));
					String line = bfr.readLine();
					String eid = line.split("\t")[0];
					String eidlower=eid.toLowerCase();
					String idtextlower=idtext.getText().toLowerCase();


					//아이디 검사하고 올바른 형식인지 확인하기
					if(idtextlower.length()<=0) {
						//입력하지 않고 확인을 누를 경우
						JOptionPane.showMessageDialog(null,"아이디를 입력해 주세요");
						idtext.setText(null);
					}else if(!idtextlower.matches("^[0-9a-z]*$")) {
						JOptionPane.showMessageDialog(null,"아이디는 영어와 숫자로만 생성 가능합니다");
						idtext.setText(null);
						//아이디 중복검사하기
						//기존에 있는 아이디를 소문자로 변환한 것과 새로 입력한 아이디를 소문자로 변환한 것을 비교하기
					} else if(idtextlower.equals(eidlower)) {
						JOptionPane.showMessageDialog(null,"이미 존재하는 아이디입니다");
						idtext.setText(null);
					}else {
						JOptionPane.showMessageDialog(null,"아이디 생성이 가능합니다!");
						Id = idtext.getText();
//						signup.print(Id+"\t");
						bfr.close();
						s.setVisible(false);
						if(!Id.equals("")) {
							setpw();
						}

					}
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
	}

	//비밀번호메서드
	public void setpw() {
		//add 비밀번호
		JPanel pwpanel = new JPanel();
		JTextField pwtext = new JTextField(15);
		JLabel pwlabel = new JLabel("비밀번호입력");
		JButton pwbutton = new JButton("비밀번호 확인");
		pwlabel.setLocation(100, 400);
		pwbutton.setFont(font1);
		pwpanel.add(pwlabel);
		pwpanel.add(pwtext);
		
		pwpanel.setBounds(0,70,600,50);
		pwpanel.add(pwbutton);
		s.add(pwpanel);
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//창이 닫히면 콘솔 종료
		s.setVisible(true);

		//비밀번호창
		pwbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {

					String pwordtemp="";
					int countCapital=0;

					for(int i=0;i<pwtext.getText().length();i++) {
						if(pwtext.getText().charAt(i)>=65&&pwtext.getText().charAt(i)<=90) {
							countCapital++;
						}
						if(countCapital>=1) {
							break;
						}
					}
					if(Id==null) {
						//아이디 없이 비밀번호만 입력할 경우
						JOptionPane.showMessageDialog(null,"아이디를 먼저 설정해 주세요");
						pwtext.setText(null);
					}else if(pwtext.getText().length()<10) {
						//길이 제한
						JOptionPane.showMessageDialog(null,"비밀번호는 10글자 이상입니다");
						pwtext.setText(null);
					}else if(countCapital==0) {
						//대문자 하나 포함
						JOptionPane.showMessageDialog(null,"비밀번호는 대문자가 하나 이상 포함되어야 합니다");
						pwtext.setText(null);
					}else if(!pwtext.getText().matches("^[0-9a-zA-Z]*$")) {
						JOptionPane.showMessageDialog(null,"비밀번호는 영어와 숫자로만 생성 가능합니다");
						pwtext.setText(null);
					}else {
						JOptionPane.showMessageDialog(null,"올바른 형식의 비밀번호입니다");
						pwordtemp = pwtext.getText();
						//비밀번호 창 뜨게
						JPanel pw2panel = new JPanel();
						JTextField pw2text = new JTextField(15);
						JLabel pw2label = new JLabel("입력한 비밀번호 확인");
						JButton pw2button = new JButton("비밀번호 재확인");
						
						pw2panel.setBounds(0,120,600,50);
						pw2panel.add(pw2label);
						pw2panel.add(pw2text);
						pw2panel.add(pw2button);
						s.add(pw2panel);
						s.setVisible(true);

						if(pwordtemp!="") {
							pw2button.addActionListener(new ActionListener() {

								@Override
								public void actionPerformed(ActionEvent e) {
									if(!pw2text.getText().equals(pwtext.getText())) {
										JOptionPane.showMessageDialog(null,"입력한 비밀번호와 다릅니다");
										pw2text.setText(null);
									}else {
										JOptionPane.showMessageDialog(null,"비밀번호 생성이 가능합니다!");
										Pw = pw2text.getText();
										s.setVisible(false);
										if(Pw!=null) {
											setname();
										}

									}//else 괄호
								}
							});
						}
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}});
	}

	//이름메서드
	public void setname() {
		JPanel namepanel = new JPanel();
		JTextField nametext = new JTextField(15);
		JLabel namelabel = new JLabel("이름 입력");
		JButton namebutton = new JButton("이름 확인");

		//아이디, 비번 만들었으면 이름 넣기
		namepanel.add(namelabel);
		namepanel.setBounds(0,170,600,50);
		namepanel.add(nametext);
		namepanel.add(namebutton);
		s.add(namepanel);
		s.setVisible(true);
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//창이 닫히면 콘솔 종료
		s.setVisible(true);

		namebutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					//이름 검사
					if(!nametext.getText().matches("^[0-9a-zA-Z가-힣]*$")) {
						JOptionPane.showMessageDialog(null,"이름의 형식이 잘못되었습니다");
						nametext.setText(null);
					}else {
						Name=nametext.getText();
						s.setVisible(false);
						if(Name!=null) {
							setage();
						}

					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
	}

	//나이메서드
	public void setage() {
		//아이디, 비번, 이름 넣었으면 나이 넣기
		JPanel agepanel = new JPanel();
		JTextField agetext = new JTextField(15);
		JLabel agelabel = new JLabel("나이 입력");
		JButton agebutton = new JButton("나이 확인");

		//나이 입력
		agepanel.add(agelabel);
		agepanel.setBounds(0,220,600,50);
		agepanel.add(agetext);
		agepanel.add(agebutton);
		s.add(agepanel);
		s.setVisible(true);
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//창이 닫히면 콘솔 종료
		s.setVisible(true);


		//나이 검사
		agebutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					//아이디부터 나이까지 조건 다 맞으면 그때 저장
					signup = new PrintStream(new FileOutputStream("C:\\Users\\user\\Desktop\\login.txt",true));
					if(!agetext.getText().matches("^[0-9]*$")||Integer.parseInt(agetext.getText())<=0||Integer.parseInt(agetext.getText())>=300){
						JOptionPane.showMessageDialog(null,"나이의 형식이 잘못되었습니다");
						agetext.setText(null);
					}else {
						Age=agetext.getText();
						signup.print(Id+"\t");
						signup.print(Pw+"\t");
						signup.print(Name+"\t");
						signup.print(Age+"\r\n");
						signup.flush();
						signup.close();
						JOptionPane.showMessageDialog(null,"회원가입완료!");

						//회원가입 끝나면 메뉴창으로
						new MainMenuSwing();
						s.setVisible(false);
					}
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
	}


	//확인용 메인
	public static void main(String[] args) {
		new SignInSwing();
	}
}
