package com.jonmid.quizdos.Parser;

import com.jonmid.quizdos.Models.UserModelOlivaCristian;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chris on 10/10/2017.
 */

public class UserJsonOlivaCristian {
    public static List<UserModelOlivaCristian> getData(String content) throws JSONException {
        JSONArray jsonArray = new JSONArray(content);
        List<UserModelOlivaCristian> userList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++){

            JSONObject item = jsonArray.getJSONObject(i);
            JSONArray company = item.getJSONArray("company");
             JSONObject companyitem=company.getJSONObject(0);

            JSONArray company1 = item.getJSONArray("company");
            JSONObject companyitem1=company1.getJSONObject(0);


            UserModelOlivaCristian  userModelOlivaCristian= new UserModelOlivaCristian();
            userModelOlivaCristian.setName(item.getString("name"));
            userModelOlivaCristian.setUsername(item.getString("username"));
            userModelOlivaCristian.setEmail(item.getString("email"));
            userModelOlivaCristian.setPhone(item.getString("phone"));


            userModelOlivaCristian.setCompany(companyitem.getString("company"));
            userModelOlivaCristian.setAddress(companyitem1.getString("address"));
            userList.add(userModelOlivaCristian);

        }
        return userList;
    }
}
