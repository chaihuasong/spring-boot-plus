package io.geekidea.springbootplus.api.controller;

import io.geekidea.springbootplus.api.entity.UserInfo;
import io.geekidea.springbootplus.api.service.UserInfoService;
import io.geekidea.springbootplus.framework.common.api.ApiCode;
import io.geekidea.springbootplus.framework.pagination.Paging;
import io.geekidea.springbootplus.api.param.UserInfoPageParam;
import io.geekidea.springbootplus.api.vo.UserInfoQueryVo;
import io.geekidea.springbootplus.framework.common.api.ApiResult;
import io.geekidea.springbootplus.framework.common.controller.BaseController;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.Validated;

import io.geekidea.springbootplus.framework.common.param.IdParam;

/**
 * <pre>
 *  前端控制器
 * </pre>
 *
 * @author geekidea
 * @since 2020-04-12
 */
@Slf4j
@RestController
@RequestMapping("/userInfo")
@Api(" API")
public class UserInfoController extends BaseController {

    @Autowired
    private UserInfoService userInfoService;

    /**
     * 添加
     */
    @PostMapping("/add")
    @ApiOperation(value = "添加UserInfo对象", notes = "添加", response = ApiResult.class)
    public ApiResult<Boolean> addUserInfo(@Validated @RequestBody UserInfo userInfo) throws Exception {
        UserInfoQueryVo userInfoQueryVo = userInfoService.getUserInfoByUnionId(userInfo.getUnionid());
        if (userInfoQueryVo != null) {
            return ApiResult.result(ApiCode.SUCCESS, "用户已存在");
        }
        boolean flag = userInfoService.saveUserInfo(userInfo);
        return ApiResult.result(flag);
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    @ApiOperation(value = "修改UserInfo对象", notes = "修改", response = ApiResult.class)
    public ApiResult<Boolean> updateUserInfoByUnionId(@Validated @RequestBody UserInfo userInfo) throws Exception {
        boolean flag = userInfoService.updateUserInfoByUnionId(userInfo);
        return ApiResult.result(flag);
    }

    /**
     * 删除
     */
    @PostMapping("/delete/{id}")
    @ApiOperation(value = "删除UserInfo对象", notes = "删除", response = ApiResult.class)
    public ApiResult<Boolean> deleteUserInfo(@PathVariable("id") Long id) throws Exception {
        boolean flag = userInfoService.deleteUserInfo(id);
        return ApiResult.result(flag);
    }

    /**
     * 获取
     */
    @GetMapping("/info/{unionid}")
    @ApiOperation(value = "获取UserInfo对象详情", notes = "查看", response = UserInfoQueryVo.class)
    public ApiResult<UserInfoQueryVo> getUserInfo(@PathVariable("unionid") String unionid) throws Exception {
        UserInfoQueryVo userInfoQueryVo = userInfoService.getUserInfoByUnionId(unionid);
        return ApiResult.ok(userInfoQueryVo);
    }

    /**
     * 分页列表
     */
    @PostMapping("/getPageList")
    @ApiOperation(value = "获取UserInfo分页列表", notes = "分页列表", response = UserInfoQueryVo.class)
    public ApiResult<Paging<UserInfoQueryVo>> getUserInfoPageList(@Validated @RequestBody UserInfoPageParam userInfoPageParam) throws Exception {
        Paging<UserInfoQueryVo> paging = userInfoService.getUserInfoPageList(userInfoPageParam);
        return ApiResult.ok(paging);
    }

}

