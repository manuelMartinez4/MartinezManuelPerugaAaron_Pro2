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
package edu.ub.prog2.MartinezManuelPerugaAaron.vista;

import java.awt.Frame;

/**
 * FrmSobre - Vista
 *
 * @author Manuel Martinez, Aaron Peruga
 * @version 1.0
 */
public class FrmSobre extends javax.swing.JDialog {

    protected final static String TITLE = "Sobre";

    /**
     * FrmSobre
     *
     * @param parent
     * @param modal
     */
    public FrmSobre(Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.getRootPane().setDefaultButton(btnTornar);
    }

    /**
     * Inicializa el formulario JDialog
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etLogoUb = new javax.swing.JLabel();
        btnTornar = new javax.swing.JButton();
        etNombrePrograma = new javax.swing.JLabel();
        etAutors = new javax.swing.JLabel();
        etAutor1 = new javax.swing.JLabel();
        etAutor2 = new javax.swing.JLabel();
        etLlicencia = new javax.swing.JLabel();
        etGPLV3 = new javax.swing.JLabel();
        etVersion = new javax.swing.JLabel();
        etVersionNumber = new javax.swing.JLabel();
        panelCopy = new javax.swing.JPanel();
        etCopyRight = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(TITLE);
        setBounds(new java.awt.Rectangle(0, 23, 0, 0));
        setMinimumSize(new java.awt.Dimension(363, 320));
        setResizable(false);

        etLogoUb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo_ub.png"))); // NOI18N
        etLogoUb.setMaximumSize(new java.awt.Dimension(60, 60));
        etLogoUb.setMinimumSize(new java.awt.Dimension(60, 60));
        etLogoUb.setPreferredSize(new java.awt.Dimension(60, 60));

        btnTornar.setText("Tornar");
        btnTornar.setFocusPainted(false);
        btnTornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTornarActionPerformed(evt);
            }
        });

        etNombrePrograma.setFont(etNombrePrograma.getFont().deriveFont(etNombrePrograma.getFont().getStyle() | java.awt.Font.BOLD));
        etNombrePrograma.setText(AplicacioUB4.TITLE);

        etAutors.setFont(etAutors.getFont().deriveFont(etAutors.getFont().getStyle() | java.awt.Font.BOLD));
        etAutors.setText("Autors:");

        etAutor1.setFont(etAutor1.getFont().deriveFont((etAutor1.getFont().getStyle() | java.awt.Font.ITALIC), etAutor1.getFont().getSize()-2));
        etAutor1.setText(AplicacioUB4.AUTORS[0]);

        etAutor2.setFont(etAutor2.getFont().deriveFont((etAutor2.getFont().getStyle() | java.awt.Font.ITALIC), etAutor2.getFont().getSize()-2));
        etAutor2.setText(AplicacioUB4.AUTORS[1]);

        etLlicencia.setFont(etLlicencia.getFont().deriveFont(etLlicencia.getFont().getStyle() | java.awt.Font.BOLD));
        etLlicencia.setText("Llicència:");

        etGPLV3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/gplv3_license.png"))); // NOI18N

        etVersion.setFont(etVersion.getFont().deriveFont(etVersion.getFont().getStyle() | java.awt.Font.BOLD));
        etVersion.setText("Versión:");

        etVersionNumber.setFont(etVersionNumber.getFont().deriveFont((etVersionNumber.getFont().getStyle() | java.awt.Font.ITALIC), etVersionNumber.getFont().getSize()-2));
        etVersionNumber.setText(AplicacioUB4.VERSION);

        etCopyRight.setFont(etCopyRight.getFont().deriveFont((etCopyRight.getFont().getStyle() | java.awt.Font.ITALIC), etCopyRight.getFont().getSize()-2));
        etCopyRight.setText(AplicacioUB4.COPY);

        javax.swing.GroupLayout panelCopyLayout = new javax.swing.GroupLayout(panelCopy);
        panelCopy.setLayout(panelCopyLayout);
        panelCopyLayout.setHorizontalGroup(
            panelCopyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCopyLayout.createSequentialGroup()
                .addComponent(etCopyRight)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelCopyLayout.setVerticalGroup(
            panelCopyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCopyLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(etCopyRight, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etVersion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etVersionNumber))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etAutors)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etAutor2)
                                    .addComponent(etAutor1)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etLlicencia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etGPLV3))
                            .addComponent(etNombrePrograma)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(etLogoUb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTornar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelCopy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(etLogoUb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etNombrePrograma)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etVersion)
                    .addComponent(etVersionNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etAutors)
                    .addComponent(etAutor1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etAutor2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etGPLV3)
                    .addComponent(etLlicencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCopy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTornar)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Acción del boton Tornar, cierra la ventana
     *
     * @param evt
     */
    private void btnTornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTornarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnTornarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTornar;
    private javax.swing.JLabel etAutor1;
    private javax.swing.JLabel etAutor2;
    private javax.swing.JLabel etAutors;
    private javax.swing.JLabel etCopyRight;
    private javax.swing.JLabel etGPLV3;
    private javax.swing.JLabel etLlicencia;
    private javax.swing.JLabel etLogoUb;
    private javax.swing.JLabel etNombrePrograma;
    private javax.swing.JLabel etVersion;
    private javax.swing.JLabel etVersionNumber;
    private javax.swing.JPanel panelCopy;
    // End of variables declaration//GEN-END:variables
}
