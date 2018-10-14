package cn.aptx4869.common.web.view;

import org.springframework.web.servlet.view.AbstractUrlBasedView;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

/**
 * 覆盖freemarker视图解析器，当不能解析时继续寻找其他视图解析器进行解析
 */
public class CustomFreemarkerViewResolver extends FreeMarkerViewResolver {
    @Override
    protected AbstractUrlBasedView buildView(String viewName) throws Exception {
        AbstractUrlBasedView abstractUrlBasedView = null;
        try{
            abstractUrlBasedView = super.buildView(viewName);
        } catch (Exception e){
            //异常时不做处理，继续寻找合适的视图解析器
        }
        return abstractUrlBasedView;
    }
}
