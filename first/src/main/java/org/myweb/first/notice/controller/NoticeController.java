package org.myweb.first.notice.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.myweb.first.notice.model.dto.Notice;
import org.myweb.first.notice.model.service.NoticeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NoticeController {
	private static final Logger logger = LoggerFactory.getLogger(NoticeController.class);

	@Autowired
	private NoticeService noticeService;

	// 요청 처리용 메소드 -----------------------------------------
	@RequestMapping(value = "ntop3.do", method = RequestMethod.POST)
	@ResponseBody
	public String noticeNewTop3Method(
			HttpServletResponse response) throws UnsupportedEncodingException {
		// ajax 요청시 리턴방법은 여러가지가 있음 (문자열, json 객체 등)
		// json 객체를 response 객체 이용시 2가지중 선택 가능
		// 방법1 : 출력스트림을 따로 생성해서 응답하는 방법 -> public void 로 지정
		// 방법2 : 뷰리졸버로 리턴해서 등록된 JSONView 가 내보내는 방법 (servlet-context.xml 에 등록)
		// public String 으로 지정

		// 최근 등록된 공지글 3개 조회 요청함
		ArrayList<Notice> list = noticeService.selectTop3();

		// 내보낼 값에 대해 response 에 mimiType 설정
		response.setContentType("application/json; charset=utf-8");

		// 리턴된 list 를 json 배열에 옮겨 기록하기
		JSONArray jarr = new JSONArray();

		for (Notice notice : list) {
			// notice 값들을 저장할 json 객체 생성
			JSONObject job = new JSONObject(); // org.json.simple.JSONObject 임포트함

			job.put("no", notice.getNoticeNo());
			// 문자열값에 한글이 포함되어 있다면, 반드시 인코딩해서 저장해야 함
			// java.net.URLEncoder 의 static 메소드인 encode('한글이있는문자열값', '문자셋') 사용함
			job.put("title", URLEncoder.encode(notice.getNoticeTitle(), "utf-8"));			
			// 날짜데이터는 반드시 문자열로 바꿔서 저장할 것 : 날짜 그대로 저장하면 뷰에서 json 전체 출력 안 됨
			job.put("date", notice.getNoticeDate().toString());

			jarr.add(job); // 배열에 추가
		} // for each

		// 전송용 json 객체 생성함
		JSONObject sendJson = new JSONObject();
		// 전송용 json 에 jarr 을 저장함
		sendJson.put("nlist", jarr);

		return sendJson.toJSONString();
	}
}
