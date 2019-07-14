package cn.dzkjdx.mybatis;

import java.util.List;

public interface RoleMapper {
    public int insertRole(Role role);
    public int deleteRole(Integer id);
    public int updateRole(Role role);
    public Role getRole(Integer id);
    public List<Role> findRoles(String rolename);
}
