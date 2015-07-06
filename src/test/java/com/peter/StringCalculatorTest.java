package com.peter;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class StringCalculatorTest {
  private StringCalculator stringCalculator;
  private String input;
  private int expected;

  @Before
  public void setUp() throws Exception {
    stringCalculator = new StringCalculator();
  }

  public StringCalculatorTest(String input, int expected) {
    this.input = input;
    this.expected = expected;
  }

  @Parameters
  public static Collection<Object[]> data() {
    return Arrays.asList(new Object[][] { { "", 0 }, { "1", 1 }, { "1,2", 3 }, { "1,6,12,456", 475 },{ "1,6\n12,456", 475 },{ "//;\n1;6\n12;456", 475 } });
  }

  @Test
  public void test() {
    int result = stringCalculator.add(input);
    assertEquals(expected, result);
  }

}
