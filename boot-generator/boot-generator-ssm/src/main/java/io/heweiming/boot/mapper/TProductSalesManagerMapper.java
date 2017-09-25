package io.heweiming.boot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import io.heweiming.boot.model.TProductSalesManager;
import io.heweiming.boot.model.TProductSalesManagerExample;

public interface TProductSalesManagerMapper {
    long countByExample(TProductSalesManagerExample example);

    int deleteByExample(TProductSalesManagerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TProductSalesManager record);

    int insertSelective(TProductSalesManager record);

    List<TProductSalesManager> selectByExample(TProductSalesManagerExample example);

    TProductSalesManager selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TProductSalesManager record, @Param("example") TProductSalesManagerExample example);

    int updateByExample(@Param("record") TProductSalesManager record, @Param("example") TProductSalesManagerExample example);

    int updateByPrimaryKeySelective(TProductSalesManager record);

    int updateByPrimaryKey(TProductSalesManager record);
}