package com.peter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;


/**
 * Create a simple String calculator with a method int Add(string numbers)
 * 
 * @author peter
 *
 */
public class StringCalculator {


  private static final String NEW_LINE_DELIMITER = "\n";
  public static final String MSG_NEGS_NOT_ALLOWED = "negatives not allowed";

  public int add(String inputNumbersString){    
    if(inputNumbersString.isEmpty()) return 0;
    
    String delimiter = StringCalculatorHelper.getDelimiter(inputNumbersString);
    
    if(!StringCalculatorHelper.isDefaultDelimiter(delimiter)){
      inputNumbersString = StringCalculatorHelper.removeDelimiterInfo(inputNumbersString);
    }
    
    String[] inputNumbers = inputNumbersString.replace(NEW_LINE_DELIMITER, delimiter).split(delimiter);
    
    List<String> invalidNumbers = StringCalculatorHelper.getInvalidNumbers(inputNumbers);
    if(!invalidNumbers.isEmpty()){
      throw new NumberFormatException(MSG_NEGS_NOT_ALLOWED + StringUtils.join(invalidNumbers));
    }
    
    Integer result = new Integer(0);
    
    for(String numberString: inputNumbers){
      Integer number = Integer.parseInt(numberString);
      result = result + number;
    }
    return result.intValue();
  }
  
  
}
