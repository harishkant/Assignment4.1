class Task6
{
    public void disp(char c)
    {
         System.out.println(c);
    }
    public void disp(char c, int num)  
    {
         System.out.println(c + " "+num);
    }
}
class Sample
{
   public static void main(String args[])
   {
       Task6 obj = new Task6();
       obj.disp('a');
       obj.disp('a',10);
   }
}