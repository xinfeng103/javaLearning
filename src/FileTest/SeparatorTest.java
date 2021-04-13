package FileTest;

import java.io.File;

public class SeparatorTest {
    public static void main(String[] args) {
        System.out.println("文件分隔符："+File.separator);
        System.out.println("环境变量分隔符："+File.pathSeparator);
    }
}
