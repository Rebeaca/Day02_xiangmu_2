package com.example.user.myapplication;

import java.util.ArrayList;
/**
 * Created by user on 2016/11/22.
 * 业务类
 */

public class StroyList {
    ArrayList<Story> mslist;

    public StroyList() {
        mslist=new ArrayList<>();
    }
    /*
    * 业务方法，添加故事
    *@param element要添加的故事数据
    * */

    public void addStroy(String name ,String auther) {
        mslist.add(new Story(name,auther));
    }
    public String getStroyList(){
        String _NameList="";
        for(int i=0;i<mslist.size();i++)
        {
            _NameList=_NameList +"\n"+mslist.get(i).getStroyName()+"-作者" + mslist.get(i).getStroyAuthor();
        }
        return _NameList;
    }
}
