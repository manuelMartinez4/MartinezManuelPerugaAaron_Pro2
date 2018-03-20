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
package edu.ub.prog2.MartinezManuelPerugaAaron.model;

import edu.ub.prog2.utils.AplicacioException;
import java.io.File;
import java.util.Date;
import java.util.Objects;

/**
 * FitxerMultimedia - Modelo, la superclass ya implementa Serializable, no hace
 * falta
 *
 * @author Manuel Martinez, Aaron Peruga
 * @version 2.0
 */
public class FitxerMultimedia extends File {

    private String descripcio;

    public FitxerMultimedia(String cami) throws AplicacioException {
        super(cami);

        if (cami.length() < 1) {
            throw new AplicacioException("Nom de fitxer invalid, ha de tenir al menys un caracter");
        }

    }

    /**
     * Retorna la extensión del fichero
     *
     * @return String
     */
    private String findExtension() {
        String name = this.getName();

        int dotIndex = this.getName().lastIndexOf('.'),
                sepIndex = name.lastIndexOf(File.separator);
        if (dotIndex <= sepIndex || dotIndex == 0) {
            return "";
        } else {
            return name.substring(dotIndex + 1);
        }
    }

    /**
     * Retorna el nombre del fichero sin extensión
     *
     * @return String
     */
    private String findName() {
        String name = this.getName();

        int dotIndex = this.getName().lastIndexOf('.');
        if (dotIndex < 1) {
            return name;
        } else {
            return name.substring(0, dotIndex);
        }
    }

    /**
     * Retorna la ruta del fichero sin el nombre del fichero
     *
     * @return String
     */
    private String findPath() {
        if (this.getParent() == null) {
            return "";
        } else {
            return this.getParent();
        }
    }

    // Getters START
    public String getNomFitxer() {
        return findName();
    }

    public String getExtensio() {
        return findExtension();
    }

    public String getDescripcio() {
        return descripcio;
    }

    public String getCamiAbsolut() {
        return findPath();
    }

    public String getCamiAbsolutComplet() {
        return this.getAbsolutePath();
    }

    public Date getUltimaModificacio() {
        return new Date(this.lastModified());
    }
    // Getters END

    // Setters START
    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }
    // Setters END

    //***************************************************************
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FitxerMultimedia other = (FitxerMultimedia) obj;
        if (!Objects.equals(this.getNomFitxer(), other.getNomFitxer())) {
            return false;
        }
        if (!Objects.equals(this.descripcio, other.descripcio)) {
            return false;
        }
        if (!Objects.equals(this.getExtensio(), other.getExtensio())) {
            return false;
        }
        if (!Objects.equals(this.getCamiAbsolut(), other.getCamiAbsolut())) {
            return false;
        }
        return Objects.equals(this.getUltimaModificacio(), other.getUltimaModificacio());
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.getCamiAbsolut());
        hash = 83 * hash + Objects.hashCode(this.getNomFitxer());
        hash = 83 * hash + Objects.hashCode(this.descripcio);
        hash = 83 * hash + Objects.hashCode(this.getExtensio());
        hash = 83 * hash + Objects.hashCode(this.getUltimaModificacio());
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder fitxer = new StringBuilder();

        fitxer.append("Descripció='").append(descripcio).append("', Data='")
                .append(this.getUltimaModificacio())
                .append("', Nom fitxer='").append(this.getNomFitxer())
                .append("', Extensio='");

        if (this.getExtensio().length() > 0) {
            fitxer.append(this.getExtensio());
        } else {
            fitxer.append("null");
        }

        fitxer.append("', Cami complet='").append(getCamiAbsolutComplet()).append("'");

        return fitxer.toString();
    }

}
