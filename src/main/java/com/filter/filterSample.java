package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class filterSample implements Filter {

	private static final Logger log = LoggerFactory.getLogger(filterSample.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.Filter#destroy()
	 */
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		log.debug("destroy");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest,
	 * javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		log.debug("befor chain.doFilter");// 컨트롤 작동전 처리
		chain.doFilter(req, res);// 컨트롤 작동
		log.debug("after chain.doFilter");// 컨트롤 작동후 처리
	}

	/*
	 * 웹xml 파일 불러올시 작동
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
	 */
	@Override
	public void init(FilterConfig cfg) throws ServletException {
		// TODO Auto-generated method stub

		log.debug("init:{}", cfg.getFilterName());
	}

}
