package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.spi.STEUtil;

@RestController

public class HomeController {

	String[] names = { "tuyono", "hanako", "taro", "sachiko", "ichiro" };

	String[] mails = { "tuyono.com", "hanako@flower", "taro@yamada", "sachiko@happy", "ichiro@baseball" };

	@RequestMapping("/{id}")
	public Dataobject index(@PathVariable int id) {
		return new Dataobject(id, names[id], mails[id]);
	}

	class Dataobject {
		// privateは、外部のクラスから値を変更できないように、アクセスの宣言している
		private int id;
		private String name;
		private String value;

		public Dataobject(int id, String name, String value) {
			// superは親クラスのコンストラクタ
			super();
			this.id = id;
			this.name = name;
			this.value = value;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}
}
