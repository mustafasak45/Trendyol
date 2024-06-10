package base_url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class HcmBaseUrl {
    public static RequestSpecification spec;
    // bu class api testlerinde dinamik olarak base url çağırmak için kullanılacak
    //tırnak içine api base URL girilecek...
    public static void hcmSetup(){
        spec=new RequestSpecBuilder().setBaseUri("").build();
    }

}
