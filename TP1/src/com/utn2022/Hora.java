package com.utn2022;

public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    public Hora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public void adelantar() {
        if (segundo >= 59 && minuto >= 59 && hora >= 23) {
            if (segundo == 59) {
                setSegundo(0);
                setMinuto(getMinuto() + 1);
                if (segundo >= 59 && minuto >= 59 && hora >= 23) {
                    if (minuto == 59) {
                        setMinuto(0);
                        setHora(getHora() + 1);
                        if (segundo >= 59 && minuto >= 59 && hora >= 23) {
                            if (hora == 23) {
                                setHora(0);
                            }
                            setHora(getHora() + 1);
                        }
                    }else {
                        setMinuto(getMinuto() + 1);
                    }
                }
            }else {
                setSegundo(getSegundo() + 1);
            }
        }
    }

        @Override
        public String toString () {
            return "Hora= " + hora + ":" + minuto + ":" + segundo;
        }

}
