package com.afkl.travel.exercise.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class TravelAspect {

    @Before("execution(* com.afkl.travel.exercise.controller.*.get*())")
    public void getAllAdvice(){
        System.out.println("Service method getter called");
    }
}
