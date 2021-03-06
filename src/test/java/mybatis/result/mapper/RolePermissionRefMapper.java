package cn.aptx4869.module.mapper;

import java.util.List;
import cn.aptx4869.module.po.RolePermissionRef;
import cn.aptx4869.module.po.RolePermissionRefExample;
import org.apache.ibatis.annotations.Param;

public interface RolePermissionRefMapper {
    long countByExample(RolePermissionRefExample example);

    int deleteByExample(RolePermissionRefExample example);

    int insert(RolePermissionRef record);

    int insertSelective(RolePermissionRef record);

    List<RolePermissionRef> selectByExample(RolePermissionRefExample example);

    int updateByExampleSelective(@Param("record") RolePermissionRef record, @Param("example") RolePermissionRefExample example);

    int updateByExample(@Param("record") RolePermissionRef record, @Param("example") RolePermissionRefExample example);
}