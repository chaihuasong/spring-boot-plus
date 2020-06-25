package io.geekidea.springbootplus.api.service;

import io.geekidea.springbootplus.api.entity.UserInfo;
import io.geekidea.springbootplus.framework.common.service.BaseService;
import io.geekidea.springbootplus.framework.pagination.Paging;
import io.geekidea.springbootplus.api.param.UserInfoPageParam;
import io.geekidea.springbootplus.api.vo.UserInfoQueryVo;

import java.io.Serializable;

/**
 * <pre>
 *  服务类
 * </pre>
 *
 * @author geekidea
 * @since 2020-04-12
 */
public interface UserInfoService extends BaseService<UserInfo> {

    /**
     * 保存
     *
     * @param userInfo
     * @return
     * @throws Exception
     */
    boolean saveUserInfo(UserInfo userInfo) throws Exception;

    /**
     * 修改
     *
     * @param userInfo
     * @return
     * @throws Exception
     */
    boolean updateUserInfoByUnionId(UserInfo userInfo) throws Exception;

    /**
     * 删除
     *
     * @param id
     * @return
     * @throws Exception
     */
    boolean deleteUserInfo(Long id) throws Exception;

    /**
     * 根据ID获取查询对象
     *
     * @param unionid
     * @return
     * @throws Exception
     */
    UserInfoQueryVo getUserInfoByUnionId(Serializable unionid) throws Exception;

    /**
     * 获取分页对象
     *
     * @param userInfoPageParam
     * @return
     * @throws Exception
     */
    Paging<UserInfoQueryVo> getUserInfoPageList(UserInfoPageParam userInfoPageParam) throws Exception;

    boolean bindTelephoneByUnionId(UserInfo userInfo);
}
