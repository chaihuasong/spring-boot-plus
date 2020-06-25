package io.geekidea.springbootplus.api.controller;

import io.geekidea.springbootplus.api.entity.AppSecureKey;
import io.geekidea.springbootplus.api.service.AppSecureKeyService;
import io.geekidea.springbootplus.framework.pagination.Paging;
import io.geekidea.springbootplus.api.param.AppSecureKeyPageParam;
import io.geekidea.springbootplus.api.vo.AppSecureKeyQueryVo;
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
 * @since 2020-03-28
 */
@Slf4j
@RestController
@RequestMapping("/appSecureKey")
@Api(" API")
public class AppSecureKeyController extends BaseController {

    @Autowired
    private AppSecureKeyService appSecureKeyService;

    /**
     * 添加
     */
    @PostMapping("/add")
    @ApiOperation(value = "添加AppSecureKey对象", notes = "添加", response = ApiResult.class)
    public ApiResult<Boolean> addAppSecureKey(@Validated @RequestBody AppSecureKey appSecureKey) throws Exception {
        boolean flag = appSecureKeyService.saveAppSecureKey(appSecureKey);
        return ApiResult.result(flag);
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    @ApiOperation(value = "修改AppSecureKey对象", notes = "修改", response = ApiResult.class)
    public ApiResult<Boolean> updateAppSecureKey(@Validated @RequestBody AppSecureKey appSecureKey) throws Exception {
        boolean flag = appSecureKeyService.updateAppSecureKey(appSecureKey);
        return ApiResult.result(flag);
    }

    /**
     * 删除
     */
    @PostMapping("/delete/{id}")
    @ApiOperation(value = "删除AppSecureKey对象", notes = "删除", response = ApiResult.class)
    public ApiResult<Boolean> deleteAppSecureKey(@PathVariable("id") Long id) throws Exception {
        boolean flag = appSecureKeyService.deleteAppSecureKey(id);
        return ApiResult.result(flag);
    }

    /**
     * 获取
     */
    @GetMapping("/info/{id}")
    @ApiOperation(value = "获取AppSecureKey对象详情", notes = "查看", response = AppSecureKeyQueryVo.class)
    public ApiResult<AppSecureKeyQueryVo> getAppSecureKey(@PathVariable("id") Long id) throws Exception {
        AppSecureKeyQueryVo appSecureKeyQueryVo = appSecureKeyService.getAppSecureKeyById(id);
        return ApiResult.ok(appSecureKeyQueryVo);
    }

    /**
     * 分页列表
     */
    @PostMapping("/getPageList")
    @ApiOperation(value = "获取AppSecureKey分页列表", notes = "分页列表", response = AppSecureKeyQueryVo.class)
    public ApiResult<Paging<AppSecureKeyQueryVo>> getAppSecureKeyPageList(@Validated @RequestBody AppSecureKeyPageParam appSecureKeyPageParam) throws Exception {
        Paging<AppSecureKeyQueryVo> paging = appSecureKeyService.getAppSecureKeyPageList(appSecureKeyPageParam);
        return ApiResult.ok(paging);
    }

}

