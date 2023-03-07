package com.dice.weather.security;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Component
public class AuthFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        String key = httpRequest.getHeader("X-RapidAPI-Key");
        String host = httpRequest.getHeader("X-RapidAPI-Host");

        if (key == null || host == null) {
            httpResponse.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Auth error");
        }

        chain.doFilter(httpRequest, httpResponse);

    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
