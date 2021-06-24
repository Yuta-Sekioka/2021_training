package jp.co.aforce.study;

public class Animal {

	//名前と年齢
	private String name;
	private int age;
	
	
	//名前を設定する
	void setName(String name) {
		this.name=name;
	}
	
	//年齢を設定
	void setAge(int age) {
		this.age=age;
	}
	
	//情報を表示するメソッド
	void showProfile() {
		System.out.println("名前は"+this.name+"、年齢は"+this.age+"才です");
	}
	
}
