package com.accp.mapper;

import com.accp.domain.Maintainxf;
import com.accp.domain.MaintainxfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaintainxfMapper {
    int countByExample(MaintainxfExample example);

    int deleteByExample(MaintainxfExample example);

    int deleteByPrimaryKey(String mafid);

    int insert(Maintainxf record);

    int insertSelective(Maintainxf record);

    List<Maintainxf> selectByExample(MaintainxfExample example);

    Maintainxf selectByPrimaryKey(String mafid);

    int updateByExampleSelective(@Param("record") Maintainxf record, @Param("example") MaintainxfExample example);

    int updateByExample(@Param("record") Maintainxf record, @Param("example") MaintainxfExample example);

    int updateByPrimaryKeySelective(Maintainxf record);

    int updateByPrimaryKey(Maintainxf record);
}