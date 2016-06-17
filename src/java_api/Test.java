package java_api;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by wufeifei on 2016/6/17.
 */
public class Test {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        Process process = null;
        try {
            process = runtime.exec("ipconfig");
            process.waitFor();
            char[] b = new char[1024];
            StringBuilder stringBuilder = new StringBuilder("result:"+"\n");
            InputStreamReader reader = new InputStreamReader(process.getInputStream());
            int count = 0;
            while ((count = reader.read(b)) > 0) {
                String str = new String(b, 0, count);
                stringBuilder.append(str);
            }
            System.out.println(stringBuilder);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
