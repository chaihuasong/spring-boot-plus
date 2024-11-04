package io.geekidea.springbootplus.api.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.geekidea.springbootplus.api.entity.ErrorMessage;
import org.springframework.stereotype.Repository;

@Repository
public interface ErrorMessageMapper extends BaseMapper<ErrorMessage> {
}
