package com.bookstore.demos.aspect_oriented_programming.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ShapeAspects {

	// @After("execution (void calculateArea())")
	// public void advice1() {
	// System.out.println("Advice 1 : calculateArea()");
	// }

	// @Before("execution (* calculate*())")
	// public void advice2x() {
	// System.out.println("Advice 2x : calculate()");
	// }

	// @Before("execution (* set*(*))")
	// public void advice2() {
	// System.out.println("Advice 2");
	// }

	// @After("execution(* calculateArea())")
	// public void advice3() {
	// System.out.println("Advice 3");
	// }

	@After("within (com.bookstore.demos.aspect_oriented_programming.model.Rectangle)||execution(* calculateArea())")
	public void advice4() {
		System.out.println("Advice 4");
	}

	@Pointcut("execution (* get*(*)) || execution (* set*(*))")
	public void gettersSettersAdvice() {
	}

	@Pointcut("within(com.demo.aspect_oriented_programming.model.Rectangle)")
	public void pointcut2() {
	}

	@Before("gettersSettersAdvice() || pointcut2()")
	public void advice5() {
		System.out.println("Advice 5");
	}













}
