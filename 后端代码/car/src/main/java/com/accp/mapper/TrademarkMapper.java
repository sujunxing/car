package com.accp.mapper;

import com.accp.domain.Trademark;
import com.accp.domain.TrademarkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrademarkMapper {
    int countByExample(TrademarkExample example);

    int deleteByExample(TrademarkExample example);

    int deleteByPrimaryKey(String trkid);

    int insert(Trademark record);

    int insertSelective(Trademark record);

    List<Trademark> selectByExample(TrademarkExample example);

    Trademark selectByPrimaryKey(String trkid);

    int updateByExampleSelective(@Param("record") Trademark record, @Param("example") TrademarkExample example);

    int updateByExample(@Param("record") Trademark record, @Param("example") TrademarkExample example);

    int updateByPrimaryKeySelective(Trademark record);

    int updateByPrimaryKey(Trademark record);
}