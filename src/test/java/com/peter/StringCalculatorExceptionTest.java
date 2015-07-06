package com.peter;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StringCalculatorExceptionTest {
  StringCalculator stringCalculator;
  @Before
  public void setUp() throws Exception {
    stringCalculator = new StringCalculator();
  }
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void shouldReportOneInvalidNumber() {
    thrown.expect(NumberFormatException.class);
    thrown.expectMessage(StringCalculator.MSG_NEGS_NOT_ALLOWED + "[-4]");
    stringCalculator.add("45,67,-4,3");

  }
  
  @Test
  public void shouldReportThreeInvalidNumber() {
    thrown.expect(NumberFormatException.class);
    thrown.expectMessage(StringCalculator.MSG_NEGS_NOT_ALLOWED + "[-67, -4, -4]");
    stringCalculator.add("45,-67,-4,3,5,12,-4");

  }

}
