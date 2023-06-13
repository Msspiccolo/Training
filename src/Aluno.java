
class Aluno {

    private String NomeAluno;

    public String getNomeAluno() {
        return NomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        NomeAluno = nomeAluno;
    }

    private float notaPrimeiroBimestre;
    private float notaSegundoBimestre;

    private float notaTerceiroBimestre;

    private float notaQuartoBimestre;

    public Aluno() {
    }

    public float getNotaQuartoBimestre() {
        return notaQuartoBimestre;
    }

    public void setNotaQuartoBimestre(float notaQuartoBimestre) {
        this.notaQuartoBimestre = notaQuartoBimestre;
    }

    public float getNotaTerceiroBimestre() {
        return notaTerceiroBimestre;
    }

    public void setNotaTerceiroBimestre(float notaTerceiroBimestre) {
        this.notaTerceiroBimestre = notaTerceiroBimestre;
    }

    public float getNotaPrimeiroBimestre() {
        return notaPrimeiroBimestre;
    }

    public void setNotaPrimeiroBimestre(float notaPrimeiroBimestre) {
        this.notaPrimeiroBimestre = notaPrimeiroBimestre;
    }

    public float getNotaSegundoBimestre() {
        return notaSegundoBimestre;
    }

    public void setNotaSegundoBimestre(float notaSegundoBimestre) {
        this.notaSegundoBimestre = notaSegundoBimestre;
    }


    public float calcularMedia() {
        return (notaPrimeiroBimestre + notaSegundoBimestre + notaTerceiroBimestre + notaQuartoBimestre) / 4;
    }
}
