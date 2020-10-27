
public class Rating {
private int id ;
private  char name ;
private String desc ;
private String  value ;

public Rating() {
	
}



public Rating(int id, char name, String desc, String value) {
	super();
	this.id = id;
	this.name = name;
	this.desc = desc;
	this.value = value;
}



public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public char getName() {
	return name;
}
public void setName(char name) {
	this.name = name;
}
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
public String getValue() {
	return value;
}
public void setValue(String value) {
	this.value = value;
}


}
