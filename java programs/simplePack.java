import simplePack.Nation;
class packageDemo
{    public static void main(String args[]) 
	{   Nation asia[]=new Nation[3];
		asia[0]=new Nation("India",1393409038);
		asia[1]=new Nation("Japan",126050804);
		asia[2]=new Nation("South Korea",51305186);
	for(int a=0;a<3;a++)
	    asia[a].display();
	}   
}