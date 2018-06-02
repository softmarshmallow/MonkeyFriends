package com.softmarshmallow.monkeyfriends.Models.MockDataSource;

import com.softmarshmallow.monkeyfriends.Models.User;

import java.util.ArrayList;
import java.util.List;

public class MockDataSource {


    static List<User> AllUserList;
    public static void GetAllUser(){
        if (AllUserList == null){
            AllUserList  = new ArrayList<User>();


            //region User1
            User user1 = new User();
            user1.profileImageUrl = "https://images.pexels.com/photos/614810/pexels-photo-614810.jpeg?auto=compress&cs=tinysrgb&h=350";
            user1.setName("woojoo");
            AllUserList.add(user1);
            //endregion


            //region User1
            User user2 = new User();
            user2.profileImageUrl = "https://images.pexels.com/photos/614810/pexels-photo-614810.jpeg?auto=compress&cs=tinysrgb&h=350";
            user2.setName("minje");
            AllUserList.add(user2);
            //endregion


            //region User1
            User user3 = new User();
            user3.profileImageUrl = "https://images.pexels.com/photos/614810/pexels-photo-614810.jpeg?auto=compress&cs=tinysrgb&h=350";
            user3.setName("song");
            AllUserList.add(user3);
            //endregion


            //region User1
            User user4 = new User();
            user4.profileImageUrl = "https://images.pexels.com/photos/614810/pexels-photo-614810.jpeg?auto=compress&cs=tinysrgb&h=350";
            user4.setName("kim");
            AllUserList.add(user4);
            //endregion


        }
        else {

        }
    }





}
