package com.loc.framework.autoconfigure.springmvc;

import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.zalando.problem.spring.web.advice.ProblemHandling;

/**
 * Created on 2017/12/6.
 */
@Configuration
@RestControllerAdvice
@ConditionalOnWebApplication
public class LocAdviceErrorAutoConfiguration implements ProblemHandling {

}
