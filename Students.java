class Students
{
static  int a=1;  // if static is not there then output is 3 times 1.

Students()
{
System.out.println(a);
a++;
}

public static void main(String ar[])
{
Students s1 = new Students();
Students s2 = new Students();
Students s3 = new Students();

}
}