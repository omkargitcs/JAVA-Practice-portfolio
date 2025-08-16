interface Sanitation_Mapper{
	void collectData(String area);
	void generateReport();
}

class SanitationMapper_interface implements Sanitation_Mapper{
	private String lastarea = "";
	
	public void collectData(String area){
		lastarea= area;
		System.out.println("DATA_COLLECTED FOR : "+area);
	}
	public void generateReport(){
		System.out.println("saitation report generated for :" + lastarea);
	}
	public static void main(String[]args){
		SanitationMapper_interface survey = new SanitationMapper_interface();
		survey.collectData("borivali west");
		survey.generateReport();
	}
}
