package fr.diginamic.recensement;

public class Ville {
    protected String codeRegion;
    protected String nomRegion;
    protected String codeDepartement;
    protected String codeCommune;
    protected String nomCommune;
    protected int populationTotale;

    @Override
    public String toString() {
        return "Ville{" +
                "codeRegion='" + codeRegion + '\'' +
                ", nomRegion='" + nomRegion + '\'' +
                ", codeDepartement='" + codeDepartement + '\'' +
                ", codeCommune='" + codeCommune + '\'' +
                ", nomCommune='" + nomCommune + '\'' +
                ", populationTotale=" + populationTotale +
                '}';
    }

    public Ville(String codeRegion, String nomRegion, String codeDepartement, String codeCommune, String nomCommune, int populationTotale) {
        this.codeRegion = codeRegion;
        this.nomRegion = nomRegion;
        this.codeDepartement = codeDepartement;
        this.codeCommune = codeCommune;
        this.nomCommune = nomCommune;
        this.populationTotale = populationTotale;
    }

    public String getCodeRegion() {
        return codeRegion;
    }

    public void setCodeRegion(String codeRegion) {
        this.codeRegion = codeRegion;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public void setCodeDepartement(String codeDepartement) {
        this.codeDepartement = codeDepartement;
    }

    public String getCodeCommune() {
        return codeCommune;
    }

    public void setCodeCommune(String codeCommune) {
        this.codeCommune = codeCommune;
    }

    public String getNomCommune() {
        return nomCommune;
    }

    public void setNomCommune(String nomCommune) {
        this.nomCommune = nomCommune;
    }

    public int getPopulationTotale() {
        return populationTotale;
    }

    public void setPopulationTotale(int populationTotale) {
        this.populationTotale = populationTotale;
    }
}