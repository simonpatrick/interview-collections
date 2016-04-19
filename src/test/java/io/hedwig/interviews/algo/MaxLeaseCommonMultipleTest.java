package io.hedwig.interviews.algo;

import static com.google.common.base.CharMatcher.is;
import static org.junit.Assert.*;

/**
 * Created by patrick on 16/4/19.
 */

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by patrick on 16/4/19.
 */
public class MaxLeaseCommonMultipleTest {

    private MaxLeaseCommonMultiple commonMultiple;

    @Test
    public void testLeaseCommonMultiple() throws Exception {
        assertEquals("check list",commonMultiple.primeSplit(14), Lists.newArrayList(2,7));
    }

    @Test
    public void testPrimeSplit() throws Exception {

    }

    @Before
    public void setUp() throws Exception {
        commonMultiple = new MaxLeaseCommonMultiple();
    }
}