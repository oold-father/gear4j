package com.gear4j.tools.file;

import org.apache.commons.lang.StringUtils;

import java.io.File;
import java.util.Objects;

/**
 * 文件工具
 * Author yinxin
 * Date 2022/1/13 上午10:40
 */
@SuppressWarnings("unused")
public class FileUtils {


    public static void removeDir(String dir, boolean isRemoveThis){

        if (StringUtils.isEmpty(dir)){
            return;
        }

        final File dirFileObj = new File(dir);

        removeDir(dirFileObj, isRemoveThis);

    }

    public static  void removeDir(File dir, Boolean isRemoveThis) {

        if (dir == null){
            return;
        }

        isRemoveThis = Objects.requireNonNullElse(isRemoveThis, false);


        File[] files = dir.listFiles();

        if (files != null){
            for(File file:files){
                if(file.isDirectory()){
                    removeDir(file, true);
                }else{
                    final boolean delete = file.delete();
                }
            }
        }

        if (isRemoveThis){
            boolean delete = dir.delete();
        }
    }
}
