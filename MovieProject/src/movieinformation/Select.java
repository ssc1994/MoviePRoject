package movieinformation;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class  Select {
	
	
	
	Select(){
		//프레임 선언
		JFrame jf = new JFrame();
		jf.setTitle("영화 예매");
		jf.setVisible(true); //창을 눈에 보이도록 함
		jf.setSize(600,600); //사이즈 지정
		jf.setResizable(false); //사이즈 재조정 불가능
		jf.setLocationRelativeTo(null); //창이 가운데에 뜨도록 함
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE); //창을 끄면 프로그램을 종료
		
		JPanel pan1 = new JPanel();	//pan1이라는 패널 생성
		jf.add(pan1);  //pan1을 프레임에 붙임.
		//패널1 셋팅
		jf.setLayout(new FlowLayout(FlowLayout.CENTER,300,200));
		pan1.setPreferredSize(new Dimension(600,600)); //패널 크기 설정
		
		JButton btn1 = new JButton("영화 정보");	//btn1이라는 버튼 생성
		JButton btn2 = new JButton("영화 예매");	//btn1이라는 버튼 생성
		pan1.add(btn1);	//pan1안에 btn1을 추가
		pan1.add(btn2);	//pan1안에 btn2을 추가
		
		//버튼 사이즈 조정
		Dimension twoButtonSize = new Dimension(100,100);
		btn1.setPreferredSize(twoButtonSize);
		btn2.setPreferredSize(twoButtonSize);
		
		//bt2(영화예매) 클릭 했을 때 Theater 클래스로 이동
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Theater();
				jf.setVisible(false);
			}
			
		});
		
		
		
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		new Select();
		
	}

}
