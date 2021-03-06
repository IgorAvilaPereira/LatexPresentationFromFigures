package apresentacao;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author iapereira
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */
    public Main() {
        initComponents();
//        JOptionPane.showMessageDialog(null, "As imagens devem ficar dentro de uma subpasta figuras");
        //this.jTextField1.setText("aula");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        button = new javax.swing.JButton();
        label_title = new javax.swing.JLabel();
        input_title = new javax.swing.JTextField();
        input_departament = new javax.swing.JTextField();
        label_departament = new javax.swing.JLabel();
        label_institute = new javax.swing.JLabel();
        input_institute = new javax.swing.JTextField();
        label_place = new javax.swing.JLabel();
        input_place = new javax.swing.JTextField();
        label_place1 = new javax.swing.JLabel();
        input_author = new javax.swing.JTextField();
        input_email = new javax.swing.JTextField();
        label_email = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        button.setText("Select Figures Folder");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        label_title.setText("Title:");

        input_title.setText("aula");
        input_title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_titleActionPerformed(evt);
            }
        });

        input_departament.setText("Divis??o de Computa????o");
        input_departament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_departamentActionPerformed(evt);
            }
        });

        label_departament.setText("Department:");

        label_institute.setText("Institute:");

        input_institute.setText("Instituto Federal de Educa????o, Ci??ncia e Tecnologia do Rio Grande do Sul (IFRS)");
        input_institute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_instituteActionPerformed(evt);
            }
        });

        label_place.setText("Place:");

        input_place.setText("C??mpus Rio Grande");
        input_place.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_placeActionPerformed(evt);
            }
        });

        label_place1.setText("Author:");

        input_author.setText("Igor Avila Pereira");
        input_author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_authorActionPerformed(evt);
            }
        });

        input_email.setText("igor.pereira@riogrande.ifrs.edu.br");
        input_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_emailActionPerformed(evt);
            }
        });

        label_email.setText("Email:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label_institute)
                                .addComponent(label_departament)
                                .addComponent(label_place))
                            .addGap(6, 6, 6))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(label_place1)
                            .addGap(38, 38, 38)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_email)
                                .addGap(0, 67, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(input_author, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(input_place, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(input_departament)
                    .addComponent(input_email)
                    .addComponent(input_institute, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                    .addComponent(input_title)
                    .addComponent(button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_title))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_institute)
                    .addComponent(input_institute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_departament)
                    .addComponent(input_departament, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input_place, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_place))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input_author, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_place1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_email))
                .addGap(18, 18, 18)
                .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        String institute = ((this.input_institute.getText().length() > 0) ? this.input_institute.getText() : "Instituto Federal de Educa????o, Ci??ncia e Tecnologia do Rio Grande do Sul (IFRS)");
        String place = ((this.input_place.getText().length() > 0) ? this.input_place.getText(): "C??mpus Rio Grande");
        String departament = ((this.input_departament.getText().length() > 0) ? this.input_departament.getText() :"Divis??o de Computa????o");
        String author = ((this.input_author.getText().length() > 0) ? this.input_author.getText() : "Igor Avila Pereira");
        String email = ((this.input_email.getText().length() > 0) ? this.input_email.getText() : "igor.pereira@riogrande.ifrs.edu.br");
        String title = ((this.input_title.getText().length() > 0) ? this.input_title.getText(): "Aula");
        String latex = ""
                + "\\documentclass[table, usenames, svgnames, dvipsnames]{beamer}\n"
                + "\\usepackage{beamerthemeshadow}\n"
                + "\\usepackage[portuguese]{babel}\n"
                + "\\usepackage[latin1]{inputenc}\n"
                + "\\usepackage[absolute,overlay]{textpos}\n"
                + "\\usepackage{array}\n"
                + "\n"
                + "%\\usepackage{subfigure}\n"
                + "%\\usepackage{multicol}\n"
                + "%\\usepackage{colortbl}\n"
                + "\n"
                + "\\usetheme{Warsaw}\n"
                + "%\\usetheme{Luebeck}\n"
                + "%\\usecolortheme{rose}\n"
                + "\\usecolortheme[named=SeaGreen]{structure}\n"
                + "\\setbeamerfont{frametitle}{size=\\normalsize}\n"
                + "\\setbeamerfont{title}{size=\\normalsize}\n"
                + "\\beamertemplatenavigationsymbolsempty\n"
                + "\n"
                + "% Podem ser utilizadas imagens no background\n"
                + "%\\setbeamercolor{frametitle}{bg=black}\n"
                + "%\\usebackgroundtemplate{\\includegraphics[height=\\paperheight]{figuras/back.jpg}}\n"
                + "\n"
                + "\\setbeamertemplate{navigation symbols}{}\n"
                + "\\setbeamertemplate{footline}{}\n"
                + "\n"
                + "\\setbeamertemplate{footline}[page number]{}\n"
                + "\\setbeamertemplate{footline}[text line]{ \\hfill {\\insertframenumber}}\n"
                + "\\DeclareGraphicsExtensions{.pdf,.jpg,.png} % compilamos apenas com pdflatex \n"
                + "\\graphicspath{{./figuras/}}  \n"
                + "\n"
                + "\\setlength{\\TPHorizModule}{1mm}\n"
                + "\\setlength{\\TPVertModule}{1mm}\n"
                + "\\newcommand{\\MyLogo}{%\n"
                + "\\begin{textblock}{}(118.5, 2.5)\n"
                + "	\\includegraphics[width=0.7cm]{ime-mod2.png}\n"
                + "\\end{textblock}\n"
                + "}\n"
                + "\n"
                + "% semitransparente\n"
                + "\\newcommand{\\semitransp}[2][35]{\\color{fg!#1}#2}\n"
                + "\n"
                + "% \\definecolor{myred}{rgb}{0.8, 0.3, 0.3}\n"
                + "\\definecolor{myblue}{rgb}{0.2, 0.2, 0.70196}\n"
                + "\n"
                + "\\usepackage{framed} % utilizado para codigo fonte\n"
                + "\\definecolor{shadecolor}{named}{LightGray}\n"
                + "\n"
                + "\\title{\\textbf{"+title+"}}\n"
                + "\\subtitle{}\n"
                + "\n"
                + "\\author["+author+"]{\\scriptsize\n"
                + "    "+author+"\\\\\n"
                + "    "+email+"\n"
                + "}\n"
                + "\\institute{\\\\[1.0mm]\n"
                + "	"+institute+" \\\\\n"
                + "	"+place+" \\\\\n"
                + "	"+departament+"} \n"
                + " \\date{}\n"
                + "\n"
                + "\\begin{document}\n"
                + "\n"
                + "{%\\usebackgroundtemplate{}}\n"
                + "\\begin{frame}[plain]\n"
                + "			\\titlepage\n"
                + "	\\addtocounter{framenumber}{-1}\n"
                + "\\end{frame}\n"
                + "}\n"
                + "\n"
                + "\\setbeamertemplate{footline}{\\hrule}\n"
                + "\\setbeamertemplate{navigation symbols}{\\large {\\insertframenumber}}\n"
                + "\n"
                + "\\begin{frame}\n"
                + "\\frametitle{\\textbf{Agenda}}\n"
                + "	\\footnotesize{ \\tableofcontents }\n"
                + "\\end{frame}";
        this.jFileChooser1.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        //this.jFileChooser1.setCurrentDirectory(dir);
        try {
            this.jFileChooser1.setCurrentDirectory(new File(Main.class.getProtectionDomain().getCodeSource().getLocation().toURI()));
        } catch (URISyntaxException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        int res = this.jFileChooser1.showOpenDialog(null);
        if (res == JFileChooser.APPROVE_OPTION) {
            File diretorio = this.jFileChooser1.getSelectedFile();
            String dir = diretorio.getAbsolutePath();
            //System.out.println(diretorio.getPath());
            JOptionPane.showMessageDialog(this, "Your folder: " + diretorio.getAbsolutePath());
            //JOptionPane.showMessageDialog(null, "Voc?? escolheu o diret??rio: " + diretorio.getCanonicalPath());
//            JOptionPane.showMessageDialog(null, "Voc?? escolheu o diret??rio: " + diretorio.getPath());
            File caminho = new File(dir);
            File caminhoCompleto = caminho.getAbsoluteFile();
            File vetFile[] = caminhoCompleto.listFiles();
            for (File imagem : vetFile) {
                if (imagem.getName().contains(".jpg") || imagem.getName().contains(".png")) {
                    latex += "\n\n"
                            + " \\section{"+ imagem.getName().substring(0, 1).toUpperCase() +  imagem.getName().substring(1, imagem.getName().indexOf("."))+"} \n\n"
                            + " \\begin{frame} \n"
                            + "\\frametitle{" + imagem.getName().substring(0, 1).toUpperCase() +  imagem.getName().substring(1, imagem.getName().indexOf(".")) + "}\n"
                            + "\\begin{figure}\n"
                            + "\\centering\n"
                            + "\\includegraphics[width=1\\linewidth]{" + imagem.getAbsoluteFile() + "}\n"
                            + "\\caption{" +imagem.getName().substring(0, imagem.getName().indexOf("."))+ "}\n"
                            + "\\label{fig:" + imagem.getName().substring(0, imagem.getName().indexOf(".")) + "}\n"
                            + "\\end{figure}\n"
                            + "\\end{frame} \n\n\n";
                } else {
                    //JOptionPane.showMessageDialog(null, "H?? algum arquivo que n??o ?? do tipo imagem.", "Informa????o", JOptionPane.ERROR_MESSAGE);                    
                }
            }
            latex += ""
                    + "{%\\usebackgroundtemplate{}}\n"
                    + "\\begin{frame}[plain]\n"
                    + "\\titlepage \n"
                    + "	\\end{frame}\n"
                    + "\\end{document}";
            //System.out.println(latex);

            try {
                OutputStreamWriter bufferOut = new OutputStreamWriter(new FileOutputStream(dir + "/" + title + ".tex"),"ISO-8859-1");
				
		bufferOut.write(latex);
		
		bufferOut.close();
                // o true significa q o arquivo ser?? constante  
                //FileWriter x = new FileWriter(dir + "/" + nome + ".tex", true);
                //x.write(latex); // armazena o texto no objeto x, que aponta para o arquivo             
                //x.close(); // cria o arquivo  
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "Success. Your latex file was created.", "Make your Latex Presentation From Figures", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Select your folder!!", "Make your Latex Presentation From From Figures", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonActionPerformed

    private void input_titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_titleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_titleActionPerformed

    private void input_departamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_departamentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_departamentActionPerformed

    private void input_instituteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_instituteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_instituteActionPerformed

    private void input_placeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_placeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_placeActionPerformed

    private void input_authorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_authorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_authorActionPerformed

    private void input_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_emailActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button;
    private javax.swing.JTextField input_author;
    private javax.swing.JTextField input_departament;
    private javax.swing.JTextField input_email;
    private javax.swing.JTextField input_institute;
    private javax.swing.JTextField input_place;
    private javax.swing.JTextField input_title;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel label_departament;
    private javax.swing.JLabel label_email;
    private javax.swing.JLabel label_institute;
    private javax.swing.JLabel label_place;
    private javax.swing.JLabel label_place1;
    private javax.swing.JLabel label_title;
    // End of variables declaration//GEN-END:variables

    
}
