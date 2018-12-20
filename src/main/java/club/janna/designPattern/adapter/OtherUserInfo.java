package club.janna.designPattern.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: 郭攀博
 * @create: 2018-12-21 07:18
 **/
public class OtherUserInfo implements IOtherUserInfo {
    @Override
    public Map<String, String> getBaseInfo() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "外部人员XXX");
        return map;
    }

    @Override
    public Map<String, String> getHomeInfo() {
        Map<String, String> map = new HashMap<>();
        map.put("address", "我家住在xxx");
        return map;
    }

    @Override
    public Map<String, String> getWorkInfo() {
        Map<String, String> map = new HashMap<>();
        map.put("phone", "185001230");
        return map;
    }
}
