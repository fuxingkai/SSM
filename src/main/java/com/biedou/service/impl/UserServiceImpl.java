package com.biedou.service.impl;

import com.biedou.dao.IUserDao;
import com.biedou.entity.Admin;
import com.biedou.entity.Teach;
import com.biedou.entity.User;
import com.biedou.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Autowired
    private IUserDao userDao;

	public User userLogin(String account, String pwd) {
		return userDao.userLogin(account,pwd);
	}

	
	public List<Map<String, Object>> findUserByAccount(String account) {
		return userDao.findUserByAccount(account);
	}

	
	public List<Map<String, Object>> findClass() {
		return userDao.findClass();
	}

	
	public List<Map<String, Object>> findSeTeach(Integer id) {
		return userDao.findSeTeach(id);
	}

	
	public void chooseTeach(Integer id, Integer cid,Integer uid) {
		userDao.chooseTeach(id,cid,uid);
	}

	
	public void updateUserInfo(Integer id,String account, Integer sex, Integer age,
			String name, String pwd, String tel, String address) {
		userDao.updateUserInfo(id,account,sex,age,name,pwd,tel,address);
	}

	
	public Admin adminLogin(String name, String pwd) {
		return userDao.adminLogin(name,pwd);
	}

	
	public void setTime(String format) {
		userDao.setTime(format);
	}

	
	public List<Map<String, Object>> countUser() {
		return userDao.countUser();
	}

	
	public List<Map<String, Object>> countTeach() {
		return userDao.countTeach();
	}

	
	public List<User> getSex() {
		return userDao.getSex();
	}

	
	public List<Map<String, Object>> findUser() {
		return userDao.findUser();
	}
	
	public List<Map<String, Object>> teachTable() {
		return userDao.teachTable();
	}
	
	public List<Map<String, Object>> apparatusTable() {
		return userDao.apparatusTable();
	}

	
	public List<Map<String, Object>> countApparatus() {
		return userDao.countApparatus();
	}

	
	public List<User> findAccount(String account) {
		return userDao.findAccount(account);
	}

	
	public void registerUser(User user) {
		userDao.registerUser(user);
	}

	
	public void delUser(Integer id) {
		userDao.delUser(id);
	}

	
	public void addTeachInfo(Teach teach) {
		userDao.addTeachInfo(teach);
		
	}

	
	public void delTeach(Integer id) {
		userDao.delTeach(id);
	}

	
	public void upTeach(Integer id, String tname,Integer cid, String ttel, String taddress) {
		userDao.upTeach(id,tname,cid,ttel,taddress);
	}

	
	public void addAppInfo(String aname) {
		userDao.addAppInfo(aname);
	}

	public void delApp(Integer id) {
		userDao.delApp(id);
	}



}
