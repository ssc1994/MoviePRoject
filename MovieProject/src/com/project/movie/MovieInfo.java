package com.project.movie;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MovieInfo {
	
	protected JLabel poster;
	protected JLabel movieInfo;
	
	 MovieInfo(){
		 
		 
		 JFrame jFrame = new JFrame();
		 jFrame.setTitle("영화 정보");
		 jFrame.setVisible(true);
		 jFrame.setSize(600,600);
//		 jFrame.setResizable(false);
		 jFrame.setLocationRelativeTo(null);
		 jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
		 
		 //프레임 배치관리자 설정(FlowLayout)
		 jFrame.setLayout(new BorderLayout());
		 
		 //pan1 에는 영화이름들 버튼을 넣는다.
		 JPanel pan1 = new JPanel();
		 jFrame.add(pan1, BorderLayout.WEST); //프레임에 패널 붙여주기
		 //패널 레이아웃 관리자 박스레이아웃으로 설정
		 //pan1.setLayout(new BoxLayout(pan1,BoxLayout.Y_AXIS));
		 pan1.setLayout(new GridLayout(5,1));
		 
		 JButton btn1 = new JButton("짱구 극장판");
		 JButton btn2 = new JButton("블랙 아담");
		 JButton btn3= new JButton("자백");
		 JButton btn4 = new JButton("고속도로 가족");
		 JButton btn5 = new JButton("뒤로가기");
		 
		 //버튼 사이즈 확인 
		 //System.out.println(btn1.getPreferredSize());
		 
		 pan1.add(btn1);
		 pan1.add(btn2);
		 pan1.add(btn3);
		 pan1.add(btn4);
		 pan1.add(btn5);
		 
		 //포스터, 영화정보 출력할 라벨 만들기.
		 JPanel pan2 = new JPanel();
		 pan2.setLayout(new GridLayout(2,1));
		 jFrame.add(pan2, BorderLayout.CENTER);
		 this.poster = new JLabel("");
		 pan2.add(poster);
		 this.movieInfo = new JLabel("");
		 pan2.add(movieInfo);
		 
		
		
		//영화 버튼 누르면 해당 내용이 pan2의 poster, movieInfo 버튼들이 변화하도록 설정
		 
		//짱구 영화 정보 출력
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				 try {
					String crayon = Files.readString(Paths.get("/Users/css/git/MovieProject/MovieProject/src/movieinformation/영화정보폴더/CrayonShin_chan.txt"));
					movieInfo.setText(crayon);
				} catch (IOException e1) {
					System.out.println(e.getActionCommand());
				}
				 
			}
		});
		//짱구 포스터 출력
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				poster.setIcon(new ImageIcon("/Users/css/git/MovieProject/MovieProject/src/movieinformation/영화정보폴더/짱구극장판.png"));
				poster.setHorizontalAlignment(0);
			}
		});
		
		//블랙아담 영화 정보 출력
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String blackAdam = Files.readString(Paths.get("/Users/css/git/MovieProject/MovieProject/src/movieinformation/영화정보폴더/BlackAdam.txt"));
					movieInfo.setText(blackAdam);
				} catch (IOException e1) {
					System.out.println(e.getActionCommand());
				}
				
			}
		});
		
		//블랙아담 영화 포스터 출력
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				poster.setIcon(new ImageIcon("/Users/css/git/MovieProject/MovieProject/src/movieinformation/영화정보폴더/블랙아담.jpg"));
				poster.setHorizontalAlignment(0);
			}
		});
		
		//자백 영화 정보 출력
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//텍스트 출력
				try {
					String confession = Files.readString(Paths.get("/Users/css/git/MovieProject/MovieProject/src/movieinformation/영화정보폴더/ConFession.txt"));
					movieInfo.setText(confession);
				} catch (IOException e1) {
					System.out.println(e.getActionCommand());
				}
				
			}
		});
		//자백 영화 포스터 출력
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				poster.setIcon(new ImageIcon("/Users/css/git/MovieProject/MovieProject/src/movieinformation/영화정보폴더/자백.png"));
				poster.setHorizontalAlignment(0);
			}
		});
		
		//고속도로 가족 영화 정보 출력
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//텍스트 출력
				try {
					String highWayFamilly = Files.readString(Paths.get("/Users/css/git/MovieProject/MovieProject/src/movieinformation/영화정보폴더/HighWayFamilly.txt"));
					movieInfo.setText(highWayFamilly);
				} catch (IOException e1) {
					System.out.println(e.getActionCommand());
				}
				
			}
		});
		//고속도로 가족 포스터 출력
		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				poster.setIcon(new ImageIcon("/Users/css/git/MovieProject/MovieProject/src/movieinformation/영화정보폴더/고속도로가족.png"));
				poster.setHorizontalAlignment(0);
			}
		});
		 
		
		 
		 
		 
		//뒤로가기 버튼 처리. 
		btn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Select();
				jFrame.setVisible(false);
			}
		});
		 
	 }
	 

	public static void main(String[] args) {
		
		 new MovieInfo();
		 
	}

	 

}