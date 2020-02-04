package com.accp.mapper;

import com.accp.domain.Shopbroad;
import com.accp.domain.ShopbroadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopbroadMapper {
    int countByExample(ShopbroadExample example);

    int deleteByExample(ShopbroadExample example);

    int deleteByPrimaryKey(String shdid);

    int insert(Shopbroad record);

    int insertSelective(Shopbroad record);

    List<Shopbroad> selectByExample(ShopbroadExample example);

    Shopbroad selectByPrimaryKey(String shdid);

    int updateByExampleSelective(@Param("record") Shopbroad record, @Param("example") ShopbroadExample example);

    int updateByExample(@Param("record") Shopbroad record, @Param("example") ShopbroadExample example);

    int updateByPrimaryKeySelective(Shopbroad record);

    int updateByPrimaryKey(Shopbroad record);
}