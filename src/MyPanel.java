import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class MyPanel extends JPanel {

    int height;
    int width;

    ArrayList<Ball> balls = new ArrayList<>();
    int n = 10;
    Random r = new Random();
    public MyPanel(){
        for (int i = 0; i < n; ++i){
            balls.add(new Ball((r.nextDouble(1000)), r.nextDouble(1000), (r.nextDouble(1000)-500)/10000000, (r.nextDouble(1000)-500)/10000000, r.nextInt(100), r.nextInt(100), r.nextInt(100)));
        }
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        for (Ball ball : balls){
            ball.paint(g);
        }

    }
}