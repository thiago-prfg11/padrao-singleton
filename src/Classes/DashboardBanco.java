package Classes;

public class DashboardBanco {

    private DashboardBanco() {};
    private static DashboardBanco instance = new DashboardBanco();
    public static DashboardBanco getInstance() {
        return instance;
    }

    private String usoCPU;
    private String usoRAM;
    private String usoDisco;
    private int conexoesAtivas;
    private String tempoResposta;

    public String getUsoCPU() {
        return usoCPU;
    }

    public void setUsoCPU(String usoCPU) {
        this.usoCPU = usoCPU;
    }

    public String getUsoRAM() {
        return usoRAM;
    }

    public void setUsoRAM(String usoRAM) {
        this.usoRAM = usoRAM;
    }

    public String getUsoDisco() {
        return usoDisco;
    }

    public void setUsoDisco(String usoDisco) {
        this.usoDisco = usoDisco;
    }

    public int getConexoesAtivas() {
        return conexoesAtivas;
    }

    public void setConexoesAtivas(int conexoesAtivas) {
        this.conexoesAtivas = conexoesAtivas;
    }

    public String getTempoResposta() {
        return tempoResposta;
    }

    public void setTempoResposta(String tempoResposta) {
        this.tempoResposta = tempoResposta;
    }

}
