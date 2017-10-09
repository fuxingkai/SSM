package com.biedou.dao;

import com.biedou.entity.Admin;
import com.biedou.entity.Teach;
import com.biedou.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface IUserDao {

	User userLogin(@Param("account") String account,@Param("pwd") String pwd);

	List<Map<String, Object>> findUserByAccount(String account);

	List<Map<String, Object>> findClass();

	List<Map<String, Object>> findSeTeach(Integer id);

	void chooseTeach(@Param("id")  Integer id, @Param("uclassId") Integer cid, @Param("uteachId") Integer uid);

	void updateUserInfo(@Param("id") Integer id, @Param("account") String account, @Param("sex") Integer sex, @Param("age") Integer age, @Param("name") String name, @Param("pwd") String pwd, @Param("tel") String tel, @Param("address") String address);

	Admin adminLogin(@Param("name") String name, @Param("pwd") String pwd);

	void setTime(String format);

	List<Map<String, Object>> countUser();

	List<Map<String, Object>> countTeach();

	List<Map<String, Object>> countApparatus();

	List<User> getSex();

	List<Map<String, Object>> findUser();

	List<Map<String, Object>> teachTable();

	List<Map<String, Object>> apparatusTable();

	List<User> findAccount(String account);

	void registerUser(User user);

	void delUser(Integer id);

	void addTeachInfo(Teach teach);

	void delTeach(Integer id);

	void upTeach(@Param("id") Integer id, @Param("tname") String tname, @Param("cid") Integer cid, @Param("ttel") String ttel, @Param("taddress") String taddress);

	void addAppInfo(String aname);

	void delApp(Integer id);

}
