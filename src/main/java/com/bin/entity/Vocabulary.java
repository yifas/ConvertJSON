package com.bin.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Data
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
     * 翻译
     * tranCn:中文
     * pos:词的类型
     * tranOther:英文翻译
     */
    private List<Translation> trans;
    /**
     * 例句
     */
    private List<Map<String,String>> sentences;


}
