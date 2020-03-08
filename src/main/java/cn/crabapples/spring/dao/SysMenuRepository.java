package cn.crabapples.spring.dao;

import cn.crabapples.spring.entity.SysMenu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

/**
 * TODO 系统菜单持久层
 *
 * @author Mr.He
 * 3/2/20 12:15 AM
 * e-mail crabapples.cn@gmail.com
 * qq 294046317
 * pc-name root
 */
public interface SysMenuRepository extends JpaRepository<SysMenu,String> {
    List<SysMenu> findByParentIdIsNull();

    List<SysMenu> findByParentId(String parentId);
}