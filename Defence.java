class Army
{
void ar()
{
System.out.println("India has 3rd largest army in the world");
}
}

class Navy extends Army
{
void nav()
{
System.out.println("India has 7th largest Navy in the world");
}
}

class Airforce extends Army
{
void aif()
{
System.out.println("India has 4th largest Airforce in the world");
}
}

class Defence
{
public static void main(String ar[])
{
Navy n = new Navy();
Airforce a = new Airforce();
a.aif();
a.ar();
n.ar();
n.nav();
}
}

