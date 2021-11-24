class Cookie {
  int cookies;
  int temp;
  int mins;
  boolean baked;

  Cookie(){
  int cookies = 0;
  int temp = 0;
  int mins = 0;
  boolean baked = false;
  }
  Cookie(int aCookies, int aTemp, int aMins){
    cookies = aCookies;
    temp = aTemp;
    mins = aMins;
    boolean baked = false;
  }
  boolean isBaked(){
    return baked;
  }
  void setCookies(int numCookies){
    cookies = numCookies;
  }
  void bakeCookies(int bTemp, int bMins){
    baked = true;
    temp = bTemp;
    mins = bMins;
    System.out.println(cookies + " were baked at " +    temp + " degrees for " + mins + " minutes");
    

  }
}