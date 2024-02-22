package com.study.tool;

import java.io.File;
import java.io.FileOutputStream;

public class FileUtil {
	public static void uploadFile(byte[] file, String filePath, String fileName) throws Exception {
		File targetFile = new File(filePath);
		if (!targetFile.exists()) {
			targetFile.mkdirs();
		}
		FileOutputStream out = new FileOutputStream(filePath + fileName);
		out.write(file);
		out.flush();
		out.close();
	}

	/**
	 * 删除文件
	 * @param path 文件路径
	 * @return
	 */
	public static boolean deleteFile(String path) {

		boolean flag = false;
		File file = new File(path);

		if (!file.exists()) {
			return flag;
		}
		try{
			flag = file.delete();
		}catch (Exception e){
			e.printStackTrace();
		}
		return flag;
	}

}