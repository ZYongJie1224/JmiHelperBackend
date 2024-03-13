package com.oxevry.Service;

import com.alibaba.fastjson.JSONObject;
import com.oxevry.Model.User;

public interface UserService {
    JSONObject login(User user);
}
