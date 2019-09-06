//import java.awt.AWTException;
//import java.awt.Desktop;
//import java.awt.Dimension;
//import java.awt.Graphics;
//import java.awt.Image;
//import java.awt.Rectangle;
//import java.awt.Robot;
//import java.awt.Toolkit;
//import java.awt.event.KeyEvent;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//import java.net.URISyntaxException;
//import java.net.URL;
//import javax.imageio.ImageIO;
//
//public class RobotDemo {
//
//    public static void main(String[] args) throws IOException, URISyntaxException, AWTException {
//        Desktop.getDesktop().browse(new URL("https://www.google.com.hk/").toURI());
//        Robot robot = new Robot();
//        robot.delay(10000);
//        Dimension d = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
//        int width = (int) d.getWidth();
//        int height = (int) d.getHeight();
//        robot.keyRelease(KeyEvent.VK_F11);
//        robot.delay(2000);
//        Image image = robot.createScreenCapture(new Rectangle(0, 0, width, height));
//        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
//        Graphics g = bi.createGraphics();
//        g.drawImage(image, 0, 0, width, height, null);
//        ImageIO.write(bi, "jpg", new File("./open.jpg"));
//    }
//}