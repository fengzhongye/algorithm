package io.github.dunwu.ds.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Zhang Peng
 * @date 2018-11-05
 */
public class PascalsTriangleTest {
    void printPascalsTriangle(List<List<Integer>> lists) {
        System.out.printf("【%d层杨辉三角】\n", lists.size());
        for (List<Integer> list : lists) {
            for (Integer num : list) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    @Test
    public void test() {
        List<List<Integer>> lists = PascalsTriangle.generate(5);
        printPascalsTriangle(lists);
    }
}
