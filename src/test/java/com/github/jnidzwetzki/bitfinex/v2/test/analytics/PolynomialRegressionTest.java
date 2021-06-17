package com.github.jnidzwetzki.bitfinex.v2.test.analytics;

import com.github.jnidzwetzki.bitfinex.v2.analytics.utils.PolynomialRegression;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class PolynomialRegressionTest
{
    @Test
    public void testPrediction()
    {
        double[] x = { 10, 20, 40, 80, 160, 200,32,17 };
        double[] y = { 100, 350, 1500, 6700, 20160, 40000,54211,1231 };
        PolynomialRegression regression = new PolynomialRegression(x, y, 5);

        // Use System.out.println() so that it works with either stdlib.jar or algs4.jar version
        System.out.println(regression);
        double prediction = regression.predict(32);
        System.out.println("prediction for 32: "+ prediction);
        assertNotEquals(0.0,prediction);
    }
}
