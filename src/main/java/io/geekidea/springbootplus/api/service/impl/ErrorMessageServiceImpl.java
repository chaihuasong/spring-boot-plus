package io.geekidea.springbootplus.api.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.geekidea.springbootplus.api.entity.ErrorMessage;
import io.geekidea.springbootplus.api.service.ErrorMessageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;

@Slf4j
@Service(value = "errorMessageService")
public class ErrorMessageServiceImpl implements ErrorMessageService {
    @Override
    public String getErrorMessage() {
        return "This is ErrorMessageServiceImpl";
    }

    @Override
    public String getErrorMessage(Long code) {
        return "";
    }

    @Override
    public void saveErrorMessage(ErrorMessage errorMessage) {

    }

    @Override
    public boolean saveBatch(Collection<ErrorMessage> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<ErrorMessage> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<ErrorMessage> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(ErrorMessage entity) {
        return false;
    }

    @Override
    public ErrorMessage getOne(Wrapper<ErrorMessage> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<ErrorMessage> queryWrapper) {
        return Collections.emptyMap();
    }

    @Override
    public <V> V getObj(Wrapper<ErrorMessage> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<ErrorMessage> getBaseMapper() {
        return null;
    }
}
