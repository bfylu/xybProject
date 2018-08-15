package com.xyb.ai.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.error.AbstractErrorController;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ErrorController extends AbstractErrorController {

	private static final String ERROR_PATH = "/error";
	Log log = LogFactory.getLog(ErrorController.class);
	
	@Autowired
    ObjectMapper objectMapper;
	public ErrorController() {
		super(new DefaultErrorAttributes());
	}

	@RequestMapping(ERROR_PATH)
	public void getErrorPath(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> model = Collections.unmodifiableMap(getErrorAttributes(
				request, false));
		Throwable cause =getCause(request);
		int status =  (Integer)model.get("status");
		//错误信息
		String message = (String)model.get("message");

		//后台打印日志信息方方便查错
		log.error(message, cause);
		response.setStatus(status);
		Map error = new HashMap();
		error.put("code", status);
		error.put("message", message);
		error.put("data", "");
		error.put("currentTime", System.currentTimeMillis());

		writeJson(response,error);
	}

	protected void writeJson(HttpServletResponse response, Map error){
		response.setContentType("application/json;charset=utf-8");
		try {
			response.getWriter().write(objectMapper.writeValueAsString(error));
		} catch (IOException e) {
			// ignore
		}
	}
	
	protected Throwable getCause(HttpServletRequest request) {
		Throwable error = (Throwable)request.getAttribute("javax.servlet.error.exception");
		if (error != null) {
			while (error instanceof ServletException && error.getCause() != null) {
				error = ((ServletException) error).getCause();
			}
		}
		return error;
	}

	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return null;
	}
}