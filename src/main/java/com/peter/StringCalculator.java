package com.peter;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a simple String calculator with a method int Add(string numbers)
 * 
 * @author peter
 *
 */
public class StringCalculator {

  public int add(String inputNumbersString){
    if(inputNumbersString.isEmpty()) return 0;
    String[] inputNumbers = inputNumbersString.split(",");
    
    Integer result = new Integer(0);
    
    for(String numberString: inputNumbers){
      Integer number = Integer.parseInt(numberString);
      result = result + number;
    }
    return result.intValue();
  }
}
