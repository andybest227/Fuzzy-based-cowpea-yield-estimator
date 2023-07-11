package cowpearyield;

import com.fuzzylite.Engine;
import com.fuzzylite.imex.FllImporter;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Dashboard extends javax.swing.JFrame {
    String low_yild = "<html><body>This result signifies a poor yiled (1 - 350kg/ha)</body></html>";
    String avarage_yield = "<html><body>The result above indicate an average yield of about 350kg/ha to 1000kg/ha</body></html>";
    String high_yield = "<html><body>Cowpea cultivated under these conditions will produce a very high yield of about 100kg/ha and above.</body></html>";
    Login_page login_page = new Login_page();
    public Dashboard(UserModel user) {
        initComponents();
        if (user != null) {
            user_fn_lbl.setText(user.getFullName());
        }
        //Set logo
        ImageIcon icon = new ImageIcon("src\\images\\logo.png");
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(logo_lbl.getWidth(), logo_lbl.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);
        logo_lbl.setIcon(newImc);
        this.setIconImage(icon.getImage());
        
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        soil_moisture = new javax.swing.ButtonGroup();
        temperature = new javax.swing.ButtonGroup();
        fertilizer_app = new javax.swing.ButtonGroup();
        pest_infections = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        logo_lbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        logout_btn = new javax.swing.JButton();
        user_fn_lbl = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        soil_moisture_vGood = new javax.swing.JRadioButton();
        soil_moisture_good = new javax.swing.JRadioButton();
        soil_moisture_poor = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        temperature_high = new javax.swing.JRadioButton();
        temperature_avg = new javax.swing.JRadioButton();
        temperature_low = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        fertilizer_high = new javax.swing.JRadioButton();
        fertilizer_avg = new javax.swing.JRadioButton();
        fertilizer_low = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        pest_high = new javax.swing.JRadioButton();
        pest_avg = new javax.swing.JRadioButton();
        pest_low = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        result_label = new javax.swing.JLabel();
        fuzzy_result_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COWPEA YIELD SIMULATOR");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(221, 251, 243));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 102, 0));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FUZZY BASED COWPEA YIELD SIMULATOR");

        logout_btn.setBackground(new java.awt.Color(0, 153, 153));
        logout_btn.setForeground(new java.awt.Color(255, 255, 255));
        logout_btn.setText("SIGN OUT");
        logout_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout_btnMouseClicked(evt);
            }
        });

        user_fn_lbl.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        user_fn_lbl.setForeground(new java.awt.Color(0, 0, 51));
        user_fn_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Welcome back");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(logo_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(206, 206, 206)))
                .addGap(214, 214, 214)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(user_fn_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logout_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(logo_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(logout_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(user_fn_lbl)))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));

        soil_moisture_vGood.setBackground(new java.awt.Color(0, 204, 0));
        soil_moisture.add(soil_moisture_vGood);
        soil_moisture_vGood.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        soil_moisture_vGood.setForeground(new java.awt.Color(255, 255, 255));
        soil_moisture_vGood.setText("2000 - 3000ML");

        soil_moisture_good.setBackground(new java.awt.Color(255, 153, 0));
        soil_moisture.add(soil_moisture_good);
        soil_moisture_good.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        soil_moisture_good.setForeground(new java.awt.Color(255, 255, 255));
        soil_moisture_good.setText("500 - 1999ML");

        soil_moisture_poor.setBackground(new java.awt.Color(255, 0, 0));
        soil_moisture.add(soil_moisture_poor);
        soil_moisture_poor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        soil_moisture_poor.setForeground(new java.awt.Color(255, 255, 255));
        soil_moisture_poor.setText("0 - 499ML");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SOIL MOISTURE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(soil_moisture_poor)
                        .addGap(18, 18, 18)
                        .addComponent(soil_moisture_good)
                        .addGap(18, 18, 18)
                        .addComponent(soil_moisture_vGood))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soil_moisture_poor)
                    .addComponent(soil_moisture_good)
                    .addComponent(soil_moisture_vGood))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(51, 51, 0));

        temperature_high.setBackground(new java.awt.Color(255, 0, 0));
        temperature.add(temperature_high);
        temperature_high.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        temperature_high.setForeground(new java.awt.Color(255, 255, 255));
        temperature_high.setText("31'c +");

        temperature_avg.setBackground(new java.awt.Color(0, 204, 0));
        temperature.add(temperature_avg);
        temperature_avg.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        temperature_avg.setForeground(new java.awt.Color(255, 255, 255));
        temperature_avg.setText("21 - 30'c");

        temperature_low.setBackground(new java.awt.Color(255, 153, 0));
        temperature.add(temperature_low);
        temperature_low.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        temperature_low.setForeground(new java.awt.Color(255, 255, 255));
        temperature_low.setText("0 - 20'c");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TEMPERATURE");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(temperature_low)
                        .addGap(18, 18, 18)
                        .addComponent(temperature_avg)
                        .addGap(18, 18, 18)
                        .addComponent(temperature_high))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(temperature_low)
                    .addComponent(temperature_avg)
                    .addComponent(temperature_high))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(51, 0, 0));

        fertilizer_high.setBackground(new java.awt.Color(255, 153, 0));
        fertilizer_app.add(fertilizer_high);
        fertilizer_high.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fertilizer_high.setForeground(new java.awt.Color(255, 255, 255));
        fertilizer_high.setText("36kg/ha +");

        fertilizer_avg.setBackground(new java.awt.Color(51, 204, 0));
        fertilizer_app.add(fertilizer_avg);
        fertilizer_avg.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fertilizer_avg.setForeground(new java.awt.Color(255, 255, 255));
        fertilizer_avg.setText("16 - 35kg/ha");

        fertilizer_low.setBackground(new java.awt.Color(255, 0, 0));
        fertilizer_app.add(fertilizer_low);
        fertilizer_low.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fertilizer_low.setForeground(new java.awt.Color(255, 255, 255));
        fertilizer_low.setText("0 - 15kg/ha");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("FERTILIZER APP.");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fertilizer_low)
                        .addGap(18, 18, 18)
                        .addComponent(fertilizer_avg)
                        .addGap(18, 18, 18)
                        .addComponent(fertilizer_high))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fertilizer_low)
                    .addComponent(fertilizer_avg)
                    .addComponent(fertilizer_high))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        pest_high.setBackground(new java.awt.Color(255, 0, 0));
        pest_infections.add(pest_high);
        pest_high.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pest_high.setForeground(new java.awt.Color(255, 255, 255));
        pest_high.setText("50% +");

        pest_avg.setBackground(new java.awt.Color(255, 153, 0));
        pest_infections.add(pest_avg);
        pest_avg.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pest_avg.setForeground(new java.awt.Color(255, 255, 255));
        pest_avg.setText("31 - 50%");

        pest_low.setBackground(new java.awt.Color(0, 204, 0));
        pest_infections.add(pest_low);
        pest_low.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pest_low.setForeground(new java.awt.Color(255, 255, 255));
        pest_low.setText("0 - 30%");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PEST INFECTIONS");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pest_low)
                .addGap(18, 18, 18)
                .addComponent(pest_avg)
                .addGap(18, 18, 18)
                .addComponent(pest_high)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(49, 49, 49))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pest_low)
                    .addComponent(pest_avg)
                    .addComponent(pest_high))
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Instructions:");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel7.setText("Carefully selected the level of each factor below to predict yield ");

        jButton2.setBackground(new java.awt.Color(0, 51, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("PREDICT YIELD");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("RESET");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(0, 0, 51));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("OUTPUT RESULT");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        result_label.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N

        fuzzy_result_lbl.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        fuzzy_result_lbl.setForeground(new java.awt.Color(0, 51, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(fuzzy_result_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(result_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fuzzy_result_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(result_label, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
       //Chech which of the button for soil moisture is selected 
        double soil_moisture_val = 0.0;
        double temperature_val = 0.0;
        double fertilizer_val = 0.0;
        double pest_infection_val = 0.0;
        
        if (soil_moisture_poor.isSelected()){
            soil_moisture_val = 0.250;
        }else if(soil_moisture_good.isSelected()){
            soil_moisture_val = 0.600;
        }else if(soil_moisture_vGood.isSelected()){
            soil_moisture_val = 1.000;
        }
        
        if(soil_moisture_val == 0.0){
            JOptionPane.showMessageDialog(null, "Please select a value for soil moisture", "Soil Moisture Level", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //get the selected value for temperature
        if (temperature_low.isSelected()){
            temperature_val = 0.520;
        }else if(temperature_avg.isSelected()){
            temperature_val = 1.000;
        }else if(temperature_high.isSelected()){
            temperature_val = 0.250;
        }
        
        if(temperature_val == 0.0){
            JOptionPane.showMessageDialog(null, "Please select a value for temperature", "Temperature Level", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //get the value for fertilizer application
        if (fertilizer_low.isSelected()){
            fertilizer_val = 0.200;
        }else if(fertilizer_avg.isSelected()){
            fertilizer_val = 1.000;
        }else if(fertilizer_high.isSelected()){
            fertilizer_val = 0.550;
        }
        
        if(fertilizer_val == 0.0){
            JOptionPane.showMessageDialog(null, "Please select fertilizer level", "Select Fertilizer", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //get the selected value for pest infections 
        if (pest_low.isSelected()){
            pest_infection_val = 0.981;
        }else if(pest_avg.isSelected()){
            pest_infection_val = 0.585;
        }else if(pest_high.isSelected()){
            pest_infection_val = 0.001;
        }
        
        if(pest_infection_val == 0.0){
            JOptionPane.showMessageDialog(null, "Please select pest infection level", "Pest Infections", JOptionPane.WARNING_MESSAGE);
            return;
        }
        //add the user inputs in an array 
        double userInputs[] = {soil_moisture_val, temperature_val, fertilizer_val, pest_infection_val}; 
        //call the method that handle the fuzzy logic
        handleFuzzyLogic(userInputs);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        soil_moisture.clearSelection();
        pest_infections.clearSelection();
        fertilizer_app.clearSelection();
        temperature.clearSelection();
        fuzzy_result_lbl.setText("");
        result_label.setText("");
    }//GEN-LAST:event_jButton3MouseClicked

    private void logout_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_btnMouseClicked
        Login_page lg = new Login_page();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logout_btnMouseClicked

    public static void main(String args[]) {
         UserModel user = null;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard(user).setVisible(true);
            }
        });
    }
    
    //a method to handle fuzzyfications
    public void handleFuzzyLogic(double userInputs[]){
        
        Engine engine = null;
            try {
                engine = new FllImporter().fromFile(new File("src\\system_rules.fll"));
            } catch (IOException e) {
            }

            StringBuilder engineStatus = new StringBuilder();
            assert engine != null;
            if (! engine.isReady(engineStatus))
                throw new RuntimeException("[engine error] engine is not ready:\n" + engineStatus); 
            engine.setInputValue("soil_moisture", userInputs[0]);
            engine.setInputValue("temperature", userInputs[1]);
            engine.setInputValue("fertilizer", userInputs[2]);
            engine.setInputValue("pest_infection", userInputs[3]);
            
            engine.process();
            double outputValue = engine.getOutputValue("prediction");
            
            //
            result_label.setText("");
            int percentage = (int) (outputValue*100);
            BigDecimal bd = new BigDecimal(percentage).setScale(1, RoundingMode.HALF_UP);
            fuzzy_result_lbl.setText("Percentage yiled equal "+String.valueOf(percentage)+"%");
            if(outputValue < 0.50){
                result_label.setText(low_yild);
            }else if(outputValue <0.70){
                result_label.setText(avarage_yield);
            }else if(outputValue >0.70){
                result_label.setText(high_yield);
            }else{
                result_label.setText(low_yild);
            }       
            
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup fertilizer_app;
    private javax.swing.JRadioButton fertilizer_avg;
    private javax.swing.JRadioButton fertilizer_high;
    private javax.swing.JRadioButton fertilizer_low;
    private javax.swing.JLabel fuzzy_result_lbl;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel logo_lbl;
    private javax.swing.JButton logout_btn;
    private javax.swing.JRadioButton pest_avg;
    private javax.swing.JRadioButton pest_high;
    private javax.swing.ButtonGroup pest_infections;
    private javax.swing.JRadioButton pest_low;
    private javax.swing.JLabel result_label;
    private javax.swing.ButtonGroup soil_moisture;
    private javax.swing.JRadioButton soil_moisture_good;
    private javax.swing.JRadioButton soil_moisture_poor;
    private javax.swing.JRadioButton soil_moisture_vGood;
    private javax.swing.ButtonGroup temperature;
    private javax.swing.JRadioButton temperature_avg;
    private javax.swing.JRadioButton temperature_high;
    private javax.swing.JRadioButton temperature_low;
    private javax.swing.JLabel user_fn_lbl;
    // End of variables declaration//GEN-END:variables
}
