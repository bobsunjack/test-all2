package com;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List pushCaptureChildList=new ArrayList<>();
        for(int i=0;i<10;i++){
            pushCaptureChildList.add(i);
        }
        int pageSize = 4;
        int size=pushCaptureChildList.size();
        int pre = size / pageSize;
        int last = size % pageSize;
        int page=(int) Math.ceil(Double.valueOf((float)size/pageSize));
        for (int index = 0; index < page; index++) {
            int begin=index*pageSize;
            int end=(index+1)*pageSize<=size?(index+1)*pageSize:size;
            System.out.println(pushCaptureChildList.subList(begin,end));
        }
    }
    //read mysql
}
