package com.project.movie;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.util.Calendar;
import javax.swing.*;

public class Reservation {//예매정보 객체

//	 private Person person; //예매한 고객을 ID로 분류하고 회원정보에서 찾아서 가져옴
	 private int round; //영화의 회차 정보
	 private JCheckBox[][] seats = new JCheckBox[7][10];  //예매한 좌석
	 
	 
	 Calendar now1 = Calendar.getInstance();
	 
	 public void Reserv(){
		 JFrame resFrame = new JFrame();
		 resFrame.setTitle("예매하기");
		 resFrame.setSize(600,600);
		 resFrame.setLocationRelativeTo(null);
		 resFrame.setLayout(new FlowLayout());
		 JPanel row1 = new JPanel();
		 JPanel row2 = new JPanel();
		 JPanel row3_1 = new JPanel();
		 JPanel row3_2 = new JPanel();
		 JPanel row4 = new JPanel();
		 JPanel row5 = new JPanel();
		 resFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 Font font1 = new Font("맑은고딕", Font.BOLD,20);
		 Font seat = new Font("맑은고딕",Font.BOLD,10);
		 Font colfont = new Font("맑은고딕", Font.PLAIN, 16);
		 Font rowfont = new Font("맑은고딕", Font.BOLD, 12);
		 
		 
		 
		 //row1에 날짜 //영화명//회차(영화시간) 표시
		 JLabel year = new JLabel();
		 String t1 =now1.get(Calendar.YEAR) + " 년 " ;
		 year.setText(t1);
		 JLabel month = new JLabel();
		 String t2 =(now1.get(Calendar.MONTH)+1) + " 월 " ;
		 month.setText(t2);
		 JLabel day = new JLabel();
		 String t3 = now1.get(Calendar.DAY_OF_MONTH) + " 일";
		 day.setText(t3);
		 
		 JPanel today = new JPanel();
		 today.setLayout(new BoxLayout(today,BoxLayout.Y_AXIS));
		 today.add(year);
		 today.add(month);
		 today.add(day);
		 
		 JLabel curMovie = new JLabel("선택한 영화");
		 JLabel curTime = new JLabel("선택한 회차");
		 
		 today.setPreferredSize(new Dimension(100,50));
		 curMovie.setPreferredSize(new Dimension(180,50));
		 curTime.setPreferredSize(new Dimension(120,50));
		 
		//row1 폰트설정
		 today.setFont(font1);
		 curMovie.setFont(font1);
		 curTime.setFont(font1);
		 
		 row1.add(today);
		 row1.add(curMovie);
		 row1.add(curTime);
		 row1.setPreferredSize(new Dimension(500,80));
		 
		 
		 //row3 사이즈 설정(좌석번호 1~10)
		 row2.setPreferredSize(new Dimension(600,20));
		 
		 for (int i = 0; i < 10; i++) {
				JLabel seatRowLabel = new JLabel();
				String input =   "           " + Integer.toString(i + 1) ;
				seatRowLabel.setText(input);
				seatRowLabel.setFont(rowfont);
				row2.add(seatRowLabel);
			}
		 //row3 사이즈 설정(좌석A~G +  체크박스)
		 row3_1.setPreferredSize(new Dimension(20,240));
		 JPanel col = new JPanel();
		 
		 for( int i = 0 ; i<7 ; i++) {
			 JLabel seatColLabel = new JLabel();
			 char input = (char)('A'+i);
			 seatColLabel.setText(Character.toString(input));
			 col.add(seatColLabel);
			 seatColLabel.setFont(colfont);
		 }
		 col.setPreferredSize(new Dimension(20,240));
		 col.setLayout(new GridLayout(7,0));
		 row3_1.add(col);
		 
		 row3_2.setPreferredSize(new Dimension(450,250));
		 row3_2.setLayout(new GridLayout(7,10));
		 
		 for(int i = 0 ; i< 7	;	i++) {
			 for(int j = 0 ; j<10 ; j++) {
				 JCheckBox box = new JCheckBox();
				 seats[i][j] = box;
				 char seatrow = (char)(i+65);
				 box.setText(seatrow + Integer.toString(j+1));
				 box.setFont(seat);
				 row3_2.add(box);
			 }
		 }
		 
		 //인원수 선택
		 ButtonGroup seatnum = new ButtonGroup();
		 for( int i = 1 ; i<=10 ; i++) {
			 JRadioButton ch = new JRadioButton(i+"명");
			 seatnum.add(ch);
			 row4.add(ch);
		 }
		 
		 //선택한 좌석 출력
		 
		 
		 
		 JLabel choice = new JLabel();
		 choice.setFont(font1);
		 
		 //좌석번호 출력용
//		 for(int i = 0 ; i< 7	;	i++) {
//			 for(int j = 0 ; j<10 ; j++) {
//				 JCheckBox box = new JCheckBox();
//				 seats[i][j] = box;
//				 char seatrow = (char)(i+65);
//				 box.setText(seatrow + Integer.toString(j+1));
//				 box.setFont(seat);
//				 row3_2.add(box);
//			 }
//		 }
		 
		 
		 
		 
		 
		 resFrame.add("North",row1);
		 resFrame.add(row2);
		 resFrame.add(row3_1);
		 resFrame.add(row3_2);
		 resFrame.add(row4);
		 resFrame.add(row5);
		 
		 
		 
		 resFrame.setVisible(true);
		 
	 }
	 public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == 1) {
				// System.out.println("checked" + e.getSource());
				// 좌석 번호 뽑아내기.
				JCheckBox tempCheckbox = (JCheckBox) e.getSource();
				
				
				
			}
		} 
	 public void actionPerfomed(ActionEvent e) {
		 
	 }
	 public static void main(String[] args) {
		Reservation rv =new Reservation();
		rv.Reserv();
		
	}
	 
}
