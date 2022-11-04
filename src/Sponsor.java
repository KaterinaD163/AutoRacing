import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Sponsor  {
        private String sponsorName;
        private int contribution;
    //        private ArrayList<Sponsor> sponsors;
     private Set<Sponsor> sponsors;
//        public ArrayList<Sponsor> getSponsors() {
//            return sponsors;
//        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return contribution == sponsor.contribution && Objects.equals(sponsorName, sponsor.sponsorName) && Objects.equals(sponsors, sponsor.sponsors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sponsorName, contribution, sponsors);
    }

    public String getSponsorName() {
        return sponsorName;
    }
//    public Sponsor(String sponsorName, int contribution) {
//            this.sponsorName = sponsorName;
//            this.contribution = contribution;
//            sponsors = new ArrayList<>();
//        }

    public Sponsor(String sponsorName, int contribution) {
        this.sponsorName = sponsorName;
        this.contribution = contribution;
        this.sponsors = new HashSet<>();
    }

    public void sponsorRace() {
            System.out.println("Спонсор " + sponsorName + "спонсировал заезд на " + contribution + " рублей" );
        }

        public String getName() {
            return sponsorName;
        }

        public int getContribution() {
            return contribution;
        }

        public void setContribution(int contribution) {
            this.contribution = contribution;
        }

        @Override
        public String toString() {
            return "Sponsor{" +
                    "sponsorName='" + sponsorName + '\'' +
                    ", contribution=" + contribution +
                    ", sponsors=" + sponsors +
                    '}';
        }
}
