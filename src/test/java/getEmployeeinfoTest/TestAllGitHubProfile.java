package getEmployeeinfoTest;

import employeeinfo.GitHubAPI;
import org.junit.Test;

public class TestAllGitHubProfile extends GitHubAPI {

    @Test
    public void getFirstUserAPI(){
        getfirstUser();
    }

    @Test
    public void getSecendUserAPI(){


        getSeconduser();
    }
}
