package projetJava;

public class Agency {
    public Agency(String bankName, String bankCode, String agencyName, String agencyCode){
        if(bankName.isEmpty()){ // NullPointer inclus
            throw new IllegalArgumentException("bankName can't be empty");
	}
	if(bankCode.isEmpty()){
            throw new IllegalArgumentException("bankCode can't be empty");
        }
	if(agencyName.isEmpty()){
            throw new IllegalArgumentException("agencyName");
	}
	if(agencyCode.isEmpty()){
            throw new IllegalArgumentException("agencyCode");
	}
        
        this.bankName = bankName;
        this.bankCode = bankCode;
        this.agencyName = agencyName;
        this.agencyCode = agencyCode;
    }
    
    public String getBankName(){
        return this.bankName;
    }
    
    public String getBankCode(){
        return this.bankCode;
    }
    
    public String getAgencyName(){
        return this.agencyName;
    }
    
    public String getAgencyCode(){
        return this.agencyCode;
    }
    
    /*public createBank(){
        //add in Bdd
    }*/
    
    /*public createAgency(){
        //add in Bdd
    }*/
    
    private String bankName, bankCode, agencyName, agencyCode;
}