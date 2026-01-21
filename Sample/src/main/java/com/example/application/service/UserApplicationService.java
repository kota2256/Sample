package com.example.application.service;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class UserApplicationService {

	/** 性別Map生成 */
	public Map<String, Integer> getGenderMap(){
		Map<String, Integer> genderMap = new LinkedHashMap<>();	//HashMap：速いが順番不定、LinkedHashMap：順番保持、TreeMap：キーで自動ソート
		genderMap.put("男性", 1);
		genderMap.put("女性", 2);
		return genderMap;
	}
}
