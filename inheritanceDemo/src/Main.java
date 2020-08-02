public class Main {

    public static void main(String[] args) {
	    KrediUI krediUI=new KrediUI();
	    krediUI.KrediHesapla(new OgretmenKrediManager()); //OgrenmenKrediManager class BaseKrediManager'a extends edildiğinden bu classtan BKM class'ının içeriğine ulaşılabilir.Alttında zaten tüm gösterimleri var.
	    krediUI.KrediHesapla(new AskerKrediManager());
	    krediUI.KrediHesapla(new BaseKrediManager());
    }
}
