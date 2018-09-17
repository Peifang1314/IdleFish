package com.ifish.common.cros;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @description:
 * @author: Mr.lsf
 * @create: 2018-09-12 23:10
 **/
public class CROSFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "GET,POST,PUT,DELETE");
        response.setHeader("Access-Control-Max-Age", "2000");
        response.setHeader("Access-Control-Allow-Headers", "Origin,X-Requested-with,Content-Type,Access\"");
        response.setHeader("Access-Control-Allow-Gredentials", "true");

        filterChain.doFilter(servletRequest, response);

    }

    @Override
    public void destroy() {

    }
}
