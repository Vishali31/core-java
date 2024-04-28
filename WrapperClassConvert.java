
     public class WrapperClassConvert {
    
    public Object convertToWrapper(Object input) {
        if (input == null) {
            return "Give proper primitive type as input";
        }
        
        if (input instanceof Integer) {
            return Integer.valueOf((int) input);
        }  else if (input instanceof Boolean) {
            return Boolean.valueOf((boolean)input);
        } else if (input instanceof Short) {
            return Short.valueOf((short)input);
        } else if (input instanceof Float) {
            return Float.valueOf((float)input);
        }else if (inputType.equals("byte")){ 
          System.out.println("Enter a byte value");
          byte inputValue = Scanner.nextByte();
          System.out.println("converted to Wrapper class: " +Converter.convertToWrapper(inputValue));
        }else if (inputType.equals("char")){ 
          System.out.println("Enter a character value");
          char inputValue = Scanner.next().charAt(0);
          System.out.println("converted to Wrapper class: " +Converter.convertToWrapper(inputValue));
         }else if (inputType.equals("Boolean")){ 
          System.out.println("Enter a Boolean value");
          boolean inputValue = Scanner.nextBoolean();
          System.out.println("converted to Wrapper class: " +converter.convertToWrapper(inputValue));
          }else {
            System.out.println("Give proper primitive type as input");
          }
         Scanner.close();
}
}

    
   