package lesson6;

public class Park {
    String nameOfAttraction;
    Attraction attraction;

    public Park(String nameOfAttraction, String infoAboutAttraction, String workTime, int price) {
        this.nameOfAttraction = nameOfAttraction;
        this.attraction = new Attraction(infoAboutAttraction, workTime, price);
    }

    public void outputInformationOfPark() {
        System.out.println("nameOfAttraction: " + nameOfAttraction);
        this.attraction.outputInformationOfAttraction();
    }

    class Attraction {
        private String infoAboutAttraction;
        private String workTime;
        private int price;

        public Attraction(String infoAboutAttraction, String workTime, int price) {
            this.infoAboutAttraction = infoAboutAttraction;
            this.workTime = workTime;
            this.price = price;
        }

        public void outputInformationOfAttraction() {
            System.out.println("infoAboutAttraction: " + infoAboutAttraction + "\n" +
                    "workTime: " + workTime + "\n" +
                    "price: " + price);
        }
    }
}
