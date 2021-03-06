package com.lbl.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class MyFilter extends ZuulFilter {

    @Override
    public String filterType() {

        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        System.out.println("拦截器执行了");
        RequestContext context = RequestContext.getCurrentContext();
        String requestURI = context.getRequest().getRequestURI();

        if(requestURI.startsWith("/clas2")){
            /*拦截 去往 run方法*/
            return true;
        }
        return false;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext();
        currentContext.setSendZuulResponse(false);
        currentContext.setResponseStatusCode(401);
        HttpServletResponse response = currentContext.getResponse();
        response.setContentType("application/json;charset=utf-8");
        try {
            response.getWriter().write("{'message':'通过网关访问了clas2我给你拦截了'}");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }
}
