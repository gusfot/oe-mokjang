package kr.ch.oe.common;

import java.net.URLEncoder;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ch.oe.model.MokjangReport;
import kr.ch.oe.model.SessionUserVO;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractExcelView;

@Component(value="excelView")
public class ExcelView extends AbstractExcelView{
    @Override
    protected void buildExcelDocument(Map<String,Object> ModelMap,HSSFWorkbook workbook, HttpServletRequest request, HttpServletResponse response) throws Exception{
          
    	SessionUserVO sessionUserVO = (SessionUserVO) request.getSession().getAttribute("sessionUserVO");
    	
    	
    	
    	String excelName = URLEncoder.encode("목장보고서","UTF-8");
    	Workbook wb = new XSSFWorkbook();
    	Sheet sheet = wb.createSheet(excelName);
    	Row row = sheet.createRow((short)0);
    	
    	// Create a new font and alter it.
        Font font = wb.createFont();
        font.setFontHeightInPoints((short)24);
        font.setFontName("Courier New");
        font.setItalic(true);
        font.setStrikeout(true);
        
        // Fonts are set into a style so create a new one to use.
        CellStyle style = wb.createCellStyle();
        style.setFont(font);

        // Create a cell and put a value in it.
        Cell cell = row.createCell(0);
        cell.setCellValue("This is a test of fonts");
        cell.setCellStyle(style);
        
    	
    	sheet.addMergedRegion(new CellRangeAddress(
                0, //first row (0-based)
                0, //last row  (0-based)
                0, //first column (0-based)
                10  //last column  (0-based)
        ));
    	
          MokjangReport mokjangReport = (MokjangReport)ModelMap.get("mokjangReport");
          
          sheet = workbook.createSheet(excelName+ " WorkSheet");
          row = sheet.createRow((short)1);
          row.createCell(0).setCellValue("목장");
          row.createCell(1).setCellValue("목장모임일시");
          row.createCell(2).setCellValue("집회장소");
          row.createCell(3).setCellValue("마음열기");
          row.createCell(4).setCellValue("찬송인도");
          row.createCell(5).setCellValue("말씀인도");
          row.createCell(6).setCellValue("사역인도");
          row.createCell(7).setCellValue("다음장소");
          row.createCell(8).setCellValue("기타보고사항");
          
          row = sheet.createRow((short)2);
          row.createCell(0).setCellValue(sessionUserVO.getDeptName());
          row.createCell(1).setCellValue(mokjangReport.getWorshipDt());
          row.createCell(2).setCellValue(mokjangReport.getWorshipPlace());
          row.createCell(3).setCellValue(mokjangReport.getWelcomeUserName());
          row.createCell(4).setCellValue(mokjangReport.getWorshipUserName());
          row.createCell(5).setCellValue(mokjangReport.getWordUserName());
          row.createCell(6).setCellValue(mokjangReport.getWorkUserName());
          row.createCell(7).setCellValue(mokjangReport.getNextWorshipPlace());
          row.createCell(8).setCellValue(mokjangReport.getEtcReportContent());
          /*for(int i=1;i<list.size()+1;i++){
                 row = worksheet.createRow(i);
                 row.createCell(0).setCellValue(list.get(i-1).getFileNo());
                 row.createCell(1).setCellValue(list.get(i-1).getArticleNo());
                 row.createCell(2).setCellValue(list.get(i-1).getFilePath());
                 row.createCell(3).setCellValue(list.get(i-1).getFileName());
                 row.createCell(4).setCellValue(list.get(i-1).getFileSize());
          }*/
          response.setContentType("Application/Msexcel");
          response.setHeader("Content-Disposition", "ATTachment; Filename="+excelName+"-excel.xls");
    }
}