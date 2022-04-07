package tema2;

public class CreazaForma {
    private FORMA cerc;
    private FORMA dreptunghi;
    private FORMA patrat;

    public CreazaForma() {
        cerc = new CERC();
        dreptunghi = new Dreptunghi();
        patrat = new Patrat();
    }

    public void drawCerc(){
        cerc.draw();
    }
    public void drawDreptunghi(){
        dreptunghi.draw();
    }
    public void drawPatrat(){
        patrat.draw();
    }
}