public class MultiClubMember extends Member{

    private int membershipPoints;

    MultiClubMember(char pMemberType, int pMemberID, String pName,double pFees, int pMembershipPoints){
        super(pMemberType,pMemberID,pName,pFees);
        pMembershipPoints=membershipPoints;
    }

    public void setMembershipPoints(int pMembershipPoints) {
        this.membershipPoints = pMembershipPoints;
    }
    public int getMembershipPoints;

    @Override
    public String toString() {
        return super.toString();
    }
}
