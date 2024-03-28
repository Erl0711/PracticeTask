package org.practice.tasks.zhyldyz.stream;

import java.util.List;

public class Lower {
    public static List<String> lower(List<String> list) {
        list.replaceAll(String::toLowerCase);
        return list;
    }
}
