package com.atguigu.pay.strategy.impl;

import com.atguigu.pay.model.OrderInfo;
import com.atguigu.pay.strategy.PayStrategy;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author lfy
 * @Description
 * @create 2022-12-29 21:17
 */
@Component
public class VisaStrategy implements PayStrategy {
    @Override
    public boolean supports(String type) {
        return "visa".equalsIgnoreCase(type);
    }

    @Override
    public String cashierPage(OrderInfo orderInfo) {
        return "Visa 收银台";
    }

    @Override
    public boolean checkSign(HttpServletRequest request, String body) {
        return true;
    }

    @Override
    public Object signError() {
        return null;
    }

    @Override
    public Object signOk() {
        return null;
    }

    @Override
    public Map<String, Object> process(HttpServletRequest request, String body) {
        return null;
    }
}
