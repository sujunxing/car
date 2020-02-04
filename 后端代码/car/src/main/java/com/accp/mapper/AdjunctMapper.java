package com.accp.mapper;

import com.accp.domain.Adjunct;
import com.accp.domain.AdjunctExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdjunctMapper {
    int countByExample(AdjunctExample example);

    int deleteByExample(AdjunctExample example);

    int deleteByPrimaryKey(String adtid);

    int insert(Adjunct record);

    int insertSelective(Adjunct record);

    List<Adjunct> selectByExample(AdjunctExample example);

    Adjunct selectByPrimaryKey(String adtid);

    int updateByExampleSelective(@Param("record") Adjunct record, @Param("example") AdjunctExample example);

    int updateByExample(@Param("record") Adjunct record, @Param("example") AdjunctExample example);

    int updateByPrimaryKeySelective(Adjunct record);

    int updateByPrimaryKey(Adjunct record);
}