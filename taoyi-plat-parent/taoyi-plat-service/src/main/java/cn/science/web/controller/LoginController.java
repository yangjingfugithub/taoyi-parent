package cn.science.web.controller;

import cn.science.domain.Employee;
import cn.science.util.AjaxResult;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        if("admin".equals(employee.getUsername())&&"123".equals(employee.getPassword())){
            return AjaxResult.me().setSuccess(true).setMessage("登录成功鸟");
        }
        return AjaxResult.me().setSuccess(false).setMessage("用户名或密码错误");
    }

}
