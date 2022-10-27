import javax.swing.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame();
        frame.setTitle("Window");
        int width = 900;
        int height = 900;
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        MyPanel panel = new MyPanel();
        frame.add(panel);
        frame.setVisible(true);
        System.out.println(panel.getWidth() + "x" + panel.getHeight());

        while (true){
            for (Ball ball : panel.balls){
                ball.update(panel.getWidth(), panel.getHeight());
            }
            panel.repaint();
        }
    }
}