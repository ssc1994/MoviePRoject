package com.project.movie;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class ReservationVO{
	
}

class rFont{		//font를 static으로 저장해서 어서든지 사용가능하게 하기  
	static Font font1 = new Font("맑은고딕", Font.BOLD,18);
	static Font font2 = new Font("맑은고딕", Font.BOLD, 15);
	static Font seat = new Font("맑은고딕",Font.BOLD,10);
	static Font colfont = new Font("맑은고딕", Font.PLAIN, 16);
	static Font rowfont = new Font("맑은고딕", Font.BOLD, 12);
}

class ReservationToday {		//날짜를 reservationDate에서 불러와서 저장하는 panel 생성 
	public static reservationDate date = new reservationDate();
	JLabel year = new JLabel();
	JLabel month = new JLabel();
	JLabel day = new JLabel();
	public static JPanel today = new JPanel();
	
	public ReservationToday() {
		new reservationDate();
		new rFont();
		//today에 날짜 //영화명//회차(영화시간)를 3줄로 저
		year.setText(date.getYear());
		month.setText(date.getMonth());
		day.setText(date.getDay());
		today.setLayout(new BoxLayout(today,BoxLayout.Y_AXIS));
		today.add(year);
		today.add(month);
		today.add(day);
		today.setPreferredSize(new Dimension(80,50));
		today.setFont(rFont.font1);
	
	}
	
//	today.setLayout(new BoxLayout(today,BoxLayout.Y_AXIS));
}

class reservationDate implements Serializable{		//날짜를 calandar 에서 불러와서 저장해두는 클래스 생성 
	Calendar now = Calendar.getInstance();
	private String Year = now.get(Calendar.YEAR) + " 년";
	private String Month = (now.get(Calendar.MONTH)+1) + " 월 ";
	private String Day = now.get(Calendar.DAY_OF_MONTH) + " 일";
	
	public reservationDate() {
	}

	public String getYear() {
		return Year;
	}

	public String getMonth() {
		return Month ;
	}

	public String getDay() {
		return Day;
	}
}