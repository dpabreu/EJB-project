package br.com.caelum.livraria.interceptador;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class LogInterceptador {
	
	@AroundInvoke
	public Object intercepta(InvocationContext context) throws Exception{
		
		Long millis = System.currentTimeMillis();
		
		Object obj = context.proceed();
		
		String classe = context.getTarget().getClass().getSimpleName();
		String metodo = context.getMethod().getName();
		
		System.out.println("Classe: " + classe +", " + "método: " + metodo);
		System.out.println("Tempo gasto: " + (System.currentTimeMillis() - millis));
		
		return obj;
	}

}
