package cn.dzkjdx.spring_mybatis;

import org.apache.ibatis.annotations.Param;

public interface RoleMapper {
    public int insertRole(Role role);
    public Role getRole(@Param("id") Integer id);
    public int updateRole(Role role);
    public int deleteRole(@Param("id") Integer id);
}
