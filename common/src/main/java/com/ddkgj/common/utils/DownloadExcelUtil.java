package com.ddkgj.common.utils;

import org.springframework.beans.BeanUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class DownloadExcelUtil {
	
	private static final String downloadPath = "http://106.14.28.146:8888/";
	
	public static <U,T> String downloadFile(HttpServletRequest request,HttpServletResponse response,List<U> sourceList,T target) throws Exception{
		List<T> targetList = new ArrayList<T>();
		if(sourceList != null && sourceList.size()>0){
			for(U souce:sourceList){
				T targetObj = (T) target.getClass().newInstance();
				BeanUtils.copyProperties(souce, targetObj);
				targetList.add(targetObj);
			}
			ExcelUtil<T> vExcelUtil = new ExcelUtil<T>();
			String fileName = target.getClass().getName().substring(target.getClass().getName().lastIndexOf('.')+1);
            String filePathName = fileName +"_" + System.currentTimeMillis() + ".xlsx";
			vExcelUtil.download(request, response, targetList,fileName,filePathName);
			return downloadPath + filePathName;
		}
		return null;
	}
}
