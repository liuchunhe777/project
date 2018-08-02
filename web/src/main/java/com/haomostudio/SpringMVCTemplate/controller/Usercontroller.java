package com.haomostudio.SpringMVCTemplate.controller;

import com.haomostudio.SpringMVCTemplate.common.domain.HmUser;
import com.haomostudio.SpringMVCTemplate.service.common.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("hm-usercontroller")
public class Usercontroller {

    @Autowired
    private UserService userService;
    /**
     * @Description :创建用户
     * @author: Liuchunhe
     * @date: 2018/8/2 19:11
     */
    @RequestMapping(value = "createHmUserUsingPOST_1", method = RequestMethod.POST)
    @ResponseBody
    public Object loanInterviewCarAppointQry(@RequestParam(required = false) HmUser record) {


        return  userService.createUser(record);

    }
}
