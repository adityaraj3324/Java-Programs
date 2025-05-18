package interfaces;

	interface A {
	    void show();
	}

	class B {
	    void show2() {
	        System.out.println("B class method");
	    }
	}

	class C extends B implements A {
	    public void show() {
	        System.out.println("interface");
	    }
	}

	public class InterfaceAdvanceConcept {
	    public static void main(String[] args) {
	        C p=new C();
	        p.show();
	        p.show2();
	    }
	}
