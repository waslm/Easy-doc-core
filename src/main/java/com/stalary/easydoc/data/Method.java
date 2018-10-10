/**
 * @(#)Method.java, 2018-09-25.
 * <p>
 * Copyright 2018 Stalary.
 */
package com.stalary.easydoc.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * Method
 * 方法
 * @author lirongqian
 * @since 2018/09/25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class Method {

    /** 方法名称 **/
    private String name;

    /** 请求路径 **/
    private String path;

    /** 请求类型(get,post,put,delete...) **/
    private String type;

    /** 方法介绍 **/
    private String description;

    /** 参数map，key代表参数名称，value默认为"" **/
    private Map<String, String> paramMap;

    /** 返回map，key代表code，value代表返回的描述 **/
    private Map<String, String> returnMap;

    /** 可能抛出的异常 **/
    private Map<String, String> throwsMap;

    /** post方法中的body **/
    private Model body;

    /** 代表方法是否已经被弃置 **/
    @Builder.Default
    private boolean deprecated = false;
}