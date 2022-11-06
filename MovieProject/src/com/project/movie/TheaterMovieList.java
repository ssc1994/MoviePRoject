package com.project.movie;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TheaterMovieList {
	TheaterMovieList() {
		//프레임 선언
		JFrame jf2 = new JFrame();

		jf2.setTitle("상영관");//창 이름 설정
		jf2.setSize(600, 600);//창 크기 설정

		//화면 중앙에 배치
		jf2.setLocationRelativeTo(null);
		//x버튼 누르면 종료되도록 설정
		jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf2.setVisible(true);

		//위치 설정하기 위해 써줌
		jf2.getContentPane().setLayout(null);

		//폰트 설정
		Font font1 = new Font("맑은고딕", Font.BOLD, 14);






		//영화 리스트
		JLabel movie1 = new JLabel("수수께끼! \n 꽃피는 천하떡잎학교"); 
		JLabel movie2 = new JLabel("자백"); 
		JLabel movie3 = new JLabel("고속도로 가족"); 
		JLabel movie4 = new JLabel("블랙 아담"); 

		//영화 리스트 폰트 적용
		movie1.setFont(font1);
		movie2.setFont(font1);
		movie3.setFont(font1);
		movie4.setFont(font1);

		//뒤로가기 버튼 선언
		JButton back = new JButton("뒤로가기");

		//시간 리스트 버튼 선언
		//movie1
		JButton movie1time1 = new JButton("17:50");
		JButton movie1time2 = new JButton("20:00");
		JButton movie1time3 = new JButton("22:10");
		//movie2
		JButton movie2time1 = new JButton("19:40");
		JButton movie2time2 = new JButton("22:20");
		//movie3
		JButton movie3time1 = new JButton("18:00");
		JButton movie3time2 = new JButton("22:50");
		//movie4
		JButton movie4time1 = new JButton("10:40");
		JButton movie4time2 = new JButton("13:20");
		JButton movie4time3 = new JButton("15:50");
		JButton movie4time4 = new JButton("18:50");
		JButton movie4time5 = new JButton("21:20");
		JButton movie4time6 = new JButton("23:50");

		//영화리스트 라벨 위치 설정
		movie1.setBounds(50,50,210,30);
		movie2.setBounds(50,170,122,30);
		movie3.setBounds(50,290,122,30);
		movie4.setBounds(50,410,122,30);

		//뒤로가기 버튼 위치 설정
		back.setBounds(450,490,122,30);

		//시간리스트 버튼 위치 설정
		//movie1
		movie1time1.setBounds(70, 105, 110, 30);
		movie1time2.setBounds(180, 105, 110, 30);
		movie1time3.setBounds(290, 105, 110, 30);
		//movie2
		movie2time1.setBounds(70, 225, 110, 30);
		movie2time2.setBounds(180, 225, 110, 30);
		//movie3
		movie3time1.setBounds(70, 345, 110, 30);
		movie3time2.setBounds(180, 345, 110, 30);
		//movie4
		movie4time1.setBounds(70, 465, 110, 30);
		movie4time2.setBounds(180, 465, 110, 30);
		movie4time3.setBounds(290, 465, 110, 30);
		movie4time4.setBounds(70, 500, 110, 30);
		movie4time5.setBounds(180, 500, 110, 30);
		movie4time6.setBounds(290, 500, 110, 30);

		//영화리스트 버튼 삽입
		jf2.add(movie1);
		jf2.add(movie2);
		jf2.add(movie3);
		jf2.add(movie4);

		//뒤로가기 버튼 삽입
		jf2.add(back);

		//시간리스트 버튼 삽입
		//movie1
		jf2.add(movie1time1);
		jf2.add(movie1time2);
		jf2.add(movie1time3);
		//movie2
		jf2.add(movie2time1);
		jf2.add(movie2time2);
		//movie3
		jf2.add(movie3time1);
		jf2.add(movie3time2);
		//movie4
		jf2.add(movie4time1);
		jf2.add(movie4time2);
		jf2.add(movie4time3);
		jf2.add(movie4time4);
		jf2.add(movie4time5);
		jf2.add(movie4time6);


		//movie1
		movie1time1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Theater.locData.setMovvieName(movie1.getText());
				Theater.locData.setMovieTime("17:50");
				new Reservation();
				jf2.setVisible(false);
			}

		});
		movie1time2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Theater.locData.setMovvieName(movie1.getText());
				Theater.locData.setMovieTime("20:00");
				new Reservation();
				jf2.setVisible(false);
			}
		});
		movie1time3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Theater.locData.setMovvieName(movie1.getText());
				Theater.locData.setMovieTime("22:10");
				new Reservation();
				jf2.setVisible(false);
			}
		});
		//movie2
		movie2time1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Theater.locData.setMovvieName(movie2.getText());
				Theater.locData.setMovieTime("19:40");
				new Reservation();
				jf2.setVisible(false);
			}
		});
		movie2time2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Theater.locData.setMovvieName(movie2.getText());
				Theater.locData.setMovieTime("22:20");
				new Reservation();
				jf2.setVisible(false);
			}
		});
		//movie3
		movie3time1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Theater.locData.setMovvieName(movie3.getText());
				Theater.locData.setMovieTime("18:00");
				new Reservation();
				jf2.setVisible(false);
			}
		});
		movie3time2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Theater.locData.setMovvieName(movie3.getText());
				Theater.locData.setMovieTime("22:50");
				new Reservation();
				jf2.setVisible(false);
			}
		});
		//movie4
		movie4time1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Theater.locData.setMovvieName(movie4.getText());
				Theater.locData.setMovieTime("10:40");
				new Reservation();
				jf2.setVisible(false);
			}
		});
		movie4time2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Theater.locData.setMovvieName(movie4.getText());
				Theater.locData.setMovieTime("13:20");
				new Reservation();
				jf2.setVisible(false);
			}
		});
		movie4time3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Theater.locData.setMovvieName(movie4.getText());
				Theater.locData.setMovieTime("15:50");
				new Reservation();
				jf2.setVisible(false);
			}
		});
		movie4time4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Theater.locData.setMovvieName(movie4.getText());
				Theater.locData.setMovieTime("18:50");
				new Reservation();
				jf2.setVisible(false);
			}
		});
		movie4time5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Theater.locData.setMovvieName(movie4.getText());
				Theater.locData.setMovieTime("21:20");
				new Reservation();
				jf2.setVisible(false);
			}
		});
		movie4time6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Theater.locData.setMovvieName(movie4.getText());
				Theater.locData.setMovieTime("23:50");
				new Reservation();
				jf2.setVisible(false);
			}
		});


		back.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Theater();
				jf2.setVisible(false);
			}
		});


	}
	public static void timeLimit() {
		LocalTime now = LocalTime.now();



		if(now.getHour() > 13) {
			JOptionPane.showMessageDialog(null, "이미 상영이 시작된 영화입니다!");
		}

	}
}