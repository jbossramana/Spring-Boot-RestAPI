package demo;

import java.util.List;


import org.springframework.beans.factory.annotation.Value;

public class CollectionsBean {

	@Value("#{'${namelist}'.split(',')}")
    public List<String> namelist;

    public void printNameList() {
        System.out.println(namelist);
    }
}