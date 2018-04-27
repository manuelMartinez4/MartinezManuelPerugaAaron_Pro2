/*
 * Copyright (C) 2018 Manuel Martinez, Aaron Peruga, Universitat de Barcelona
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.ub.prog2.MartinezManuelPerugaAaron.controlador;

import edu.ub.prog2.MartinezManuelPerugaAaron.model.CarpetaFitxers;
import edu.ub.prog2.MartinezManuelPerugaAaron.model.FitxerReproduible;
import edu.ub.prog2.utils.AplicacioException;
import edu.ub.prog2.utils.EscoltadorReproduccioBasic;
import java.io.File;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * EscoltadorReproduccio - Controlador
 *
 * @author Manuel Martinez, Aaron Peruga
 * @version 1.0
 */
public class EscoltadorReproduccio extends EscoltadorReproduccioBasic implements Serializable {

    private CarpetaFitxers llistaReproduint;
    private List<Integer> llistaCtrl;
    private boolean reproduccioCiclica, reproduccioAleatoria;
    private int posicio;
    private int size;

    // TODO (DUDA CONSTRUCTORES)
    public EscoltadorReproduccio() {
    }

    public EscoltadorReproduccio(CarpetaFitxers llistaReproduint) {
        setLlistaReproduint(llistaReproduint);
    }

    /**
     * Asigna una CarpetaFitxers, una lista de enteros del mismo tamaño y una
     * posición de inicio para poder reproducir
     *
     * @param llistaReproduint
     */
    public void setLlistaReproduint(CarpetaFitxers llistaReproduint) {
        this.llistaReproduint = llistaReproduint;
        // (JAVA8) Generamos una Lista de interos desde 0 hasta tamaño de carpeta-1
        llistaCtrl = IntStream.range(0, llistaReproduint.getSize()).boxed().collect(Collectors.toList());
        posicio = 0;
        size = llistaReproduint.getSize() - 1;
        if (isReproduccioAleatoria()) {
            Collections.shuffle(llistaCtrl);
        }
    }

    // Getters y Setters START
    public boolean isReproduccioCiclica() {
        return reproduccioCiclica;
    }

    public boolean isReproduccioAleatoria() {
        return reproduccioAleatoria;
    }

    public void setReproduccioCiclica(boolean reproduccioCiclica) {
        this.reproduccioCiclica = reproduccioCiclica;
    }

    public void setReproduccioAleatoria(boolean reproduccioAleatoria) {
        this.reproduccioAleatoria = reproduccioAleatoria;
    }
    // Getters y Setters END

    /**
     * Es llamado cuando acaba la reproducción de un fichero, comprobamos si
     * puede continuar o no la reproducción y en caso afirmativo la continuamos
     */
    @Override
    protected void onEndFile() {
        if (reproduccioCiclica) {
            if (hasNext()) {
                next();
            } else {
                iniciarReproduccio(llistaReproduint, reproduccioCiclica);
            }
        } else {
            if (hasNext()) {
                next();
            }
        }
    }

    /**
     * Es llamado desde onEndFile() cuando va a reproducir el siguiente fichero
     * en caso de que sea posible
     */
    @Override
    protected void next() {
        posicio++;
        continua();
    }

    /**
     * Comprueba si hay más archivos por reproducir
     *
     * @return boolean
     */
    @Override
    protected boolean hasNext() {
        return posicio != size;
    }

    /**
     * Inicia la reproducción
     *
     * @param llistaReproduint
     * @param reproduccioCiclica
     */
    public void iniciarReproduccio(CarpetaFitxers llistaReproduint, boolean reproduccioCiclica) {
        setLlistaReproduint(llistaReproduint);
        this.reproduccioCiclica = reproduccioCiclica;
        continua();
    }

    /**
     * Continua la reproduccion de IniciarReproduccio() / next()
     */
    public void continua() {
        File file = llistaReproduint.getAt(llistaCtrl.get(posicio));
        if (file instanceof FitxerReproduible) {
            // TODO (DUDA TRY-CATCH)
            try {
                ((FitxerReproduible) file).reproduir();
            } catch (AplicacioException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

}
