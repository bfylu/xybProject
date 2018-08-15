package com.xyb.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 所有控制器的父类
 */
public abstract class BaseController {
    protected final Logger log = LoggerFactory.getLogger(getClass());
}