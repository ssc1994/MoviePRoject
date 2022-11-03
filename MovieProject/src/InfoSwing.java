import javax.swing.JFrame;

public class InfoSwing{
		 
	 InfoSwing(){
		 
		 JFrame jFrame = new JFrame();
		 jFrame.setTitle("영화 정보");
		 jFrame.setVisible(true);
		 jFrame.setSize(600,600);
		 jFrame.setResizable(false);
		 jFrame.setLocationRelativeTo(null);
		 jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
		 
		 
	 }
	 
	 public static void main(String[] args) {
		
		 new InfoSwing();
		 
	}
	 
	 
}
