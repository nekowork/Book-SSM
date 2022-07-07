package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.qust.Book1.bean.Admin;
import edu.qust.Book1.constant.ErrorEnum;
import edu.qust.Book1.constant.Message;
import edu.qust.Book1.service.AdminService;

@RestController
@RequestMapping("common")
public class CommonController {

	@Autowired
	private AdminService adminSrivice;
	
	@RequestMapping("login")
	public Message login(@RequestBody Admin loginAdmin){
		Admin admin=this.adminSrivice.selectByUname(loginAdmin.getUname());
		if(admin==null){
			return Message.createFailureMessage(ErrorEnum.UnknownAccount);
		}
		if(admin.getPwd().equals(loginAdmin.getPwd())){
			return Message.createFailureMessage(ErrorEnum.IncorrectCredentials);
		}
		return Message.createSuccessMessage();
		
	}
}
