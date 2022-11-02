package com.project.movie;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TheaterMovieList {
	TheaterMovieList() {
		JFrame jf2 = new JFrame();

		jf2.setTitle("상영관");

		jf2.setSize(600, 600);
		//		jf2.setLayout(new FlowLayout());
		Dimension frameSize = jf2.getSize();

		//화면 중앙에 배치
		jf2.setLocationRelativeTo(null);

		//		Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
		//		setLocation((windowSize.width - frameSize.width) / 2,
		//				(windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
		jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf2.setVisible(true);

		jf2.getContentPane().setLayout(null);

		//영화 리스트
		JLabel movie1 = new JLabel("수수께끼! 꽃피는 천하떡잎학교"); 
		JLabel movie2 = new JLabel("자백"); 
		JLabel movie3 = new JLabel("고속도로 가족"); 
		JLabel movie4 = new JLabel("블랙 아담"); 


		//		JButton movie1 = new JButton("수수께끼! 꽃피는 천하떡잎학교");
		//		JButton movie2 = new JButton("자백");
		//		JButton movie3 = new JButton("고속도로 가족");
		//		JButton movie4 = new JButton("블랙 아담");
		JButton back = new JButton("뒤로가기");

		//시간 리스트 
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

		//영화리스트 위치 설정
		movie1.setBounds(50,50,210,30);
		movie2.setBounds(50,170,122,30);
		movie3.setBounds(50,290,122,30);
		movie4.setBounds(50,410,122,30);

		//뒤로가기 위치 설정
		back.setBounds(450,490,122,30);


		//시간리스트 위치 설정
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



		//Container c = getContentPane();
		//영화리스트 버튼 삽입
		jf2.add(movie1);
		jf2.add(movie2);
		jf2.add(movie3);
		jf2.add(movie4);
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


		//시간 클릭하면 창 넘어가게 설정
		//movie1
		movie1time1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				/////////나중에 다음 페이지 추가해야함///////////
				new TheaterMovieList();
				jf2.setVisible(false);
			}
		});
		movie1time2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				/////////나중에 다음 페이지 추가해야함///////////
				new TheaterMovieList();
				jf2.setVisible(false);
			}
		});
		movie1time3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				/////////나중에 다음 페이지 추가해야함///////////
				new TheaterMovieList();
				jf2.setVisible(false);
			}
		});
		//movie2
		movie2time1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				/////////나중에 다음 페이지 추가해야함///////////
				new TheaterMovieList();
				jf2.setVisible(false);
			}
		});
		movie2time2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				/////////나중에 다음 페이지 추가해야함///////////
				new TheaterMovieList();
				jf2.setVisible(false);
			}
		});
		//movie3
		movie3time1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				/////////나중에 다음 페이지 추가해야함///////////
				new TheaterMovieList();
				jf2.setVisible(false);
			}
		});
		movie3time2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				/////////나중에 다음 페이지 추가해야함///////////
				new TheaterMovieList();
				jf2.setVisible(false);
			}
		});
		//movie4
		movie4time1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				/////////나중에 다음 페이지 추가해야함///////////
				new TheaterMovieList();
				jf2.setVisible(false);
			}
		});
		movie4time2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				/////////나중에 다음 페이지 추가해야함///////////
				new TheaterMovieList();
				jf2.setVisible(false);
			}
		});
		movie4time3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				/////////나중에 다음 페이지 추가해야함///////////
				new TheaterMovieList();
				jf2.setVisible(false);
			}
		});
		movie4time4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				/////////나중에 다음 페이지 추가해야함///////////
				new TheaterMovieList();
				jf2.setVisible(false);
			}
		});
		movie4time5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				/////////나중에 다음 페이지 추가해야함///////////
				new TheaterMovieList();
				jf2.setVisible(false);
			}
		});
		movie4time6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				/////////나중에 다음 페이지 추가해야함///////////
				new TheaterMovieList();
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
}