package club.janna.designPattern.adapter;

import java.util.Map;

/**
 * @author: 郭攀博
 * @create: 2018-12-21 07:16
 **/
public interface IOtherUserInfo {
    Map<String, String> getBaseInfo();
    Map<String, String> getHomeInfo();
    Map<String, String> getWorkInfo();
}