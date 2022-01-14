package com.gear4j.tools.file;

import com.gear4j.tools.file.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * 文件工具 测试类
 * Author yinxin
 * Date 2022/1/13 上午10:40
 */
@SuppressWarnings("unused")
public class FileUtilsTest {

    @Test
    public void removeDirByString() throws IOException {

        final String fileName = "src/test/resources/.removeDirByStringFile";

        final File file = new File(fileName);

        if (!file.exists()){
            final boolean newFile = file.createNewFile();
        }

        FileUtils.removeDir(fileName, true);

        assertFalse(file.exists());

    }

}
