package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.qust.Book1.bean.WebModel;
import edu.qust.Book1.constant.Message;
import edu.qust.Book1.service.BookCategoryService;

//加bac是在后台展示  登录进入系统后 展示的 

@RestController
@RequestMapping("/bac/bookCategory")
public class BookCategoryController {

	@Autowired
	private BookCategoryService bookCategoryService;
	
	
	@RequestMapping("selectAll")
	public Message selectAll(WebModel wm){
		this.bookCategoryService.selectAll(wm);
		return Message.createSuccessMessage(wm);
	}

}
