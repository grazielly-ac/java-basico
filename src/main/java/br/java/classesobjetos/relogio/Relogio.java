package br.java.classesobjetos.relogio;

public class Relogio {

    private static Ponteiro ponteiroHora;
    private static Ponteiro ponteiroMinuto;
    private static Ponteiro ponteiroSegundo;

    private int hora;
    private int minuto, validaMinuto;
    private int segundo, validaSegundo;

    Ponteiro getPonteiroHora() {
        return ponteiroHora;
    }

    Ponteiro getPonteiroMinuto() {
        return ponteiroMinuto;
    }

    Ponteiro getPonteiroSegundo() {
        return ponteiroSegundo;
    }

    public void setPonteiroHora(Ponteiro ponteiroHora) {
        this.ponteiroHora = ponteiroHora;
    }

    public void setPonteiroMinuto(Ponteiro ponteiroMinuto) {
        this.ponteiroMinuto = ponteiroMinuto;
    }

    public void setPonteiroSegundo(Ponteiro ponteiroSegundo) {
        this.ponteiroSegundo = ponteiroSegundo;
    }

    public void acertarRelogio(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;

        boolean validaHora = hora >= 0 && hora <=24;
        boolean validaMinuto = minuto <= 59  && minuto >= 0;
        boolean validaSegundo = segundo <= 59  && segundo >= 0;

        atribuirHora(validaHora);
        atribuirMinuto(validaMinuto);
        atribuirSegundo(validaSegundo);

    }

    public int lerHora() {
        return getPonteiroHora().getPosicao() ;
    }

    public int lerMinuto() {
        if(this.validaMinuto == 60){
            return getPonteiroMinuto().getPosicao();
        }
         return getPonteiroMinuto().getPosicao();
    }

    public int lerSegundo() {
        if(this.validaSegundo == 60){
            return getPonteiroSegundo().getPosicao();
        }
          return getPonteiroSegundo().getPosicao() * 5;
    }

    private void atribuirHora(boolean validaHora){
        if(validaHora){
            hora = hora % 12;
            ponteiroHora = new Ponteiro();
            ponteiroHora.setPosicao(hora);
            setPonteiroHora(ponteiroHora);
        }else{
            System.err.println("A hora informada não existe!");
            ponteiroHora = new Ponteiro();
            ponteiroHora.setPosicao(0);
            setPonteiroHora(ponteiroHora);
        }
    }


    private void atribuirMinuto(boolean validaMinuto){
        if(validaMinuto){
            ponteiroMinuto = new Ponteiro();
            ponteiroMinuto.setPosicao(minuto / 5);
            setPonteiroMinuto(ponteiroMinuto);

        }else if(minuto == 60){
            this.validaMinuto = minuto;
            minuto = 0;
            ponteiroMinuto = new Ponteiro();
            ponteiroMinuto.setPosicao(minuto);
            ponteiroHora.setPosicao(hora+1);
            setPonteiroHora(ponteiroHora);
        }else{
            System.err.println("O minuto informado não existe!");
            ponteiroMinuto = new Ponteiro();
            ponteiroMinuto.setPosicao(0);
            setPonteiroMinuto(ponteiroMinuto);
        }
    }

    private void atribuirSegundo(boolean validaSegundo){

        if(validaSegundo){
            ponteiroSegundo = new Ponteiro();
            ponteiroSegundo.setPosicao(segundo / 5);
            setPonteiroSegundo(ponteiroSegundo);
        }else if(segundo == 60){
            this.validaSegundo = segundo;
            segundo = 0;
            ponteiroSegundo = new Ponteiro();
            ponteiroSegundo.setPosicao(segundo);
            setPonteiroSegundo(ponteiroSegundo);

            ponteiroMinuto.setPosicao(minuto+1);
            setPonteiroMinuto(ponteiroMinuto);

        }else{
            System.err.println("O segundo informado não existe!");
            ponteiroSegundo = new Ponteiro();
            ponteiroSegundo.setPosicao(0);
            setPonteiroSegundo(ponteiroSegundo);
        }
    }
}

//Código no main
/*
*    Relogio relogio = new Relogio();

        relogio.acertarRelogio(23,60,60);

        System.out.println(relogio.lerHora() +":"+ relogio.lerMinuto() +":"+ relogio.lerSegundo());
*
* */
