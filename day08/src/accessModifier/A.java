package accessModifier;

public class A {
	//필드
	public int var1;
	int var2;
	protected int var3;
	private int var4; //메소드로만 접근 가능
	
	//생성자
	public A() {
		super();
	}

	//게터, 세터 사용이유 : 데이터의 무결성을 지키기 위함
	//JSP파일에서 HTML내부에 자바문법을 사용하게 되고 자바쪽의 데이터를 가져올 때
	//직접 접근을 할 수 없고 메소드만 사용이 가능한다
	public int getVar4() {
		return var4;
	}

	public void setVar4(int var4) {
		this.var4 = var4;
	}
}










