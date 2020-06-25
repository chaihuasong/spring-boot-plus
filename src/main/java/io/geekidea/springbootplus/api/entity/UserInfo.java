package io.geekidea.springbootplus.api.entity;

import io.geekidea.springbootplus.framework.common.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.baomidou.mybatisplus.annotation.TableField;

/**
 * <pre>
 * 
 * </pre>
 *
 * @author geekidea
 * @since 2020-04-12
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "UserInfo对象", description = "")
public class UserInfo extends BaseEntity {

    private static final long serialVersionUID = 1L;

@TableId(value = "id", type = IdType.AUTO)
    private Long id;

@NotBlank(message = "不能为空")
    private String unionid;

@NotBlank(message = "不能为空")
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
