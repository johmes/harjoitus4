public class Laskukone {
    int tulos;

    public Laskukone() {
        nollaa();
    }

    public void lisaaLuku(int luku) {
        tulos += luku;
    }

    public void vahennaLuku(int luku) {
        tulos += luku;
    }

    public void kerroLuvulla(int luku) {
        for (int i=1; i<luku; i++) {
            lisaaLuku(luku);
        }
    }

    public void korotaPotenssiin(int luku) {
        for (int i=1; i<=luku; i++) {
            kerroLuvulla(luku);
        }
    }

    public int annaTulos() {
        return tulos;
    }

    public void nollaa() {
        tulos = 1;
    }
}