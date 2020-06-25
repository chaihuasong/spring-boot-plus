package io.geekidea.springbootplus.api.controller;

import io.geekidea.springbootplus.api.entity.UserInfo;
import io.geekidea.springbootplus.api.service.UserInfoService;
import io.geekidea.springbootplus.api.vo.UserInfoQueryVo;
import io.geekidea.springbootplus.framework.common.api.ApiResult;
import io.geekidea.springbootplus.utils.SendSmsUtil;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
@Api(" API")
@RequestMapping("/telephone")
public class TelephoneController {
    private Map<String, String> mCodeMap = new HashMap<>();
    private Map<String, Long> mRequestMap = new HashMap<>();

    @Autowired
    private UserInfoService userInfoService;

    @PostMapping("getSmsCode")
    public ApiResult getSmsCode(String unionid, String telephone) {
        try {
            UserInfoQueryVo userInfoQueryVo = userInfoService.getUserInfoByUnionId(unionid);
            if (userInfoQueryVo == null) {
                return ApiResult.fail("用户不存在");
            }
        } catch (Exception e) {
            return ApiResult.fail(e.getMessage());
        }
        if (mRequestMap.containsKey(telephone) && mRequestMap.get(telephone) != null) {
            if (System.currentTimeMillis() - mRequestMap.get(telephone) < 60000) {
                return ApiResult.fail("请求过于频繁");
            }
        }
        String code = SendSmsUtil.getSixRandomCode();
        mRequestMap.put(telephone, System.currentTimeMillis());
        mCodeMap.put(unionid, code);
        SendSmsUtil.send(telephone, code);
        return ApiResult.ok(code);
    }

    @PostMapping("bindTelephone")
    public ApiResult bindTelephone(String unionid, String telephone, String code) {
        if (mCodeMap.get(unionid) == null || !mCodeMap.get(unionid).equals(code)) {
            return ApiResult.fail("code不匹配");
        }
        try {
            UserInfo userInfo = new UserInfo();
            userInfo.setUnionid(unionid);
            userInfo.setTelephone(telephone);
            userInfoService.bindTelephoneByUnionId(userInfo);
        } catch (Exception e) {
            return ApiResult.fail(e.getMessage());
        }
        return ApiResult.ok(code);
    }
}
