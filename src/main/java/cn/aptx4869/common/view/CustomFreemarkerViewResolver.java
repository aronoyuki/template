package cn.aptx4869.common.view;

import org.springframework.web.servlet.view.AbstractUrlBasedView;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

/**
 * @author huy
 * @date 2018/10/8 16:36
 * @description
 */
public class CustomFreemarkerViewResolver extends FreeMarkerViewResolver {
    @Override
    protected AbstractUrlBasedView buildView(String viewName) throws Exception {
        AbstractUrlBasedView view = null;
        try {
            view = super.buildView(viewName);
        } catch (Exception e){

        }
        return view;
    }
}
