package com.sweet.utils;

import lombok.Data;

@Data
public class BlogKeyword {
    private String keyword;

    private Integer number;

    public static BlogKeyword getInstance(String keyword,int number) {
        BlogKeyword blogKeyword = new BlogKeyword();
        blogKeyword.setKeyword(keyword);
        blogKeyword.setNumber(number);
        return blogKeyword;
    }
}
