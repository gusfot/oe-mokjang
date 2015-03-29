package kr.ch.oe.common;

import java.awt.print.Book;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.springframework.web.servlet.view.document.AbstractExcelView;

public class ExcelBuilder extends AbstractExcelView {
	 
    @Override
    protected void buildExcelDocument(Map<String, Object> model,
            HSSFWorkbook workbook, HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        // get data model which is passed by the Spring container
        List<Book> listBooks = (List<Book>) model.get("mokjangReport");
         
        // create a new Excel sheet
        HSSFSheet sheet = workbook.createSheet("목장보고서");
        sheet.setDefaultColumnWidth(30);
         
        // create style for header cells
        CellStyle style = workbook.createCellStyle();
        Font font = workbook.createFont();
        font.setFontName("Arial");
        style.setFillForegroundColor(HSSFColor.BLUE.index);
        style.setFillPattern(CellStyle.SOLID_FOREGROUND);
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        font.setColor(HSSFColor.WHITE.index);
        style.setFont(font);
         
        // create header row
        HSSFRow header = sheet.createRow(0);
         
        header.createCell(0).setCellValue("Book Title");
        header.getCell(0).setCellStyle(style);
         
        header.createCell(1).setCellValue("Author");
        header.getCell(1).setCellStyle(style);
         
        header.createCell(2).setCellValue("ISBN");
        header.getCell(2).setCellStyle(style);
         
        header.createCell(3).setCellValue("Published Date");
        header.getCell(3).setCellStyle(style);
         
        header.createCell(4).setCellValue("Price");
        header.getCell(4).setCellStyle(style);
         
        // create data rows
        int rowCount = 1;
         
        for (Book aBook : listBooks) {
            HSSFRow aRow = sheet.createRow(rowCount++);
//            aRow.createCell(0).setCellValue(aBook.getTitle());
//            aRow.createCell(1).setCellValue(aBook.getAuthor());
//            aRow.createCell(2).setCellValue(aBook.getIsbn());
//            aRow.createCell(3).setCellValue(aBook.getPublishedDate());
//            aRow.createCell(4).setCellValue(aBook.getPrice());
        }
    }
 
}