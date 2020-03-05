package entity;

import java.io.Serializable;

public class Subject implements Serializable{

private String title;
private int hours;

public Subject() {
}

public String getTitle() {
return title;
}

public void setTitle(String title) {
this.title = title;
}

public int getHours() {
return hours;
}

public void setHours(int hours) {
this.hours = hours;
}

@Override
public String toString() {
return "Subject{" + "title=" + title + ", hours=" + hours + '}';
}


}