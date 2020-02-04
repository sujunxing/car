package com.accp.mapper;

import com.accp.domain.Shopcentre;
import com.accp.domain.ShopcentreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopcentreMapper {
    int countByExample(ShopcentreExample example);

    int deleteByExample(ShopcentreExample example);

    int deleteByPrimaryKey(String sheid);

    int insert(Shopcentre record);

    int insertSelective(Shopcentre record);

    List<Shopcentre> selectByExample(ShopcentreExample example);

    Shopcentre selectByPrimaryKey(String sheid);

    int updateByExampleSelective(@Param("record") Shopcentre record, @Param("example") ShopcentreExample example);

    int updateByExample(@Param("record") Shopcentre record, @Param("example") ShopcentreExample example);

    int updateByPrimaryKeySelective(Shopcentre record);

    int updateByPrimaryKey(Shopcentre record);
}