package GUI;

import javax.swing.DefaultListModel;
import data.Contact;
import data.Agenda;
import java.util.ArrayList;
import java.util.List;
import data.NrTel;
import data.NrMobil;
import data.NrFix;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author gabrieliordache
 */
public class Interfata extends javax.swing.JFrame implements Serializable {

    private Agenda agenda = new Agenda();

    private DefaultListModel<Contact> model = new DefaultListModel<>();

    private Comparator<Contact> cDupaNume = (c1, c2) -> c1.getNume().compareToIgnoreCase(c2.getNume().toLowerCase());
    private Comparator<Contact> cDupaPrenume = (c1, c2) -> c1.getPrenume().compareToIgnoreCase(c2.getPrenume());
    private Comparator<Contact> cDupaData = (c1, c2) -> c1.getDob().compareTo(c2.getDob());
    private Comparator<Contact> cDupaTelefon = (c1, c2) -> c1.getNrTelefon().compareTo(c2.getNrTelefon());

    public Interfata() throws IOException {
        initComponents();
        jListaContacte.setModel(model);
        actualizareModel(agenda.colectieContacte);
        changeImage();
        miDeschidere.setVisible(false);
        miSalvare.setVisible(false);

    }


    private void actualizareModel(List<Contact> lista) {
        model.clear();
        for (Contact c : lista) {
            model.addElement(c);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFC = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JCBFiltrare = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTFFiltru = new javax.swing.JTextField();
        jbFiltreaza = new javax.swing.JButton();
        jCBOrdonare = new javax.swing.JComboBox<>();
        jbOrdoneaza = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListaContacte = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jbSterge = new javax.swing.JButton();
        jbEditeaza = new javax.swing.JButton();
        jbAdauga = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLAds = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miDeschidere = new javax.swing.JMenuItem();
        miSalvare = new javax.swing.JMenuItem();
        miIesire = new javax.swing.JMenuItem();
        miInregistrare = new javax.swing.JMenu();
        jMIInregistrare = new javax.swing.JMenuItem();
        miDespre = new javax.swing.JMenuItem();

        jFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFCActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda");

        jLabel1.setText("Filtrare:");

        jLabel2.setText("Ordonare:");

        JCBFiltrare.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nr. Fix", "Nr. Mobil", "Data nastere zi curenta", "Data nastere luna curenta" }));

        jLabel3.setText("Filtru:");

        jTFFiltru.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFFiltruKeyPressed(evt);
            }
        });

        jbFiltreaza.setText("Filtreaza");
        jbFiltreaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFiltreazaActionPerformed(evt);
            }
        });

        jCBOrdonare.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "dupa nume", "dupa prenume", "dupa data", "dupa Nr. telefon" }));

        jbOrdoneaza.setText("Ordoneaza");
        jbOrdoneaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOrdoneazaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(29, 29, 29)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JCBFiltrare, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(181, 181, 181))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCBOrdonare, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFFiltru, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jbOrdoneaza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jbFiltreaza, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JCBFiltrare)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFFiltru)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jbFiltreaza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jCBOrdonare))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jbOrdoneaza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jListaContacte);

        jbSterge.setText("Sterge contact selectat");
        jbSterge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbStergeActionPerformed(evt);
            }
        });

        jbEditeaza.setText("Editeaza contact selectat");
        jbEditeaza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbEditeazaMouseClicked(evt);
            }
        });
        jbEditeaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditeazaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbSterge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbEditeaza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jbSterge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jbEditeaza, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
        );

        jbAdauga.setText("Adauga contact");
        jbAdauga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdaugaActionPerformed(evt);
            }
        });

        jLAds.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/poze/1.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(jLAds)
                    .addContainerGap(60, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 273, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLAds, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(7, Short.MAX_VALUE)))
        );

        jMenu1.setText("Fisiere");

        miDeschidere.setText("Deschidere");
        miDeschidere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDeschidereActionPerformed(evt);
            }
        });
        jMenu1.add(miDeschidere);

        miSalvare.setText("Salvare");
        miSalvare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalvareActionPerformed(evt);
            }
        });
        jMenu1.add(miSalvare);

        miIesire.setText("Iesire");
        miIesire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miIesireActionPerformed(evt);
            }
        });
        jMenu1.add(miIesire);

        jMenuBar1.add(jMenu1);

        miInregistrare.setText("Ajutor");

        jMIInregistrare.setText("Inregistrare");
        jMIInregistrare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIInregistrareActionPerformed(evt);
            }
        });
        miInregistrare.add(jMIInregistrare);

        miDespre.setText("Despre");
        miDespre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDespreActionPerformed(evt);
            }
        });
        miInregistrare.add(miDespre);

        jMenuBar1.add(miInregistrare);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbAdauga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(jbAdauga, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbOrdoneazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOrdoneazaActionPerformed
        int index = jCBOrdonare.getSelectedIndex();
        String sFaramaText = jTFFiltru.getText().trim();
        switch (index) {
            case 0:
                Collections.sort(agenda.colectieContacte, cDupaNume);
                actualizareModel(agenda.colectieContacte);
                break;
            case 1:
                Collections.sort(agenda.colectieContacte, cDupaPrenume);
                actualizareModel(agenda.colectieContacte);
                break;
            case 2:

                if (sFaramaText.isEmpty()) {
                    List<Contact> persoaneDeAfisat = new ArrayList<>();
                    for (Contact c : agenda.colectieContacte) {

                        String data = c.getDob();
                        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd.MM.yyyy");
                        LocalDate ld = LocalDate.parse(data, dt);
                        Comparator<Contact> comp = (c1, c2) -> c1.getData().compareTo(c2.getData());

                        persoaneDeAfisat.add(c);
                        persoaneDeAfisat.sort(comp);
                        actualizareModel(persoaneDeAfisat);
                    }
                }

                break;
            case 3:
                Collections.sort(agenda.colectieContacte, cDupaTelefon);
                actualizareModel(agenda.colectieContacte);
                break;
        }
    }//GEN-LAST:event_jbOrdoneazaActionPerformed

    private void jbAdaugaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdaugaActionPerformed

        AdaugaPersoana dlgAdd = new AdaugaPersoana(this, true);
        dlgAdd.setVisible(true);
        Contact cAdded = dlgAdd.getContact();
        for (Contact c : agenda.colectieContacte) {
            String data = c.getDob();
            DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate ld = LocalDate.parse(data, dt);
            if (ld.isEqual(LocalDate.now())) {
                JOptionPane.showMessageDialog(rootPane, "Data curenta coincide cu ziua de nastere a contactului!", "Atentie", 2);
            }
            if (cAdded.equals(c)) {
                JOptionPane.showMessageDialog(rootPane, "Contact existent!", "EROARE", 0);
                return;
            }
        }

        if (cAdded != null) {
            agenda.colectieContacte.add(cAdded);
        }
        actualizareModel(agenda.colectieContacte);
    }//GEN-LAST:event_jbAdaugaActionPerformed

    private void jbStergeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbStergeActionPerformed
        int index = jListaContacte.getSelectedIndex();
        int input = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(rootPane, "Doriti stergerea contactului?", "Confirmare stergere", input);
        if (index != -1 && result == 0) {
            model.remove(index);
        } else {
            return;
        }
    }//GEN-LAST:event_jbStergeActionPerformed

    private void jbEditeazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditeazaActionPerformed

        int index = jListaContacte.getSelectedIndex();

        AdaugaPersoana dlgAdd = new AdaugaPersoana(this, true);
        dlgAdd.setVisible(true);
        Contact cAdded = dlgAdd.getContact();
        if (cAdded != null) {

            agenda.colectieContacte.add(cAdded);
        }
        model.removeElement(evt);
        agenda.colectieContacte.remove(index);

        actualizareModel(agenda.colectieContacte);

    }//GEN-LAST:event_jbEditeazaActionPerformed

    private void jbEditeazaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbEditeazaMouseClicked
    }//GEN-LAST:event_jbEditeazaMouseClicked

    public Comparator<Contact> getNrTelefon() {
        return cDupaTelefon;
    }
    private void jbFiltreazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFiltreazaActionPerformed
        int index = JCBFiltrare.getSelectedIndex();
        String sFaramaText = jTFFiltru.getText().trim();
        switch (index) {
            case 0:

                if (sFaramaText.isEmpty()) {
                    actualizareModel(agenda.colectieContacte);
                } else {
                    List<Contact> persoaneDeAfisat = new ArrayList<>();
                    for (Contact c : agenda.colectieContacte) {
                        if ((sFaramaText.startsWith("02")) && c.getNrTelefon().toString().substring(0, 2).contains(sFaramaText)) {
                            persoaneDeAfisat.add(c);
                        } else if ((sFaramaText.startsWith("03")) && c.getNrTelefon().toString().substring(0, 2).contains(sFaramaText)) {
                            persoaneDeAfisat.add(c);
                        }
                    }
                    actualizareModel(persoaneDeAfisat);
                }

                break;

            case 1:
                if (sFaramaText.isEmpty()) {
                    actualizareModel(agenda.colectieContacte);
                } else {
                    List<Contact> persoaneDeAfisat = new ArrayList<>();
                    for (Contact c : agenda.colectieContacte) {
                        if ((sFaramaText.startsWith("07")) && c.getNrTelefon().toString().substring(0, 2).contains(sFaramaText)) {
                            persoaneDeAfisat.add(c);

                        }
                    }
                    actualizareModel(persoaneDeAfisat);
                }
                break;

            case 2:
                if (sFaramaText.isEmpty()) {
                    List<Contact> persoaneDeAfisat = new ArrayList<>();
                    for (Contact c : agenda.colectieContacte) {
                        String data = c.getDob();
                        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd.MM.yyyy");
                        LocalDate ld = LocalDate.parse(data, dt);
                        if (ld.getDayOfMonth() == LocalDate.now().getDayOfMonth()) {
                            persoaneDeAfisat.add(c);
                        }
                        actualizareModel(persoaneDeAfisat);
                    }
                }

                break;

            case 3:
                if (sFaramaText.isEmpty()) {
                    List<Contact> persoaneDeAfisat = new ArrayList<>();
                    for (Contact c : agenda.colectieContacte) {
                        String data = c.getDob();
                        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd.MM.yyyy");
                        LocalDate ld = LocalDate.parse(data, dt);
                        if (ld.getMonth() == LocalDate.now().getMonth()) {
                            persoaneDeAfisat.add(c);
                        }
                        actualizareModel(persoaneDeAfisat);
                    }
                }

                break;
        }
    }//GEN-LAST:event_jbFiltreazaActionPerformed

    private void jTFFiltruKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFFiltruKeyPressed
        String sFaramaText = jTFFiltru.getText().trim();
        if (sFaramaText.isEmpty()) {
            actualizareModel(agenda.colectieContacte);
        } else {
            List<Contact> persoaneDeAfisat = new ArrayList<>();
            for (Contact c : agenda.colectieContacte) {
                if (c.getNume().contains(sFaramaText)) {
                    persoaneDeAfisat.add(c);
                } else if (c.getPrenume().contains(sFaramaText)) {
                    persoaneDeAfisat.add(c);
                } else if (c.getNrTelefon().toString().contains(sFaramaText)) {
                    persoaneDeAfisat.add(c);
                }

            }
            actualizareModel(persoaneDeAfisat);
        }
    }//GEN-LAST:event_jTFFiltruKeyPressed

    private void miDeschidereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDeschidereActionPerformed

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Deschidere");

        int userSelection = fileChooser.showOpenDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            String saver = fileToSave.getAbsolutePath().toString();

            try {
                FileInputStream fis = new FileInputStream(saver);
                ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(fis));

                agenda.colectieContacte = (List<Contact>) ois.readObject();
                ois.close();
                fis.close();
                actualizareModel(agenda.colectieContacte);
            } catch (Exception e) {
                System.out.println("eroare deschidere" + e);
            }
        }


    }//GEN-LAST:event_miDeschidereActionPerformed

    private void miIesireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miIesireActionPerformed
        int input = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(rootPane, "Doriti sa parasati aplicatia?", "Exit", input);
        if (result == 0) {
            System.exit(0);
        } else {
            return;
        }
    }//GEN-LAST:event_miIesireActionPerformed

    public void autoSavePath() {
        try {
            FileInputStream whereTo = new FileInputStream(new File("../Proiect Final/src/whereTo.txt").getCanonicalPath());
            ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(whereTo));

            String whereToSave = (String) ois.readObject();
            ois.close();
            whereTo.close();
            saveTo = new File(whereToSave);
            System.out.println(new String(saveTo.getAbsolutePath().toString()) + " autosavePath");
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }

    public static File saveTo;
    public static File save = new File("/Volumes/Stocare/JavaNetbeansApp/23martie/Proiect Final/list.txt");


    private void miSalvareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalvareActionPerformed

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Salvare");

        int userSelection = fileChooser.showSaveDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            String saver = fileToSave.getAbsolutePath().toString();

            try {
                FileOutputStream whereTo = new FileOutputStream(new File("../Proiect Final/src/whereTo.txt").getCanonicalPath());
                ObjectOutputStream whereOut = new ObjectOutputStream(new BufferedOutputStream(whereTo));
                whereOut.writeObject(saver);
                whereOut.close();
                whereTo.close();
            } catch (Exception e) {
                System.out.println("aici" + e);
            }

        }

        autoSavePath();
        try {

            FileOutputStream fos = new FileOutputStream(new File(new String(saveTo.getCanonicalPath().toString())));
            ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(fos));

            System.out.println(agenda.colectieContacte);

            oos.writeObject(agenda.colectieContacte);
            oos.writeObject(saveTo);

            oos.close();
            fos.close();
            autoSave();
        } catch (Exception ex) {
            System.out.println("problema" + ex);
        }

    }//GEN-LAST:event_miSalvareActionPerformed

    synchronized void autoSave() throws IOException {
        new Thread(new Runnable() {
            @Override
            public void run() {

                int timer = 15000;
                while (true) {
                    LocalDateTime acum = LocalDateTime.now();
                    try {
                        FileOutputStream whereTo = new FileOutputStream(saveTo);
                        ObjectOutputStream whereOut = new ObjectOutputStream(new BufferedOutputStream(whereTo));
                        whereOut.writeObject(agenda.colectieContacte);
                        whereOut.writeObject(saveTo);
                        whereOut.close();
                        whereTo.close();
                        //System.out.println("fisierul a fost salvat " + acum);
                        //System.out.println(agenda.colectieContacte);
                        Thread.sleep(timer);
                    } catch (Exception e) {
                        System.out.println("aici" + e);
                    }

                }
            }

        }
        ).start();
    }

    private void miDespreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDespreActionPerformed
        About about = new About();
        about.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {

                about.setVisible(false);
                about.dispose();
            }
        });

        about.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        about.setVisible(true);
    }//GEN-LAST:event_miDespreActionPerformed

    private void jFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFCActionPerformed
    }//GEN-LAST:event_jFCActionPerformed


    private void jMIInregistrareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIInregistrareActionPerformed
        Pass pass = new Pass();
        pass.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {

                pass.setVisible(false);
                pass.dispose();
            }
        });

        pass.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        pass.setVisible(true);
    }//GEN-LAST:event_jMIInregistrareActionPerformed

    //Ads
    synchronized void changeImage() throws IOException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                int counter = 0;
                int n = 2000;
                try {
                    while (true) {
                        switch (counter) {

                            case 0:
                                shareware();
                                Thread.sleep(n);
                                jLAds.setIcon(new ImageIcon(new File("../Proiect Final/src/GUI/poze/1.jpg").getCanonicalPath()));
                                counter++;
                            case 1:
                                shareware();
                                Thread.sleep(n);
                                jLAds.setIcon(new ImageIcon(new File("../Proiect Final/src/GUI/poze/2.jpg").getCanonicalPath()));
                                counter++;
                            case 2:
                                shareware();
                                Thread.sleep(n);
                                jLAds.setIcon(new ImageIcon(new File("../Proiect Final/src/GUI/poze/3.jpg").getCanonicalPath()));
                                counter++;
                            case 3:
                                shareware();
                                Thread.sleep(n);
                                jLAds.setIcon(new ImageIcon(new File("../Proiect Final/src/GUI/poze/4.jpg").getCanonicalPath()));
                                counter = 0;
                        }
                    }
                } catch (Exception e) {

                }
            }
        }).start();
    }

    synchronized void shareware() {
        if (Pass.passOK == "123456") {
            jPanel3.setVisible(false);
            miDeschidere.setVisible(true);
            miSalvare.setVisible(true);
            this.revalidate();
            this.repaint();
            this.setSize(650, 500);

        }
    }

    public static void main(String args[]) {
        Splash splash = new Splash();
        splash.setVisible(true);

        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(10);
                splash.loadingNo.setText(Integer.toString(i) + "%");
                splash.loadingBar.setValue(i);
                if (i == 100) {
                    splash.setVisible(false);
                }
            }
        } catch (Exception e) {

        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Interfata().setVisible(true);

                } catch (IOException ex) {
                    Logger.getLogger(Interfata.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JCBFiltrare;
    private javax.swing.JComboBox<String> jCBOrdonare;
    private javax.swing.JFileChooser jFC;
    private javax.swing.JLabel jLAds;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<Contact> jListaContacte;
    private javax.swing.JMenuItem jMIInregistrare;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFFiltru;
    private javax.swing.JButton jbAdauga;
    private javax.swing.JButton jbEditeaza;
    private javax.swing.JButton jbFiltreaza;
    private javax.swing.JButton jbOrdoneaza;
    private javax.swing.JButton jbSterge;
    private javax.swing.JMenuItem miDeschidere;
    private javax.swing.JMenuItem miDespre;
    private javax.swing.JMenuItem miIesire;
    private javax.swing.JMenu miInregistrare;
    private javax.swing.JMenuItem miSalvare;
    // End of variables declaration//GEN-END:variables
}
