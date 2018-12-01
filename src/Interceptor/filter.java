package Interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class filter extends MethodFilterInterceptor{
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		//获得ActionContext
		ActionContext context=invocation.getInvocationContext();
		Object user=context.getSession().get("user");
		if(user!=null){
			return invocation.invoke();
		}
		else {
			return "error";
		}
	}
}
