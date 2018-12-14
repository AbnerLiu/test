package com.lsy.demo;

import com.lsy.demo.entity.Article;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {
        Article article1 = new Article("hello1", "liusy006", new ArrayList<String>(Arrays.asList("Java", "Python", "C++", "C#")));
        Article article2 = new Article("hello2", "liusy006", new ArrayList<String>(Arrays.asList("sha", "sdi", "sdaer3w", "dasda#")));
        Article article3 = new Article("hello3", "liusy006", new ArrayList<String>(Arrays.asList("dadsa", "erw", "3223", "fd#")));
        Test test = new Test();
        Optional<Article> optionalArticle = Optional.of(article1);
        optionalArticle.ifPresent((value)->{
            System.out.println(value.getTags());
        });

        System.out.println(optionalArticle.toString());
        Supplier<Article> supplier = Article::new;
        Article article4 = supplier.get();
        System.out.println(article4.getAuthor());
    }

    public Optional<Article> getFirstJavaArticle(List<Article> articles) {
        return articles.stream()
            .filter(article -> article.getTags().contains("Java"))
            .findFirst();
    }

}
