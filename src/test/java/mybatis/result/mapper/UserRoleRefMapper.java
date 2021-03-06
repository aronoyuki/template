package cn.aptx4869.module.mapper;

import java.util.List;
import cn.aptx4869.module.po.UserRoleRef;
import cn.aptx4869.module.po.UserRoleRefExample;
import org.apache.ibatis.annotations.Param;

public interface UserRoleRefMapper {
    long countByExample(UserRoleRefExample example);

    int deleteByExample(UserRoleRefExample example);

    int insert(UserRoleRef record);

    int insertSelective(UserRoleRef record);

    List<UserRoleRef> selectByExample(UserRoleRefExample example);

    int updateByExampleSelective(@Param("record") UserRoleRef record, @Param("example") UserRoleRefExample example);

    int updateByExample(@Param("record") UserRoleRef record, @Param("example") UserRoleRefExample example);
}