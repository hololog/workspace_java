package access_modifier2;

import access_modifier.ParentClass;

public class OtherPackageChildClass extends ParentClass {
	public void useMember() {
		publicVar = 10;
		protectedVar = 20;
		
		ParentClass p = new ParentClass();
		p.publicVar = 10;
//		p.protectedVar = 20;
		
	
	}
	
}
