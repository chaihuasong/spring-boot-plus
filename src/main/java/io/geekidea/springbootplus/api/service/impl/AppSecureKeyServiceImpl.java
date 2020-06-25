package io.geekidea.springbootplus.api.service.impl;

import io.geekidea.springbootplus.api.entity.AppSecureKey;
import io.geekidea.springbootplus.api.mapper.AppSecureKeyMapper;
import io.geekidea.springbootplus.api.service.AppSecureKeyService;
import io.geekidea.springbootplus.framework.pagination.Paging;
import io.geekidea.springbootplus.api.param.AppSecureKeyPageParam;
import io.geekidea.springbootplus.framework.pagination.PageUtil;
import io.geekidea.springbootplus.api.vo.AppSecureKeyQueryVo;
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
 * @since 2020-03-28
 */
@Slf4j
@Service
public class AppSecureKeyServiceImpl extends BaseServiceImpl<AppSecureKeyMapper, AppSecureKey> implements AppSecureKeyService {

    @Autowired
    private AppSecureKeyMapper appSecureKeyMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean saveAppSecureKey(AppSecureKey appSecureKey) throws Exception {
        return super.save(appSecureKey);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateAppSecureKey(AppSecureKey appSecureKey) throws Exception {
        return super.updateById(appSecureKey);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean deleteAppSecureKey(Long id) throws Exception {
        return super.removeById(id);
    }

    @Override
    public AppSecureKeyQueryVo getAppSecureKeyById(Serializable id) throws Exception {
        return appSecureKeyMapper.getAppSecureKeyById(id);
    }

    @Override
    public Paging<AppSecureKeyQueryVo> getAppSecureKeyPageList(AppSecureKeyPageParam appSecureKeyPageParam) throws Exception {
        Page page = PageUtil.getPage(appSecureKeyPageParam, OrderItem.desc(getLambdaColumn(AppSecureKey::getId)));
        IPage<AppSecureKeyQueryVo> iPage = appSecureKeyMapper.getAppSecureKeyPageList(page, appSecureKeyPageParam);
        return new Paging(iPage);
    }

}
