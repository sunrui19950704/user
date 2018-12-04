package cn.bdqn.tangcco.sun.aop;


import org.aspectj.lang.JoinPoint;

import java.util.Arrays;
import java.util.logging.Logger;

public class aopController {

    private final Logger logger=Logger.getLogger("aopController");
    //打印入参参数的逻辑
    public void before(JoinPoint joinPoint){
        //joinPoint.getTarget();//获取目标对象
        //joinPoint.getSignature();//获取方法
        //joinPoint.getArgs();//获取方法入参
        logger.info("$$$$$$$$$调用了$$$$$$$$$"+ joinPoint.getTarget()+"类的"+
                joinPoint.getSignature().getName()+"方法"+",入参:"+
                Arrays.toString(joinPoint.getArgs()));

    }
    //打印返回阐述的逻辑
    public void after(JoinPoint joinPoint, Object result){

        logger.info("$$$$$$$$$调用了$$$$$$$$$"+joinPoint.getTarget()+"类的"+
                joinPoint.getSignature().getName()+"方法,返回"+result);

    }






}
