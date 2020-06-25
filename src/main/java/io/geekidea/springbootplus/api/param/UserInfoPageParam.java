package io.geekidea.springbootplus.api.param;

import io.geekidea.springbootplus.framework.pagination.BasePageOrderParam;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <pre>
 *  查询参数对象
 * </pre>
 *
 * @author geekidea
 * @date 2020-04-12
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "UserInfoPageParam对象", description = "查询参数")
public class UserInfoPageParam extends BasePageOrderParam {
    private static final long serialVersionUID = 1L;
}
