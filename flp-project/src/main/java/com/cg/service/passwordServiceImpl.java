package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.daos.AdminDAO;
import com.cg.daos.MerchantDAO;
import com.cg.daos.UserDAO;
import com.cg.entities.Admin;
import com.cg.entities.Merchant;
import com.cg.entities.PasswordEntity;
import com.cg.entities.User1;
@Service
public class passwordServiceImpl implements passwordService {
	
	@Autowired UserDAO userDao;
	@Autowired AdminDAO adminDao;
	@Autowired MerchantDAO merchantDao;
	
	@Override
	public String changepassword(PasswordEntity entity) {
		// TODO Auto-generated method stub
		String type=entity.getCategory();
		if(type.equals("user"))
		{
			String uname=entity.getEmail();
			User1 userObject=userDao.existsByEmail(uname);
			if(userObject==null)
			{
				return "User not Found";
			}
			if(userObject.getPassword().equals(entity.getOld_password()))
			{
				if(entity.getNew_password().equals(entity.getConfirm_password()))
				{	
				  userDao.updatepassword(entity.getEmail(), entity.getNew_password());
				  return "Password Changed Sucessfully";
				}
				else
				{
					return "New Password and Confirm Password didn't match";
				}
				
			}
			
			else
			{
				return "Old Password did not match";
			}
		}
		if(type.equals("merchant"))
		{
			String uname=entity.getEmail();
			Merchant merchantObject=merchantDao.existsByEmail(uname);
			if(merchantObject==null)
			{
				return "User not Found";
			}
			if(merchantObject.getPassword().equals(entity.getOld_password()))
			{
				if(entity.getNew_password().equals(entity.getConfirm_password()))
				{
					merchantDao.updatepassword(entity.getEmail(), entity.getNew_password());
				}
				else
				{
					return "New Password and Confirm Password didn't match";
				}
				
			}
			
			else
			{
				return "Old Password did not match";
			}
		}
		if(type.equals("admin"))
		{
			String uname=entity.getEmail();
			Admin adminObject=adminDao.existsByEmail(uname);
			if(adminObject==null)
			{
				return "User not Found";
			}
			if(adminObject.getPassword().equals(entity.getOld_password()))
			{
				if(entity.getNew_password().equals(entity.getConfirm_password()))
				{
					adminDao.updatepassword(entity.getEmail(), entity.getNew_password());
				}
				else
				{
					return "New Password and Confirm Password didn't match";
				}
				
			}
			
			else
			{
				return "Old Password did not match";
			}
		}
		return null;
		
	}

}
