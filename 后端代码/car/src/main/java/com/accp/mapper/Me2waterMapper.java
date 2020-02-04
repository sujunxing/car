package com.accp.mapper;

import com.accp.domain.Me2water;
import com.accp.domain.Me2waterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Me2waterMapper {
    int countByExample(Me2waterExample example);

    int deleteByExample(Me2waterExample example);

    int deleteByPrimaryKey(Integer me2waterid);

    int insert(Me2water record);

    int insertSelective(Me2water record);

    List<Me2water> selectByExample(Me2waterExample example);

    Me2water selectByPrimaryKey(Integer me2waterid);

    int updateByExampleSelective(@Param("record") Me2water record, @Param("example") Me2waterExample example);

    int updateByExample(@Param("record") Me2water record, @Param("example") Me2waterExample example);

    int updateByPrimaryKeySelective(Me2water record);

    int updateByPrimaryKey(Me2water record);
}