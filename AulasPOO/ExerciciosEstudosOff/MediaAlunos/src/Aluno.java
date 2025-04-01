public class Aluno {
    private static Integer contadorId = 1;
    private String Name;
    private Integer Id;
    private Double media;

    public Aluno(String Name){
        this.Name = Name;
        this.Id = contadorId++;
        this.media = 0.0;
    }


    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Integer getId() {
        return Id;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }



}
