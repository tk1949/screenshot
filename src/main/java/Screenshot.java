import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Screenshot {
    public static void main(String[] args) throws IOException, InterruptedException {
        String blank = "  ";
        Process process = Runtime.getRuntime().exec(
                "./phantomjs.exe" + blank                       // phantomjs.exe路径
                + "./screenshot.js" + blank                     // javascript脚本的存放路径
                + "https://phantomjs.org/download.html" + blank // 目标url地址
                + "./demo.png");                                // 图片输出路径

        Thread.sleep(10000);

        InputStream inputStream = process.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        if (reader.readLine() != null) {
            reader.close();
            process.destroy();
        }
    }
}