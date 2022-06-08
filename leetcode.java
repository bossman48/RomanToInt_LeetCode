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

        //get lenght of string
        int lenght=roman.length();
        int result=0;

        //using for from higher to lower
        for(int i=lenght-1;i>=0;i--){

            //check minus index
            int k=i-1;
            
            //check I
            if(roman.charAt(i)=='I'){
                result+=1;
            }

            //check V
            else if(roman.charAt(i)=='V'){
                result+=5;

                //check minus value
                if(k>=0){
                  if(roman.charAt(k)=='I'){
                      result-=1;
                      i--;
                  }
                }
            }

            //check X
            else if(roman.charAt(i)=='X'){
                result+=10;

                //check minus value
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

            //check L
            else if(roman.charAt(i)=='L'){
                result+=50;

                //check minus value
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

            //check C
            else if(roman.charAt(i)=='C'){
                result+=100;

                //check minus value
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

            //check D
            else if(roman.charAt(i)=='D'){
                result+=500;

                //check minus value
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

            //check M
            else if(roman.charAt(i)=='M'){
                result+=1000;

                //check minus value
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
