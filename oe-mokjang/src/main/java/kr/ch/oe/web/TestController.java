package kr.ch.oe.web;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.jxls.transformer.XLSTransformer;

import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TestController {

	
	public String down(HttpServletRequest request, HttpServletResponse response) { 
		try {
            // set output header
            ServletOutputStream os = response.getOutputStream();
            response.setContentType("application/vnd.ms-excel");
            response.setHeader("Content-Disposition", "attachment; filename=\"myexcel.xls\"");
             
            //String reportLocation = context.getRealPath("WEB-INF");
 
            Map beans = new HashMap();
            beans.put("name", "Edwin");
            beans.put("address", "Jakarta, Indonesia");
            XLSTransformer transformer = new XLSTransformer();
 
            Workbook workbook = transformer.transformXLS(new FileInputStream("WEB-INF" + "/views/report/mokjangReport.xls"), beans);
            workbook.write(os);
            os.flush();
 
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
	}
}
