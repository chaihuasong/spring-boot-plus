package io.geekidea.springbootplus.api.service;

import io.geekidea.springbootplus.api.entity.ErrorMessage;
import io.geekidea.springbootplus.framework.common.service.BaseService;

public interface ErrorMessageService extends BaseService<ErrorMessage> {
    String getErrorMessage();

    String getErrorMessage(Long code);
    void saveErrorMessage(ErrorMessage errorMessage);
}
