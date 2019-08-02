package com.karl.spi;


/**
 * @author karl.zhong
 */
public class StrategyB implements Strategy {
    @Override
    public void apply() {
        System.out.println("StrategyB");
    }
}
