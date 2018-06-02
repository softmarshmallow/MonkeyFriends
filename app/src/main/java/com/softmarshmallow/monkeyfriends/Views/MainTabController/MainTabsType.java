package com.softmarshmallow.monkeyfriends.Views.MainTabController;

import java.util.HashMap;
import java.util.Map;

public enum MainTabsType
{
        Featured (0),
        Search  (1),
        MyPage  (2),
        Notifications(3),
        More (4),;

        int value;
        MainTabsType(int value) {
                this.value = value;
        }

        public int getValue() {
                return value;
        }
        
        
        public static Map<Integer, MainTabsType> MainTabsPositionMapping = new HashMap<Integer, MainTabsType>(){{
                put(0, MainTabsType.Featured);
                put(1, MainTabsType.Search);
                put(2, MainTabsType.MyPage);
                put(3, MainTabsType.Notifications);
                put(4, MainTabsType.More);
        }};
}
