package com.accp.mapper;

import com.accp.domain.Payoff;
import com.accp.domain.PayoffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayoffMapper {
    int countByExample(PayoffExample example);

    int deleteByExample(PayoffExample example);

    int deleteByPrimaryKey(String pafid);

    int insert(Payoff record);

    int insertSelective(Payoff record);

    List<Payoff> selectByExample(PayoffExample example);

    Payoff selectByPrimaryKey(String pafid);

    int updateByExampleSelective(@Param("record") Payoff record, @Param("example") PayoffExample example);

    int updateByExample(@Param("record") Payoff record, @Param("example") PayoffExample example);

    int updateByPrimaryKeySelective(Payoff record);

    int updateByPrimaryKey(Payoff record);
}