package com.accp.mapper;

import com.accp.domain.Shopsmall;
import com.accp.domain.ShopsmallExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopsmallMapper {
    int countByExample(ShopsmallExample example);

    int deleteByExample(ShopsmallExample example);

    int deleteByPrimaryKey(String shlid);

    int insert(Shopsmall record);

    int insertSelective(Shopsmall record);

    List<Shopsmall> selectByExample(ShopsmallExample example);

    Shopsmall selectByPrimaryKey(String shlid);

    int updateByExampleSelective(@Param("record") Shopsmall record, @Param("example") ShopsmallExample example);

    int updateByExample(@Param("record") Shopsmall record, @Param("example") ShopsmallExample example);

    int updateByPrimaryKeySelective(Shopsmall record);

    int updateByPrimaryKey(Shopsmall record);
}