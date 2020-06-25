package io.geekidea.springbootplus.api.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;
import java.io.Serializable;

import java.math.BigDecimal;
import java.util.Date;

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
@ApiModel(value = "AppSecureKeyQueryVo对象", description = "查询参数")
public class AppSecureKeyQueryVo implements Serializable {
    private static final long serialVersionUID = 1L;

private Integer id;

private String appName;

private String platform;

private String appId;

private String appSecureKey;

private String note;

}