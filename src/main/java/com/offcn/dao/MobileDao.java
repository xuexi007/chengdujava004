package com.offcn.dao;

import java.util.List;

import com.offcn.po.Mobile;

public interface MobileDao {
 public void save(Mobile m);
 public void saves(List<Mobile> list);
 
 public Mobile findMobile(String mobilenumber);
 
 //小白新增指定编号的手机号码
 public List<Mobile> getAllMobile(String areacode);
}
