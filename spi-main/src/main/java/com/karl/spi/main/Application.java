package com.karl.spi.main;

import com.karl.spi.Strategy;

import java.util.ServiceLoader;

/**
 * @author karl.zhong
 */
public class Application {
	public static void main(String[] args) {
		ServiceLoader<Strategy> serviceLoader = ServiceLoader.load(Strategy.class);
		serviceLoader.forEach(Strategy::apply);
	}
}
