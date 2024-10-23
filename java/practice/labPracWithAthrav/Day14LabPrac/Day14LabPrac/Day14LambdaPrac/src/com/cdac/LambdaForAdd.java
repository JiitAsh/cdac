package com.cdac;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoublePredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaForAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=4;
		Operation<Integer> add=(x, y)->x+y;
		Integer sum=add.operate(a, b);
		System.out.println(sum);
		
		// Function
		// R 	apply​(T t)
		Function<Integer, Integer> fc = (val) -> val*10;
		System.out.println(fc.apply(a));
		
		//BiFunction
		// R 	apply​(T t, U u)
		BiFunction<Integer, Integer, Integer> bf = (val1, val2) -> val1*val2;
		System.out.println(bf.apply(a,b));
		
		
		//Predicate
		//boolean 	test​(T t)
		Predicate<Float> p = (t) -> t%2==0;
		System.out.println(p.test(a+0.5f));
		
		
		
		//DoublePredicate
		//boolean test​(double value)
//		DoublePredicate<double> dc = (t) -> t%2==0;   // no need to pass double as data type 
//		System.out.println(dc.test(a+0.5));
		
		DoublePredicate dp = (t) -> t%2==0;
		System.out.println(dp.test(a+0.5));
		
		/***********Consumer practice from here*************/
		//Consumer
		//void 	accept​(T t)
		// with system.out.println()
		Consumer<Integer> cc = (t) -> System.out.println(t);
		cc.accept(a);
		
		// to check that passing will change or not
		Consumer<Integer> cc1 = (t) -> t += 2000;
		int tval = 3200;
		cc1.accept(tval);
		System.out.println(tval);  // no change
		
		// with block
		Consumer<Integer> cc2 = (t) -> {
			
			System.out.println(t);
			t=t*2;
			System.out.println(t);
			System.out.println("hello");
			System.out.println("world");
		};  // block will be executed but the variables are local to block so changes won't be reflected outside
		Integer tval1 = 3403;
		cc2.accept(tval1);
		System.out.println(tval1);
		
		
		//with StringBuilder  // change will be reflect outside
		StringBuilder sb = new StringBuilder("Lambda :(");
		Consumer<StringBuilder> lsb = (t) -> t = t.append(" Hello");
		lsb.accept(sb);  // now sb will be change
		System.out.println(sb);  
		
		
		
	}

}
