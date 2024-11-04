package io.geekidea.springbootplus.api.controller;

import io.geekidea.springbootplus.api.entity.ErrorMessage;
import io.geekidea.springbootplus.api.service.ErrorMessageService;
import io.geekidea.springbootplus.api.vo.ErrorMessageQueryVo;
import io.geekidea.springbootplus.framework.common.api.ApiResult;
import io.geekidea.springbootplus.framework.pagination.Paging;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@Api("API")
@RequestMapping("/error")
public class ErrorManagerController {

    @Autowired
    private ErrorMessageService errorMessageService;

    @PostMapping("/save")
    public void save(@RequestBody ErrorMessage errorMessage) {
        errorMessageService.saveErrorMessage(errorMessage);
    }
    /**
     * 获取错误信息分页列表
     *
     * @return ApiResult<Paging<ErrorMessageQueryVo>> 包含错误信息分页列表的ApiResult对象
     */
    @RequestMapping("/get")
    //public ApiResult<Paging<ErrorMessageQueryVo>> get() {
    public ApiResult get() {
        System.out.println("============== get ===============");
        // 创建一个空的Paging对象作为分页数据
        Paging<ErrorMessageQueryVo> paging = new Paging<>();
        // 创建一个ApiResult对象，表示请求成功，并设置分页数据
        //ApiResult result = ApiResult.result(ApiCode.SUCCESS, "get ok..", null).setData(paging);
        // 返回ApiResult对象
        return ApiResult.ok();
    }
}
