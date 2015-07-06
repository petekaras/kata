package com.peter;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorHelperTest {


  @Test
  public void shouldGetDefaultDelimiter() {
    String result = StringCalculatorHelper.getDelimiter("1,6,12,456");
    assertEquals(",", result);
  }
  
  @Test
  public void shouldGetDelimiter() {
    String result = StringCalculatorHelper.getDelimiter("//;\n1;6\n12;456");
    assertEquals(";", result);
  }
  
  @Test
  public void shouldStripDelimiterInfo() {
    String result = StringCalculatorHelper.removeDelimiterInfo("//;\n1;6\n12;456");
    assertEquals("1;6\n12;456", result);
  }
  
  @Test
  public void shouldIdentifyDelimiter(){
    boolean result = StringCalculatorHelper.isDefaultDelimiter(StringCalculatorHelper.DEFAULT_NUMBER_DELIMITER);
    assertEquals(true, result);
  }
  
  @Test
  public void shouldNotIdentifyDelimiter(){
    boolean result = StringCalculatorHelper.isDefaultDelimiter(";");
    assertEquals(false, result);
  }
  
  @Test
  public void shouldValidateNumberList(){
    List<String> invalidNumbers = StringCalculatorHelper.getInvalidNumbers(new String[]{"1","2","5"});
    assertEquals(0, invalidNumbers.size());
  }
  
  @Test
  public void shouldNotValidateNumberList(){
    List<String> invalidNumbers = StringCalculatorHelper.getInvalidNumbers(new String[]{"1","-2","5"});
    assertEquals(1, invalidNumbers.size());
  }
  
  @Test
  public void shouldGetRightInvalidNumber(){
    List<String> invalidNumbers = StringCalculatorHelper.getInvalidNumbers(new String[]{"1","-2","5"});
    assertEquals("-2", invalidNumbers.get(0));
  }

}
