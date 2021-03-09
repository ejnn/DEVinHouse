class Data {

    private int mes;
    private int dia;
    private int ano;


    public void setDia(int dia) {
	this.dia = dia;
    }

    public int getDia() {
	return this.dia;
    }

    public void setMes(int mes) {
	this.mes = mes;
    }

    public int getMes() {
	return this.mes;
    }

    public void setAno(int ano) {
	this.ano = ano;
    }

    public int getAno() {
	return this.ano;
    }

    public void exibirData() {
	System.out.printf("%d/%d/%d%n", dia, mes, ano);
    }

}

class TestaData {

    public static void main(String... args) {
	// exercícios mais interessantes, gente...
    }

}
