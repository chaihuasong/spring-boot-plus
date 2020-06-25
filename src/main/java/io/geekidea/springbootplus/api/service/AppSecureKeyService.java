package io.geekidea.springbootplus.api.service;

import io.geekidea.springbootplus.api.entity.AppSecureKey;
import io.geekidea.springbootplus.framework.common.service.BaseService;
import io.geekidea.springbootplus.framework.pagination.Paging;
import io.geekidea.springbootplus.api.param.AppSecureKeyPageParam;
import io.geekidea.springbootplus.api.vo.AppSecureKeyQueryVo;

import java.io.Serializable;

/**
 * <pre>
 *  服务类
 * </pre>
 *
 * @author geekidea
 * @since 2020-03-28
 */
public interface AppSecureKeyService extends BaseService<AppSecureKey> {

    /**
     * 保存
     *
     * @param appSecureKey
     * @return
     * @throws Exception
     */
    boolean saveAppSecureKey(AppSecureKey appSecureKey) throws Exception;

    /**
     * 修改
     *
     * @param appSecureKey
     * @return
     * @throws Exception
     */
    boolean updateAppSecureKey(AppSecureKey appSecureKey) throws Exception;

    /**
     * 删除
     *
     * @param id
     * @return
     * @throws Exception
     */
    boolean deleteAppSecureKey(Long id) throws Exception;

    /**
     * 根据ID获取查询对象
     *
     * @param id
     * @return
     * @throws Exception
     */
    AppSecureKeyQueryVo getAppSecureKeyById(Serializable id) throws Exception;

    /**
     * 获取分页对象
     *
     * @param appSecureKeyPageParam
     * @return
     * @throws Exception
     */
    Paging<AppSecureKeyQueryVo> getAppSecureKeyPageList(AppSecureKeyPageParam appSecureKeyPageParam) throws Exception;

}
