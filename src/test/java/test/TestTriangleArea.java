package test;

import org.junit.Test;
import com.ocp.day19_exception.Calculator;
import org.junit.Assert;

// 測試 Calculator 裡的 
// public int triangleArea(int w, int h)
// 採用 3A 制
// 1. Arrange (安排待測物件)
// 2. Act (調用測試方法)
// 3. Assert (驗證是否符合預期結果)
public class TestTriangleArea {
    @Test
    public void test1() {
        // 1. Arrange (安排待測物件與相關參數)
        Calculator calculator = new Calculator();
        int w = 10; // 底(寬)
        int h = 5;  // 高
        int expected = 25; // 期望結果(自己算的)
        // 2. Act (調用測試方法)
        int actual = calculator.triangleArea(w, h); // 實際運算結果(電腦算的)
        // 3. Assert (驗證是否符合預期結果)
        Assert.assertEquals(expected, actual);
        
    }
}
