package TugasPraktikum2;

public class Bola {

    public double jarijari=20;
    public double diameter;
    public double luaspermukaan;
    public double volume;
    
    
    public void SetJarijari(){
        jarijari = 20;
        System.out.println("Jari-jari yang digunakan adalah = "+jarijari);
    }
    public void showDiameter(){
        diameter = 2*jarijari;
        System.out.println("Diameter yang digunakan adalah = "+ diameter);
    }
    public void showLuaspermukaan(){
        luaspermukaan = 4*Math.PI*jarijari*jarijari;
        System.out.println("Luas Permukaan Bola adalah = "+luaspermukaan);
    }
    public void showVolume(){
        volume = 4/3*Math.PI*jarijari*jarijari*jarijari;
        System.out.println("Volume bola adalah = "+volume);
    }
}

