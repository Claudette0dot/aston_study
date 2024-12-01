package org.example;

public class Park {

    public class Attraction {
        private String name;
        private String work_schedule;
        private int price;

        public Attraction(String name, String work_schedule, int price) {
            this.name = name;
            this.work_schedule = work_schedule;
            this.price = price;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getWork_schedule() {
            return work_schedule;
        }
        public void setWork_schedule(String work_schedule) {
            this.work_schedule = work_schedule;
        }
        public int getPrice() {
            return price;
        }
        public void setPrice(int price) {
            this.price = price;
        }
        public void info() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + work_schedule);
            System.out.println("Стоимость: " + price);
        }

        public void main(String[] args) {
            Park park = new Park();

            Park.Attraction autodrome = park.new Attraction("Автодром", "09:00 - 21:00", 300);
            Park.Attraction ufo = park.new Attraction("НЛО", "09:00 - 21:00", 250);
            autodrome.info();
            System.out.println();
            ufo.info();
        }
    }
}
