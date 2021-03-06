package com.fengyukeji.resourceslib.dao;

import com.fengyukeji.resourceslib.bean.CountByDate;
import com.fengyukeji.resourceslib.bean.Visit;
import com.fengyukeji.resourceslib.bean.VisitExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface VisitMapper {
    long countByExample(VisitExample example);

    int deleteByExample(VisitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Visit record);

    int insertSelective(Visit record);

    List<Visit> selectByExample(VisitExample example);
    
    //自定义方法 获取大于指定时间的访问记录
    List<CountByDate> selectByDate(String date);
    
    Visit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Visit record, @Param("example") VisitExample example);

    int updateByExample(@Param("record") Visit record, @Param("example") VisitExample example);

    int updateByPrimaryKeySelective(Visit record);

    int updateByPrimaryKey(Visit record);
}