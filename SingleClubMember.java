public class SingleClubMember extends Member{
        private int club;

        SingleClubMember(char pMemberType, int pMemberID, String pName,double pFees, int pClub){
                super(pMemberType,pMemberID,pName,pFees);
                pClub=club;
        }

        public void setClub(int pClub) {
                this.club = pClub;
        }

        public int getClub() {
                return club;
        }

        @Override
        public String toString() {
                return super.toString();
        }
}
