package com.bin.entity;


import lombok.Data;

import java.io.Serializable;
/*
无法直接封装  需要另一张表
使用主表的wordRank作为外键
 */
@Data
public class Translation implements Serializable {
    /*
    "trans":[
{
"tranCn":"结实的，固体的",
"descOther":"英释",
"pos":"adj",
"descCn":"中释",
"tranOther":"hard or firm, with a fixed shape, and not a liquid or gas"
},
{
"tranCn":" 固体",
"descOther":"英释",
"pos":"n",
"descCn":"中释",
"tranOther":"a firm object or substance that has a fixed shape, not a gas or liquid"
}
]
     */
    /**
     * 自动增长ID
     */
    private Integer id;
    /**
     * 中文翻译
     */
    private String tranCn;
    /**
     * 类型 n v vi。。
     */
    private String pos;
    /**
     * 英译
     */
    private String tranOther;


}
