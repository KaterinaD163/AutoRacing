import java.util.ArrayList;
    public class Sponsor  {
        private String sponsorName;
        private int contribution;
        private ArrayList<Sponsor> sponsors;

        public ArrayList<Sponsor> getSponsors() {
            return sponsors;
        }

        public Sponsor(String sponsorName, int contribution) {
            this.sponsorName = sponsorName;
            this.contribution = contribution;
            sponsors = new ArrayList<>();
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
