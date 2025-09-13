package demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CollectionsBean {

    @Autowired
    @Qualifier("list1")
    private List<String> nameList;
    
    
    @Autowired
    @Qualifier("list2")
    private List<String> nameList2;
    
    @Autowired
    Account account;

    public void printNameList() {
        System.out.println(nameList);
        System.out.println("Account balance : " + account.getAmount());
    }
}