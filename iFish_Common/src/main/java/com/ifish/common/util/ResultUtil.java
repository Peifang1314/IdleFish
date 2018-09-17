package com.ifish.common.util;

import com.wyh.common.restult.R;

/**
 * @description:
 * @author: Mr.lsf
 * @create: 2018-09-05 00:20
 **/
public class ResultUtil {
    public static R creatResult(int ret){
        if (ret>0){
            return R.setOK();
        }else {
            return R.setERROR();
        }
    }
}
