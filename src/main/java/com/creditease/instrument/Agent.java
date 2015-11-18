package com.creditease.instrument;

import java.lang.instrument.Instrumentation;

//import java.lang.instrument.Instrumentation;

public class Agent {

	public static void premain(String args, Instrumentation inst){
		System.out.println("hi I am agent");
		inst.addTransformer(new MonitorTransformer());
	}
}
