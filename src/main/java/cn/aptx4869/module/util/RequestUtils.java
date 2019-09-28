package cn.aptx4869.module.util;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author huy
 * @date 2019/2/19 16:03
 * @description 请求相关工具方法
 */
public class RequestUtils {
    /**
     * 判断请求是否为ajax请求
     * @param request
     * @return
     */
    public static boolean isAjaxRequest(HttpServletRequest request) {
        String requestProxy = request.getHeader("X-Requested-With");
        return org.springframework.util.StringUtils.hasText(requestProxy) && "XMLHttpRequest".equals(requestProxy);
    }

    /**
     * 获取当前请求
     * @return
     */
    public static HttpServletRequest getCurrentRequest() {
        try {
            if (!Thread.currentThread().getName().toLowerCase().contains("http")) {
                return null;
            }
            ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
            if (servletRequestAttributes != null) {
                return servletRequestAttributes.getRequest();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
