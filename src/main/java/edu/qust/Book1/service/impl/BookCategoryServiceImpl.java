package edu.qust.Book1.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.qust.Book1.bean.BookCategory;
import edu.qust.Book1.bean.BookCategoryExample;
import edu.qust.Book1.bean.WebModel;
import edu.qust.Book1.mapper.BookCategoryMapper;
import edu.qust.Book1.service.BookCategoryService;

@Service
public class BookCategoryServiceImpl implements BookCategoryService{

	@Autowired
	private BookCategoryMapper bookCategoryMapper;

	@Override
	public void selectAll(WebModel wm) {
		
		//第一件事 查询分页数据
		BookCategoryExample be = new BookCategoryExample();
		be.setLimitStart(wm.getLimitStart());
		be.setPageSize(wm.getPs());
		be.setOrderByClause("_index asc");
		List<BookCategory> data = this.bookCategoryMapper.selectByExample(be);
		
		//第二件事 查询出一共多少条 数据   计算出 一共能分多少页
		int count = this.bookCategoryMapper.countByExample(be);
		
		wm.setData(data);
		wm.setTotalCount(count);
	}
	
}

