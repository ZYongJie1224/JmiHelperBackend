package com.oxevry.Service.ServiceImp;

import com.alibaba.fastjson.JSONObject;
import com.oxevry.DAO.UserDAO;
import com.oxevry.Model.User;
import com.oxevry.Service.UserService;
import com.oxevry.Utils.Res;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class UserSeriviceImp implements UserService {
    @Resource
    UserDAO userDAO;
    @Resource
    Res res;

    @Override
    public JSONObject login(User user) {
        User currentUser = userDAO.queryByUserName(user);
        if (currentUser == null) {
            JSONObject JSONObject = new JSONObject();
            JSONObject.put("code","500");
            JSONObject.put("Msg","user is not exist");
            return  JSONObject;
        }
        if (currentUser.getPassWord().equals(user.getPassWord())) {
            return res.Success();
        }
        JSONObject JSONObject = new JSONObject();
        JSONObject.put("code","500");
        JSONObject.put("Msg","Wrong Password");
        return  JSONObject;
    }
}
