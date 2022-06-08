class LeetCode {
    public static void main(String []args) {
        System.out.println("Hello World"); // prints Hello World

        System.out.println("deneme".charAt(5));

        System.out.println(romanToInt("roman"));

        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }


    public static int romanToInt(String roman){
        int lenght=roman.length();
        int result=0;
        for(int i=lenght-1;i>=0;i--){
            int k=i-1;
            if(roman.charAt(i)=='I'){
                result+=1;
            }
            else if(roman.charAt(i)=='V'){
                result+=5;
                if(k>=0){
                  if(roman.charAt(k)=='I'){
                      result-=1;
                      i--;
                  }
                }
            }
            else if(roman.charAt(i)=='X'){
                result+=10;
                if(k>=0){
                  if(roman.charAt(k)=='I'){
                      result-=1;
                      i--;
                  }
                  else if(roman.charAt(k)=='V'){
                      result-=5;
                      i--;
                  }
              }
            }
            else if(roman.charAt(i)=='L'){
                result+=50;
                if(k>=0){
                  if(roman.charAt(k)=='I'){
                      result-=1;
                      i--;
                  }
                  else if(roman.charAt(k)=='V'){
                      result-=5;
                      i--;
                  }
                  else if(roman.charAt(k)=='X'){
                      result-=10;
                      i--;
                  }
              }
            }
            else if(roman.charAt(i)=='C'){
                result+=100;
                if(k>=0){
                  if(roman.charAt(k)=='I'){
                      result-=1;
                      i--;
                  }
                  else if(roman.charAt(k)=='V'){
                      result-=5;
                      i--;
                  }
                  else if(roman.charAt(k)=='X'){
                      result-=10;
                      i--;
                  }
                  else if(roman.charAt(k)=='L'){
                      result-=50;
                      i--;
                  }
              }
            }
            else if(roman.charAt(i)=='D'){
                result+=500;
                if(k>=0){
                  if(roman.charAt(k)=='I'){
                      result-=1;
                      i--;
                  }
                  else if(roman.charAt(k)=='V'){
                      result-=5;
                      i--;
                  }
                  else if(roman.charAt(k)=='X'){
                      result-=10;
                      i--;
                  }
                  else if(roman.charAt(k)=='L'){
                      result-=50;
                      i--;
                  }
                  else if(roman.charAt(k)=='C'){
                      result-=100;
                      i--;
                  }
              }
            }
            else if(roman.charAt(i)=='M'){
                result+=1000;
                if(k>=0){
                  if(roman.charAt(k)=='I'){
                      result-=1;
                      i--;
                  }
                  else if(roman.charAt(k)=='V'){
                      result-=5;
                      i--;
                  }
                  else if(roman.charAt(k)=='X'){
                      result-=10;
                      i--;
                  }
                  else if(roman.charAt(k)=='L'){
                      result-=50;
                      i--;
                  }
                  else if(roman.charAt(k)=='C'){
                      result-=100;
                      i--;
                  }
                  else if(roman.charAt(k)=='D'){
                      result-=500;
                      i--;
                  }
              }
            }
            else{
                System.out.println("Not suitable for Roman to Int");
                return 0;
            }
        }
        return result;
    }
}
