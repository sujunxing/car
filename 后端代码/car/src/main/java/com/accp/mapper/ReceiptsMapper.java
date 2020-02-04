package com.accp.mapper;

import com.accp.domain.Receipts;
import com.accp.domain.ReceiptsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReceiptsMapper {
    int countByExample(ReceiptsExample example);

    int deleteByExample(ReceiptsExample example);

    int deleteByPrimaryKey(Integer resid);

    int insert(Receipts record);

    int insertSelective(Receipts record);

    List<Receipts> selectByExample(ReceiptsExample example);

    Receipts selectByPrimaryKey(Integer resid);

    int updateByExampleSelective(@Param("record") Receipts record, @Param("example") ReceiptsExample example);

    int updateByExample(@Param("record") Receipts record, @Param("example") ReceiptsExample example);

    int updateByPrimaryKeySelective(Receipts record);

    int updateByPrimaryKey(Receipts record);
}