package kr.ch.oe.web;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ch.oe.model.User;
import net.sf.jxls.transformer.XLSTransformer;

import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping(value = { "/modify.oe" }, method = RequestMethod.POST)
	public @ResponseBody boolean modifyUser(
			@ModelAttribute User user
			)  {
		String rebirth = user.getBirth().replace("-","");
		user.setBirth(rebirth);
		return true ;
	}
	@RequestMapping(value = { "/testExcel.oe" }, method = RequestMethod.POST)
	public String down(
			@RequestParam(value="no") String no,
			@RequestParam(value="roleName") String roleName,
			@RequestParam(value="userName") String userName,
			@RequestParam(value="birth") String birth,
			HttpServletRequest request, HttpServletResponse response) { 
		
 
            Map beans = new HashMap();
            beans.put("no", no);
            beans.put("roleName", roleName);
            beans.put("userName", userName);
            beans.put("birth", birth);
            XLSTransformer transformer = new XLSTransformer();

            
        return null;
	}
}
