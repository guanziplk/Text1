package com.yao.utils;

public class CloseUtils {
    public static void CloseAll(AutoCloseable ... closeAll){
        for (AutoCloseable c: closeAll)
        {
            if(c != null){
                try {
                    c.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
