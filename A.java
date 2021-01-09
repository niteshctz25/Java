class A implements Runnable
{
public void run()
{
for(int i=1;i<=4;i++)
{
try
{
Thread.sleep(800);
System.out.println(i+" "+Thread.currentThread().getName());
}
catch(Exception e)
{
System.out.println(e);
}
//System.out.println(i+" "+Thread.currentThread().getName());
//System.out.println(i+" "+Thread.currentThread().getPriority());
}
}
public static void main(String arg[])
{
A ob = new A();
Thread t = new Thread(ob);
Thread t1 = new Thread(ob);
Thread t2 = new Thread(ob);
t1.setPriority(Thread.MAX_PRIORITY);
t.setPriority(Thread.MIN_PRIORITY);
t2.setPriority(Thread.NORM_PRIORITY);
t.start();
try
{
t.join();
}
catch(Exception e)
{
System.out.println(e);
}
t1.start();
t2.start();
}
}
