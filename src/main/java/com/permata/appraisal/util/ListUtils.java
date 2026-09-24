package com.permata.appraisal.util;

import java.util.List;
import java.util.Set;

public class ListUtils {

    public static boolean isNotEmpty(Set list) {
        return !isEmpty(list);
    }

    public static boolean isEmpty(Set set){
        if (set == null) {
            return true;
        }
        if (set.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean isEmpty(List list) {
        if (list == null) {
            return true;
        }
        if (list.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean isNotEmpty(List list) {
        return !isEmpty(list);
    }
}
