package com.accp.mapper;

import com.accp.domain.Juese;
import com.accp.domain.JueseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JueseMapper {
    int countByExample(JueseExample example);

    int deleteByExample(JueseExample example);

    int deleteByPrimaryKey(Integer jueid);

    int insert(Juese record);

    int insertSelective(Juese record);

    List<Juese> selectByExample(JueseExample example);

    Juese selectByPrimaryKey(Integer jueid);

    int updateByExampleSelective(@Param("record") Juese record, @Param("example") JueseExample example);

    int updateByExample(@Param("record") Juese record, @Param("example") JueseExample example);

    int updateByPrimaryKeySelective(Juese record);

    int updateByPrimaryKey(Juese record);
}