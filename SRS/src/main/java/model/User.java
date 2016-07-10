package model;

public  class User {
	//------------
	// Attributes.
	//------------

	private String ssn;
	private String password;
	public User(String ssn, String password) {
		this.setSsn(ssn);
		this.setPassword(password);
		
	}

        public User() {
        	this.setSsn("???-??-????");
		    this.setPassword("?");
		
        }

		public void setSsn(String s) {
			ssn = s;
    	}
	
	   public String getSsn() {
		return ssn;
	   }
	
	   public void setPassword(String p) {
		password = p;
	   }
	
	   public String getPassword() {
		return password;
	}
	
}