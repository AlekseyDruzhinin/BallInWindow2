import java.awt.*;

public class Ball {
    double x;
    double y;
    int r;

    double vx;
    double vy;

    Color c;

    public Ball(double x, double y, double vx, double vy, int a, int b, int c) {
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
        this.r = 71-(int)(Math.sqrt(vx*vx+vy*vy)*1000000);
        this.c = new Color(a, b, c);
    }

    public void paint(Graphics g){
        g.setColor(c);
        g.fillOval((int) (x-r), (int) y-r, 2*r, 2*r);
    }

    public void update(int width, int height){
        x += vx;
        if (x < r){
            vx *= -1;
        }
        if (x > width - r){
            vx *= -1;
        }

        y += vy;
        if (y < r){
            vy *= -1;
        }
        if (y > height - r){
            vy *= -1;
        }
    }

    public boolean cross(Ball ball){
        if (Math.pow(ball.x-this.x, 2) + Math.pow(ball.y-this.y, 2) < Math.pow(this.r+ball.r, 2)){
            return true;
        }
        return false;
    }
}