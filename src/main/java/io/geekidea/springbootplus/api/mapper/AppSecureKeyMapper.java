package io.geekidea.springbootplus.api.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.geekidea.springbootplus.api.entity.AppSecureKey;
import io.geekidea.springbootplus.framework.pagination.Paging;
import io.geekidea.springbootplus.api.param.AppSecureKeyPageParam;
import io.geekidea.springbootplus.api.vo.AppSecureKeyQueryVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * <pre>
 *  Mapper 接口
 * </pre>
 *
 * @author geekidea
 * @since 2020-03-28
 */
@Repository
public interface AppSecureKeyMapper extends BaseMapper<AppSecureKey> {

    /**
     * 根据ID获取查询对象
     *
     * @param id
     * @return
     */
    AppSecureKeyQueryVo getAppSecureKeyById(Serializable id);

    /**
     * 获取分页对象
     *
     * @param page
     * @param appSecureKeyPageParam
     * @return
     */
    IPage<AppSecureKeyQueryVo> getAppSecureKeyPageList(@Param("page") Page page, @Param("param") AppSecureKeyPageParam appSecureKeyPageParam);

}
