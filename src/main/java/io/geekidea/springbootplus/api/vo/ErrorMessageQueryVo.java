package io.geekidea.springbootplus.api.vo;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <pre>
 *  查询结果对象
 * </pre>
 *
 * @author geekidea
 * @date 2020-03-28
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "ErrorMessageQueryVo对象", description = "查询参数")
public class ErrorMessageQueryVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String pkg;

    private String phone;

    private String info;

    private String time;

    private String user;

}