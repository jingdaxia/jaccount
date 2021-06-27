package com.jcy.common.annotation;

import com.jcy.common.configuration.CommonConfiger;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import(CommonConfiger.class)
public @interface EnableJcyCommon {
}
