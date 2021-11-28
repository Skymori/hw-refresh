package hw13.defaults;

import hw13.entity.Company;

public class DefaultCompany {
    public static Company createDefaultCompany(){
        Company company = new Company();
        company.setName("CompanyName");
        company.setCatchPhrase("Phrase to Phrase");
        company.setBs("Bs to Bs");
        return company;
    }
}
