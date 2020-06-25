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
 * @date 2020-04-12
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "UserInfoQueryVo对象", description = "查询参数")
public class UserInfoQueryVo implements Serializable {
    private static final long serialVersionUID = 1L;

private Long id;

private String unionid;

private String nickname;

private String openid;

private Integer sex;

private String headimgurl;

private String country;

private String province;

private String city;

private String language;

private Integer groupId;

private String telephone;

private String pwd;

private String sign;

private String note;

private Date createTime;

private Date lastUpdateTime;

}