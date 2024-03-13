package com.oxevry.Utils;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Component;

@Component
public class Res {
    public JSONObject invalidParam(){
        JSONObject res = new JSONObject();
        res.put("code",500);
        res.put("msg","invalid param");
        return res;
    }
    public JSONObject Success(){
        JSONObject res = new JSONObject();
        res.put("code",200);
        res.put("msg","SUCCESS");
        return res;
    }
}
