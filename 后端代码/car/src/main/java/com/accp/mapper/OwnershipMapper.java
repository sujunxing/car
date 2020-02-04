package com.accp.mapper;

import com.accp.domain.Ownership;
import com.accp.domain.OwnershipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OwnershipMapper {
    int countByExample(OwnershipExample example);

    int deleteByExample(OwnershipExample example);

    int deleteByPrimaryKey(Integer ownershipid);

    int insert(Ownership record);

    int insertSelective(Ownership record);

    List<Ownership> selectByExample(OwnershipExample example);

    Ownership selectByPrimaryKey(Integer ownershipid);

    int updateByExampleSelective(@Param("record") Ownership record, @Param("example") OwnershipExample example);

    int updateByExample(@Param("record") Ownership record, @Param("example") OwnershipExample example);

    int updateByPrimaryKeySelective(Ownership record);

    int updateByPrimaryKey(Ownership record);
}