

import math.MathOps;

public class CalcLogic{

    public static double dataConvertToDouble(int datatype, String textField){
        double x=0;
        
        if(datatype == 0){x=Double.parseDouble(textField);
          }else if(datatype == 1){ x = Double.parseDouble(textField);
            }else if(datatype== 2){ x = (double)MathOps.stringToOctalInt(textField);
              }else if(datatype == 3){ x = (double)MathOps.stringToBinaryInt(textField);
                }else if(datatype == 4){ x = (double)MathOps.stringToHexInt(textField);
                }
        return x;
      }

    public static String resultsToSlectedDataType(int datatype, double value){
        String result = "";
        
        if(datatype == 0){result = String.valueOf(MathOps.doubleToInt(value));
        }else if(datatype == 1){result = String.valueOf(value);
          }else if(datatype == 2){result = MathOps.toOctalString(MathOps.doubleToInt(value));
            }else if(datatype == 3){result = MathOps.toBinaryString(MathOps.doubleToInt(value));
              }else if(datatype == 4){result = MathOps.toHexString(MathOps.doubleToInt(value));
              }
              
        return result;
    }




}