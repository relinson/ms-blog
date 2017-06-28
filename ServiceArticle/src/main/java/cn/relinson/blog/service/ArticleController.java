package cn.relinson.blog.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {

	@Value("${article.default.title}")
	String author;

	@Value("${article.default.mail}")
	String mail;

	@Value("${article.default.title}")
	String title;

	@RequestMapping("/hello")
	public String index() {
		return "hello world " + author + "/" + mail + "/" + title;
	}
}
