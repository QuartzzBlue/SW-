package com.quartz.boot.excel;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Component;

import com.quartz.boot.vo.DeptLCResponseVO;
import com.quartz.boot.vo.DoubleResponseVO;
import com.quartz.boot.vo.IntResponseVO;

@Component
public class Poi {
	static final String FILEPATH = "C:/Developments/Workspace/Eclipse/Bootcamp/files/";
	static HSSFWorkbook workbook;
	static HSSFSheet sheet;
	static HSSFRow row;
	static HSSFCell cell;
	static HashMap<String, Object> map;
	
	public void writeData(Object voType, int rowIdx) {	
		row = sheet.createRow(++rowIdx);
		cell = row.createCell(0);
		cell.setCellValue("data");

		if(voType.getClass().equals(new DeptLCResponseVO().getClass())) {
			List<DeptLCResponseVO> list = (List<DeptLCResponseVO>)map.get("data");
			for(DeptLCResponseVO vo : list) {
				cell = row.createCell(1);
				cell.setCellValue("deptRank");
				cell = row.createCell(2);
				cell.setCellValue(vo.getDeptRank());
				row = sheet.createRow(++rowIdx);
				cell = row.createCell(1);
				cell.setCellValue("deptName");
				cell = row.createCell(2);
				cell.setCellValue(vo.getDeptName());
				row = sheet.createRow(++rowIdx);
				cell = row.createCell(1);
				cell.setCellValue("totalLoginCnt");
				cell = row.createCell(2);
				cell.setCellValue(vo.getTotalLoginCnt());
				row = sheet.createRow(++rowIdx);
			}
		}else if(voType.getClass().equals(new DoubleResponseVO().getClass())){
			List<DoubleResponseVO> list = (List<DoubleResponseVO>)map.get("data");
			for(DoubleResponseVO vo : list) {
				cell = row.createCell(1);
				cell.setCellValue("date");
				cell = row.createCell(2);
				cell.setCellValue(vo.getDate());
				row = sheet.createRow(++rowIdx);
				cell = row.createCell(1);
				cell.setCellValue("cnt");
				cell = row.createCell(2);
				cell.setCellValue(vo.getCnt());
				row = sheet.createRow(++rowIdx);
			}
		}else if(voType.getClass().equals(new IntResponseVO().getClass())){
			List<IntResponseVO> list = (List<IntResponseVO>)map.get("data");
			for(IntResponseVO vo : list) {
				cell = row.createCell(1);
				cell.setCellValue("date");
				cell = row.createCell(2);
				cell.setCellValue(vo.getDate());
				row = sheet.createRow(++rowIdx);
				cell = row.createCell(1);
				cell.setCellValue("cnt");
				cell = row.createCell(2);
				cell.setCellValue(vo.getCnt());
				row = sheet.createRow(++rowIdx);
			}
		}
	}
	
	public void writeExcel(HashMap<String, Object> map) {
		this.map = map;
		// 새 엑셀 파일 생성
		workbook = new HSSFWorkbook();
		// 새 시트 만들기 (result이라는 이름의 시트)
		sheet = workbook.createSheet("result");
		
		int rowIdx = 0;  
        // 엑셀 파일에 값 입력
		for(String key : map.keySet()) {
			if(key.equals("data")) {
				continue;
			}
			row = sheet.createRow(++rowIdx);
			cell = row.createCell(0);
			cell.setCellValue(key);
			cell = row.createCell(1);
			cell.setCellValue(map.get(key)+"");
			
		}
		
		if((int)map.get("dataSize") != 0) {
			Object dataType =((ArrayList) map.get("data")).get(0);		
			writeData(dataType, rowIdx);
		}
		
		//파일 생성
		try {
			FileOutputStream output = new FileOutputStream(FILEPATH+"API_Result.xls");
			workbook.write(output);
	        output.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	


}
