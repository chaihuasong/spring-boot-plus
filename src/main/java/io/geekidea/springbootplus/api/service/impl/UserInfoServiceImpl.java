package io.geekidea.springbootplus.api.service.impl;

import io.geekidea.springbootplus.api.entity.UserInfo;
import io.geekidea.springbootplus.api.mapper.UserInfoMapper;
import io.geekidea.springbootplus.api.service.UserInfoService;
import io.geekidea.springbootplus.framework.pagination.Paging;
import io.geekidea.springbootplus.api.param.UserInfoPageParam;
import io.geekidea.springbootplus.framework.pagination.PageUtil;
import io.geekidea.springbootplus.api.vo.UserInfoQueryVo;
import io.geekidea.springbootplus.framework.common.service.impl.BaseServiceImpl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;


import java.io.Serializable;


/**
 * <pre>
 *  服务实现类
 * </pre>
 *
 * @author geekidea
 * @since 2020-04-12
 */
@Slf4j
@Service
public class UserInfoServiceImpl extends BaseServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean saveUserInfo(UserInfo userInfo) throws Exception {
        return super.save(userInfo);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateUserInfoByUnionId(UserInfo userInfo) throws Exception {
        return userInfoMapper.updateUserInfoByUnionId(userInfo);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean deleteUserInfo(Long id) throws Exception {
        return super.removeById(id);
    }

    @Override
    public UserInfoQueryVo getUserInfoByUnionId(Serializable unionid) throws Exception {
        return userInfoMapper.getUserInfoByUnionId(unionid);
    }

    @Override
    public Paging<UserInfoQueryVo> getUserInfoPageList(UserInfoPageParam userInfoPageParam) throws Exception {
        Page page = PageUtil.getPage(userInfoPageParam, OrderItem.desc(getLambdaColumn(UserInfo::getCreateTime)));
        IPage<UserInfoQueryVo> iPage = userInfoMapper.getUserInfoPageList(page, userInfoPageParam);
        return new Paging(iPage);
    }

    @Override
    public boolean bindTelephoneByUnionId(UserInfo userInfo) {
        return userInfoMapper.bindTelephoneByUnionId(userInfo);
    }

}
