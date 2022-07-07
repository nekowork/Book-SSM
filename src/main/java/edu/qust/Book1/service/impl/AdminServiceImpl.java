package edu.qust.Book1.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import edu.qust.Book1.bean.Admin;
import edu.qust.Book1.bean.AdminExample;
import edu.qust.Book1.mapper.AdminMapper;
import edu.qust.Book1.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminMapper adminMapper;
	
	@Override
	public Admin selectByUname(String uname) {
		// TODO Auto-generated method stub
		AdminExample e=new AdminExample();
		AdminExample.Criteria c= e.createCriteria();
		c.andUnameEqualTo(uname);
		
		List<Admin> admins=this.adminMapper.selectByExample(e);
		
		if(admins!=null&&admins.size()>0){
			return admins.get(0);
		}
		
		
		return null;
	}

}
