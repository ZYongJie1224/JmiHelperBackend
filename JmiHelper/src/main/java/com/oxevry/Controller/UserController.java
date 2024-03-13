package com.oxevry.Controller;

import com.alibaba.fastjson.JSONObject;
import com.oxevry.Model.User;
import com.oxevry.Utils.Res;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
public class UserController {
    @Resource
    Res res = new Res();

    @PostMapping("/login")
    public JSONObject login(@RequestBody User user){
        //校验在前端做
        if (user.getUserName().isEmpty() || user.getPassWord().isEmpty()) {
            return res.invalidParam();
        }
        return  new JSONObject();
    }
    @RequestMapping("/test")
    public String a(){
        return "sssss";
    }

}
