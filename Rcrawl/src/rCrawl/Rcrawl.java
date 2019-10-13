package rCrawl;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;


public class Rcrawl {

	static String BASE_URL_F=
			"https://search.naver.com/search.naver?&where=news&query=Bigdata&start=";
	static String BASE_URL_B="&refresh_start=0";
	static int BASE_URL_PAGE=1;
	static String COMPLETE_URL= BASE_URL_F + BASE_URL_PAGE+BASE_URL_B;
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Document doc=Jsoup.connect("https://news.naver.com/main/read.nhn?").get();
		
		Elements body = doc.select("div#articleBodyContents");
		Elements title = doc.select("h3#articleTitle");
		
		String str = body.text();
		System.out.println("본문 : "+ str);
		System.out.println("제목 : "+ title.text());
		
		
	}

}
