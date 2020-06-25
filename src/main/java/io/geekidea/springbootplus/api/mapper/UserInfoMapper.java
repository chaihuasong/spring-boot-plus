package io.geekidea.springbootplus.api.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.geekidea.springbootplus.api.entity.UserInfo;
import io.geekidea.springbootplus.framework.pagination.Paging;
import io.geekidea.springbootplus.api.param.UserInfoPageParam;
import io.geekidea.springbootplus.api.vo.UserInfoQueryVo;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * <pre>
 *  Mapper 接口
 * </pre>
 *
 * @author geekidea
 * @since 2020-04-12
 */
@Repository
public interface UserInfoMapper extends BaseMapper<UserInfo> {

    /**
     * 根据ID获取查询对象
     *
     * @param unionid
     * @return
     */
    UserInfoQueryVo getUserInfoByUnionId(Serializable unionid);

    boolean updateUserInfoByUnionId(UserInfo userInfo);

    /**
     * 获取分页对象
     *
     * @param page
     * @param userInfoPageParam
     * @return
     */
    IPage<UserInfoQueryVo> getUserInfoPageList(@Param("page") Page page, @Param("param") UserInfoPageParam userInfoPageParam);

    boolean bindTelephoneByUnionId(UserInfo userInfo);
}
