package com.vypeensoft;

import java.util.List;
import java.io.File;
import java.text.DecimalFormat;

public class Number_Prefix {
	private static DecimalFormat numberFormatter = new DecimalFormat("0000");

    public static void main(String[] args) throws Exception {
        List<String> fileList = FileUtil.getFileListFromFolder("U:\\Projects\\Number_Prefix_Java_GIT\\x\\");
    	for(int i=0;i<fileList.size();i++) {
    		String oneFile = fileList.get(i); 
            File file = new File(oneFile);
            String fileNameOnly = file.getName();
            String newFileNameOnly = numberFormatter.format(i) +"_" + fileNameOnly ;
            String folderName = file.getParent();
            String newName = folderName+"\\"+newFileNameOnly;
            File newFile = new File(newName );
            file.renameTo(newFile);
    	}
    }
}
