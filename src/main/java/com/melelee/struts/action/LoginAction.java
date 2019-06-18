package com.melelee.struts.action;

import com.melelee.struts.form.LoginForm;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by melelee on 2019/6/18.
 */
public class LoginAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        LoginForm loginForm = (LoginForm) form;
        System.out.println("用户名=" + loginForm.getUsername());
        System.out.println("密码=" + loginForm.getPassword());
        // 简单验证
        if ("123".equals(loginForm.getPassword())) {
            // 如果用户密码为123，则为合法
            return mapping.findForward("success");
        } else {
            return mapping.findForward("error");
        }
    }
}
