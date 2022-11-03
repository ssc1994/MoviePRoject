package movieinformation;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class LoadMovieImage extends Component {  
    //버퍼를 활용한 이미지 클래스
BufferedImage img;
 
    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, null); //그림을 그리는 메소드
    }
    //디폴트 생성자
    public LoadMovieImage() {
       try {
      String filename="C:\\Users\\user\\git\\MovieProject\\MovieProject\\src\\movieinformation\\영화정보폴더\\블랙아담.jpg"; // 파일의 경로
           img = ImageIO.read(new File(filename)); //이미지 파일을 불러오는 IO 메소드
            //파일경로의 이미지 파일을 읽는다.
       } catch (IOException e) {
      e.printStackTrace();
       }
    }

    public Dimension getPreferredSize() {
        if (img == null) {
             return new Dimension(100,100); //그림 파일이 없을 경우 프레임의 크기를 100,100으로 만든다
        } else {
           return new Dimension(img.getWidth(null), img.getHeight(null)); //그림의 크기에 따라 화면의 크기를 변경한다.
       }
    }
    public static void main(String[] args) {

        JFrame f = new JFrame("Load Image Sample");
           
        f.addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });

        f.add(new LoadMovieImage());
        f.pack();
        f.setVisible(true);
    }
}
