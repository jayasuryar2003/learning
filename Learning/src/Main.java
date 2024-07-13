class Main{
   int num;
   static int lastNum=100;

    @Override
    public int hashCode() {
        return num;
    }

    Main(){
       this.num=lastNum;
       lastNum++;
   }

    @Override
    public boolean equals(Object obj) {
        return this.num==((Main)obj).num;
    }

    public static void main(String[] args) {
      Main obj=new Main();
        System.out.println(obj);
      Main obj1=new Main();
        System.out.println(obj1);
    }
}