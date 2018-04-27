package com.egoint.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.egoint.model.BaseResult;
import com.egoint.model.User;
import com.egoint.model.UserResult;
import com.egoint.service.UserService;
import com.egoint.service.RedisService;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;


@Controller
public class MemberController {

    @Autowired
    private UserService memberService;
    @Autowired
    private RedisService redisService;
    
    
    
    /**
	 * 根据ID查询用户
	 * @param id
	 * @return
	 */
	@ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
	@ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "String", paramType = "path")
	@RequestMapping(value = "user/select/{id}", method = RequestMethod.GET)
    public BaseResult memberInfo(@PathVariable(value = "id") String id) {
        BaseResult baseResult = new BaseResult();
        baseResult.setStatus("000");
        baseResult.setMessage("登录成功!");
        return baseResult;
    }
	
	 /**
		 * 根据user查询用户
		 * @param id
		 * @return
		 */
		@ApiOperation(value="获取用户详细信息", notes="根据user来获取用户详细信息")
		@ApiImplicitParam(name = "user", value = "用户", required = true, dataType = "User", paramType = "User")
		@RequestMapping(value = "user/selectUser", method = RequestMethod.POST)
	    public UserResult getmemberInfo(@RequestBody User user) {
	        UserResult userResult = new UserResult();
	        User user1 = memberService.getUserByUid(user.getUid());
	        userResult.setStatus("000");
	        userResult.setMessage("查询成功");
	        userResult.setUser(user1);
	        return userResult;
	    }
	
	@ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
	@ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "String", paramType = "path")
   @RequestMapping(value = "/member/redisInfo",method = RequestMethod.GET)
    public ModelAndView insertRedisInfo() {
        User member = new User();
        member.setUid(UUID.randomUUID().toString());
        ModelAndView mv = new ModelAndView("member");
        boolean  flag  = redisService.set("124", "123");
        mv.addObject("member",member);
        mv.addObject("zzz",flag);
        mv.addObject("member");
        return mv;
    }
	@ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
	@ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "String", paramType = "path")
    @RequestMapping(value="/member/getRedisInfo",method = RequestMethod.GET)
    public ModelAndView getRedisInfo(@RequestParam(value="id", required=true, defaultValue="0") String id) {
        ModelAndView mv = new ModelAndView("member");
        User member = new User();
        member.setUid(UUID.randomUUID().toString());
        mv.addObject("member",member);
        mv.addObject("member");
        return mv;
    }
    
    
    

}
