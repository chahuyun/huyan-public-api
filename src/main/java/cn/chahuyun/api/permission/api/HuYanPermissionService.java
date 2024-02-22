package cn.chahuyun.api.permission.api;

import cn.chahuyun.api.permission.abnormal.NotExistHuYanPermissionException;

/**
 * 用户权限操作的公共api
 *
 * @author Moyuyanli
 * @date 2024/2/21 11:12
 */
public interface HuYanPermissionService {

    /**
     * 判断该id是否拥有该权限
     *
     * @param id       用户id
     * @param permCode 权限code
     * @return true 该id存在该权限<p>
     * false 该id不存在或该id不存在该权限
     * @throws NotExistHuYanPermissionException 该权限不存在
     */
    boolean isPermissions(String id, String permCode) throws NotExistHuYanPermissionException;

    /**
     * 为该id添加权限
     *
     * @param id       用户id
     * @param permCode 权限code
     * @return true 为该id添加权限成功<p>
     * false 该id不存在或该id已有该权限
     * @throws NotExistHuYanPermissionException 该权限不存在
     */
    boolean addPermissions(String id, String permCode) throws NotExistHuYanPermissionException;

    /**
     * @param id       用户id
     * @param permCode 权限code
     * @return true 为该id添加权限成功<p>
     * false 该id不存在或该id已有该权限
     * @throws NotExistHuYanPermissionException 该权限不存在
     */
    boolean delPermissions(String id, String permCode) throws NotExistHuYanPermissionException;

    /**
     * 清除这个用户的所有权限
     *
     * @param id 用户id
     * @return true 成功
     */
    boolean cleanPermissions(String id);

    /**
     * 清除这个权限用户，
     * 直接清除用户
     *
     * @param id 用户id
     * @return true 成功
     */
    boolean cleanPermUser(String id);
}
