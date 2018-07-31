package com.financial.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.financial.entity.User;
import com.financial.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userservice;
	//跳到添加页面
	@RequestMapping("toAddUser")
    public String toAddUser(){
        return "addUser";
    }
	//添加用户并跳转到列表页
	@RequestMapping("insert")
	public String insert(Model model,User user) {
		if(user != null) {
			userservice.insertUser(user);
		}
			return "redirect:/user/userInfo";
		
	}
	//查询单个用户
    @RequestMapping("/getUser")  
    public String getUser(int id,Model model){
        model.addAttribute("user", userservice.findUserById(id));  
        return "editUser";
    }
	//查询所有用户	
	 @RequestMapping("getAllUser")  
	    public String getAllUser(Model model){
	        List<User> user = userservice.getUsers();
	        model.addAttribute("userList",user);
	        return "allUser";
	    }
	//更新用户
	 @RequestMapping("updateUser")  
	    public String UpdateUser(Model model,User user){
	             if(userservice.updateUser(user)){  
	                    user = userservice.findUserById(user.getId());  
	                    model.addAttribute("user", user);  
	                    return "redirect:/user/userInfo";  
	                } 
	         return "/error";  
	    }
	 //删除用户
	 @RequestMapping("/delUser") 
	    public String deleteUser(int id,Model model){
	        model.addAttribute("user", userservice.deleteUser(id));  
	        return "redirect:/user/userInfo";
	    }
	 //列表展示
	 @RequestMapping("userInfo")
	    public String getUsers(@RequestParam(value="pn",defaultValue="1")Integer pn,Model model){
	        //从第一条开始 每页查询五条数据
	        PageHelper.startPage(pn, 5);
	        List<User> users = userservice.getUsers();
	        //将用户信息放入PageInfo对象里
	        PageInfo<User> page = new PageInfo<User>(users,5);
	        model.addAttribute("pageInfo", page);
	        return "allUser";
	    }
}
