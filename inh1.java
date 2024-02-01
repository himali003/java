class SupCls
{
	SupCls()
	{
		System.out.println("SUPER CLASS");
	}
	void displ()
	{
		System.out.println("display() of super class");
		
	}
}
    class Sub extends SupCls
	{
		Sub()
		{
		System.out.println("sub class");
	}
		public static void main(String s1[])
		{
			Sub S=new Sub();
			S.displ();
		}
	}