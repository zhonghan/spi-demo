package com.karl.spi;

/**
 * @author karl.zhong
 */
public class StrategyA implements Strategy {
    @Override
    public void apply() {
        System.out.println("StrategyA");
    }
}
