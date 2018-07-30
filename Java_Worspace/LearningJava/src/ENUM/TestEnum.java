package ENUM;

public enum TestEnum {
//is the parametarised constants
	France("French","Paris"),
	Italy("ITalian","Rome"),
	UK("English","London");
	
	private String Capital;
	private String Language;
	
    
	private String getlanguage(){
    	return Language;
    }
    
    private String getCaptal(){
    	return Capital;
    }
	
	TestEnum(String Language,String Capital){
		this.Capital=Capital;
		this.Language=Language;
		
		
	}
	
}
