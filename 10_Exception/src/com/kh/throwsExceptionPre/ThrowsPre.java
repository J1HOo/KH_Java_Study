package com.kh.throwsExceptionPre;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsPre {

    public void method1() throws IOException {
        String path = System.getProperty("user.dir") + "/Desktop";
        String fileName = "여행지도";
        String extName = ".docs"; // 확장자명

        File file = new File(path, fileName + extName);

        file.createNewFile();
    }

    public void method2() throws IOException {
        FileReader fr = new FileReader(System.getProperty("user.home") + "/Desktop" + "여행지도" + System.currentTimeMillis() + ".doc");
        String line = fr.toString();
        System.out.println(line);
    }
}
