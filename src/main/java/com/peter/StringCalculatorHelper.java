package com.peter;

import java.util.ArrayList;
import java.util.List;

/**
 * Utilities to help process lines...
 * @author peter
 *
 */
public class StringCalculatorHelper {
  public static final String DEFAULT_NUMBER_DELIMITER = ",";
  public static final String DIFFERENT_DELIMITER_MARKER = "//";
  
  public static String getDelimiter(final String line){
    if(!line.startsWith(DIFFERENT_DELIMITER_MARKER)) return DEFAULT_NUMBER_DELIMITER;
    return line.substring(2, 3);
  }
  
  public static String removeDelimiterInfo(final String line){
    return line.substring(4, line.length());
  }
  
  public static boolean isDefaultDelimiter(final String delimiter){
    return delimiter.equalsIgnoreCase(DEFAULT_NUMBER_DELIMITER);
  }
  
  public static List getInvalidNumbers(final String[] numbers){
    List<String> invalidNumbers = new ArrayList<String>();
    
    for(String number : numbers){
      if(number.contains("-")){
        invalidNumbers.add(number);
      }
    }
   return invalidNumbers;
  }
  

}
