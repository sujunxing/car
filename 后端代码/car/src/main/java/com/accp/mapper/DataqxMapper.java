package com.accp.mapper;

import com.accp.domain.Dataqx;
import com.accp.domain.DataqxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataqxMapper {
    int countByExample(DataqxExample example);

    int deleteByExample(DataqxExample example);

    int deleteByPrimaryKey(Integer daxid);

    int insert(Dataqx record);

    int insertSelective(Dataqx record);

    List<Dataqx> selectByExample(DataqxExample example);

    Dataqx selectByPrimaryKey(Integer daxid);

    int updateByExampleSelective(@Param("record") Dataqx record, @Param("example") DataqxExample example);

    int updateByExample(@Param("record") Dataqx record, @Param("example") DataqxExample example);

    int updateByPrimaryKeySelective(Dataqx record);

    int updateByPrimaryKey(Dataqx record);
}