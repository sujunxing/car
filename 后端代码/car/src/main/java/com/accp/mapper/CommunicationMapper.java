package com.accp.mapper;

import com.accp.domain.Communication;
import com.accp.domain.CommunicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommunicationMapper {
    int countByExample(CommunicationExample example);

    int deleteByExample(CommunicationExample example);

    int deleteByPrimaryKey(Integer conid);

    int insert(Communication record);

    int insertSelective(Communication record);

    List<Communication> selectByExample(CommunicationExample example);

    Communication selectByPrimaryKey(Integer conid);

    int updateByExampleSelective(@Param("record") Communication record, @Param("example") CommunicationExample example);

    int updateByExample(@Param("record") Communication record, @Param("example") CommunicationExample example);

    int updateByPrimaryKeySelective(Communication record);

    int updateByPrimaryKey(Communication record);
}