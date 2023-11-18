package Framework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datadriven {

@DataProvider(name="login")
    public Object[][] TC_login(){
        Object[][] data=new Object[5][2];
        data[0][0]="user1";
        data[0][1]="Abcd@1234@1234@";
        data[1][0]="category1";
        data[1][1]="Abcd@1234@1234@";
        data[2][0]="category2";
        data[2][1]="Abcd@1234@1234@";
        data[3][0]="category3";
        data[3][1]="Abcd@1234@1234@";
        data[4][0]="category4";
        data[4][1]="Abcd@1234@1234@";
        return data;
    }

}
