package com.kipper.museumchatbot.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class FaqAnswer {
	
    private List<String> keywords;
    
    private String answer;
    
     public FaqAnswer(List<String> keywords , String answer ) {
    	 
    	 this.answer = answer;
    	 this.keywords = keywords;
    	 
     }
    
	public List<String> getKeywords() {
		return keywords;
	}
	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}
	public String getAnswers() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
    
    
    
}
