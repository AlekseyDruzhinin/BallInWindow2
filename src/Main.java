import javax.swing.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame();
        frame.setTitle("Window");
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        MyPanel panel = new MyPanel();
        frame.add(panel);
        frame.setVisible(true);

        while (true){
            for (Ball ball : panel.balls){
                ball.update(1000, 1000);
            }
            panel.repaint();
        }
    }
}