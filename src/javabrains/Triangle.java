package javabrains;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

//import java.util.List;

public class Triangle implements ApplicationContextAware, BeanNameAware,InitializingBean,DisposableBean,Shape {

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private List<Point> points;
	private ApplicationContext context;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("My triangle :)");

		for (Point point : points) {
			System.out.println("Point = ( " + point.getX() + " , " + point.getY() + " )");
		}
		// System.out.println("Point A = ( "+ getPointA().getX()+" ,
		// "+getPointA().getY()+" )");
		// System.out.println("Point B = ( "+ getPointB().getX()+" ,
		// "+getPointB().getY()+" )");
		// System.out.println("Point C = ( "+ getPointC().getX()+" ,
		// "+getPointC().getY()+" )");

	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
	}

	@Override
	public void setBeanName(String beanName) {
//		System.out.println("Bean name is: " + beanName);
	}

	public void myInit() {
//		System.out.println("myInit method hehe");
	}
	public void cleanUp() {
//		System.out.println("Czyszczenie tego smietnika");
	}

	@Override
	public void destroy() throws Exception {
//		System.out.println("z interfejsu niszczenie  hehe");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
//		System.out.println("z interfejsu utworzenie");
		
	}

}
