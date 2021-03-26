package pbo2Latihan2;

public class Bus {

    private int penumpang;
    private int maxPenumpang;
    public Bus(int maxpenumpang) {
        this.maxPenumpang = maxpenumpang;
        penumpang = 0;
    }

    public void addPenumpang(int penumpang) {
        int temp;
        temp = this.penumpang + penumpang;
        if (temp >= maxPenumpang) {
            System.out.println("Penumpang melebihi kuota");
        } else {
            this.penumpang = temp;
        }
    }

    public void cetak() {
        System.out.println("Penumpang Bus sekarang adalah " + penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah " + maxPenumpang);
    }
}
