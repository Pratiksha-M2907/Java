public class IndianArmyOfficerInfoRunner {
    public static void main(String[] args) {
        IndianArmyOfficerInfo officer = new IndianArmyOfficerInfo();
        officer.setOfficerId(1);
        officer.setOfficerName("Lt Ram Prakash");
        officer.setOfficerRank("Lieutenant");
        officer.setOfficerBranch("Indian Army");
        officer.setOfficerRegiment("Madras Regiment");
        officer.setOfficerCommissionDate("19th December 1981");
        officer.setOfficerDateOfBirth("10th June 1959");
        officer.setOfficerPlaceOfBirth("Pali village in Hissar District of Haryana");
        officer.setOfficerLastPosting("Jammu and Kashmir");
        officer.setOfficerAwardsAndDecorations("Ashoka Chakra");
		
		System.out.println("Officer ID: " + officer.getOfficerId());
        System.out.println("Officer Name: " + officer.getOfficerName());
        System.out.println("Officer Rank: " + officer.getOfficerRank());
        System.out.println("Officer Branch: " + officer.getOfficerBranch());
        System.out.println("Officer Regiment: " + officer.getOfficerRegiment());
        System.out.println("Officer Commission Date: " + officer.getOfficerCommissionDate());
        System.out.println("Officer Date of Birth: " + officer.getOfficerDateOfBirth());
        System.out.println("Officer Place of Birth: " + officer.getOfficerPlaceOfBirth());
        System.out.println("Officer Current Posting: " + officer.getOfficerLastPosting());
        System.out.println("Officer Awards and Decorations: " + officer.getOfficerAwardsAndDecorations());

	}
}
