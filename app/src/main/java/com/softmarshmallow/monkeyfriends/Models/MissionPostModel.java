package com.softmarshmallow.monkeyfriends.Models;

import java.util.List;
import java.util.Map;

public class MissionPostModel {
    public String postContent;
    public String mediaUrl;
    public User missionDoer;
    public User missionGiver;
    public List<Map<User, String>> commentsMap;
    public String uploadTime;
    public MissionModel mission;
}
