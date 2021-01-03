package com.bin.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@TableName("vocabulary")
public class Vocabulary implements Serializable {

    /**
     * 单词顺序
     */
    private Integer wordRank;
    /**
     * 单词
     */
    private String headWord;

    /**
     * 单词书类型
     */
    private String type;

    /**
     * 自动生成创建时间
     */
    private Date createTime;

    /**
     * 自动生成修改时间
     */
    private Date updateTime;


    /*
    是否意味着 一对多关系 通过逻辑外键体现 一下字段就不必再表中建立了
    但是再我查询数据出来  封装成json的时候需要使用的
     */
    /**
     * 翻译
     * tranCn:中文
     * pos:词的类型
     * tranOther:英文翻译
     */
    private List<Translation> trans;
    /**
     * 例句
     */
    //private List<Map<String,String>> sentences;
    private List<Sentences> sentences;

}
