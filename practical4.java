public class pract4 {
// getbyte

        public static int getByte(int num)
        {
             int  ans;
             int temp;
           
           if(num>0){

            temp=num/128;
            if(temp%2==0)
          {
            ans =num%128;
          }
       else
        {
              ans =num%128-128;
        } 
                  }
                    else{
                        temp=num/128;
                       
                       if(temp%2==0)
                       {
                      ans =-num%128;
                       }
                      else
                       {
                        ans=num%128+128;
                       }
                         }
                     return ans;

                         }
         //getShort
         
          public static int getShort(int num)
{
   int  ans;
   int temp;
   if(num>0){

    temp=num/32768;
    if(temp%2==0)
  {
    ans =num%32768;
  }
   else
  {
    ans =num%32768-32768;
  } 
  }
  else{
     temp=num/32768;
     if(temp%2==0)
    {
      ans =-num%32768;
    }
    else
   {
     ans=num%32768+32768;
   }
   }
   return ans;

  }
  
  //getnumber
  
public static int getNumber(int num ,String s)
{
int ans ;
if( s.equalsIgnoreCase("Byte")
{
return getByte(int num);
}
else if(s.equalsIgnoreCase("Short")
{
return getShort(int num);
}
         return -1;
}
  // decimal to binary
    public static int decimalToBinary(int num) {
        int r;
        int b = 0;
        int base = 1;

        while (num > 0) {
            r = num % 2;
            num = num / 2;
            b = b + r * base;
            base = base * 10;
        }
        return b;
    }

    // decimal to hexa 
    public static String decimalToHex(int decimal) {
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        if (decimal == 0) {
            return "0";
        }

        StringBuilder hex = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % 16;
            hex.insert(0, hexChars[remainder]);
            decimal = decimal / 16;
        }

        return hex.toString();
    }

    //  Decimal to Octal
    public static int decimalToOctal(int num) {
        int r;
        int b = 0;
        int base = 1;

        while (num > 0) {
            r = num % 8;
            num = num / 8;
            b = b + r * base;
            base = base * 10;
        }
        return b;
    }

    //  Binary to Decimal
    public static int binaryToDecimal(int binary) {
        int r;
        int d = 0;
        int base = 1;
        while (binary > 0) {
            r = binary % 10;
            d = d + r * base;
            binary = binary / 10;
            base = base * 2;
        }
        return d;
    }

    //  Octal to Decimal
    public static int octalToDecimal(int octal) {
        int r;
        int d = 0;
        int base = 1;
        while (octal > 0) {
            r = octal % 10;
            d = d + r * base;
            octal = octal / 10;
            base = base * 8;
        }
        return d;
    }

    //  Hexadecimal to Decimal
    public static int hexToDecimal(String hex) {
        int decimal = 0;
        int length = hex.length();

        for (int i = 0; i < length; i++) {
            char hexChar = hex.charAt(i);
            int hexValue = 0;

            if (hexChar >= '0' && hexChar <= '9') {
                hexValue = hexChar - '0';  
            } else if (hexChar >= 'A' && hexChar <= 'F') {
                hexValue = hexChar - 'A' + 10; 
            } else if (hexChar >= 'a' && hexChar <= 'f') {
                hexValue = hexChar - 'a' + 10;  
            }

            decimal = decimal * 16 + hexValue;
        }

        return decimal;
    }

    //  Binary to Octal
    public static String binaryToOctal(int binary) {
        int decimal = binaryToDecimal(binary);
        return String.valueOf(decimalToOctal(decimal));
    }

    //  Binary to Hexadecimal
    public static String binaryToHex(int binary) {
        int decimal = binaryToDecimal(binary);
        return decimalToHex(decimal);
    }

    // Octal to Binary
    public static String octalToBinary(int octal) {
        int decimal = octalToDecimal(octal);
        return String.valueOf(decimalToBinary(decimal));
    }

    //  Octal to Hexadecimal
    public static String octalToHex(int octal) {
        int decimal = octalToDecimal(octal);
        return decimalToHex(decimal);
    }

    //  Hexadecimal to binary
    public static String hexToBinary(String hex) {
        int decimal = hexToDecimal(hex);
        return String.valueOf(decimalToBinary(decimal));
    }

    // Hexadecimal to Octal
    public static String hexToOctal(String hex) {
        int decimal = hexToDecimal(hex);
        return String.valueOf(decimalToOctal(decimal));
    }

    public static String toXXSystem(String num, String XX) {
        int decimalNum = 0;
        String result = "";

      
        if (num.startsWith("0b") || num.startsWith("0B")) {  
            num = num.substring(2); 
            decimalNum = binaryToDecimal(Integer.parseInt(num));
        } else if (num.startsWith("0x") || num.startsWith("0X")) { 
            num = num.substring(2);  
            decimalNum = hexToDecimal(num);
        } else if (num.startsWith("0") && num.length() > 1) { 
            num = num.substring(1);  
            decimalNum = octalToDecimal(Integer.parseInt(num));
        } else if (num.matches("[01]+")) {  
            decimalNum = binaryToDecimal(Integer.parseInt(num));
        } else if (num.matches("[0-9A-Fa-f]+")) {  
            decimalNum = hexToDecimal(num);
        } else {
            return "Invalid input";
        }

      
        switch (XX.toLowerCase()) {
            case "binary":
                result = String.valueOf(decimalToBinary(decimalNum));
                break;
            case "octal":
                result = String.valueOf(decimalToOctal(decimalNum));
                break;
            case "hex":
                result = decimalToHex(decimalNum);
                break;
            case "decimal":
                result = String.valueOf(decimalNum);
                break;
            default:
                result = "Invalid target system";
        }

        return result;
    }

  
        


