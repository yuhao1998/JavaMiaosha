package com.miaoshaproject.miaosha.dao;

import com.miaoshaproject.miaosha.dataobject.ItemDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Sat Apr 27 15:53:43 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Sat Apr 27 15:53:43 CST 2019
     */
    int insert(ItemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Sat Apr 27 15:53:43 CST 2019
     */
    int insertSelective(ItemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Sat Apr 27 15:53:43 CST 2019
     */
    ItemDO selectByPrimaryKey(Integer id);
    List<ItemDO> selectListItem();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Sat Apr 27 15:53:43 CST 2019
     */
    int updateByPrimaryKeySelective(ItemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Sat Apr 27 15:53:43 CST 2019
     */
    int updateByPrimaryKey(ItemDO record);

    //更新销量，销量增加
    int increaseSales(@Param("id")Integer id, @Param("amount")Integer amount);
}