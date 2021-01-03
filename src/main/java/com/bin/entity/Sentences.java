package com.bin.entity;

import lombok.Data;

@Data
public class Sentences {
    /**
     * 主键自增
     */
    private Integer id;
    /**
     * 英文例句
     */
    private String sContent;
    /**
     * 中文例句翻译
     */
    private String sCn;

    //逻辑外键  wordRank
}
