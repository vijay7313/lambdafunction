package com.aws.controller;

public class User {
	 public User(String name, String email) {
			// TODO Auto-generated constructor stub
			this.name=name;
			this.emailAddress=email;
		}
		private String name;
		private String emailAddress;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public String getEmailAddress() {
			return emailAddress;
		}
		public void setEmailAddress(String emailAddress) {
			this.emailAddress = emailAddress;
		}
	}
