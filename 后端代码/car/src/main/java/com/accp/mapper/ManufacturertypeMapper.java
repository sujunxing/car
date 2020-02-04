package com.accp.mapper;

import com.accp.domain.Manufacturertype;
import com.accp.domain.ManufacturertypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManufacturertypeMapper {
    int countByExample(ManufacturertypeExample example);

    int deleteByExample(ManufacturertypeExample example);

    int deleteByPrimaryKey(Integer maeid);

    int insert(Manufacturertype record);

    int insertSelective(Manufacturertype record);

    List<Manufacturertype> selectByExample(ManufacturertypeExample example);

    Manufacturertype selectByPrimaryKey(Integer maeid);

    int updateByExampleSelective(@Param("record") Manufacturertype record, @Param("example") ManufacturertypeExample example);

    int updateByExample(@Param("record") Manufacturertype record, @Param("example") ManufacturertypeExample example);

    int updateByPrimaryKeySelective(Manufacturertype record);

    int updateByPrimaryKey(Manufacturertype record);
}